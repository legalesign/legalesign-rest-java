// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.member.MemberCreateParams
import com.legalesign.api.models.member.MemberDeleteParams
import com.legalesign.api.models.member.MemberListParams
import com.legalesign.api.models.member.MemberListResponse
import com.legalesign.api.models.member.MemberResponse
import com.legalesign.api.models.member.MemberRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MemberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberServiceAsync

    /**
     * If the email is a registered user then access to group will be immediate, otherise an
     * invitation will be created and emailed.
     */
    fun create(params: MemberCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MemberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get group member */
    fun retrieve(memberId: String): CompletableFuture<MemberResponse> =
        retrieve(memberId, MemberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        memberId: String,
        params: MemberRetrieveParams = MemberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberResponse> =
        retrieve(params.toBuilder().memberId(memberId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        memberId: String,
        params: MemberRetrieveParams = MemberRetrieveParams.none(),
    ): CompletableFuture<MemberResponse> = retrieve(memberId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MemberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberResponse>

    /** @see retrieve */
    fun retrieve(params: MemberRetrieveParams): CompletableFuture<MemberResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        memberId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MemberResponse> =
        retrieve(memberId, MemberRetrieveParams.none(), requestOptions)

    /** List members of groups, one user may be in one or more groups */
    fun list(): CompletableFuture<MemberListResponse> = list(MemberListParams.none())

    /** @see list */
    fun list(
        params: MemberListParams = MemberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberListResponse>

    /** @see list */
    fun list(
        params: MemberListParams = MemberListParams.none()
    ): CompletableFuture<MemberListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MemberListResponse> =
        list(MemberListParams.none(), requestOptions)

    /** Remove member from group */
    fun delete(memberId: String): CompletableFuture<Void?> =
        delete(memberId, MemberDeleteParams.none())

    /** @see delete */
    fun delete(
        memberId: String,
        params: MemberDeleteParams = MemberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().memberId(memberId).build(), requestOptions)

    /** @see delete */
    fun delete(
        memberId: String,
        params: MemberDeleteParams = MemberDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(memberId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MemberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: MemberDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(memberId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(memberId, MemberDeleteParams.none(), requestOptions)

    /**
     * A view of [MemberServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /member/`, but is otherwise the same as
         * [MemberServiceAsync.create].
         */
        fun create(params: MemberCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MemberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /member/{memberId}/`, but is otherwise the same as
         * [MemberServiceAsync.retrieve].
         */
        fun retrieve(memberId: String): CompletableFuture<HttpResponseFor<MemberResponse>> =
            retrieve(memberId, MemberRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            memberId: String,
            params: MemberRetrieveParams = MemberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberResponse>> =
            retrieve(params.toBuilder().memberId(memberId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            memberId: String,
            params: MemberRetrieveParams = MemberRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MemberResponse>> =
            retrieve(memberId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MemberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MemberRetrieveParams
        ): CompletableFuture<HttpResponseFor<MemberResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            memberId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MemberResponse>> =
            retrieve(memberId, MemberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /member/`, but is otherwise the same as
         * [MemberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MemberListResponse>> =
            list(MemberListParams.none())

        /** @see list */
        fun list(
            params: MemberListParams = MemberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberListResponse>>

        /** @see list */
        fun list(
            params: MemberListParams = MemberListParams.none()
        ): CompletableFuture<HttpResponseFor<MemberListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MemberListResponse>> =
            list(MemberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /member/{memberId}/`, but is otherwise the same
         * as [MemberServiceAsync.delete].
         */
        fun delete(memberId: String): CompletableFuture<HttpResponse> =
            delete(memberId, MemberDeleteParams.none())

        /** @see delete */
        fun delete(
            memberId: String,
            params: MemberDeleteParams = MemberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().memberId(memberId).build(), requestOptions)

        /** @see delete */
        fun delete(
            memberId: String,
            params: MemberDeleteParams = MemberDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(memberId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MemberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: MemberDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            memberId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(memberId, MemberDeleteParams.none(), requestOptions)
    }
}
