// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.document.DocumentArchiveParams
import com.legalesign.api.models.document.DocumentCreateParams
import com.legalesign.api.models.document.DocumentCreateResponse
import com.legalesign.api.models.document.DocumentDeletePermanentlyParams
import com.legalesign.api.models.document.DocumentDownloadAuditLogParams
import com.legalesign.api.models.document.DocumentGetFieldsParams
import com.legalesign.api.models.document.DocumentGetFieldsResponse
import com.legalesign.api.models.document.DocumentListParams
import com.legalesign.api.models.document.DocumentListResponse
import com.legalesign.api.models.document.DocumentPreviewParams
import com.legalesign.api.models.document.DocumentRetrieveParams
import com.legalesign.api.models.document.DocumentRetrieveResponse
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

    /**
     * Permanently deletes data and files. You must enable group automated deletion. We recommend
     * archiveDocument.
     */
    fun deletePermanently(docId: String) =
        deletePermanently(docId, DocumentDeletePermanentlyParams.none())

    /** @see deletePermanently */
    fun deletePermanently(
        docId: String,
        params: DocumentDeletePermanentlyParams = DocumentDeletePermanentlyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deletePermanently(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see deletePermanently */
    fun deletePermanently(
        docId: String,
        params: DocumentDeletePermanentlyParams = DocumentDeletePermanentlyParams.none(),
    ) = deletePermanently(docId, params, RequestOptions.none())

    /** @see deletePermanently */
    fun deletePermanently(
        params: DocumentDeletePermanentlyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deletePermanently */
    fun deletePermanently(params: DocumentDeletePermanentlyParams) =
        deletePermanently(params, RequestOptions.none())

    /** @see deletePermanently */
    fun deletePermanently(docId: String, requestOptions: RequestOptions) =
        deletePermanently(docId, DocumentDeletePermanentlyParams.none(), requestOptions)

    /** Download pdf of audit log */
    @MustBeClosed
    fun downloadAuditLog(docId: String): HttpResponse =
        downloadAuditLog(docId, DocumentDownloadAuditLogParams.none())

    /** @see downloadAuditLog */
    @MustBeClosed
    fun downloadAuditLog(
        docId: String,
        params: DocumentDownloadAuditLogParams = DocumentDownloadAuditLogParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = downloadAuditLog(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see downloadAuditLog */
    @MustBeClosed
    fun downloadAuditLog(
        docId: String,
        params: DocumentDownloadAuditLogParams = DocumentDownloadAuditLogParams.none(),
    ): HttpResponse = downloadAuditLog(docId, params, RequestOptions.none())

    /** @see downloadAuditLog */
    @MustBeClosed
    fun downloadAuditLog(
        params: DocumentDownloadAuditLogParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see downloadAuditLog */
    @MustBeClosed
    fun downloadAuditLog(params: DocumentDownloadAuditLogParams): HttpResponse =
        downloadAuditLog(params, RequestOptions.none())

    /** @see downloadAuditLog */
    @MustBeClosed
    fun downloadAuditLog(docId: String, requestOptions: RequestOptions): HttpResponse =
        downloadAuditLog(docId, DocumentDownloadAuditLogParams.none(), requestOptions)

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
     * Returns a redirect response (302) with link in the Location header to a one-use temporary URL
     * you can redirect to, to see a preview of the signing page. Follow the redirect immediately
     * since it expires after a few seconds.
     */
    fun preview() = preview(DocumentPreviewParams.none())

    /** @see preview */
    fun preview(
        params: DocumentPreviewParams = DocumentPreviewParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see preview */
    fun preview(params: DocumentPreviewParams = DocumentPreviewParams.none()) =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(requestOptions: RequestOptions) =
        preview(DocumentPreviewParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `delete /document/{docId}/delete/`, but is otherwise the
         * same as [DocumentService.deletePermanently].
         */
        @MustBeClosed
        fun deletePermanently(docId: String): HttpResponse =
            deletePermanently(docId, DocumentDeletePermanentlyParams.none())

        /** @see deletePermanently */
        @MustBeClosed
        fun deletePermanently(
            docId: String,
            params: DocumentDeletePermanentlyParams = DocumentDeletePermanentlyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deletePermanently(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see deletePermanently */
        @MustBeClosed
        fun deletePermanently(
            docId: String,
            params: DocumentDeletePermanentlyParams = DocumentDeletePermanentlyParams.none(),
        ): HttpResponse = deletePermanently(docId, params, RequestOptions.none())

        /** @see deletePermanently */
        @MustBeClosed
        fun deletePermanently(
            params: DocumentDeletePermanentlyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deletePermanently */
        @MustBeClosed
        fun deletePermanently(params: DocumentDeletePermanentlyParams): HttpResponse =
            deletePermanently(params, RequestOptions.none())

        /** @see deletePermanently */
        @MustBeClosed
        fun deletePermanently(docId: String, requestOptions: RequestOptions): HttpResponse =
            deletePermanently(docId, DocumentDeletePermanentlyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /document/{docId}/auditlog/`, but is otherwise the
         * same as [DocumentService.downloadAuditLog].
         */
        @MustBeClosed
        fun downloadAuditLog(docId: String): HttpResponse =
            downloadAuditLog(docId, DocumentDownloadAuditLogParams.none())

        /** @see downloadAuditLog */
        @MustBeClosed
        fun downloadAuditLog(
            docId: String,
            params: DocumentDownloadAuditLogParams = DocumentDownloadAuditLogParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = downloadAuditLog(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see downloadAuditLog */
        @MustBeClosed
        fun downloadAuditLog(
            docId: String,
            params: DocumentDownloadAuditLogParams = DocumentDownloadAuditLogParams.none(),
        ): HttpResponse = downloadAuditLog(docId, params, RequestOptions.none())

        /** @see downloadAuditLog */
        @MustBeClosed
        fun downloadAuditLog(
            params: DocumentDownloadAuditLogParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see downloadAuditLog */
        @MustBeClosed
        fun downloadAuditLog(params: DocumentDownloadAuditLogParams): HttpResponse =
            downloadAuditLog(params, RequestOptions.none())

        /** @see downloadAuditLog */
        @MustBeClosed
        fun downloadAuditLog(docId: String, requestOptions: RequestOptions): HttpResponse =
            downloadAuditLog(docId, DocumentDownloadAuditLogParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /document/preview/`, but is otherwise the same as
         * [DocumentService.preview].
         */
        @MustBeClosed fun preview(): HttpResponse = preview(DocumentPreviewParams.none())

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: DocumentPreviewParams = DocumentPreviewParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see preview */
        @MustBeClosed
        fun preview(params: DocumentPreviewParams = DocumentPreviewParams.none()): HttpResponse =
            preview(params, RequestOptions.none())

        /** @see preview */
        @MustBeClosed
        fun preview(requestOptions: RequestOptions): HttpResponse =
            preview(DocumentPreviewParams.none(), requestOptions)
    }
}
