// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.status.StatusResponse
import com.legalesign.api.models.status.StatusRetrieveAllParams
import com.legalesign.api.models.status.StatusRetrieveAllResponse
import com.legalesign.api.models.status.StatusRetrieveParams
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
    fun retrieve(docId: String): StatusResponse = retrieve(docId, StatusRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: StatusRetrieveParams = StatusRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatusResponse = retrieve(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: StatusRetrieveParams = StatusRetrieveParams.none(),
    ): StatusResponse = retrieve(docId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: StatusRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatusResponse

    /** @see retrieve */
    fun retrieve(params: StatusRetrieveParams): StatusResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(docId: String, requestOptions: RequestOptions): StatusResponse =
        retrieve(docId, StatusRetrieveParams.none(), requestOptions)

    /** Shortened faster query for status of signing documents */
    fun retrieveAll(): StatusRetrieveAllResponse = retrieveAll(StatusRetrieveAllParams.none())

    /** @see retrieveAll */
    fun retrieveAll(
        params: StatusRetrieveAllParams = StatusRetrieveAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatusRetrieveAllResponse

    /** @see retrieveAll */
    fun retrieveAll(
        params: StatusRetrieveAllParams = StatusRetrieveAllParams.none()
    ): StatusRetrieveAllResponse = retrieveAll(params, RequestOptions.none())

    /** @see retrieveAll */
    fun retrieveAll(requestOptions: RequestOptions): StatusRetrieveAllResponse =
        retrieveAll(StatusRetrieveAllParams.none(), requestOptions)

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
        fun retrieve(docId: String): HttpResponseFor<StatusResponse> =
            retrieve(docId, StatusRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            docId: String,
            params: StatusRetrieveParams = StatusRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatusResponse> =
            retrieve(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            docId: String,
            params: StatusRetrieveParams = StatusRetrieveParams.none(),
        ): HttpResponseFor<StatusResponse> = retrieve(docId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: StatusRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatusResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: StatusRetrieveParams): HttpResponseFor<StatusResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            docId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatusResponse> =
            retrieve(docId, StatusRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /status/`, but is otherwise the same as
         * [StatusService.retrieveAll].
         */
        @MustBeClosed
        fun retrieveAll(): HttpResponseFor<StatusRetrieveAllResponse> =
            retrieveAll(StatusRetrieveAllParams.none())

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(
            params: StatusRetrieveAllParams = StatusRetrieveAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatusRetrieveAllResponse>

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(
            params: StatusRetrieveAllParams = StatusRetrieveAllParams.none()
        ): HttpResponseFor<StatusRetrieveAllResponse> = retrieveAll(params, RequestOptions.none())

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(
            requestOptions: RequestOptions
        ): HttpResponseFor<StatusRetrieveAllResponse> =
            retrieveAll(StatusRetrieveAllParams.none(), requestOptions)
    }
}
