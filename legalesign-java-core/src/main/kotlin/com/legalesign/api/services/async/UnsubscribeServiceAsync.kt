// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.models.unsubscribe.UnsubscribeDeleteWebhookParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UnsubscribeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UnsubscribeServiceAsync

    /** Delete webhook */
    fun deleteWebhook(params: UnsubscribeDeleteWebhookParams): CompletableFuture<Void?> =
        deleteWebhook(params, RequestOptions.none())

    /** @see deleteWebhook */
    fun deleteWebhook(
        params: UnsubscribeDeleteWebhookParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [UnsubscribeServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UnsubscribeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /unsubscribe/`, but is otherwise the same as
         * [UnsubscribeServiceAsync.deleteWebhook].
         */
        fun deleteWebhook(params: UnsubscribeDeleteWebhookParams): CompletableFuture<HttpResponse> =
            deleteWebhook(params, RequestOptions.none())

        /** @see deleteWebhook */
        fun deleteWebhook(
            params: UnsubscribeDeleteWebhookParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
