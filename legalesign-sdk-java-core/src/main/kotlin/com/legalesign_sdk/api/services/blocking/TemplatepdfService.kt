// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign_sdk.api.core.ClientOptions
import com.legalesign_sdk.api.core.RequestOptions
import com.legalesign_sdk.api.core.http.HttpResponse
import com.legalesign_sdk.api.core.http.HttpResponseFor
import com.legalesign_sdk.api.models.templatepdf.TemplatePdf
import com.legalesign_sdk.api.models.templatepdf.TemplatepdfCreateParams
import com.legalesign_sdk.api.models.templatepdf.TemplatepdfGetEditLinkParams
import com.legalesign_sdk.api.models.templatepdf.TemplatepdfListParams
import com.legalesign_sdk.api.models.templatepdf.TemplatepdfListResponse
import com.legalesign_sdk.api.models.templatepdf.TemplatepdfRetrieveParams
import com.legalesign_sdk.api.services.blocking.templatepdf.FieldService
import java.util.function.Consumer

interface TemplatepdfService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplatepdfService

    fun fields(): FieldService

    /** Upload a PDF document you want to send to be signed */
    fun create(params: TemplatepdfCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplatepdfCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get PDF template */
    fun retrieve(pdfId: String): TemplatePdf = retrieve(pdfId, TemplatepdfRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        pdfId: String,
        params: TemplatepdfRetrieveParams = TemplatepdfRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplatePdf = retrieve(params.toBuilder().pdfId(pdfId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        pdfId: String,
        params: TemplatepdfRetrieveParams = TemplatepdfRetrieveParams.none(),
    ): TemplatePdf = retrieve(pdfId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplatepdfRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplatePdf

    /** @see retrieve */
    fun retrieve(params: TemplatepdfRetrieveParams): TemplatePdf =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(pdfId: String, requestOptions: RequestOptions): TemplatePdf =
        retrieve(pdfId, TemplatepdfRetrieveParams.none(), requestOptions)

    /** Get PDF templates */
    fun list(): TemplatepdfListResponse = list(TemplatepdfListParams.none())

    /** @see list */
    fun list(
        params: TemplatepdfListParams = TemplatepdfListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplatepdfListResponse

    /** @see list */
    fun list(
        params: TemplatepdfListParams = TemplatepdfListParams.none()
    ): TemplatepdfListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TemplatepdfListResponse =
        list(TemplatepdfListParams.none(), requestOptions)

    /** Get PDF embeddable link */
    fun getEditLink(pdfId: String): String = getEditLink(pdfId, TemplatepdfGetEditLinkParams.none())

    /** @see getEditLink */
    fun getEditLink(
        pdfId: String,
        params: TemplatepdfGetEditLinkParams = TemplatepdfGetEditLinkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = getEditLink(params.toBuilder().pdfId(pdfId).build(), requestOptions)

    /** @see getEditLink */
    fun getEditLink(
        pdfId: String,
        params: TemplatepdfGetEditLinkParams = TemplatepdfGetEditLinkParams.none(),
    ): String = getEditLink(pdfId, params, RequestOptions.none())

    /** @see getEditLink */
    fun getEditLink(
        params: TemplatepdfGetEditLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see getEditLink */
    fun getEditLink(params: TemplatepdfGetEditLinkParams): String =
        getEditLink(params, RequestOptions.none())

    /** @see getEditLink */
    fun getEditLink(pdfId: String, requestOptions: RequestOptions): String =
        getEditLink(pdfId, TemplatepdfGetEditLinkParams.none(), requestOptions)

    /**
     * A view of [TemplatepdfService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplatepdfService.WithRawResponse

        fun fields(): FieldService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /templatepdf/`, but is otherwise the same as
         * [TemplatepdfService.create].
         */
        @MustBeClosed
        fun create(params: TemplatepdfCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TemplatepdfCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /templatepdf/{pdfId}/`, but is otherwise the same as
         * [TemplatepdfService.retrieve].
         */
        @MustBeClosed
        fun retrieve(pdfId: String): HttpResponseFor<TemplatePdf> =
            retrieve(pdfId, TemplatepdfRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            pdfId: String,
            params: TemplatepdfRetrieveParams = TemplatepdfRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplatePdf> =
            retrieve(params.toBuilder().pdfId(pdfId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            pdfId: String,
            params: TemplatepdfRetrieveParams = TemplatepdfRetrieveParams.none(),
        ): HttpResponseFor<TemplatePdf> = retrieve(pdfId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TemplatepdfRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplatePdf>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TemplatepdfRetrieveParams): HttpResponseFor<TemplatePdf> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(pdfId: String, requestOptions: RequestOptions): HttpResponseFor<TemplatePdf> =
            retrieve(pdfId, TemplatepdfRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /templatepdf/`, but is otherwise the same as
         * [TemplatepdfService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TemplatepdfListResponse> = list(TemplatepdfListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplatepdfListParams = TemplatepdfListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplatepdfListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplatepdfListParams = TemplatepdfListParams.none()
        ): HttpResponseFor<TemplatepdfListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TemplatepdfListResponse> =
            list(TemplatepdfListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /templatepdf/{pdfId}/edit-link/`, but is otherwise
         * the same as [TemplatepdfService.getEditLink].
         */
        @MustBeClosed
        fun getEditLink(pdfId: String): HttpResponseFor<String> =
            getEditLink(pdfId, TemplatepdfGetEditLinkParams.none())

        /** @see getEditLink */
        @MustBeClosed
        fun getEditLink(
            pdfId: String,
            params: TemplatepdfGetEditLinkParams = TemplatepdfGetEditLinkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> =
            getEditLink(params.toBuilder().pdfId(pdfId).build(), requestOptions)

        /** @see getEditLink */
        @MustBeClosed
        fun getEditLink(
            pdfId: String,
            params: TemplatepdfGetEditLinkParams = TemplatepdfGetEditLinkParams.none(),
        ): HttpResponseFor<String> = getEditLink(pdfId, params, RequestOptions.none())

        /** @see getEditLink */
        @MustBeClosed
        fun getEditLink(
            params: TemplatepdfGetEditLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see getEditLink */
        @MustBeClosed
        fun getEditLink(params: TemplatepdfGetEditLinkParams): HttpResponseFor<String> =
            getEditLink(params, RequestOptions.none())

        /** @see getEditLink */
        @MustBeClosed
        fun getEditLink(pdfId: String, requestOptions: RequestOptions): HttpResponseFor<String> =
            getEditLink(pdfId, TemplatepdfGetEditLinkParams.none(), requestOptions)
    }
}
