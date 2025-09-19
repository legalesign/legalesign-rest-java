// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking.templatepdf

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.templatepdf.fields.FieldCreateParams
import com.legalesign.api.models.templatepdf.fields.FieldListParams
import com.legalesign.api.models.templatepdf.fields.FieldListResponse
import java.util.function.Consumer

interface FieldService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FieldService

    /** Replace existing pdf fields with new ones */
    fun create(pdfId: String, params: FieldCreateParams) =
        create(pdfId, params, RequestOptions.none())

    /** @see create */
    fun create(
        pdfId: String,
        params: FieldCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = create(params.toBuilder().pdfId(pdfId).build(), requestOptions)

    /** @see create */
    fun create(params: FieldCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: FieldCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get PDF template fields */
    fun list(pdfId: String): FieldListResponse = list(pdfId, FieldListParams.none())

    /** @see list */
    fun list(
        pdfId: String,
        params: FieldListParams = FieldListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FieldListResponse = list(params.toBuilder().pdfId(pdfId).build(), requestOptions)

    /** @see list */
    fun list(pdfId: String, params: FieldListParams = FieldListParams.none()): FieldListResponse =
        list(pdfId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FieldListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FieldListResponse

    /** @see list */
    fun list(params: FieldListParams): FieldListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(pdfId: String, requestOptions: RequestOptions): FieldListResponse =
        list(pdfId, FieldListParams.none(), requestOptions)

    /** A view of [FieldService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FieldService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /templatepdf/{pdfId}/fields/`, but is otherwise the
         * same as [FieldService.create].
         */
        @MustBeClosed
        fun create(pdfId: String, params: FieldCreateParams): HttpResponse =
            create(pdfId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            pdfId: String,
            params: FieldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = create(params.toBuilder().pdfId(pdfId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: FieldCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FieldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /templatepdf/{pdfId}/fields/`, but is otherwise the
         * same as [FieldService.list].
         */
        @MustBeClosed
        fun list(pdfId: String): HttpResponseFor<FieldListResponse> =
            list(pdfId, FieldListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            pdfId: String,
            params: FieldListParams = FieldListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FieldListResponse> =
            list(params.toBuilder().pdfId(pdfId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            pdfId: String,
            params: FieldListParams = FieldListParams.none(),
        ): HttpResponseFor<FieldListResponse> = list(pdfId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FieldListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FieldListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: FieldListParams): HttpResponseFor<FieldListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            pdfId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FieldListResponse> = list(pdfId, FieldListParams.none(), requestOptions)
    }
}
