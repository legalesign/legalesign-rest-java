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
import com.legalesign.api.models.signer.SignerGetAccessLinkParams
import com.legalesign.api.models.signer.SignerGetRejectionReasonParams
import com.legalesign.api.models.signer.SignerGetRejectionReasonResponse
import com.legalesign.api.models.signer.SignerResetParams
import com.legalesign.api.models.signer.SignerRetrieveFieldsParams
import com.legalesign.api.models.signer.SignerRetrieveFieldsResponse
import com.legalesign.api.models.signer.SignerRetrieveParams
import com.legalesign.api.models.signer.SignerRetrieveResponse
import com.legalesign.api.models.signer.SignerSendReminderParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SignerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SignerService {

    private val withRawResponse: SignerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SignerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SignerService =
        SignerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: SignerRetrieveParams,
        requestOptions: RequestOptions,
    ): SignerRetrieveResponse =
        // get /signer/{signerId}/
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun getAccessLink(params: SignerGetAccessLinkParams, requestOptions: RequestOptions) {
        // get /signer/{signerId}/new-link/
        withRawResponse().getAccessLink(params, requestOptions)
    }

    override fun getRejectionReason(
        params: SignerGetRejectionReasonParams,
        requestOptions: RequestOptions,
    ): SignerGetRejectionReasonResponse =
        // get /signer/{signerId}/rejection/
        withRawResponse().getRejectionReason(params, requestOptions).parse()

    override fun reset(params: SignerResetParams, requestOptions: RequestOptions) {
        // post /signer/{signerId}/reset/
        withRawResponse().reset(params, requestOptions)
    }

    override fun retrieveFields(
        params: SignerRetrieveFieldsParams,
        requestOptions: RequestOptions,
    ): List<SignerRetrieveFieldsResponse> =
        // get /signer/{signerId}/fields1/
        withRawResponse().retrieveFields(params, requestOptions).parse()

    override fun sendReminder(params: SignerSendReminderParams, requestOptions: RequestOptions) {
        // post /signer/{signerId}/send-reminder/
        withRawResponse().sendReminder(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SignerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SignerService.WithRawResponse =
            SignerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<SignerRetrieveResponse> =
            jsonHandler<SignerRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SignerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SignerRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("signerId", params.signerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("signer", params._pathParam(0), "")
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

        private val getAccessLinkHandler: Handler<Void?> = emptyHandler()

        override fun getAccessLink(
            params: SignerGetAccessLinkParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("signerId", params.signerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("signer", params._pathParam(0), "new-link", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getAccessLinkHandler.handle(it) }
            }
        }

        private val getRejectionReasonHandler: Handler<SignerGetRejectionReasonResponse> =
            jsonHandler<SignerGetRejectionReasonResponse>(clientOptions.jsonMapper)

        override fun getRejectionReason(
            params: SignerGetRejectionReasonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SignerGetRejectionReasonResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("signerId", params.signerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("signer", params._pathParam(0), "rejection", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getRejectionReasonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val resetHandler: Handler<Void?> = emptyHandler()

        override fun reset(
            params: SignerResetParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("signerId", params.signerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("signer", params._pathParam(0), "reset", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { resetHandler.handle(it) }
            }
        }

        private val retrieveFieldsHandler: Handler<List<SignerRetrieveFieldsResponse>> =
            jsonHandler<List<SignerRetrieveFieldsResponse>>(clientOptions.jsonMapper)

        override fun retrieveFields(
            params: SignerRetrieveFieldsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SignerRetrieveFieldsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("signerId", params.signerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("signer", params._pathParam(0), "fields1", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveFieldsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val sendReminderHandler: Handler<Void?> = emptyHandler()

        override fun sendReminder(
            params: SignerSendReminderParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { sendReminderHandler.handle(it) }
            }
        }
    }
}
