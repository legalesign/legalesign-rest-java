// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.templatepdf.TemplatePdf
import com.legalesign.api.models.templatepdf.TemplatepdfArchiveParams
import com.legalesign.api.models.templatepdf.TemplatepdfConvertTagsParams
import com.legalesign.api.models.templatepdf.TemplatepdfCreateParams
import com.legalesign.api.models.templatepdf.TemplatepdfGetEditLinkParams
import com.legalesign.api.models.templatepdf.TemplatepdfListParams
import com.legalesign.api.models.templatepdf.TemplatepdfListResponse
import com.legalesign.api.models.templatepdf.TemplatepdfRetrieveParams
import com.legalesign.api.services.async.templatepdf.FieldServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TemplatepdfServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplatepdfServiceAsync

    fun fields(): FieldServiceAsync

    /** Upload a PDF document you want to send to be signed */
    fun create(params: TemplatepdfCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplatepdfCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get PDF template */
    fun retrieve(pdfId: String): CompletableFuture<TemplatePdf> =
        retrieve(pdfId, TemplatepdfRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        pdfId: String,
        params: TemplatepdfRetrieveParams = TemplatepdfRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplatePdf> =
        retrieve(params.toBuilder().pdfId(pdfId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        pdfId: String,
        params: TemplatepdfRetrieveParams = TemplatepdfRetrieveParams.none(),
    ): CompletableFuture<TemplatePdf> = retrieve(pdfId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplatepdfRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplatePdf>

    /** @see retrieve */
    fun retrieve(params: TemplatepdfRetrieveParams): CompletableFuture<TemplatePdf> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(pdfId: String, requestOptions: RequestOptions): CompletableFuture<TemplatePdf> =
        retrieve(pdfId, TemplatepdfRetrieveParams.none(), requestOptions)

    /** Get PDF templates */
    fun list(): CompletableFuture<TemplatepdfListResponse> = list(TemplatepdfListParams.none())

    /** @see list */
    fun list(
        params: TemplatepdfListParams = TemplatepdfListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplatepdfListResponse>

    /** @see list */
    fun list(
        params: TemplatepdfListParams = TemplatepdfListParams.none()
    ): CompletableFuture<TemplatepdfListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TemplatepdfListResponse> =
        list(TemplatepdfListParams.none(), requestOptions)

    /** Delists the PDF */
    fun archive(pdfId: String): CompletableFuture<Void?> =
        archive(pdfId, TemplatepdfArchiveParams.none())

    /** @see archive */
    fun archive(
        pdfId: String,
        params: TemplatepdfArchiveParams = TemplatepdfArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = archive(params.toBuilder().pdfId(pdfId).build(), requestOptions)

    /** @see archive */
    fun archive(
        pdfId: String,
        params: TemplatepdfArchiveParams = TemplatepdfArchiveParams.none(),
    ): CompletableFuture<Void?> = archive(pdfId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: TemplatepdfArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see archive */
    fun archive(params: TemplatepdfArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(pdfId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        archive(pdfId, TemplatepdfArchiveParams.none(), requestOptions)

    /** Convert any text tags in the PDF into fields */
    fun convertTags(pdfId: String): CompletableFuture<Void?> =
        convertTags(pdfId, TemplatepdfConvertTagsParams.none())

    /** @see convertTags */
    fun convertTags(
        pdfId: String,
        params: TemplatepdfConvertTagsParams = TemplatepdfConvertTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        convertTags(params.toBuilder().pdfId(pdfId).build(), requestOptions)

    /** @see convertTags */
    fun convertTags(
        pdfId: String,
        params: TemplatepdfConvertTagsParams = TemplatepdfConvertTagsParams.none(),
    ): CompletableFuture<Void?> = convertTags(pdfId, params, RequestOptions.none())

    /** @see convertTags */
    fun convertTags(
        params: TemplatepdfConvertTagsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see convertTags */
    fun convertTags(params: TemplatepdfConvertTagsParams): CompletableFuture<Void?> =
        convertTags(params, RequestOptions.none())

    /** @see convertTags */
    fun convertTags(pdfId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        convertTags(pdfId, TemplatepdfConvertTagsParams.none(), requestOptions)

    /** Get PDF embeddable link */
    fun getEditLink(pdfId: String): CompletableFuture<String> =
        getEditLink(pdfId, TemplatepdfGetEditLinkParams.none())

    /** @see getEditLink */
    fun getEditLink(
        pdfId: String,
        params: TemplatepdfGetEditLinkParams = TemplatepdfGetEditLinkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String> =
        getEditLink(params.toBuilder().pdfId(pdfId).build(), requestOptions)

    /** @see getEditLink */
    fun getEditLink(
        pdfId: String,
        params: TemplatepdfGetEditLinkParams = TemplatepdfGetEditLinkParams.none(),
    ): CompletableFuture<String> = getEditLink(pdfId, params, RequestOptions.none())

    /** @see getEditLink */
    fun getEditLink(
        params: TemplatepdfGetEditLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see getEditLink */
    fun getEditLink(params: TemplatepdfGetEditLinkParams): CompletableFuture<String> =
        getEditLink(params, RequestOptions.none())

    /** @see getEditLink */
    fun getEditLink(pdfId: String, requestOptions: RequestOptions): CompletableFuture<String> =
        getEditLink(pdfId, TemplatepdfGetEditLinkParams.none(), requestOptions)

    /**
     * A view of [TemplatepdfServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplatepdfServiceAsync.WithRawResponse

        fun fields(): FieldServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /templatepdf/`, but is otherwise the same as
         * [TemplatepdfServiceAsync.create].
         */
        fun create(params: TemplatepdfCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TemplatepdfCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /templatepdf/{pdfId}/`, but is otherwise the same as
         * [TemplatepdfServiceAsync.retrieve].
         */
        fun retrieve(pdfId: String): CompletableFuture<HttpResponseFor<TemplatePdf>> =
            retrieve(pdfId, TemplatepdfRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            pdfId: String,
            params: TemplatepdfRetrieveParams = TemplatepdfRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplatePdf>> =
            retrieve(params.toBuilder().pdfId(pdfId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            pdfId: String,
            params: TemplatepdfRetrieveParams = TemplatepdfRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TemplatePdf>> =
            retrieve(pdfId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TemplatepdfRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplatePdf>>

        /** @see retrieve */
        fun retrieve(
            params: TemplatepdfRetrieveParams
        ): CompletableFuture<HttpResponseFor<TemplatePdf>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            pdfId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TemplatePdf>> =
            retrieve(pdfId, TemplatepdfRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /templatepdf/`, but is otherwise the same as
         * [TemplatepdfServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TemplatepdfListResponse>> =
            list(TemplatepdfListParams.none())

        /** @see list */
        fun list(
            params: TemplatepdfListParams = TemplatepdfListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplatepdfListResponse>>

        /** @see list */
        fun list(
            params: TemplatepdfListParams = TemplatepdfListParams.none()
        ): CompletableFuture<HttpResponseFor<TemplatepdfListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TemplatepdfListResponse>> =
            list(TemplatepdfListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /templatepdf/{pdfId}/archive/`, but is otherwise
         * the same as [TemplatepdfServiceAsync.archive].
         */
        fun archive(pdfId: String): CompletableFuture<HttpResponse> =
            archive(pdfId, TemplatepdfArchiveParams.none())

        /** @see archive */
        fun archive(
            pdfId: String,
            params: TemplatepdfArchiveParams = TemplatepdfArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(params.toBuilder().pdfId(pdfId).build(), requestOptions)

        /** @see archive */
        fun archive(
            pdfId: String,
            params: TemplatepdfArchiveParams = TemplatepdfArchiveParams.none(),
        ): CompletableFuture<HttpResponse> = archive(pdfId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: TemplatepdfArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see archive */
        fun archive(params: TemplatepdfArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            pdfId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            archive(pdfId, TemplatepdfArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /templatepdf/{pdfId}/tags/`, but is otherwise the
         * same as [TemplatepdfServiceAsync.convertTags].
         */
        fun convertTags(pdfId: String): CompletableFuture<HttpResponse> =
            convertTags(pdfId, TemplatepdfConvertTagsParams.none())

        /** @see convertTags */
        fun convertTags(
            pdfId: String,
            params: TemplatepdfConvertTagsParams = TemplatepdfConvertTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            convertTags(params.toBuilder().pdfId(pdfId).build(), requestOptions)

        /** @see convertTags */
        fun convertTags(
            pdfId: String,
            params: TemplatepdfConvertTagsParams = TemplatepdfConvertTagsParams.none(),
        ): CompletableFuture<HttpResponse> = convertTags(pdfId, params, RequestOptions.none())

        /** @see convertTags */
        fun convertTags(
            params: TemplatepdfConvertTagsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see convertTags */
        fun convertTags(params: TemplatepdfConvertTagsParams): CompletableFuture<HttpResponse> =
            convertTags(params, RequestOptions.none())

        /** @see convertTags */
        fun convertTags(
            pdfId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            convertTags(pdfId, TemplatepdfConvertTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /templatepdf/{pdfId}/edit-link/`, but is otherwise
         * the same as [TemplatepdfServiceAsync.getEditLink].
         */
        fun getEditLink(pdfId: String): CompletableFuture<HttpResponseFor<String>> =
            getEditLink(pdfId, TemplatepdfGetEditLinkParams.none())

        /** @see getEditLink */
        fun getEditLink(
            pdfId: String,
            params: TemplatepdfGetEditLinkParams = TemplatepdfGetEditLinkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            getEditLink(params.toBuilder().pdfId(pdfId).build(), requestOptions)

        /** @see getEditLink */
        fun getEditLink(
            pdfId: String,
            params: TemplatepdfGetEditLinkParams = TemplatepdfGetEditLinkParams.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            getEditLink(pdfId, params, RequestOptions.none())

        /** @see getEditLink */
        fun getEditLink(
            params: TemplatepdfGetEditLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see getEditLink */
        fun getEditLink(
            params: TemplatepdfGetEditLinkParams
        ): CompletableFuture<HttpResponseFor<String>> = getEditLink(params, RequestOptions.none())

        /** @see getEditLink */
        fun getEditLink(
            pdfId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> =
            getEditLink(pdfId, TemplatepdfGetEditLinkParams.none(), requestOptions)
    }
}
