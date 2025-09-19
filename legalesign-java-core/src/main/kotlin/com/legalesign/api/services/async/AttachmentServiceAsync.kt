// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.attachment.AttachmentDeleteParams
import com.legalesign.api.models.attachment.AttachmentListParams
import com.legalesign.api.models.attachment.AttachmentListResponse
import com.legalesign.api.models.attachment.AttachmentResponse
import com.legalesign.api.models.attachment.AttachmentRetrieveParams
import com.legalesign.api.models.attachment.AttachmentUploadParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AttachmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttachmentServiceAsync

    /** Get attachment */
    fun retrieve(attachmentId: String): CompletableFuture<AttachmentResponse> =
        retrieve(attachmentId, AttachmentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        attachmentId: String,
        params: AttachmentRetrieveParams = AttachmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttachmentResponse> =
        retrieve(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        attachmentId: String,
        params: AttachmentRetrieveParams = AttachmentRetrieveParams.none(),
    ): CompletableFuture<AttachmentResponse> = retrieve(attachmentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AttachmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttachmentResponse>

    /** @see retrieve */
    fun retrieve(params: AttachmentRetrieveParams): CompletableFuture<AttachmentResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        attachmentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AttachmentResponse> =
        retrieve(attachmentId, AttachmentRetrieveParams.none(), requestOptions)

    /** List attachments in your groups */
    fun list(): CompletableFuture<AttachmentListResponse> = list(AttachmentListParams.none())

    /** @see list */
    fun list(
        params: AttachmentListParams = AttachmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttachmentListResponse>

    /** @see list */
    fun list(
        params: AttachmentListParams = AttachmentListParams.none()
    ): CompletableFuture<AttachmentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AttachmentListResponse> =
        list(AttachmentListParams.none(), requestOptions)

    /** Delete attachment */
    fun delete(attachmentId: String): CompletableFuture<Void?> =
        delete(attachmentId, AttachmentDeleteParams.none())

    /** @see delete */
    fun delete(
        attachmentId: String,
        params: AttachmentDeleteParams = AttachmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        attachmentId: String,
        params: AttachmentDeleteParams = AttachmentDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(attachmentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AttachmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AttachmentDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(attachmentId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(attachmentId, AttachmentDeleteParams.none(), requestOptions)

    /** Upload PDF attachment */
    fun upload(params: AttachmentUploadParams): CompletableFuture<Void?> =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: AttachmentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [AttachmentServiceAsync] that provides access to raw HTTP responses for each
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
        ): AttachmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /attachment/{attachmentId}/`, but is otherwise the
         * same as [AttachmentServiceAsync.retrieve].
         */
        fun retrieve(attachmentId: String): CompletableFuture<HttpResponseFor<AttachmentResponse>> =
            retrieve(attachmentId, AttachmentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            attachmentId: String,
            params: AttachmentRetrieveParams = AttachmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttachmentResponse>> =
            retrieve(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            attachmentId: String,
            params: AttachmentRetrieveParams = AttachmentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AttachmentResponse>> =
            retrieve(attachmentId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AttachmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttachmentResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AttachmentRetrieveParams
        ): CompletableFuture<HttpResponseFor<AttachmentResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            attachmentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AttachmentResponse>> =
            retrieve(attachmentId, AttachmentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /attachment/`, but is otherwise the same as
         * [AttachmentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AttachmentListResponse>> =
            list(AttachmentListParams.none())

        /** @see list */
        fun list(
            params: AttachmentListParams = AttachmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttachmentListResponse>>

        /** @see list */
        fun list(
            params: AttachmentListParams = AttachmentListParams.none()
        ): CompletableFuture<HttpResponseFor<AttachmentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AttachmentListResponse>> =
            list(AttachmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /attachment/{attachmentId}/`, but is otherwise
         * the same as [AttachmentServiceAsync.delete].
         */
        fun delete(attachmentId: String): CompletableFuture<HttpResponse> =
            delete(attachmentId, AttachmentDeleteParams.none())

        /** @see delete */
        fun delete(
            attachmentId: String,
            params: AttachmentDeleteParams = AttachmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

        /** @see delete */
        fun delete(
            attachmentId: String,
            params: AttachmentDeleteParams = AttachmentDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(attachmentId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AttachmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AttachmentDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            attachmentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(attachmentId, AttachmentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /attachment/`, but is otherwise the same as
         * [AttachmentServiceAsync.upload].
         */
        fun upload(params: AttachmentUploadParams): CompletableFuture<HttpResponse> =
            upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(
            params: AttachmentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
