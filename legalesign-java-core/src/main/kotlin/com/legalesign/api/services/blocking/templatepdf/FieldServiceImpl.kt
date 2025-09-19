// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking.templatepdf

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
import com.legalesign.api.models.templatepdf.fields.FieldCreateParams
import com.legalesign.api.models.templatepdf.fields.FieldListParams
import com.legalesign.api.models.templatepdf.fields.FieldListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FieldServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FieldService {

    private val withRawResponse: FieldService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FieldService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FieldService =
        FieldServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: FieldCreateParams, requestOptions: RequestOptions) {
        // post /templatepdf/{pdfId}/fields/
        withRawResponse().create(params, requestOptions)
    }

    override fun list(params: FieldListParams, requestOptions: RequestOptions): FieldListResponse =
        // get /templatepdf/{pdfId}/fields/
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FieldService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FieldService.WithRawResponse =
            FieldServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: FieldCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pdfId", params.pdfId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("templatepdf", params._pathParam(0), "fields", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val listHandler: Handler<FieldListResponse> =
            jsonHandler<FieldListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FieldListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FieldListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pdfId", params.pdfId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("templatepdf", params._pathParam(0), "fields", "")
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
    }
}
