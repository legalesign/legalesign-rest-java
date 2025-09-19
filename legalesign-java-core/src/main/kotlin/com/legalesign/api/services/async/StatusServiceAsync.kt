// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.status.StatusResponse
import com.legalesign.api.models.status.StatusRetrieveAllParams
import com.legalesign.api.models.status.StatusRetrieveAllResponse
import com.legalesign.api.models.status.StatusRetrieveParams
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
    fun retrieve(docId: String): CompletableFuture<StatusResponse> =
        retrieve(docId, StatusRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: StatusRetrieveParams = StatusRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatusResponse> =
        retrieve(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: StatusRetrieveParams = StatusRetrieveParams.none(),
    ): CompletableFuture<StatusResponse> = retrieve(docId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: StatusRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatusResponse>

    /** @see retrieve */
    fun retrieve(params: StatusRetrieveParams): CompletableFuture<StatusResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(docId: String, requestOptions: RequestOptions): CompletableFuture<StatusResponse> =
        retrieve(docId, StatusRetrieveParams.none(), requestOptions)

    /** Shortened faster query for status of signing documents */
    fun retrieveAll(): CompletableFuture<StatusRetrieveAllResponse> =
        retrieveAll(StatusRetrieveAllParams.none())

    /** @see retrieveAll */
    fun retrieveAll(
        params: StatusRetrieveAllParams = StatusRetrieveAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StatusRetrieveAllResponse>

    /** @see retrieveAll */
    fun retrieveAll(
        params: StatusRetrieveAllParams = StatusRetrieveAllParams.none()
    ): CompletableFuture<StatusRetrieveAllResponse> = retrieveAll(params, RequestOptions.none())

    /** @see retrieveAll */
    fun retrieveAll(requestOptions: RequestOptions): CompletableFuture<StatusRetrieveAllResponse> =
        retrieveAll(StatusRetrieveAllParams.none(), requestOptions)

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
        fun retrieve(docId: String): CompletableFuture<HttpResponseFor<StatusResponse>> =
            retrieve(docId, StatusRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            docId: String,
            params: StatusRetrieveParams = StatusRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatusResponse>> =
            retrieve(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            docId: String,
            params: StatusRetrieveParams = StatusRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<StatusResponse>> =
            retrieve(docId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: StatusRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatusResponse>>

        /** @see retrieve */
        fun retrieve(
            params: StatusRetrieveParams
        ): CompletableFuture<HttpResponseFor<StatusResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            docId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatusResponse>> =
            retrieve(docId, StatusRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /status/`, but is otherwise the same as
         * [StatusServiceAsync.retrieveAll].
         */
        fun retrieveAll(): CompletableFuture<HttpResponseFor<StatusRetrieveAllResponse>> =
            retrieveAll(StatusRetrieveAllParams.none())

        /** @see retrieveAll */
        fun retrieveAll(
            params: StatusRetrieveAllParams = StatusRetrieveAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StatusRetrieveAllResponse>>

        /** @see retrieveAll */
        fun retrieveAll(
            params: StatusRetrieveAllParams = StatusRetrieveAllParams.none()
        ): CompletableFuture<HttpResponseFor<StatusRetrieveAllResponse>> =
            retrieveAll(params, RequestOptions.none())

        /** @see retrieveAll */
        fun retrieveAll(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StatusRetrieveAllResponse>> =
            retrieveAll(StatusRetrieveAllParams.none(), requestOptions)
    }
}
