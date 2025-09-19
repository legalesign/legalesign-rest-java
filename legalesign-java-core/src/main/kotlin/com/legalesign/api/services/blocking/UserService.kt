// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.RequestOptions
import com.legalesign.api.core.http.HttpResponse
import com.legalesign.api.core.http.HttpResponseFor
import com.legalesign.api.models.user.UserCreateParams
import com.legalesign.api.models.user.UserRetrieveParams
import com.legalesign.api.models.user.UserRetrieveResponse
import com.legalesign.api.models.user.UserUpdateParams
import java.util.function.Consumer

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService

    /** Create user */
    fun create(params: UserCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: UserCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get user */
    fun retrieve(userId: String): UserRetrieveResponse = retrieve(userId, UserRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse = retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
    ): UserRetrieveResponse = retrieve(userId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: UserRetrieveParams): UserRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(userId: String, requestOptions: RequestOptions): UserRetrieveResponse =
        retrieve(userId, UserRetrieveParams.none(), requestOptions)

    /** Update a user first name or last name */
    fun update(userId: String) = update(userId, UserUpdateParams.none())

    /** @see update */
    fun update(
        userId: String,
        params: UserUpdateParams = UserUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see update */
    fun update(userId: String, params: UserUpdateParams = UserUpdateParams.none()) =
        update(userId, params, RequestOptions.none())

    /** @see update */
    fun update(params: UserUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(params: UserUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(userId: String, requestOptions: RequestOptions) =
        update(userId, UserUpdateParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /user/`, but is otherwise the same as
         * [UserService.create].
         */
        @MustBeClosed
        fun create(params: UserCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /user/{userId}/`, but is otherwise the same as
         * [UserService.retrieve].
         */
        @MustBeClosed
        fun retrieve(userId: String): HttpResponseFor<UserRetrieveResponse> =
            retrieve(userId, UserRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
        ): HttpResponseFor<UserRetrieveResponse> = retrieve(userId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: UserRetrieveParams): HttpResponseFor<UserRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRetrieveResponse> =
            retrieve(userId, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /user/{userId}/`, but is otherwise the same as
         * [UserService.update].
         */
        @MustBeClosed
        fun update(userId: String): HttpResponse = update(userId, UserUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            userId: String,
            params: UserUpdateParams = UserUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            userId: String,
            params: UserUpdateParams = UserUpdateParams.none(),
        ): HttpResponse = update(userId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(params: UserUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(userId: String, requestOptions: RequestOptions): HttpResponse =
            update(userId, UserUpdateParams.none(), requestOptions)
    }
}
