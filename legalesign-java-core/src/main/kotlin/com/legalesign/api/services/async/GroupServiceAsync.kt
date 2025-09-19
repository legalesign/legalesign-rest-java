// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.group.GroupCreateParams
import com.legalesign.api.models.group.GroupListParams
import com.legalesign.api.models.group.GroupListResponse
import com.legalesign.api.models.group.GroupRetrieveParams
import com.legalesign.api.models.group.GroupRetrieveResponse
import com.legalesign.api.models.group.GroupUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupServiceAsync

    /** Create group */
    fun create(params: GroupCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get group */
    fun retrieve(groupId: String): CompletableFuture<GroupRetrieveResponse> =
        retrieve(groupId, GroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        groupId: String,
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupRetrieveResponse> =
        retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        groupId: String,
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
    ): CompletableFuture<GroupRetrieveResponse> = retrieve(groupId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: GroupRetrieveParams): CompletableFuture<GroupRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        groupId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GroupRetrieveResponse> =
        retrieve(groupId, GroupRetrieveParams.none(), requestOptions)

    /** Update group */
    fun update(groupId: String): CompletableFuture<Void?> =
        update(groupId, GroupUpdateParams.none())

    /** @see update */
    fun update(
        groupId: String,
        params: GroupUpdateParams = GroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see update */
    fun update(
        groupId: String,
        params: GroupUpdateParams = GroupUpdateParams.none(),
    ): CompletableFuture<Void?> = update(groupId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: GroupUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(groupId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(groupId, GroupUpdateParams.none(), requestOptions)

    /** List groups the api user belongs to */
    fun list(): CompletableFuture<GroupListResponse> = list(GroupListParams.none())

    /** @see list */
    fun list(
        params: GroupListParams = GroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupListResponse>

    /** @see list */
    fun list(
        params: GroupListParams = GroupListParams.none()
    ): CompletableFuture<GroupListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<GroupListResponse> =
        list(GroupListParams.none(), requestOptions)

    /** A view of [GroupServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /group/`, but is otherwise the same as
         * [GroupServiceAsync.create].
         */
        fun create(params: GroupCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /group/{groupId}/`, but is otherwise the same as
         * [GroupServiceAsync.retrieve].
         */
        fun retrieve(groupId: String): CompletableFuture<HttpResponseFor<GroupRetrieveResponse>> =
            retrieve(groupId, GroupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            groupId: String,
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupRetrieveResponse>> =
            retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            groupId: String,
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<GroupRetrieveResponse>> =
            retrieve(groupId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: GroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: GroupRetrieveParams
        ): CompletableFuture<HttpResponseFor<GroupRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            groupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GroupRetrieveResponse>> =
            retrieve(groupId, GroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /group/{groupId}/`, but is otherwise the same as
         * [GroupServiceAsync.update].
         */
        fun update(groupId: String): CompletableFuture<HttpResponse> =
            update(groupId, GroupUpdateParams.none())

        /** @see update */
        fun update(
            groupId: String,
            params: GroupUpdateParams = GroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see update */
        fun update(
            groupId: String,
            params: GroupUpdateParams = GroupUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(groupId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(params: GroupUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            groupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            update(groupId, GroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /group/`, but is otherwise the same as
         * [GroupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<GroupListResponse>> =
            list(GroupListParams.none())

        /** @see list */
        fun list(
            params: GroupListParams = GroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupListResponse>>

        /** @see list */
        fun list(
            params: GroupListParams = GroupListParams.none()
        ): CompletableFuture<HttpResponseFor<GroupListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GroupListResponse>> =
            list(GroupListParams.none(), requestOptions)
    }
}
