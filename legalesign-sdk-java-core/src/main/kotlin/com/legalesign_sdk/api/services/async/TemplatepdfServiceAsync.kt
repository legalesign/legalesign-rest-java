// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.async

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
import com.legalesign_sdk.api.services.async.templatepdf.FieldServiceAsync
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
