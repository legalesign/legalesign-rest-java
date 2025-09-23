// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign_sdk.api.core.ClientOptions
import com.legalesign_sdk.api.core.RequestOptions
import com.legalesign_sdk.api.core.http.HttpResponse
import com.legalesign_sdk.api.core.http.HttpResponseFor
import com.legalesign_sdk.api.models.document.DocumentArchiveParams
import com.legalesign_sdk.api.models.document.DocumentCreateParams
import com.legalesign_sdk.api.models.document.DocumentCreateResponse
import com.legalesign_sdk.api.models.document.DocumentGetFieldsParams
import com.legalesign_sdk.api.models.document.DocumentGetFieldsResponse
import com.legalesign_sdk.api.models.document.DocumentListParams
import com.legalesign_sdk.api.models.document.DocumentListResponse
import com.legalesign_sdk.api.models.document.DocumentPermanentlyDeleteParams
import com.legalesign_sdk.api.models.document.DocumentRetrieveParams
import com.legalesign_sdk.api.models.document.DocumentRetrieveResponse
import java.util.function.Consumer

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService

    /** Create signing document */
    fun create(params: DocumentCreateParams): DocumentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentCreateResponse

    /** Get document */
    fun retrieve(docId: String): DocumentRetrieveResponse =
        retrieve(docId, DocumentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentRetrieveResponse = retrieve(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
    ): DocumentRetrieveResponse = retrieve(docId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: DocumentRetrieveParams): DocumentRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(docId: String, requestOptions: RequestOptions): DocumentRetrieveResponse =
        retrieve(docId, DocumentRetrieveParams.none(), requestOptions)

    /** List (unarchived) signing documents. Use /status/ if you need high-level information. */
    fun list(params: DocumentListParams): DocumentListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListResponse

    /** Delete does not remove permanently but sets it with status 40 (removed) and archives it. */
    fun archive(docId: String) = archive(docId, DocumentArchiveParams.none())

    /** @see archive */
    fun archive(
        docId: String,
        params: DocumentArchiveParams = DocumentArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see archive */
    fun archive(docId: String, params: DocumentArchiveParams = DocumentArchiveParams.none()) =
        archive(docId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: DocumentArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see archive */
    fun archive(params: DocumentArchiveParams) = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(docId: String, requestOptions: RequestOptions) =
        archive(docId, DocumentArchiveParams.none(), requestOptions)

    /** Get document fields */
    fun getFields(docId: String): List<DocumentGetFieldsResponse> =
        getFields(docId, DocumentGetFieldsParams.none())

    /** @see getFields */
    fun getFields(
        docId: String,
        params: DocumentGetFieldsParams = DocumentGetFieldsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DocumentGetFieldsResponse> =
        getFields(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see getFields */
    fun getFields(
        docId: String,
        params: DocumentGetFieldsParams = DocumentGetFieldsParams.none(),
    ): List<DocumentGetFieldsResponse> = getFields(docId, params, RequestOptions.none())

    /** @see getFields */
    fun getFields(
        params: DocumentGetFieldsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DocumentGetFieldsResponse>

    /** @see getFields */
    fun getFields(params: DocumentGetFieldsParams): List<DocumentGetFieldsResponse> =
        getFields(params, RequestOptions.none())

    /** @see getFields */
    fun getFields(docId: String, requestOptions: RequestOptions): List<DocumentGetFieldsResponse> =
        getFields(docId, DocumentGetFieldsParams.none(), requestOptions)

    /**
     * Permanently deletes data and files. You must enable group automated deletion. We recommend
     * archiveDocument.
     */
    fun permanentlyDelete(docId: String) =
        permanentlyDelete(docId, DocumentPermanentlyDeleteParams.none())

    /** @see permanentlyDelete */
    fun permanentlyDelete(
        docId: String,
        params: DocumentPermanentlyDeleteParams = DocumentPermanentlyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = permanentlyDelete(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see permanentlyDelete */
    fun permanentlyDelete(
        docId: String,
        params: DocumentPermanentlyDeleteParams = DocumentPermanentlyDeleteParams.none(),
    ) = permanentlyDelete(docId, params, RequestOptions.none())

    /** @see permanentlyDelete */
    fun permanentlyDelete(
        params: DocumentPermanentlyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see permanentlyDelete */
    fun permanentlyDelete(params: DocumentPermanentlyDeleteParams) =
        permanentlyDelete(params, RequestOptions.none())

    /** @see permanentlyDelete */
    fun permanentlyDelete(docId: String, requestOptions: RequestOptions) =
        permanentlyDelete(docId, DocumentPermanentlyDeleteParams.none(), requestOptions)

    /** A view of [DocumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /document/`, but is otherwise the same as
         * [DocumentService.create].
         */
        @MustBeClosed
        fun create(params: DocumentCreateParams): HttpResponseFor<DocumentCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentCreateResponse>

        /**
         * Returns a raw HTTP response for `get /document/{docId}/`, but is otherwise the same as
         * [DocumentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(docId: String): HttpResponseFor<DocumentRetrieveResponse> =
            retrieve(docId, DocumentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            docId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentRetrieveResponse> =
            retrieve(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            docId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        ): HttpResponseFor<DocumentRetrieveResponse> =
            retrieve(docId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DocumentRetrieveParams): HttpResponseFor<DocumentRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            docId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentRetrieveResponse> =
            retrieve(docId, DocumentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /document/`, but is otherwise the same as
         * [DocumentService.list].
         */
        @MustBeClosed
        fun list(params: DocumentListParams): HttpResponseFor<DocumentListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListResponse>

        /**
         * Returns a raw HTTP response for `delete /document/{docId}/`, but is otherwise the same as
         * [DocumentService.archive].
         */
        @MustBeClosed
        fun archive(docId: String): HttpResponse = archive(docId, DocumentArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            docId: String,
            params: DocumentArchiveParams = DocumentArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            docId: String,
            params: DocumentArchiveParams = DocumentArchiveParams.none(),
        ): HttpResponse = archive(docId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: DocumentArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see archive */
        @MustBeClosed
        fun archive(params: DocumentArchiveParams): HttpResponse =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(docId: String, requestOptions: RequestOptions): HttpResponse =
            archive(docId, DocumentArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /document/{docId}/fields/`, but is otherwise the
         * same as [DocumentService.getFields].
         */
        @MustBeClosed
        fun getFields(docId: String): HttpResponseFor<List<DocumentGetFieldsResponse>> =
            getFields(docId, DocumentGetFieldsParams.none())

        /** @see getFields */
        @MustBeClosed
        fun getFields(
            docId: String,
            params: DocumentGetFieldsParams = DocumentGetFieldsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DocumentGetFieldsResponse>> =
            getFields(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see getFields */
        @MustBeClosed
        fun getFields(
            docId: String,
            params: DocumentGetFieldsParams = DocumentGetFieldsParams.none(),
        ): HttpResponseFor<List<DocumentGetFieldsResponse>> =
            getFields(docId, params, RequestOptions.none())

        /** @see getFields */
        @MustBeClosed
        fun getFields(
            params: DocumentGetFieldsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DocumentGetFieldsResponse>>

        /** @see getFields */
        @MustBeClosed
        fun getFields(
            params: DocumentGetFieldsParams
        ): HttpResponseFor<List<DocumentGetFieldsResponse>> =
            getFields(params, RequestOptions.none())

        /** @see getFields */
        @MustBeClosed
        fun getFields(
            docId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<DocumentGetFieldsResponse>> =
            getFields(docId, DocumentGetFieldsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /document/{docId}/delete/`, but is otherwise the
         * same as [DocumentService.permanentlyDelete].
         */
        @MustBeClosed
        fun permanentlyDelete(docId: String): HttpResponse =
            permanentlyDelete(docId, DocumentPermanentlyDeleteParams.none())

        /** @see permanentlyDelete */
        @MustBeClosed
        fun permanentlyDelete(
            docId: String,
            params: DocumentPermanentlyDeleteParams = DocumentPermanentlyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = permanentlyDelete(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see permanentlyDelete */
        @MustBeClosed
        fun permanentlyDelete(
            docId: String,
            params: DocumentPermanentlyDeleteParams = DocumentPermanentlyDeleteParams.none(),
        ): HttpResponse = permanentlyDelete(docId, params, RequestOptions.none())

        /** @see permanentlyDelete */
        @MustBeClosed
        fun permanentlyDelete(
            params: DocumentPermanentlyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see permanentlyDelete */
        @MustBeClosed
        fun permanentlyDelete(params: DocumentPermanentlyDeleteParams): HttpResponse =
            permanentlyDelete(params, RequestOptions.none())

        /** @see permanentlyDelete */
        @MustBeClosed
        fun permanentlyDelete(docId: String, requestOptions: RequestOptions): HttpResponse =
            permanentlyDelete(docId, DocumentPermanentlyDeleteParams.none(), requestOptions)
    }
}
