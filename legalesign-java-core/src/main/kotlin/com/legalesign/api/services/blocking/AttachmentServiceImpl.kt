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
import com.legalesign.api.models.attachment.AttachmentDeleteParams
import com.legalesign.api.models.attachment.AttachmentListParams
import com.legalesign.api.models.attachment.AttachmentListResponse
import com.legalesign.api.models.attachment.AttachmentResponse
import com.legalesign.api.models.attachment.AttachmentRetrieveParams
import com.legalesign.api.models.attachment.AttachmentUploadParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AttachmentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AttachmentService {

    private val withRawResponse: AttachmentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AttachmentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttachmentService =
        AttachmentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: AttachmentRetrieveParams,
        requestOptions: RequestOptions,
    ): AttachmentResponse =
        // get /attachment/{attachmentId}/
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AttachmentListParams,
        requestOptions: RequestOptions,
    ): AttachmentListResponse =
        // get /attachment/
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AttachmentDeleteParams, requestOptions: RequestOptions) {
        // delete /attachment/{attachmentId}/
        withRawResponse().delete(params, requestOptions)
    }

    override fun upload(params: AttachmentUploadParams, requestOptions: RequestOptions) {
        // post /attachment/
        withRawResponse().upload(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AttachmentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttachmentService.WithRawResponse =
            AttachmentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<AttachmentResponse> =
            jsonHandler<AttachmentResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AttachmentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("attachmentId", params.attachmentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("attachment", params._pathParam(0), "")
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

        private val listHandler: Handler<AttachmentListResponse> =
            jsonHandler<AttachmentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AttachmentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("attachment", "")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AttachmentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("attachmentId", params.attachmentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("attachment", params._pathParam(0), "")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val uploadHandler: Handler<Void?> = emptyHandler()

        override fun upload(
            params: AttachmentUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("attachment", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { uploadHandler.handle(it) }
            }
        }
    }
}
