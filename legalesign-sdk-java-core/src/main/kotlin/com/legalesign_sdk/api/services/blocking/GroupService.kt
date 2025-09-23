// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign_sdk.api.core.ClientOptions
import com.legalesign_sdk.api.core.RequestOptions
import com.legalesign_sdk.api.core.http.HttpResponse
import com.legalesign_sdk.api.core.http.HttpResponseFor
import com.legalesign_sdk.api.models.group.GroupCreateParams
import com.legalesign_sdk.api.models.group.GroupListParams
import com.legalesign_sdk.api.models.group.GroupListResponse
import com.legalesign_sdk.api.models.group.GroupRetrieveParams
import com.legalesign_sdk.api.models.group.GroupRetrieveResponse
import java.util.function.Consumer

interface GroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService

    /** Create group */
    fun create(params: GroupCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: GroupCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get group */
    fun retrieve(groupId: String): GroupRetrieveResponse =
        retrieve(groupId, GroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        groupId: String,
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupRetrieveResponse = retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        groupId: String,
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
    ): GroupRetrieveResponse = retrieve(groupId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: GroupRetrieveParams): GroupRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(groupId: String, requestOptions: RequestOptions): GroupRetrieveResponse =
        retrieve(groupId, GroupRetrieveParams.none(), requestOptions)

    /** List groups the api user belongs to */
    fun list(): GroupListResponse = list(GroupListParams.none())

    /** @see list */
    fun list(
        params: GroupListParams = GroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupListResponse

    /** @see list */
    fun list(params: GroupListParams = GroupListParams.none()): GroupListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): GroupListResponse =
        list(GroupListParams.none(), requestOptions)

    /** A view of [GroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /group/`, but is otherwise the same as
         * [GroupService.create].
         */
        @MustBeClosed
        fun create(params: GroupCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /group/{groupId}/`, but is otherwise the same as
         * [GroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(groupId: String): HttpResponseFor<GroupRetrieveResponse> =
            retrieve(groupId, GroupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            groupId: String,
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupRetrieveResponse> =
            retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            groupId: String,
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
        ): HttpResponseFor<GroupRetrieveResponse> = retrieve(groupId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: GroupRetrieveParams): HttpResponseFor<GroupRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            groupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GroupRetrieveResponse> =
            retrieve(groupId, GroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /group/`, but is otherwise the same as
         * [GroupService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<GroupListResponse> = list(GroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GroupListParams = GroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: GroupListParams = GroupListParams.none()
        ): HttpResponseFor<GroupListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<GroupListResponse> =
            list(GroupListParams.none(), requestOptions)
    }
}
