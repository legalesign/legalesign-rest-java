// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.notifications.NotificationListParams
import com.legalesign.api.models.notifications.NotificationListResponse
import java.util.function.Consumer

interface NotificationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationService

    /** Callbacks sent to URL of your choice */
    fun list(): List<NotificationListResponse> = list(NotificationListParams.none())

    /** @see list */
    fun list(
        params: NotificationListParams = NotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<NotificationListResponse>

    /** @see list */
    fun list(
        params: NotificationListParams = NotificationListParams.none()
    ): List<NotificationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<NotificationListResponse> =
        list(NotificationListParams.none(), requestOptions)

    /**
     * A view of [NotificationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /notifications/`, but is otherwise the same as
         * [NotificationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<NotificationListResponse>> =
            list(NotificationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationListParams = NotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<NotificationListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationListParams = NotificationListParams.none()
        ): HttpResponseFor<List<NotificationListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<NotificationListResponse>> =
            list(NotificationListParams.none(), requestOptions)
    }
}
