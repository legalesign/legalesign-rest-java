// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.signer.SignerGetAccessLinkParams
import com.legalesign.api.models.signer.SignerGetRejectionReasonParams
import com.legalesign.api.models.signer.SignerGetRejectionReasonResponse
import com.legalesign.api.models.signer.SignerResetParams
import com.legalesign.api.models.signer.SignerRetrieveFieldsParams
import com.legalesign.api.models.signer.SignerRetrieveFieldsResponse
import com.legalesign.api.models.signer.SignerRetrieveParams
import com.legalesign.api.models.signer.SignerRetrieveResponse
import com.legalesign.api.models.signer.SignerSendReminderParams
import java.util.function.Consumer

interface SignerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SignerService

    /** Get status and details of an individual signer */
    fun retrieve(signerId: String): SignerRetrieveResponse =
        retrieve(signerId, SignerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        signerId: String,
        params: SignerRetrieveParams = SignerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignerRetrieveResponse =
        retrieve(params.toBuilder().signerId(signerId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        signerId: String,
        params: SignerRetrieveParams = SignerRetrieveParams.none(),
    ): SignerRetrieveResponse = retrieve(signerId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SignerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignerRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: SignerRetrieveParams): SignerRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(signerId: String, requestOptions: RequestOptions): SignerRetrieveResponse =
        retrieve(signerId, SignerRetrieveParams.none(), requestOptions)

    /** Returns 1-use link for signer in Location header. */
    fun getAccessLink(signerId: String) = getAccessLink(signerId, SignerGetAccessLinkParams.none())

    /** @see getAccessLink */
    fun getAccessLink(
        signerId: String,
        params: SignerGetAccessLinkParams = SignerGetAccessLinkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = getAccessLink(params.toBuilder().signerId(signerId).build(), requestOptions)

    /** @see getAccessLink */
    fun getAccessLink(
        signerId: String,
        params: SignerGetAccessLinkParams = SignerGetAccessLinkParams.none(),
    ) = getAccessLink(signerId, params, RequestOptions.none())

    /** @see getAccessLink */
    fun getAccessLink(
        params: SignerGetAccessLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see getAccessLink */
    fun getAccessLink(params: SignerGetAccessLinkParams) =
        getAccessLink(params, RequestOptions.none())

    /** @see getAccessLink */
    fun getAccessLink(signerId: String, requestOptions: RequestOptions) =
        getAccessLink(signerId, SignerGetAccessLinkParams.none(), requestOptions)

    /** Returns reason signer gave for rejecting a document, if given */
    fun getRejectionReason(signerId: String): SignerGetRejectionReasonResponse =
        getRejectionReason(signerId, SignerGetRejectionReasonParams.none())

    /** @see getRejectionReason */
    fun getRejectionReason(
        signerId: String,
        params: SignerGetRejectionReasonParams = SignerGetRejectionReasonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignerGetRejectionReasonResponse =
        getRejectionReason(params.toBuilder().signerId(signerId).build(), requestOptions)

    /** @see getRejectionReason */
    fun getRejectionReason(
        signerId: String,
        params: SignerGetRejectionReasonParams = SignerGetRejectionReasonParams.none(),
    ): SignerGetRejectionReasonResponse =
        getRejectionReason(signerId, params, RequestOptions.none())

    /** @see getRejectionReason */
    fun getRejectionReason(
        params: SignerGetRejectionReasonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignerGetRejectionReasonResponse

    /** @see getRejectionReason */
    fun getRejectionReason(
        params: SignerGetRejectionReasonParams
    ): SignerGetRejectionReasonResponse = getRejectionReason(params, RequestOptions.none())

    /** @see getRejectionReason */
    fun getRejectionReason(
        signerId: String,
        requestOptions: RequestOptions,
    ): SignerGetRejectionReasonResponse =
        getRejectionReason(signerId, SignerGetRejectionReasonParams.none(), requestOptions)

    /** Reset to an earlier signer if forwarded */
    fun reset(signerId: String, params: SignerResetParams) =
        reset(signerId, params, RequestOptions.none())

    /** @see reset */
    fun reset(
        signerId: String,
        params: SignerResetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = reset(params.toBuilder().signerId(signerId).build(), requestOptions)

    /** @see reset */
    fun reset(params: SignerResetParams) = reset(params, RequestOptions.none())

    /** @see reset */
    fun reset(params: SignerResetParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get signer form fields */
    fun retrieveFields(signerId: String): List<SignerRetrieveFieldsResponse> =
        retrieveFields(signerId, SignerRetrieveFieldsParams.none())

    /** @see retrieveFields */
    fun retrieveFields(
        signerId: String,
        params: SignerRetrieveFieldsParams = SignerRetrieveFieldsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SignerRetrieveFieldsResponse> =
        retrieveFields(params.toBuilder().signerId(signerId).build(), requestOptions)

    /** @see retrieveFields */
    fun retrieveFields(
        signerId: String,
        params: SignerRetrieveFieldsParams = SignerRetrieveFieldsParams.none(),
    ): List<SignerRetrieveFieldsResponse> = retrieveFields(signerId, params, RequestOptions.none())

    /** @see retrieveFields */
    fun retrieveFields(
        params: SignerRetrieveFieldsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SignerRetrieveFieldsResponse>

    /** @see retrieveFields */
    fun retrieveFields(params: SignerRetrieveFieldsParams): List<SignerRetrieveFieldsResponse> =
        retrieveFields(params, RequestOptions.none())

    /** @see retrieveFields */
    fun retrieveFields(
        signerId: String,
        requestOptions: RequestOptions,
    ): List<SignerRetrieveFieldsResponse> =
        retrieveFields(signerId, SignerRetrieveFieldsParams.none(), requestOptions)

    /** Send signer reminder email */
    fun sendReminder(signerId: String) = sendReminder(signerId, SignerSendReminderParams.none())

    /** @see sendReminder */
    fun sendReminder(
        signerId: String,
        params: SignerSendReminderParams = SignerSendReminderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = sendReminder(params.toBuilder().signerId(signerId).build(), requestOptions)

    /** @see sendReminder */
    fun sendReminder(
        signerId: String,
        params: SignerSendReminderParams = SignerSendReminderParams.none(),
    ) = sendReminder(signerId, params, RequestOptions.none())

    /** @see sendReminder */
    fun sendReminder(
        params: SignerSendReminderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see sendReminder */
    fun sendReminder(params: SignerSendReminderParams) = sendReminder(params, RequestOptions.none())

    /** @see sendReminder */
    fun sendReminder(signerId: String, requestOptions: RequestOptions) =
        sendReminder(signerId, SignerSendReminderParams.none(), requestOptions)

    /** A view of [SignerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SignerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /signer/{signerId}/`, but is otherwise the same as
         * [SignerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(signerId: String): HttpResponseFor<SignerRetrieveResponse> =
            retrieve(signerId, SignerRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            signerId: String,
            params: SignerRetrieveParams = SignerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignerRetrieveResponse> =
            retrieve(params.toBuilder().signerId(signerId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            signerId: String,
            params: SignerRetrieveParams = SignerRetrieveParams.none(),
        ): HttpResponseFor<SignerRetrieveResponse> =
            retrieve(signerId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SignerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignerRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: SignerRetrieveParams): HttpResponseFor<SignerRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            signerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SignerRetrieveResponse> =
            retrieve(signerId, SignerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /signer/{signerId}/new-link/`, but is otherwise the
         * same as [SignerService.getAccessLink].
         */
        @MustBeClosed
        fun getAccessLink(signerId: String): HttpResponse =
            getAccessLink(signerId, SignerGetAccessLinkParams.none())

        /** @see getAccessLink */
        @MustBeClosed
        fun getAccessLink(
            signerId: String,
            params: SignerGetAccessLinkParams = SignerGetAccessLinkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getAccessLink(params.toBuilder().signerId(signerId).build(), requestOptions)

        /** @see getAccessLink */
        @MustBeClosed
        fun getAccessLink(
            signerId: String,
            params: SignerGetAccessLinkParams = SignerGetAccessLinkParams.none(),
        ): HttpResponse = getAccessLink(signerId, params, RequestOptions.none())

        /** @see getAccessLink */
        @MustBeClosed
        fun getAccessLink(
            params: SignerGetAccessLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getAccessLink */
        @MustBeClosed
        fun getAccessLink(params: SignerGetAccessLinkParams): HttpResponse =
            getAccessLink(params, RequestOptions.none())

        /** @see getAccessLink */
        @MustBeClosed
        fun getAccessLink(signerId: String, requestOptions: RequestOptions): HttpResponse =
            getAccessLink(signerId, SignerGetAccessLinkParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /signer/{signerId}/rejection/`, but is otherwise the
         * same as [SignerService.getRejectionReason].
         */
        @MustBeClosed
        fun getRejectionReason(
            signerId: String
        ): HttpResponseFor<SignerGetRejectionReasonResponse> =
            getRejectionReason(signerId, SignerGetRejectionReasonParams.none())

        /** @see getRejectionReason */
        @MustBeClosed
        fun getRejectionReason(
            signerId: String,
            params: SignerGetRejectionReasonParams = SignerGetRejectionReasonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignerGetRejectionReasonResponse> =
            getRejectionReason(params.toBuilder().signerId(signerId).build(), requestOptions)

        /** @see getRejectionReason */
        @MustBeClosed
        fun getRejectionReason(
            signerId: String,
            params: SignerGetRejectionReasonParams = SignerGetRejectionReasonParams.none(),
        ): HttpResponseFor<SignerGetRejectionReasonResponse> =
            getRejectionReason(signerId, params, RequestOptions.none())

        /** @see getRejectionReason */
        @MustBeClosed
        fun getRejectionReason(
            params: SignerGetRejectionReasonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignerGetRejectionReasonResponse>

        /** @see getRejectionReason */
        @MustBeClosed
        fun getRejectionReason(
            params: SignerGetRejectionReasonParams
        ): HttpResponseFor<SignerGetRejectionReasonResponse> =
            getRejectionReason(params, RequestOptions.none())

        /** @see getRejectionReason */
        @MustBeClosed
        fun getRejectionReason(
            signerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SignerGetRejectionReasonResponse> =
            getRejectionReason(signerId, SignerGetRejectionReasonParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /signer/{signerId}/reset/`, but is otherwise the
         * same as [SignerService.reset].
         */
        @MustBeClosed
        fun reset(signerId: String, params: SignerResetParams): HttpResponse =
            reset(signerId, params, RequestOptions.none())

        /** @see reset */
        @MustBeClosed
        fun reset(
            signerId: String,
            params: SignerResetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = reset(params.toBuilder().signerId(signerId).build(), requestOptions)

        /** @see reset */
        @MustBeClosed
        fun reset(params: SignerResetParams): HttpResponse = reset(params, RequestOptions.none())

        /** @see reset */
        @MustBeClosed
        fun reset(
            params: SignerResetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /signer/{signerId}/fields1/`, but is otherwise the
         * same as [SignerService.retrieveFields].
         */
        @MustBeClosed
        fun retrieveFields(signerId: String): HttpResponseFor<List<SignerRetrieveFieldsResponse>> =
            retrieveFields(signerId, SignerRetrieveFieldsParams.none())

        /** @see retrieveFields */
        @MustBeClosed
        fun retrieveFields(
            signerId: String,
            params: SignerRetrieveFieldsParams = SignerRetrieveFieldsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SignerRetrieveFieldsResponse>> =
            retrieveFields(params.toBuilder().signerId(signerId).build(), requestOptions)

        /** @see retrieveFields */
        @MustBeClosed
        fun retrieveFields(
            signerId: String,
            params: SignerRetrieveFieldsParams = SignerRetrieveFieldsParams.none(),
        ): HttpResponseFor<List<SignerRetrieveFieldsResponse>> =
            retrieveFields(signerId, params, RequestOptions.none())

        /** @see retrieveFields */
        @MustBeClosed
        fun retrieveFields(
            params: SignerRetrieveFieldsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SignerRetrieveFieldsResponse>>

        /** @see retrieveFields */
        @MustBeClosed
        fun retrieveFields(
            params: SignerRetrieveFieldsParams
        ): HttpResponseFor<List<SignerRetrieveFieldsResponse>> =
            retrieveFields(params, RequestOptions.none())

        /** @see retrieveFields */
        @MustBeClosed
        fun retrieveFields(
            signerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SignerRetrieveFieldsResponse>> =
            retrieveFields(signerId, SignerRetrieveFieldsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /signer/{signerId}/send-reminder/`, but is
         * otherwise the same as [SignerService.sendReminder].
         */
        @MustBeClosed
        fun sendReminder(signerId: String): HttpResponse =
            sendReminder(signerId, SignerSendReminderParams.none())

        /** @see sendReminder */
        @MustBeClosed
        fun sendReminder(
            signerId: String,
            params: SignerSendReminderParams = SignerSendReminderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            sendReminder(params.toBuilder().signerId(signerId).build(), requestOptions)

        /** @see sendReminder */
        @MustBeClosed
        fun sendReminder(
            signerId: String,
            params: SignerSendReminderParams = SignerSendReminderParams.none(),
        ): HttpResponse = sendReminder(signerId, params, RequestOptions.none())

        /** @see sendReminder */
        @MustBeClosed
        fun sendReminder(
            params: SignerSendReminderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see sendReminder */
        @MustBeClosed
        fun sendReminder(params: SignerSendReminderParams): HttpResponse =
            sendReminder(params, RequestOptions.none())

        /** @see sendReminder */
        @MustBeClosed
        fun sendReminder(signerId: String, requestOptions: RequestOptions): HttpResponse =
            sendReminder(signerId, SignerSendReminderParams.none(), requestOptions)
    }
}
