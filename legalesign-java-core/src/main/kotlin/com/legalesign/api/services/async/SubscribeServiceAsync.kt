// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.models.subscribe.SubscribeCreateWebhookParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubscribeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscribeServiceAsync

    /** Create webhook */
    fun createWebhook(params: SubscribeCreateWebhookParams): CompletableFuture<Void?> =
        createWebhook(params, RequestOptions.none())

    /** @see createWebhook */
    fun createWebhook(
        params: SubscribeCreateWebhookParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [SubscribeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscribeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /subscribe/`, but is otherwise the same as
         * [SubscribeServiceAsync.createWebhook].
         */
        fun createWebhook(params: SubscribeCreateWebhookParams): CompletableFuture<HttpResponse> =
            createWebhook(params, RequestOptions.none())

        /** @see createWebhook */
        fun createWebhook(
            params: SubscribeCreateWebhookParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
