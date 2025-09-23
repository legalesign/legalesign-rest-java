// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.async

import com.legalesign_sdk.api.core.ClientOptions
import com.legalesign_sdk.api.core.RequestOptions
import com.legalesign_sdk.api.core.http.HttpResponseFor
import com.legalesign_sdk.api.models.status.StatusRetrieveParams
import com.legalesign_sdk.api.models.status.StatusRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StatusServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusServiceAsync

    /** Faster short query for a document status */
    fun retrieve(docId: String): CompletableFuture<StatusRetrieveResponse> =
        retrieve(docId, StatusRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: StatusRetrieveParams = StatusRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatusRetrieveResponse> =
        retrieve(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: StatusRetrieveParams = StatusRetrieveParams.none(),
    ): CompletableFuture<StatusRetrieveResponse> = retrieve(docId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: StatusRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatusRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: StatusRetrieveParams): CompletableFuture<StatusRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        docId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<StatusRetrieveResponse> =
        retrieve(docId, StatusRetrieveParams.none(), requestOptions)

    /**
     * A view of [StatusServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatusServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /status/{docId}/`, but is otherwise the same as
         * [StatusServiceAsync.retrieve].
         */
        fun retrieve(docId: String): CompletableFuture<HttpResponseFor<StatusRetrieveResponse>> =
            retrieve(docId, StatusRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            docId: String,
            params: StatusRetrieveParams = StatusRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatusRetrieveResponse>> =
            retrieve(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            docId: String,
            params: StatusRetrieveParams = StatusRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<StatusRetrieveResponse>> =
            retrieve(docId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: StatusRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatusRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: StatusRetrieveParams
        ): CompletableFuture<HttpResponseFor<StatusRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            docId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatusRetrieveResponse>> =
            retrieve(docId, StatusRetrieveParams.none(), requestOptions)
    }
}
