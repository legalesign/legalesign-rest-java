// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.models.subscribe.SubscribeCreateWebhookParams
import java.util.function.Consumer

interface SubscribeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscribeService

    /** Create webhook */
    fun createWebhook(params: SubscribeCreateWebhookParams) =
        createWebhook(params, RequestOptions.none())

    /** @see createWebhook */
    fun createWebhook(
        params: SubscribeCreateWebhookParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [SubscribeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscribeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /subscribe/`, but is otherwise the same as
         * [SubscribeService.createWebhook].
         */
        @MustBeClosed
        fun createWebhook(params: SubscribeCreateWebhookParams): HttpResponse =
            createWebhook(params, RequestOptions.none())

        /** @see createWebhook */
        @MustBeClosed
        fun createWebhook(
            params: SubscribeCreateWebhookParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
