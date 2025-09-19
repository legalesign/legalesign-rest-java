// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.invited.InvitedDeleteParams
import com.legalesign.api.models.invited.InvitedListParams
import com.legalesign.api.models.invited.InvitedListResponse
import java.util.function.Consumer

interface InvitedService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvitedService

    /** Invitations to people to join the group are listed by email */
    fun list(): InvitedListResponse = list(InvitedListParams.none())

    /** @see list */
    fun list(
        params: InvitedListParams = InvitedListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitedListResponse

    /** @see list */
    fun list(params: InvitedListParams = InvitedListParams.none()): InvitedListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InvitedListResponse =
        list(InvitedListParams.none(), requestOptions)

    /** Delete invitation */
    fun delete(invitedId: String) = delete(invitedId, InvitedDeleteParams.none())

    /** @see delete */
    fun delete(
        invitedId: String,
        params: InvitedDeleteParams = InvitedDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().invitedId(invitedId).build(), requestOptions)

    /** @see delete */
    fun delete(invitedId: String, params: InvitedDeleteParams = InvitedDeleteParams.none()) =
        delete(invitedId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: InvitedDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: InvitedDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(invitedId: String, requestOptions: RequestOptions) =
        delete(invitedId, InvitedDeleteParams.none(), requestOptions)

    /** A view of [InvitedService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvitedService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /invited/`, but is otherwise the same as
         * [InvitedService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InvitedListResponse> = list(InvitedListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InvitedListParams = InvitedListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitedListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InvitedListParams = InvitedListParams.none()
        ): HttpResponseFor<InvitedListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InvitedListResponse> =
            list(InvitedListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /invited/{invitedId}/`, but is otherwise the same
         * as [InvitedService.delete].
         */
        @MustBeClosed
        fun delete(invitedId: String): HttpResponse = delete(invitedId, InvitedDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            invitedId: String,
            params: InvitedDeleteParams = InvitedDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().invitedId(invitedId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            invitedId: String,
            params: InvitedDeleteParams = InvitedDeleteParams.none(),
        ): HttpResponse = delete(invitedId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: InvitedDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: InvitedDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(invitedId: String, requestOptions: RequestOptions): HttpResponse =
            delete(invitedId, InvitedDeleteParams.none(), requestOptions)
    }
}
