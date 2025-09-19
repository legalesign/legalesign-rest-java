// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.checkRequired
import com.legalesign.api.core.handlers.emptyHandler
import com.legalesign.api.core.handlers.errorBodyHandler
import com.legalesign.api.core.handlers.errorHandler
import com.legalesign.api.core.handlers.jsonHandler
import com.legalesign.api.core.http.HttpMethod
import com.legalesign.api.core.http.HttpRequest
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponse.Handler
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.core.http.json
import com.legalesign.api.core.http.parseable
import com.legalesign.api.core.prepare
import com.legalesign.api.models.document.DocumentArchiveParams
import com.legalesign.api.models.document.DocumentCreateParams
import com.legalesign.api.models.document.DocumentCreateResponse
import com.legalesign.api.models.document.DocumentDeletePermanentlyParams
import com.legalesign.api.models.document.DocumentDownloadAuditLogParams
import com.legalesign.api.models.document.DocumentGetFieldsParams
import com.legalesign.api.models.document.DocumentGetFieldsResponse
import com.legalesign.api.models.document.DocumentListParams
import com.legalesign.api.models.document.DocumentListResponse
import com.legalesign.api.models.document.DocumentPreviewParams
import com.legalesign.api.models.document.DocumentRetrieveParams
import com.legalesign.api.models.document.DocumentRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DocumentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DocumentService {

    private val withRawResponse: DocumentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocumentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService =
        DocumentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions,
    ): DocumentCreateResponse =
        // post /document/
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions,
    ): DocumentRetrieveResponse =
        // get /document/{docId}/
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions,
    ): DocumentListResponse =
        // get /document/
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(params: DocumentArchiveParams, requestOptions: RequestOptions) {
        // delete /document/{docId}/
        withRawResponse().archive(params, requestOptions)
    }

    override fun deletePermanently(
        params: DocumentDeletePermanentlyParams,
        requestOptions: RequestOptions,
    ) {
        // delete /document/{docId}/delete/
        withRawResponse().deletePermanently(params, requestOptions)
    }

    override fun downloadAuditLog(
        params: DocumentDownloadAuditLogParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /document/{docId}/auditlog/
        withRawResponse().downloadAuditLog(params, requestOptions)

    override fun getFields(
        params: DocumentGetFieldsParams,
        requestOptions: RequestOptions,
    ): List<DocumentGetFieldsResponse> =
        // get /document/{docId}/fields/
        withRawResponse().getFields(params, requestOptions).parse()

    override fun preview(params: DocumentPreviewParams, requestOptions: RequestOptions) {
        // post /document/preview/
        withRawResponse().preview(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentService.WithRawResponse =
            DocumentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DocumentCreateResponse> =
            jsonHandler<DocumentCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("document", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<DocumentRetrieveResponse> =
            jsonHandler<DocumentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("docId", params.docId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("document", params._pathParam(0), "")
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

        private val listHandler: Handler<DocumentListResponse> =
            jsonHandler<DocumentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("document", "")
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
            params: DocumentArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("docId", params.docId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("document", params._pathParam(0), "")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { archiveHandler.handle(it) }
            }
        }

        private val deletePermanentlyHandler: Handler<Void?> = emptyHandler()

        override fun deletePermanently(
            params: DocumentDeletePermanentlyParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("docId", params.docId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("document", params._pathParam(0), "delete", "")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deletePermanentlyHandler.handle(it) }
            }
        }

        override fun downloadAuditLog(
            params: DocumentDownloadAuditLogParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("docId", params.docId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("document", params._pathParam(0), "auditlog", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val getFieldsHandler: Handler<List<DocumentGetFieldsResponse>> =
            jsonHandler<List<DocumentGetFieldsResponse>>(clientOptions.jsonMapper)

        override fun getFields(
            params: DocumentGetFieldsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<DocumentGetFieldsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("docId", params.docId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("document", params._pathParam(0), "fields", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getFieldsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val previewHandler: Handler<Void?> = emptyHandler()

        override fun preview(
            params: DocumentPreviewParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("document", "preview", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { previewHandler.handle(it) }
            }
        }
    }
}
