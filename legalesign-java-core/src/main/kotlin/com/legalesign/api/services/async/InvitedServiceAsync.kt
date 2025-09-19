// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.invited.InvitedDeleteParams
import com.legalesign.api.models.invited.InvitedListParams
import com.legalesign.api.models.invited.InvitedListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InvitedServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvitedServiceAsync

    /** Invitations to people to join the group are listed by email */
    fun list(): CompletableFuture<InvitedListResponse> = list(InvitedListParams.none())

    /** @see list */
    fun list(
        params: InvitedListParams = InvitedListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitedListResponse>

    /** @see list */
    fun list(
        params: InvitedListParams = InvitedListParams.none()
    ): CompletableFuture<InvitedListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InvitedListResponse> =
        list(InvitedListParams.none(), requestOptions)

    /** Delete invitation */
    fun delete(invitedId: String): CompletableFuture<Void?> =
        delete(invitedId, InvitedDeleteParams.none())

    /** @see delete */
    fun delete(
        invitedId: String,
        params: InvitedDeleteParams = InvitedDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().invitedId(invitedId).build(), requestOptions)

    /** @see delete */
    fun delete(
        invitedId: String,
        params: InvitedDeleteParams = InvitedDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(invitedId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InvitedDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: InvitedDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(invitedId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(invitedId, InvitedDeleteParams.none(), requestOptions)

    /**
     * A view of [InvitedServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvitedServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /invited/`, but is otherwise the same as
         * [InvitedServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InvitedListResponse>> =
            list(InvitedListParams.none())

        /** @see list */
        fun list(
            params: InvitedListParams = InvitedListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitedListResponse>>

        /** @see list */
        fun list(
            params: InvitedListParams = InvitedListParams.none()
        ): CompletableFuture<HttpResponseFor<InvitedListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InvitedListResponse>> =
            list(InvitedListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /invited/{invitedId}/`, but is otherwise the same
         * as [InvitedServiceAsync.delete].
         */
        fun delete(invitedId: String): CompletableFuture<HttpResponse> =
            delete(invitedId, InvitedDeleteParams.none())

        /** @see delete */
        fun delete(
            invitedId: String,
            params: InvitedDeleteParams = InvitedDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().invitedId(invitedId).build(), requestOptions)

        /** @see delete */
        fun delete(
            invitedId: String,
            params: InvitedDeleteParams = InvitedDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(invitedId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: InvitedDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: InvitedDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            invitedId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(invitedId, InvitedDeleteParams.none(), requestOptions)
    }
}
