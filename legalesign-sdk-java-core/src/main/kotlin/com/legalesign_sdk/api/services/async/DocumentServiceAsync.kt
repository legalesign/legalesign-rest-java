// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.async

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentServiceAsync

    /** Create signing document */
    fun create(params: DocumentCreateParams): CompletableFuture<DocumentCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentCreateResponse>

    /** Get document */
    fun retrieve(docId: String): CompletableFuture<DocumentRetrieveResponse> =
        retrieve(docId, DocumentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentRetrieveResponse> =
        retrieve(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
    ): CompletableFuture<DocumentRetrieveResponse> = retrieve(docId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: DocumentRetrieveParams): CompletableFuture<DocumentRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        docId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentRetrieveResponse> =
        retrieve(docId, DocumentRetrieveParams.none(), requestOptions)

    /** List (unarchived) signing documents. Use /status/ if you need high-level information. */
    fun list(params: DocumentListParams): CompletableFuture<DocumentListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListResponse>

    /** Delete does not remove permanently but sets it with status 40 (removed) and archives it. */
    fun archive(docId: String): CompletableFuture<Void?> =
        archive(docId, DocumentArchiveParams.none())

    /** @see archive */
    fun archive(
        docId: String,
        params: DocumentArchiveParams = DocumentArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = archive(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see archive */
    fun archive(
        docId: String,
        params: DocumentArchiveParams = DocumentArchiveParams.none(),
    ): CompletableFuture<Void?> = archive(docId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: DocumentArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see archive */
    fun archive(params: DocumentArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(docId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        archive(docId, DocumentArchiveParams.none(), requestOptions)

    /** Get document fields */
    fun getFields(docId: String): CompletableFuture<List<DocumentGetFieldsResponse>> =
        getFields(docId, DocumentGetFieldsParams.none())

    /** @see getFields */
    fun getFields(
        docId: String,
        params: DocumentGetFieldsParams = DocumentGetFieldsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DocumentGetFieldsResponse>> =
        getFields(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see getFields */
    fun getFields(
        docId: String,
        params: DocumentGetFieldsParams = DocumentGetFieldsParams.none(),
    ): CompletableFuture<List<DocumentGetFieldsResponse>> =
        getFields(docId, params, RequestOptions.none())

    /** @see getFields */
    fun getFields(
        params: DocumentGetFieldsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DocumentGetFieldsResponse>>

    /** @see getFields */
    fun getFields(
        params: DocumentGetFieldsParams
    ): CompletableFuture<List<DocumentGetFieldsResponse>> = getFields(params, RequestOptions.none())

    /** @see getFields */
    fun getFields(
        docId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<DocumentGetFieldsResponse>> =
        getFields(docId, DocumentGetFieldsParams.none(), requestOptions)

    /**
     * Permanently deletes data and files. You must enable group automated deletion. We recommend
     * archiveDocument.
     */
    fun permanentlyDelete(docId: String): CompletableFuture<Void?> =
        permanentlyDelete(docId, DocumentPermanentlyDeleteParams.none())

    /** @see permanentlyDelete */
    fun permanentlyDelete(
        docId: String,
        params: DocumentPermanentlyDeleteParams = DocumentPermanentlyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        permanentlyDelete(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see permanentlyDelete */
    fun permanentlyDelete(
        docId: String,
        params: DocumentPermanentlyDeleteParams = DocumentPermanentlyDeleteParams.none(),
    ): CompletableFuture<Void?> = permanentlyDelete(docId, params, RequestOptions.none())

    /** @see permanentlyDelete */
    fun permanentlyDelete(
        params: DocumentPermanentlyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see permanentlyDelete */
    fun permanentlyDelete(params: DocumentPermanentlyDeleteParams): CompletableFuture<Void?> =
        permanentlyDelete(params, RequestOptions.none())

    /** @see permanentlyDelete */
    fun permanentlyDelete(docId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        permanentlyDelete(docId, DocumentPermanentlyDeleteParams.none(), requestOptions)

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /document/`, but is otherwise the same as
         * [DocumentServiceAsync.create].
         */
        fun create(
            params: DocumentCreateParams
        ): CompletableFuture<HttpResponseFor<DocumentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /document/{docId}/`, but is otherwise the same as
         * [DocumentServiceAsync.retrieve].
         */
        fun retrieve(docId: String): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>> =
            retrieve(docId, DocumentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            docId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>> =
            retrieve(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            docId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>> =
            retrieve(docId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: DocumentRetrieveParams
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            docId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>> =
            retrieve(docId, DocumentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /document/`, but is otherwise the same as
         * [DocumentServiceAsync.list].
         */
        fun list(
            params: DocumentListParams
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>>

        /**
         * Returns a raw HTTP response for `delete /document/{docId}/`, but is otherwise the same as
         * [DocumentServiceAsync.archive].
         */
        fun archive(docId: String): CompletableFuture<HttpResponse> =
            archive(docId, DocumentArchiveParams.none())

        /** @see archive */
        fun archive(
            docId: String,
            params: DocumentArchiveParams = DocumentArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see archive */
        fun archive(
            docId: String,
            params: DocumentArchiveParams = DocumentArchiveParams.none(),
        ): CompletableFuture<HttpResponse> = archive(docId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: DocumentArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see archive */
        fun archive(params: DocumentArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            docId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            archive(docId, DocumentArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /document/{docId}/fields/`, but is otherwise the
         * same as [DocumentServiceAsync.getFields].
         */
        fun getFields(
            docId: String
        ): CompletableFuture<HttpResponseFor<List<DocumentGetFieldsResponse>>> =
            getFields(docId, DocumentGetFieldsParams.none())

        /** @see getFields */
        fun getFields(
            docId: String,
            params: DocumentGetFieldsParams = DocumentGetFieldsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DocumentGetFieldsResponse>>> =
            getFields(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see getFields */
        fun getFields(
            docId: String,
            params: DocumentGetFieldsParams = DocumentGetFieldsParams.none(),
        ): CompletableFuture<HttpResponseFor<List<DocumentGetFieldsResponse>>> =
            getFields(docId, params, RequestOptions.none())

        /** @see getFields */
        fun getFields(
            params: DocumentGetFieldsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DocumentGetFieldsResponse>>>

        /** @see getFields */
        fun getFields(
            params: DocumentGetFieldsParams
        ): CompletableFuture<HttpResponseFor<List<DocumentGetFieldsResponse>>> =
            getFields(params, RequestOptions.none())

        /** @see getFields */
        fun getFields(
            docId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<DocumentGetFieldsResponse>>> =
            getFields(docId, DocumentGetFieldsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /document/{docId}/delete/`, but is otherwise the
         * same as [DocumentServiceAsync.permanentlyDelete].
         */
        fun permanentlyDelete(docId: String): CompletableFuture<HttpResponse> =
            permanentlyDelete(docId, DocumentPermanentlyDeleteParams.none())

        /** @see permanentlyDelete */
        fun permanentlyDelete(
            docId: String,
            params: DocumentPermanentlyDeleteParams = DocumentPermanentlyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            permanentlyDelete(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see permanentlyDelete */
        fun permanentlyDelete(
            docId: String,
            params: DocumentPermanentlyDeleteParams = DocumentPermanentlyDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = permanentlyDelete(docId, params, RequestOptions.none())

        /** @see permanentlyDelete */
        fun permanentlyDelete(
            params: DocumentPermanentlyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see permanentlyDelete */
        fun permanentlyDelete(
            params: DocumentPermanentlyDeleteParams
        ): CompletableFuture<HttpResponse> = permanentlyDelete(params, RequestOptions.none())

        /** @see permanentlyDelete */
        fun permanentlyDelete(
            docId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            permanentlyDelete(docId, DocumentPermanentlyDeleteParams.none(), requestOptions)
    }
}
