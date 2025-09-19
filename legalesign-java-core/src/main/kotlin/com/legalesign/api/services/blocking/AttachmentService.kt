// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface AttachmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttachmentService

    /** Get attachment */
    fun retrieve(attachmentId: String): AttachmentResponse =
        retrieve(attachmentId, AttachmentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        attachmentId: String,
        params: AttachmentRetrieveParams = AttachmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentResponse =
        retrieve(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        attachmentId: String,
        params: AttachmentRetrieveParams = AttachmentRetrieveParams.none(),
    ): AttachmentResponse = retrieve(attachmentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AttachmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentResponse

    /** @see retrieve */
    fun retrieve(params: AttachmentRetrieveParams): AttachmentResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(attachmentId: String, requestOptions: RequestOptions): AttachmentResponse =
        retrieve(attachmentId, AttachmentRetrieveParams.none(), requestOptions)

    /** List attachments in your groups */
    fun list(): AttachmentListResponse = list(AttachmentListParams.none())

    /** @see list */
    fun list(
        params: AttachmentListParams = AttachmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentListResponse

    /** @see list */
    fun list(params: AttachmentListParams = AttachmentListParams.none()): AttachmentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AttachmentListResponse =
        list(AttachmentListParams.none(), requestOptions)

    /** Delete attachment */
    fun delete(attachmentId: String) = delete(attachmentId, AttachmentDeleteParams.none())

    /** @see delete */
    fun delete(
        attachmentId: String,
        params: AttachmentDeleteParams = AttachmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        attachmentId: String,
        params: AttachmentDeleteParams = AttachmentDeleteParams.none(),
    ) = delete(attachmentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AttachmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: AttachmentDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(attachmentId: String, requestOptions: RequestOptions) =
        delete(attachmentId, AttachmentDeleteParams.none(), requestOptions)

    /** Upload PDF attachment */
    fun upload(params: AttachmentUploadParams) = upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: AttachmentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [AttachmentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttachmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /attachment/{attachmentId}/`, but is otherwise the
         * same as [AttachmentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(attachmentId: String): HttpResponseFor<AttachmentResponse> =
            retrieve(attachmentId, AttachmentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            attachmentId: String,
            params: AttachmentRetrieveParams = AttachmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentResponse> =
            retrieve(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            attachmentId: String,
            params: AttachmentRetrieveParams = AttachmentRetrieveParams.none(),
        ): HttpResponseFor<AttachmentResponse> =
            retrieve(attachmentId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AttachmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AttachmentRetrieveParams): HttpResponseFor<AttachmentResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            attachmentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentResponse> =
            retrieve(attachmentId, AttachmentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /attachment/`, but is otherwise the same as
         * [AttachmentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AttachmentListResponse> = list(AttachmentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AttachmentListParams = AttachmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AttachmentListParams = AttachmentListParams.none()
        ): HttpResponseFor<AttachmentListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AttachmentListResponse> =
            list(AttachmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /attachment/{attachmentId}/`, but is otherwise
         * the same as [AttachmentService.delete].
         */
        @MustBeClosed
        fun delete(attachmentId: String): HttpResponse =
            delete(attachmentId, AttachmentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            attachmentId: String,
            params: AttachmentDeleteParams = AttachmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            attachmentId: String,
            params: AttachmentDeleteParams = AttachmentDeleteParams.none(),
        ): HttpResponse = delete(attachmentId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AttachmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AttachmentDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(attachmentId: String, requestOptions: RequestOptions): HttpResponse =
            delete(attachmentId, AttachmentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /attachment/`, but is otherwise the same as
         * [AttachmentService.upload].
         */
        @MustBeClosed
        fun upload(params: AttachmentUploadParams): HttpResponse =
            upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: AttachmentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
