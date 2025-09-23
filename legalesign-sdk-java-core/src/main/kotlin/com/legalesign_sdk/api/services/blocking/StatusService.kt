// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign_sdk.api.core.ClientOptions
import com.legalesign_sdk.api.core.RequestOptions
import com.legalesign_sdk.api.core.http.HttpResponseFor
import com.legalesign_sdk.api.models.status.StatusRetrieveParams
import com.legalesign_sdk.api.models.status.StatusRetrieveResponse
import java.util.function.Consumer

interface StatusService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusService

    /** Faster short query for a document status */
    fun retrieve(docId: String): StatusRetrieveResponse =
        retrieve(docId, StatusRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: StatusRetrieveParams = StatusRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatusRetrieveResponse = retrieve(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: StatusRetrieveParams = StatusRetrieveParams.none(),
    ): StatusRetrieveResponse = retrieve(docId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: StatusRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatusRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: StatusRetrieveParams): StatusRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(docId: String, requestOptions: RequestOptions): StatusRetrieveResponse =
        retrieve(docId, StatusRetrieveParams.none(), requestOptions)

    /** A view of [StatusService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /status/{docId}/`, but is otherwise the same as
         * [StatusService.retrieve].
         */
        @MustBeClosed
        fun retrieve(docId: String): HttpResponseFor<StatusRetrieveResponse> =
            retrieve(docId, StatusRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            docId: String,
            params: StatusRetrieveParams = StatusRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatusRetrieveResponse> =
            retrieve(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            docId: String,
            params: StatusRetrieveParams = StatusRetrieveParams.none(),
        ): HttpResponseFor<StatusRetrieveResponse> = retrieve(docId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: StatusRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatusRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: StatusRetrieveParams): HttpResponseFor<StatusRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            docId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatusRetrieveResponse> =
            retrieve(docId, StatusRetrieveParams.none(), requestOptions)
    }
}
