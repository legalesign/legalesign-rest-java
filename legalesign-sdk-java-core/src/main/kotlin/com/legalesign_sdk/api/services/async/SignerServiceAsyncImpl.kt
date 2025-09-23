// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.async

import com.legalesign_sdk.api.core.ClientOptions
import com.legalesign_sdk.api.core.RequestOptions
import com.legalesign_sdk.api.core.checkRequired
import com.legalesign_sdk.api.core.handlers.emptyHandler
import com.legalesign_sdk.api.core.handlers.errorBodyHandler
import com.legalesign_sdk.api.core.handlers.errorHandler
import com.legalesign_sdk.api.core.handlers.jsonHandler
import com.legalesign_sdk.api.core.http.HttpMethod
import com.legalesign_sdk.api.core.http.HttpRequest
import com.legalesign_sdk.api.core.http.HttpResponse
import com.legalesign_sdk.api.core.http.HttpResponse.Handler
import com.legalesign_sdk.api.core.http.HttpResponseFor
import com.legalesign_sdk.api.core.http.json
import com.legalesign_sdk.api.core.http.parseable
import com.legalesign_sdk.api.core.prepareAsync
import com.legalesign_sdk.api.models.signer.SignerGetAccessLinkParams
import com.legalesign_sdk.api.models.signer.SignerRetrieveFieldsParams
import com.legalesign_sdk.api.models.signer.SignerRetrieveFieldsResponse
import com.legalesign_sdk.api.models.signer.SignerRetrieveParams
import com.legalesign_sdk.api.models.signer.SignerRetrieveResponse
import com.legalesign_sdk.api.models.signer.SignerSendReminderParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SignerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SignerServiceAsync {

    private val withRawResponse: SignerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SignerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SignerServiceAsync =
        SignerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: SignerRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SignerRetrieveResponse> =
        // get /signer/{signerId}/
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun getAccessLink(
        params: SignerGetAccessLinkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /signer/{signerId}/new-link/
        withRawResponse().getAccessLink(params, requestOptions).thenAccept {}

    override fun retrieveFields(
        params: SignerRetrieveFieldsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<SignerRetrieveFieldsResponse>> =
        // get /signer/{signerId}/fields1/
        withRawResponse().retrieveFields(params, requestOptions).thenApply { it.parse() }

    override fun sendReminder(
        params: SignerSendReminderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /signer/{signerId}/send-reminder/
        withRawResponse().sendReminder(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SignerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SignerServiceAsync.WithRawResponse =
            SignerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<SignerRetrieveResponse> =
            jsonHandler<SignerRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SignerRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SignerRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("signerId", params.signerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("signer", params._pathParam(0), "")
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

        private val getAccessLinkHandler: Handler<Void?> = emptyHandler()

        override fun getAccessLink(
            params: SignerGetAccessLinkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("signerId", params.signerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("signer", params._pathParam(0), "new-link", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { getAccessLinkHandler.handle(it) }
                    }
                }
        }

        private val retrieveFieldsHandler: Handler<List<SignerRetrieveFieldsResponse>> =
            jsonHandler<List<SignerRetrieveFieldsResponse>>(clientOptions.jsonMapper)

        override fun retrieveFields(
            params: SignerRetrieveFieldsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<SignerRetrieveFieldsResponse>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("signerId", params.signerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("signer", params._pathParam(0), "fields1", "")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveFieldsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val sendReminderHandler: Handler<Void?> = emptyHandler()

        override fun sendReminder(
            params: SignerSendReminderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("signerId", params.signerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("signer", params._pathParam(0), "send-reminder", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { sendReminderHandler.handle(it) }
                    }
                }
        }
    }
}
