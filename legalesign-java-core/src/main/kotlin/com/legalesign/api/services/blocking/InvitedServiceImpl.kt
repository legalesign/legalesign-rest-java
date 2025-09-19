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
import com.legalesign.api.models.invited.InvitedDeleteParams
import com.legalesign.api.models.invited.InvitedListParams
import com.legalesign.api.models.invited.InvitedListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InvitedServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvitedService {

    private val withRawResponse: InvitedService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvitedService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvitedService =
        InvitedServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: InvitedListParams,
        requestOptions: RequestOptions,
    ): InvitedListResponse =
        // get /invited/
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: InvitedDeleteParams, requestOptions: RequestOptions) {
        // delete /invited/{invitedId}/
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvitedService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvitedService.WithRawResponse =
            InvitedServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<InvitedListResponse> =
            jsonHandler<InvitedListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InvitedListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvitedListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invited", "")
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
            params: InvitedDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invitedId", params.invitedId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("invited", params._pathParam(0), "")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
