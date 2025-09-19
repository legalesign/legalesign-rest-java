// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.models.pdf.PdfCreatePreviewParams
import com.legalesign.api.models.pdf.PdfRetrieveParams
import java.util.function.Consumer

interface PdfService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PdfService

    /** Get the PDF for a signing document */
    @MustBeClosed
    fun retrieve(docId: String): HttpResponse = retrieve(docId, PdfRetrieveParams.none())

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(
        docId: String,
        params: PdfRetrieveParams = PdfRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = retrieve(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(
        docId: String,
        params: PdfRetrieveParams = PdfRetrieveParams.none(),
    ): HttpResponse = retrieve(docId, params, RequestOptions.none())

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(
        params: PdfRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(params: PdfRetrieveParams): HttpResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @MustBeClosed
    fun retrieve(docId: String, requestOptions: RequestOptions): HttpResponse =
        retrieve(docId, PdfRetrieveParams.none(), requestOptions)

    /** text/html document as pdf preview */
    @MustBeClosed
    fun createPreview(params: PdfCreatePreviewParams): HttpResponse =
        createPreview(params, RequestOptions.none())

    /** @see createPreview */
    @MustBeClosed
    fun createPreview(
        params: PdfCreatePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** A view of [PdfService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PdfService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /pdf/{docId}/`, but is otherwise the same as
         * [PdfService.retrieve].
         */
        @MustBeClosed
        fun retrieve(docId: String): HttpResponse = retrieve(docId, PdfRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            docId: String,
            params: PdfRetrieveParams = PdfRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            docId: String,
            params: PdfRetrieveParams = PdfRetrieveParams.none(),
        ): HttpResponse = retrieve(docId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PdfRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PdfRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(docId: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(docId, PdfRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /pdf/preview/`, but is otherwise the same as
         * [PdfService.createPreview].
         */
        @MustBeClosed
        fun createPreview(params: PdfCreatePreviewParams): HttpResponse =
            createPreview(params, RequestOptions.none())

        /** @see createPreview */
        @MustBeClosed
        fun createPreview(
            params: PdfCreatePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
