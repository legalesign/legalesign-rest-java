// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.async

import com.legalesign_sdk.api.core.ClientOptions
import com.legalesign_sdk.api.core.RequestOptions
import com.legalesign_sdk.api.core.http.HttpResponse
import com.legalesign_sdk.api.core.http.HttpResponseFor
import com.legalesign_sdk.api.models.template.TemplateCreateParams
import com.legalesign_sdk.api.models.template.TemplateListParams
import com.legalesign_sdk.api.models.template.TemplateListResponse
import com.legalesign_sdk.api.models.template.TemplateRetrieveParams
import com.legalesign_sdk.api.models.template.TemplateRetrieveResponse
import com.legalesign_sdk.api.models.template.TemplateUpdateParams
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
    }
}
