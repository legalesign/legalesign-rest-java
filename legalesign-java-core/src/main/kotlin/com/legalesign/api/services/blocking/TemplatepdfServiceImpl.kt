// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

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
import com.legalesign.api.core.prepare
import com.legalesign.api.models.templatepdf.TemplatePdf
import com.legalesign.api.models.templatepdf.TemplatepdfArchiveParams
import com.legalesign.api.models.templatepdf.TemplatepdfConvertTagsParams
import com.legalesign.api.models.templatepdf.TemplatepdfCreateParams
import com.legalesign.api.models.templatepdf.TemplatepdfGetEditLinkParams
import com.legalesign.api.models.templatepdf.TemplatepdfListParams
import com.legalesign.api.models.templatepdf.TemplatepdfListResponse
import com.legalesign.api.models.templatepdf.TemplatepdfRetrieveParams
import com.legalesign.api.services.blocking.templatepdf.FieldService
import com.legalesign.api.services.blocking.templatepdf.FieldServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TemplatepdfServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TemplatepdfService {

    private val withRawResponse: TemplatepdfService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val fields: FieldService by lazy { FieldServiceImpl(clientOptions) }

    override fun withRawResponse(): TemplatepdfService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplatepdfService =
        TemplatepdfServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun fields(): FieldService = fields

    override fun create(params: TemplatepdfCreateParams, requestOptions: RequestOptions) {
        // post /templatepdf/
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: TemplatepdfRetrieveParams,
        requestOptions: RequestOptions,
    ): TemplatePdf =
        // get /templatepdf/{pdfId}/
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: TemplatepdfListParams,
        requestOptions: RequestOptions,
    ): TemplatepdfListResponse =
        // get /templatepdf/
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(params: TemplatepdfArchiveParams, requestOptions: RequestOptions) {
        // post /templatepdf/{pdfId}/archive/
        withRawResponse().archive(params, requestOptions)
    }

    override fun convertTags(params: TemplatepdfConvertTagsParams, requestOptions: RequestOptions) {
        // post /templatepdf/{pdfId}/tags/
        withRawResponse().convertTags(params, requestOptions)
    }

    override fun getEditLink(
        params: TemplatepdfGetEditLinkParams,
        requestOptions: RequestOptions,
    ): String =
        // get /templatepdf/{pdfId}/edit-link/
        withRawResponse().getEditLink(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TemplatepdfService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val fields: FieldService.WithRawResponse by lazy {
            FieldServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplatepdfService.WithRawResponse =
            TemplatepdfServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun fields(): FieldService.WithRawResponse = fields

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: TemplatepdfCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("templatepdf", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<TemplatePdf> =
            jsonHandler<TemplatePdf>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TemplatepdfRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TemplatePdf> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pdfId", params.pdfId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("templatepdf", params._pathParam(0), "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<TemplatepdfListResponse> =
            jsonHandler<TemplatepdfListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TemplatepdfListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TemplatepdfListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("templatepdf", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val archiveHandler: Handler<Void?> = emptyHandler()

        override fun archive(
            params: TemplatepdfArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { archiveHandler.handle(it) }
            }
        }

        private val convertTagsHandler: Handler<Void?> = emptyHandler()

        override fun convertTags(
            params: TemplatepdfConvertTagsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { convertTagsHandler.handle(it) }
            }
        }

        private val getEditLinkHandler: Handler<String> = stringHandler()

        override fun getEditLink(
            params: TemplatepdfGetEditLinkParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pdfId", params.pdfId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("templatepdf", params._pathParam(0), "edit-link", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getEditLinkHandler.handle(it) }
            }
        }
    }
}
