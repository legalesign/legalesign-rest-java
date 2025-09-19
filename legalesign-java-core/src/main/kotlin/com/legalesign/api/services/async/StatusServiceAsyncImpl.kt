// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.checkRequired
import com.legalesign.api.core.handlers.errorBodyHandler
import com.legalesign.api.core.handlers.errorHandler
import com.legalesign.api.core.handlers.jsonHandler
import com.legalesign.api.core.http.HttpMethod
import com.legalesign.api.core.http.HttpRequest
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponse.Handler
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.core.http.parseable
import com.legalesign.api.core.prepareAsync
import com.legalesign.api.models.status.StatusResponse
import com.legalesign.api.models.status.StatusRetrieveAllParams
import com.legalesign.api.models.status.StatusRetrieveAllResponse
import com.legalesign.api.models.status.StatusRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StatusServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StatusServiceAsync {

    private val withRawResponse: StatusServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatusServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusServiceAsync =
        StatusServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: StatusRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StatusResponse> =
        // get /status/{docId}/
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun retrieveAll(
        params: StatusRetrieveAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StatusRetrieveAllResponse> =
        // get /status/
        withRawResponse().retrieveAll(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatusServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatusServiceAsync.WithRawResponse =
            StatusServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<StatusResponse> =
            jsonHandler<StatusResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: StatusRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("docId", params.docId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("status", params._pathParam(0), "")
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

        private val retrieveAllHandler: Handler<StatusRetrieveAllResponse> =
            jsonHandler<StatusRetrieveAllResponse>(clientOptions.jsonMapper)

        override fun retrieveAll(
            params: StatusRetrieveAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatusRetrieveAllResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("status", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveAllHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
