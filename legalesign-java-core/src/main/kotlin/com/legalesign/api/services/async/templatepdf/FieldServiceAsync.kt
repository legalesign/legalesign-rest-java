// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async.templatepdf

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.templatepdf.fields.FieldCreateParams
import com.legalesign.api.models.templatepdf.fields.FieldListParams
import com.legalesign.api.models.templatepdf.fields.FieldListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FieldServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FieldServiceAsync

    /** Replace existing pdf fields with new ones */
    fun create(pdfId: String, params: FieldCreateParams): CompletableFuture<Void?> =
        create(pdfId, params, RequestOptions.none())

    /** @see create */
    fun create(
        pdfId: String,
        params: FieldCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = create(params.toBuilder().pdfId(pdfId).build(), requestOptions)

    /** @see create */
    fun create(params: FieldCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FieldCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get PDF template fields */
    fun list(pdfId: String): CompletableFuture<FieldListResponse> =
        list(pdfId, FieldListParams.none())

    /** @see list */
    fun list(
        pdfId: String,
        params: FieldListParams = FieldListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FieldListResponse> =
        list(params.toBuilder().pdfId(pdfId).build(), requestOptions)

    /** @see list */
    fun list(
        pdfId: String,
        params: FieldListParams = FieldListParams.none(),
    ): CompletableFuture<FieldListResponse> = list(pdfId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FieldListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FieldListResponse>

    /** @see list */
    fun list(params: FieldListParams): CompletableFuture<FieldListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(pdfId: String, requestOptions: RequestOptions): CompletableFuture<FieldListResponse> =
        list(pdfId, FieldListParams.none(), requestOptions)

    /** A view of [FieldServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FieldServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /templatepdf/{pdfId}/fields/`, but is otherwise the
         * same as [FieldServiceAsync.create].
         */
        fun create(pdfId: String, params: FieldCreateParams): CompletableFuture<HttpResponse> =
            create(pdfId, params, RequestOptions.none())

        /** @see create */
        fun create(
            pdfId: String,
            params: FieldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(params.toBuilder().pdfId(pdfId).build(), requestOptions)

        /** @see create */
        fun create(params: FieldCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FieldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /templatepdf/{pdfId}/fields/`, but is otherwise the
         * same as [FieldServiceAsync.list].
         */
        fun list(pdfId: String): CompletableFuture<HttpResponseFor<FieldListResponse>> =
            list(pdfId, FieldListParams.none())

        /** @see list */
        fun list(
            pdfId: String,
            params: FieldListParams = FieldListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FieldListResponse>> =
            list(params.toBuilder().pdfId(pdfId).build(), requestOptions)

        /** @see list */
        fun list(
            pdfId: String,
            params: FieldListParams = FieldListParams.none(),
        ): CompletableFuture<HttpResponseFor<FieldListResponse>> =
            list(pdfId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FieldListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FieldListResponse>>

        /** @see list */
        fun list(params: FieldListParams): CompletableFuture<HttpResponseFor<FieldListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            pdfId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FieldListResponse>> =
            list(pdfId, FieldListParams.none(), requestOptions)
    }
}
