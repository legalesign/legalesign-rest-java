// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.handlers.emptyHandler
import com.legalesign.api.core.handlers.errorBodyHandler
import com.legalesign.api.core.handlers.errorHandler
import com.legalesign.api.core.http.HttpMethod
import com.legalesign.api.core.http.HttpRequest
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponse.Handler
import com.legalesign.api.core.http.json
import com.legalesign.api.core.http.parseable
import com.legalesign.api.core.prepareAsync
import com.legalesign.api.models.subscribe.SubscribeCreateWebhookParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SubscribeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SubscribeServiceAsync {

    private val withRawResponse: SubscribeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubscribeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscribeServiceAsync =
        SubscribeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createWebhook(
        params: SubscribeCreateWebhookParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /subscribe/
        withRawResponse().createWebhook(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubscribeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscribeServiceAsync.WithRawResponse =
            SubscribeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createWebhookHandler: Handler<Void?> = emptyHandler()

        override fun createWebhook(
            params: SubscribeCreateWebhookParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("subscribe", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createWebhookHandler.handle(it) }
                    }
                }
        }
    }
}
