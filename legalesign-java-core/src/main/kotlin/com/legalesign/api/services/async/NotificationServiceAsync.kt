// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.notifications.NotificationListParams
import com.legalesign.api.models.notifications.NotificationListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NotificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationServiceAsync

    /** Callbacks sent to URL of your choice */
    fun list(): CompletableFuture<List<NotificationListResponse>> =
        list(NotificationListParams.none())

    /** @see list */
    fun list(
        params: NotificationListParams = NotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<NotificationListResponse>>

    /** @see list */
    fun list(
        params: NotificationListParams = NotificationListParams.none()
    ): CompletableFuture<List<NotificationListResponse>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<NotificationListResponse>> =
        list(NotificationListParams.none(), requestOptions)

    /**
     * A view of [NotificationServiceAsync] that provides access to raw HTTP responses for each
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
        ): NotificationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /notifications/`, but is otherwise the same as
         * [NotificationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<NotificationListResponse>>> =
            list(NotificationListParams.none())

        /** @see list */
        fun list(
            params: NotificationListParams = NotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<NotificationListResponse>>>

        /** @see list */
        fun list(
            params: NotificationListParams = NotificationListParams.none()
        ): CompletableFuture<HttpResponseFor<List<NotificationListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<NotificationListResponse>>> =
            list(NotificationListParams.none(), requestOptions)
    }
}
