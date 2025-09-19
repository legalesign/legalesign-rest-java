// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface TemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService

    /**
     * Create a new html/text template. This probably isn't the method you are looking for. You can
     * use the 'text' attribute in /document/ to create and send your HTML as a signing document in
     * one call.
     */
    fun create(params: TemplateCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: TemplateCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get text template */
    fun retrieve(templateId: String): TemplateRetrieveResponse =
        retrieve(templateId, TemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplateRetrieveResponse =
        retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
    ): TemplateRetrieveResponse = retrieve(templateId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplateRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: TemplateRetrieveParams): TemplateRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(templateId: String, requestOptions: RequestOptions): TemplateRetrieveResponse =
        retrieve(templateId, TemplateRetrieveParams.none(), requestOptions)

    /** Update text template */
    fun update(templateId: String, params: TemplateUpdateParams) =
        update(templateId, params, RequestOptions.none())

    /** @see update */
    fun update(
        templateId: String,
        params: TemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see update */
    fun update(params: TemplateUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: TemplateUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get text templates */
    fun list(): TemplateListResponse = list(TemplateListParams.none())

    /** @see list */
    fun list(
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplateListResponse

    /** @see list */
    fun list(params: TemplateListParams = TemplateListParams.none()): TemplateListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TemplateListResponse =
        list(TemplateListParams.none(), requestOptions)

    /**
     * Archives a template (is recoverable, i.e. not fully deleted, if you need true data deletion
     * contact us).
     */
    fun archive(templateId: String) = archive(templateId, TemplateArchiveParams.none())

    /** @see archive */
    fun archive(
        templateId: String,
        params: TemplateArchiveParams = TemplateArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see archive */
    fun archive(templateId: String, params: TemplateArchiveParams = TemplateArchiveParams.none()) =
        archive(templateId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: TemplateArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see archive */
    fun archive(params: TemplateArchiveParams) = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(templateId: String, requestOptions: RequestOptions) =
        archive(templateId, TemplateArchiveParams.none(), requestOptions)

    /** A view of [TemplateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /template/`, but is otherwise the same as
         * [TemplateService.create].
         */
        @MustBeClosed
        fun create(params: TemplateCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /template/{templateId}/`, but is otherwise the same
         * as [TemplateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(templateId: String): HttpResponseFor<TemplateRetrieveResponse> =
            retrieve(templateId, TemplateRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplateRetrieveResponse> =
            retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
        ): HttpResponseFor<TemplateRetrieveResponse> =
            retrieve(templateId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplateRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TemplateRetrieveParams): HttpResponseFor<TemplateRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TemplateRetrieveResponse> =
            retrieve(templateId, TemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /template/{templateId}/`, but is otherwise the
         * same as [TemplateService.update].
         */
        @MustBeClosed
        fun update(templateId: String, params: TemplateUpdateParams): HttpResponse =
            update(templateId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            templateId: String,
            params: TemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TemplateUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /template/`, but is otherwise the same as
         * [TemplateService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TemplateListResponse> = list(TemplateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplateListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplateListParams = TemplateListParams.none()
        ): HttpResponseFor<TemplateListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TemplateListResponse> =
            list(TemplateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /template/{templateId}/`, but is otherwise the
         * same as [TemplateService.archive].
         */
        @MustBeClosed
        fun archive(templateId: String): HttpResponse =
            archive(templateId, TemplateArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            templateId: String,
            params: TemplateArchiveParams = TemplateArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            templateId: String,
            params: TemplateArchiveParams = TemplateArchiveParams.none(),
        ): HttpResponse = archive(templateId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: TemplateArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see archive */
        @MustBeClosed
        fun archive(params: TemplateArchiveParams): HttpResponse =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(templateId: String, requestOptions: RequestOptions): HttpResponse =
            archive(templateId, TemplateArchiveParams.none(), requestOptions)
    }
}
