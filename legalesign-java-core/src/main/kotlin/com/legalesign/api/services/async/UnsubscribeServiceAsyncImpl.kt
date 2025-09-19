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
import com.legalesign.api.models.unsubscribe.UnsubscribeDeleteWebhookParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class UnsubscribeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UnsubscribeServiceAsync {

    private val withRawResponse: UnsubscribeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UnsubscribeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UnsubscribeServiceAsync =
        UnsubscribeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun deleteWebhook(
        params: UnsubscribeDeleteWebhookParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /unsubscribe/
        withRawResponse().deleteWebhook(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UnsubscribeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UnsubscribeServiceAsync.WithRawResponse =
            UnsubscribeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteWebhookHandler: Handler<Void?> = emptyHandler()

        override fun deleteWebhook(
            params: UnsubscribeDeleteWebhookParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("unsubscribe", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteWebhookHandler.handle(it) }
                    }
                }
        }
    }
}
