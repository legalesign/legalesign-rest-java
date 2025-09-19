// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface MemberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberService

    /**
     * If the email is a registered user then access to group will be immediate, otherise an
     * invitation will be created and emailed.
     */
    fun create(params: MemberCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: MemberCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get group member */
    fun retrieve(memberId: String): MemberResponse = retrieve(memberId, MemberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        memberId: String,
        params: MemberRetrieveParams = MemberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberResponse = retrieve(params.toBuilder().memberId(memberId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        memberId: String,
        params: MemberRetrieveParams = MemberRetrieveParams.none(),
    ): MemberResponse = retrieve(memberId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MemberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberResponse

    /** @see retrieve */
    fun retrieve(params: MemberRetrieveParams): MemberResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(memberId: String, requestOptions: RequestOptions): MemberResponse =
        retrieve(memberId, MemberRetrieveParams.none(), requestOptions)

    /** List members of groups, one user may be in one or more groups */
    fun list(): MemberListResponse = list(MemberListParams.none())

    /** @see list */
    fun list(
        params: MemberListParams = MemberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberListResponse

    /** @see list */
    fun list(params: MemberListParams = MemberListParams.none()): MemberListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MemberListResponse =
        list(MemberListParams.none(), requestOptions)

    /** Remove member from group */
    fun delete(memberId: String) = delete(memberId, MemberDeleteParams.none())

    /** @see delete */
    fun delete(
        memberId: String,
        params: MemberDeleteParams = MemberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().memberId(memberId).build(), requestOptions)

    /** @see delete */
    fun delete(memberId: String, params: MemberDeleteParams = MemberDeleteParams.none()) =
        delete(memberId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: MemberDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: MemberDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(memberId: String, requestOptions: RequestOptions) =
        delete(memberId, MemberDeleteParams.none(), requestOptions)

    /** A view of [MemberService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /member/`, but is otherwise the same as
         * [MemberService.create].
         */
        @MustBeClosed
        fun create(params: MemberCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MemberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /member/{memberId}/`, but is otherwise the same as
         * [MemberService.retrieve].
         */
        @MustBeClosed
        fun retrieve(memberId: String): HttpResponseFor<MemberResponse> =
            retrieve(memberId, MemberRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            memberId: String,
            params: MemberRetrieveParams = MemberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberResponse> =
            retrieve(params.toBuilder().memberId(memberId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            memberId: String,
            params: MemberRetrieveParams = MemberRetrieveParams.none(),
        ): HttpResponseFor<MemberResponse> = retrieve(memberId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MemberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MemberRetrieveParams): HttpResponseFor<MemberResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            memberId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MemberResponse> =
            retrieve(memberId, MemberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /member/`, but is otherwise the same as
         * [MemberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MemberListResponse> = list(MemberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MemberListParams = MemberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MemberListParams = MemberListParams.none()
        ): HttpResponseFor<MemberListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MemberListResponse> =
            list(MemberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /member/{memberId}/`, but is otherwise the same
         * as [MemberService.delete].
         */
        @MustBeClosed
        fun delete(memberId: String): HttpResponse = delete(memberId, MemberDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            memberId: String,
            params: MemberDeleteParams = MemberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().memberId(memberId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            memberId: String,
            params: MemberDeleteParams = MemberDeleteParams.none(),
        ): HttpResponse = delete(memberId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MemberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: MemberDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(memberId: String, requestOptions: RequestOptions): HttpResponse =
            delete(memberId, MemberDeleteParams.none(), requestOptions)
    }
}
