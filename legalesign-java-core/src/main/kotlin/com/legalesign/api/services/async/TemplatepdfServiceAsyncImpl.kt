// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.checkRequired
import com.legalesign.api.core.handlers.emptyHandler
import com.legalesign.api.core.handlers.errorBodyHandler
import com.legalesign.api.core.handlers.errorHandler
import com.legalesign.api.core.handlers.jsonHandler
import com.legalesign.api.core.handlers.stringHandler
import com.legalesign.api.core.http.HttpMethod
import com.legalesign.api.core.http.HttpRequest
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponse.Handler
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.core.http.json
import com.legalesign.api.core.http.parseable
import com.legalesign.api.core.prepareAsync
import com.legalesign.api.models.templatepdf.TemplatePdf
import com.legalesign.api.models.templatepdf.TemplatepdfArchiveParams
import com.legalesign.api.models.templatepdf.TemplatepdfConvertTagsParams
import com.legalesign.api.models.templatepdf.TemplatepdfCreateParams
import com.legalesign.api.models.templatepdf.TemplatepdfGetEditLinkParams
import com.legalesign.api.models.templatepdf.TemplatepdfListParams
import com.legalesign.api.models.templatepdf.TemplatepdfListResponse
import com.legalesign.api.models.templatepdf.TemplatepdfRetrieveParams
import com.legalesign.api.services.async.templatepdf.FieldServiceAsync
import com.legalesign.api.services.async.templatepdf.FieldServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TemplatepdfServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TemplatepdfServiceAsync {

    private val withRawResponse: TemplatepdfServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val fields: FieldServiceAsync by lazy { FieldServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TemplatepdfServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplatepdfServiceAsync =
        TemplatepdfServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun fields(): FieldServiceAsync = fields

    override fun create(
        params: TemplatepdfCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /templatepdf/
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(
        params: TemplatepdfRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TemplatePdf> =
        // get /templatepdf/{pdfId}/
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TemplatepdfListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TemplatepdfListResponse> =
        // get /templatepdf/
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: TemplatepdfArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /templatepdf/{pdfId}/archive/
        withRawResponse().archive(params, requestOptions).thenAccept {}

    override fun convertTags(
        params: TemplatepdfConvertTagsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /templatepdf/{pdfId}/tags/
        withRawResponse().convertTags(params, requestOptions).thenAccept {}

    override fun getEditLink(
        params: TemplatepdfGetEditLinkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /templatepdf/{pdfId}/edit-link/
        withRawResponse().getEditLink(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TemplatepdfServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val fields: FieldServiceAsync.WithRawResponse by lazy {
            FieldServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplatepdfServiceAsync.WithRawResponse =
            TemplatepdfServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun fields(): FieldServiceAsync.WithRawResponse = fields

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: TemplatepdfCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("templatepdf", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createHandler.handle(it) }
                    }
                }
        }

        private val retrieveHandler: Handler<TemplatePdf> =
            jsonHandler<TemplatePdf>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TemplatepdfRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TemplatePdf>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pdfId", params.pdfId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("templatepdf", params._pathParam(0), "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<TemplatepdfListResponse> =
            jsonHandler<TemplatepdfListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TemplatepdfListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TemplatepdfListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("templatepdf", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val archiveHandler: Handler<Void?> = emptyHandler()

        override fun archive(
            params: TemplatepdfArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pdfId", params.pdfId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("templatepdf", params._pathParam(0), "archive", "")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { archiveHandler.handle(it) }
                    }
                }
        }

        private val convertTagsHandler: Handler<Void?> = emptyHandler()

        override fun convertTags(
            params: TemplatepdfConvertTagsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pdfId", params.pdfId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("templatepdf", params._pathParam(0), "tags", "")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { convertTagsHandler.handle(it) }
                    }
                }
        }

        private val getEditLinkHandler: Handler<String> = stringHandler()

        override fun getEditLink(
            params: TemplatepdfGetEditLinkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pdfId", params.pdfId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("templatepdf", params._pathParam(0), "edit-link", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { getEditLinkHandler.handle(it) }
                    }
                }
        }
    }
}
