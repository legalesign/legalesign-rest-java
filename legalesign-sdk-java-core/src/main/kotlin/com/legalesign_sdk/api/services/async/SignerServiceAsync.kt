// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.async

import com.legalesign_sdk.api.core.ClientOptions
import com.legalesign_sdk.api.core.RequestOptions
import com.legalesign_sdk.api.core.http.HttpResponse
import com.legalesign_sdk.api.core.http.HttpResponseFor
import com.legalesign_sdk.api.models.signer.SignerGetAccessLinkParams
import com.legalesign_sdk.api.models.signer.SignerRetrieveFieldsParams
import com.legalesign_sdk.api.models.signer.SignerRetrieveFieldsResponse
import com.legalesign_sdk.api.models.signer.SignerRetrieveParams
import com.legalesign_sdk.api.models.signer.SignerRetrieveResponse
import com.legalesign_sdk.api.models.signer.SignerSendReminderParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SignerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SignerServiceAsync

    /** Get status and details of an individual signer */
    fun retrieve(signerId: String): CompletableFuture<SignerRetrieveResponse> =
        retrieve(signerId, SignerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        signerId: String,
        params: SignerRetrieveParams = SignerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SignerRetrieveResponse> =
        retrieve(params.toBuilder().signerId(signerId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        signerId: String,
        params: SignerRetrieveParams = SignerRetrieveParams.none(),
    ): CompletableFuture<SignerRetrieveResponse> = retrieve(signerId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SignerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SignerRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: SignerRetrieveParams): CompletableFuture<SignerRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        signerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SignerRetrieveResponse> =
        retrieve(signerId, SignerRetrieveParams.none(), requestOptions)

    /** Returns 1-use link for signer in Location header. */
    fun getAccessLink(signerId: String): CompletableFuture<Void?> =
        getAccessLink(signerId, SignerGetAccessLinkParams.none())

    /** @see getAccessLink */
    fun getAccessLink(
        signerId: String,
        params: SignerGetAccessLinkParams = SignerGetAccessLinkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        getAccessLink(params.toBuilder().signerId(signerId).build(), requestOptions)

    /** @see getAccessLink */
    fun getAccessLink(
        signerId: String,
        params: SignerGetAccessLinkParams = SignerGetAccessLinkParams.none(),
    ): CompletableFuture<Void?> = getAccessLink(signerId, params, RequestOptions.none())

    /** @see getAccessLink */
    fun getAccessLink(
        params: SignerGetAccessLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see getAccessLink */
    fun getAccessLink(params: SignerGetAccessLinkParams): CompletableFuture<Void?> =
        getAccessLink(params, RequestOptions.none())

    /** @see getAccessLink */
    fun getAccessLink(signerId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        getAccessLink(signerId, SignerGetAccessLinkParams.none(), requestOptions)

    /** Get signer form fields */
    fun retrieveFields(signerId: String): CompletableFuture<List<SignerRetrieveFieldsResponse>> =
        retrieveFields(signerId, SignerRetrieveFieldsParams.none())

    /** @see retrieveFields */
    fun retrieveFields(
        signerId: String,
        params: SignerRetrieveFieldsParams = SignerRetrieveFieldsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SignerRetrieveFieldsResponse>> =
        retrieveFields(params.toBuilder().signerId(signerId).build(), requestOptions)

    /** @see retrieveFields */
    fun retrieveFields(
        signerId: String,
        params: SignerRetrieveFieldsParams = SignerRetrieveFieldsParams.none(),
    ): CompletableFuture<List<SignerRetrieveFieldsResponse>> =
        retrieveFields(signerId, params, RequestOptions.none())

    /** @see retrieveFields */
    fun retrieveFields(
        params: SignerRetrieveFieldsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SignerRetrieveFieldsResponse>>

    /** @see retrieveFields */
    fun retrieveFields(
        params: SignerRetrieveFieldsParams
    ): CompletableFuture<List<SignerRetrieveFieldsResponse>> =
        retrieveFields(params, RequestOptions.none())

    /** @see retrieveFields */
    fun retrieveFields(
        signerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<SignerRetrieveFieldsResponse>> =
        retrieveFields(signerId, SignerRetrieveFieldsParams.none(), requestOptions)

    /** Send signer reminder email */
    fun sendReminder(signerId: String): CompletableFuture<Void?> =
        sendReminder(signerId, SignerSendReminderParams.none())

    /** @see sendReminder */
    fun sendReminder(
        signerId: String,
        params: SignerSendReminderParams = SignerSendReminderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        sendReminder(params.toBuilder().signerId(signerId).build(), requestOptions)

    /** @see sendReminder */
    fun sendReminder(
        signerId: String,
        params: SignerSendReminderParams = SignerSendReminderParams.none(),
    ): CompletableFuture<Void?> = sendReminder(signerId, params, RequestOptions.none())

    /** @see sendReminder */
    fun sendReminder(
        params: SignerSendReminderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see sendReminder */
    fun sendReminder(params: SignerSendReminderParams): CompletableFuture<Void?> =
        sendReminder(params, RequestOptions.none())

    /** @see sendReminder */
    fun sendReminder(signerId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        sendReminder(signerId, SignerSendReminderParams.none(), requestOptions)

    /**
     * A view of [SignerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SignerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /signer/{signerId}/`, but is otherwise the same as
         * [SignerServiceAsync.retrieve].
         */
        fun retrieve(signerId: String): CompletableFuture<HttpResponseFor<SignerRetrieveResponse>> =
            retrieve(signerId, SignerRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            signerId: String,
            params: SignerRetrieveParams = SignerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SignerRetrieveResponse>> =
            retrieve(params.toBuilder().signerId(signerId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            signerId: String,
            params: SignerRetrieveParams = SignerRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SignerRetrieveResponse>> =
            retrieve(signerId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SignerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SignerRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SignerRetrieveParams
        ): CompletableFuture<HttpResponseFor<SignerRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            signerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SignerRetrieveResponse>> =
            retrieve(signerId, SignerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /signer/{signerId}/new-link/`, but is otherwise the
         * same as [SignerServiceAsync.getAccessLink].
         */
        fun getAccessLink(signerId: String): CompletableFuture<HttpResponse> =
            getAccessLink(signerId, SignerGetAccessLinkParams.none())

        /** @see getAccessLink */
        fun getAccessLink(
            signerId: String,
            params: SignerGetAccessLinkParams = SignerGetAccessLinkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getAccessLink(params.toBuilder().signerId(signerId).build(), requestOptions)

        /** @see getAccessLink */
        fun getAccessLink(
            signerId: String,
            params: SignerGetAccessLinkParams = SignerGetAccessLinkParams.none(),
        ): CompletableFuture<HttpResponse> = getAccessLink(signerId, params, RequestOptions.none())

        /** @see getAccessLink */
        fun getAccessLink(
            params: SignerGetAccessLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getAccessLink */
        fun getAccessLink(params: SignerGetAccessLinkParams): CompletableFuture<HttpResponse> =
            getAccessLink(params, RequestOptions.none())

        /** @see getAccessLink */
        fun getAccessLink(
            signerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getAccessLink(signerId, SignerGetAccessLinkParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /signer/{signerId}/fields1/`, but is otherwise the
         * same as [SignerServiceAsync.retrieveFields].
         */
        fun retrieveFields(
            signerId: String
        ): CompletableFuture<HttpResponseFor<List<SignerRetrieveFieldsResponse>>> =
            retrieveFields(signerId, SignerRetrieveFieldsParams.none())

        /** @see retrieveFields */
        fun retrieveFields(
            signerId: String,
            params: SignerRetrieveFieldsParams = SignerRetrieveFieldsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SignerRetrieveFieldsResponse>>> =
            retrieveFields(params.toBuilder().signerId(signerId).build(), requestOptions)

        /** @see retrieveFields */
        fun retrieveFields(
            signerId: String,
            params: SignerRetrieveFieldsParams = SignerRetrieveFieldsParams.none(),
        ): CompletableFuture<HttpResponseFor<List<SignerRetrieveFieldsResponse>>> =
            retrieveFields(signerId, params, RequestOptions.none())

        /** @see retrieveFields */
        fun retrieveFields(
            params: SignerRetrieveFieldsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SignerRetrieveFieldsResponse>>>

        /** @see retrieveFields */
        fun retrieveFields(
            params: SignerRetrieveFieldsParams
        ): CompletableFuture<HttpResponseFor<List<SignerRetrieveFieldsResponse>>> =
            retrieveFields(params, RequestOptions.none())

        /** @see retrieveFields */
        fun retrieveFields(
            signerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<SignerRetrieveFieldsResponse>>> =
            retrieveFields(signerId, SignerRetrieveFieldsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /signer/{signerId}/send-reminder/`, but is
         * otherwise the same as [SignerServiceAsync.sendReminder].
         */
        fun sendReminder(signerId: String): CompletableFuture<HttpResponse> =
            sendReminder(signerId, SignerSendReminderParams.none())

        /** @see sendReminder */
        fun sendReminder(
            signerId: String,
            params: SignerSendReminderParams = SignerSendReminderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            sendReminder(params.toBuilder().signerId(signerId).build(), requestOptions)

        /** @see sendReminder */
        fun sendReminder(
            signerId: String,
            params: SignerSendReminderParams = SignerSendReminderParams.none(),
        ): CompletableFuture<HttpResponse> = sendReminder(signerId, params, RequestOptions.none())

        /** @see sendReminder */
        fun sendReminder(
            params: SignerSendReminderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see sendReminder */
        fun sendReminder(params: SignerSendReminderParams): CompletableFuture<HttpResponse> =
            sendReminder(params, RequestOptions.none())

        /** @see sendReminder */
        fun sendReminder(
            signerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            sendReminder(signerId, SignerSendReminderParams.none(), requestOptions)
    }
}
