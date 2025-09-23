// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.async

import com.legalesign_sdk.api.core.ClientOptions
import com.legalesign_sdk.api.core.RequestOptions
import com.legalesign_sdk.api.core.http.HttpResponse
import com.legalesign_sdk.api.models.pdf.PdfRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PdfServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PdfServiceAsync

    /** Get the PDF for a signing document */
    fun retrieve(docId: String): CompletableFuture<HttpResponse> =
        retrieve(docId, PdfRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: PdfRetrieveParams = PdfRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        retrieve(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: PdfRetrieveParams = PdfRetrieveParams.none(),
    ): CompletableFuture<HttpResponse> = retrieve(docId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PdfRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see retrieve */
    fun retrieve(params: PdfRetrieveParams): CompletableFuture<HttpResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(docId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        retrieve(docId, PdfRetrieveParams.none(), requestOptions)

    /** A view of [PdfServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PdfServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /pdf/{docId}/`, but is otherwise the same as
         * [PdfServiceAsync.retrieve].
         */
        fun retrieve(docId: String): CompletableFuture<HttpResponse> =
            retrieve(docId, PdfRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            docId: String,
            params: PdfRetrieveParams = PdfRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            docId: String,
            params: PdfRetrieveParams = PdfRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(docId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PdfRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: PdfRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            docId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            retrieve(docId, PdfRetrieveParams.none(), requestOptions)
    }
}
