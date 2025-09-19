// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.user.UserCreateParams
import com.legalesign.api.models.user.UserRetrieveParams
import com.legalesign.api.models.user.UserRetrieveResponse
import com.legalesign.api.models.user.UserUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync

    /** Create user */
    fun create(params: UserCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get user */
    fun retrieve(userId: String): CompletableFuture<UserRetrieveResponse> =
        retrieve(userId, UserRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRetrieveResponse> =
        retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
    ): CompletableFuture<UserRetrieveResponse> = retrieve(userId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: UserRetrieveParams): CompletableFuture<UserRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserRetrieveResponse> =
        retrieve(userId, UserRetrieveParams.none(), requestOptions)

    /** Update a user first name or last name */
    fun update(userId: String): CompletableFuture<Void?> = update(userId, UserUpdateParams.none())

    /** @see update */
    fun update(
        userId: String,
        params: UserUpdateParams = UserUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see update */
    fun update(
        userId: String,
        params: UserUpdateParams = UserUpdateParams.none(),
    ): CompletableFuture<Void?> = update(userId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: UserUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(userId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(userId, UserUpdateParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /user/`, but is otherwise the same as
         * [UserServiceAsync.create].
         */
        fun create(params: UserCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /user/{userId}/`, but is otherwise the same as
         * [UserServiceAsync.retrieve].
         */
        fun retrieve(userId: String): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(userId, UserRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(userId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: UserRetrieveParams
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserRetrieveResponse>> =
            retrieve(userId, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /user/{userId}/`, but is otherwise the same as
         * [UserServiceAsync.update].
         */
        fun update(userId: String): CompletableFuture<HttpResponse> =
            update(userId, UserUpdateParams.none())

        /** @see update */
        fun update(
            userId: String,
            params: UserUpdateParams = UserUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see update */
        fun update(
            userId: String,
            params: UserUpdateParams = UserUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(userId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(params: UserUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = update(userId, UserUpdateParams.none(), requestOptions)
    }
}
