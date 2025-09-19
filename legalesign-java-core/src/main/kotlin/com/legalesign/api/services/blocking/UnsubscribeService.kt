// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.models.unsubscribe.UnsubscribeDeleteWebhookParams
import java.util.function.Consumer

interface UnsubscribeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UnsubscribeService

    /** Delete webhook */
    fun deleteWebhook(params: UnsubscribeDeleteWebhookParams) =
        deleteWebhook(params, RequestOptions.none())

    /** @see deleteWebhook */
    fun deleteWebhook(
        params: UnsubscribeDeleteWebhookParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [UnsubscribeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UnsubscribeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /unsubscribe/`, but is otherwise the same as
         * [UnsubscribeService.deleteWebhook].
         */
        @MustBeClosed
        fun deleteWebhook(params: UnsubscribeDeleteWebhookParams): HttpResponse =
            deleteWebhook(params, RequestOptions.none())

        /** @see deleteWebhook */
        @MustBeClosed
        fun deleteWebhook(
            params: UnsubscribeDeleteWebhookParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
