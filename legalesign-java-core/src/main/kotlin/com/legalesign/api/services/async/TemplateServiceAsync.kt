// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.template.TemplateArchiveParams
import com.legalesign.api.models.template.TemplateCreateParams
import com.legalesign.api.models.template.TemplateListParams
import com.legalesign.api.models.template.TemplateListResponse
import com.legalesign.api.models.template.TemplateRetrieveParams
import com.legalesign.api.models.template.TemplateRetrieveResponse
import com.legalesign.api.models.template.TemplateUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateServiceAsync

    /**
     * Create a new html/text template. This probably isn't the method you are looking for. You can
     * use the 'text' attribute in /document/ to create and send your HTML as a signing document in
     * one call.
     */
    fun create(params: TemplateCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get text template */
    fun retrieve(templateId: String): CompletableFuture<TemplateRetrieveResponse> =
        retrieve(templateId, TemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplateRetrieveResponse> =
        retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
    ): CompletableFuture<TemplateRetrieveResponse> =
        retrieve(templateId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplateRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: TemplateRetrieveParams): CompletableFuture<TemplateRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TemplateRetrieveResponse> =
        retrieve(templateId, TemplateRetrieveParams.none(), requestOptions)

    /** Update text template */
    fun update(templateId: String, params: TemplateUpdateParams): CompletableFuture<Void?> =
        update(templateId, params, RequestOptions.none())

    /** @see update */
    fun update(
        templateId: String,
        params: TemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see update */
    fun update(params: TemplateUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get text templates */
    fun list(): CompletableFuture<TemplateListResponse> = list(TemplateListParams.none())

    /** @see list */
    fun list(
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplateListResponse>

    /** @see list */
    fun list(
        params: TemplateListParams = TemplateListParams.none()
    ): CompletableFuture<TemplateListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TemplateListResponse> =
        list(TemplateListParams.none(), requestOptions)

    /**
     * Archives a template (is recoverable, i.e. not fully deleted, if you need true data deletion
     * contact us).
     */
    fun archive(templateId: String): CompletableFuture<Void?> =
        archive(templateId, TemplateArchiveParams.none())

    /** @see archive */
    fun archive(
        templateId: String,
        params: TemplateArchiveParams = TemplateArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        archive(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see archive */
    fun archive(
        templateId: String,
        params: TemplateArchiveParams = TemplateArchiveParams.none(),
    ): CompletableFuture<Void?> = archive(templateId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: TemplateArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see archive */
    fun archive(params: TemplateArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(templateId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        archive(templateId, TemplateArchiveParams.none(), requestOptions)

    /**
     * A view of [TemplateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /template/`, but is otherwise the same as
         * [TemplateServiceAsync.create].
         */
        fun create(params: TemplateCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /template/{templateId}/`, but is otherwise the same
         * as [TemplateServiceAsync.retrieve].
         */
        fun retrieve(
            templateId: String
        ): CompletableFuture<HttpResponseFor<TemplateRetrieveResponse>> =
            retrieve(templateId, TemplateRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            templateId: String,
            params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplateRetrieveResponse>> =
            retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            templateId: String,
            params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TemplateRetrieveResponse>> =
            retrieve(templateId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplateRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TemplateRetrieveParams
        ): CompletableFuture<HttpResponseFor<TemplateRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            templateId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TemplateRetrieveResponse>> =
            retrieve(templateId, TemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /template/{templateId}/`, but is otherwise the
         * same as [TemplateServiceAsync.update].
         */
        fun update(
            templateId: String,
            params: TemplateUpdateParams,
        ): CompletableFuture<HttpResponse> = update(templateId, params, RequestOptions.none())

        /** @see update */
        fun update(
            templateId: String,
            params: TemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see update */
        fun update(params: TemplateUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /template/`, but is otherwise the same as
         * [TemplateServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TemplateListResponse>> =
            list(TemplateListParams.none())

        /** @see list */
        fun list(
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplateListResponse>>

        /** @see list */
        fun list(
            params: TemplateListParams = TemplateListParams.none()
        ): CompletableFuture<HttpResponseFor<TemplateListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TemplateListResponse>> =
            list(TemplateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /template/{templateId}/`, but is otherwise the
         * same as [TemplateServiceAsync.archive].
         */
        fun archive(templateId: String): CompletableFuture<HttpResponse> =
            archive(templateId, TemplateArchiveParams.none())

        /** @see archive */
        fun archive(
            templateId: String,
            params: TemplateArchiveParams = TemplateArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see archive */
        fun archive(
            templateId: String,
            params: TemplateArchiveParams = TemplateArchiveParams.none(),
        ): CompletableFuture<HttpResponse> = archive(templateId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: TemplateArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see archive */
        fun archive(params: TemplateArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            templateId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            archive(templateId, TemplateArchiveParams.none(), requestOptions)
    }
}
