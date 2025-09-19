// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.user

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.legalesign.api.core.Enum
import com.legalesign.api.core.ExcludeMissing
import com.legalesign.api.core.JsonField
import com.legalesign.api.core.JsonMissing
import com.legalesign.api.core.JsonValue
import com.legalesign.api.core.Params
import com.legalesign.api.core.checkRequired
import com.legalesign.api.core.http.Headers
import com.legalesign.api.core.http.QueryParams
import com.legalesign.api.errors.LegalesignInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create user */
class UserCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = body.email()

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String = body.firstName()

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String = body.lastName()

    /**
     * comma delimited list of groups to add user to, can be full group resource_uri or groupId
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groups(): Optional<String> = body.groups()

    /**
     * If not set a verification email is sent. Password must be at least 8 chars, include upper and
     * lower case, with a number and a special character
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun password(): Optional<String> = body.password()

    /**
     * set user permissions _ 1 - admin _ 2 - create and send docs, team user _ 3 - readonly, team
     * user _ 4 - send only, team user _ 5 - send only, individual user _ 6 - create and send docs,
     * invidual user
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permission(): Optional<Permission> = body.permission()

    /**
     * List of available timezones
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezone(): Optional<TimezoneEnum> = body.timezone()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstName(): JsonField<String> = body._firstName()

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lastName(): JsonField<String> = body._lastName()

    /**
     * Returns the raw JSON value of [groups].
     *
     * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groups(): JsonField<String> = body._groups()

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _password(): JsonField<String> = body._password()

    /**
     * Returns the raw JSON value of [permission].
     *
     * Unlike [permission], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _permission(): JsonField<Permission> = body._permission()

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timezone(): JsonField<TimezoneEnum> = body._timezone()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserCreateParams].
         *
         * The following fields are required:
         * ```java
         * .email()
         * .firstName()
         * .lastName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userCreateParams: UserCreateParams) = apply {
            body = userCreateParams.body.toBuilder()
            additionalHeaders = userCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = userCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [email]
         * - [firstName]
         * - [lastName]
         * - [groups]
         * - [password]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun email(email: String) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        fun firstName(firstName: String) = apply { body.firstName(firstName) }

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        fun lastName(lastName: String) = apply { body.lastName(lastName) }

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        /**
         * comma delimited list of groups to add user to, can be full group resource_uri or groupId
         */
        fun groups(groups: String) = apply { body.groups(groups) }

        /**
         * Sets [Builder.groups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groups] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groups(groups: JsonField<String>) = apply { body.groups(groups) }

        /**
         * If not set a verification email is sent. Password must be at least 8 chars, include upper
         * and lower case, with a number and a special character
         */
        fun password(password: String) = apply { body.password(password) }

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { body.password(password) }

        /**
         * set user permissions _ 1 - admin _ 2 - create and send docs, team user _ 3 - readonly,
         * team user _ 4 - send only, team user _ 5 - send only, individual user _ 6 - create and
         * send docs, invidual user
         */
        fun permission(permission: Permission) = apply { body.permission(permission) }

        /**
         * Sets [Builder.permission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permission] with a well-typed [Permission] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun permission(permission: JsonField<Permission>) = apply { body.permission(permission) }

        /** List of available timezones */
        fun timezone(timezone: TimezoneEnum) = apply { body.timezone(timezone) }

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [TimezoneEnum] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timezone(timezone: JsonField<TimezoneEnum>) = apply { body.timezone(timezone) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [UserCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .email()
         * .firstName()
         * .lastName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserCreateParams =
            UserCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Create a new user who can gain access to your groups. You should specify the groups the user
     * should be able to access. Only the groups the API user can access are valid. If you do not
     * set a password then a verification link will be emailed to the user. This will allow the user
     * to set their password and activate their account. In this case you can also add a redirect_to
     * url to redirect the user back to your website after they have activated their account. N.B.
     * Make sure you add the user to at least one of your groups, otherwise you will not have API
     * access to the user information.
     */
    class Body
    private constructor(
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val groups: JsonField<String>,
        private val password: JsonField<String>,
        private val permission: JsonField<Permission>,
        private val timezone: JsonField<TimezoneEnum>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("groups") @ExcludeMissing groups: JsonField<String> = JsonMissing.of(),
            @JsonProperty("password")
            @ExcludeMissing
            password: JsonField<String> = JsonMissing.of(),
            @JsonProperty("permission")
            @ExcludeMissing
            permission: JsonField<Permission> = JsonMissing.of(),
            @JsonProperty("timezone")
            @ExcludeMissing
            timezone: JsonField<TimezoneEnum> = JsonMissing.of(),
        ) : this(email, firstName, lastName, groups, password, permission, timezone, mutableMapOf())

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstName(): String = firstName.getRequired("first_name")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastName(): String = lastName.getRequired("last_name")

        /**
         * comma delimited list of groups to add user to, can be full group resource_uri or groupId
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groups(): Optional<String> = groups.getOptional("groups")

        /**
         * If not set a verification email is sent. Password must be at least 8 chars, include upper
         * and lower case, with a number and a special character
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun password(): Optional<String> = password.getOptional("password")

        /**
         * set user permissions _ 1 - admin _ 2 - create and send docs, team user _ 3 - readonly,
         * team user _ 4 - send only, team user _ 5 - send only, individual user _ 6 - create and
         * send docs, invidual user
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun permission(): Optional<Permission> = permission.getOptional("permission")

        /**
         * List of available timezones
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timezone(): Optional<TimezoneEnum> = timezone.getOptional("timezone")

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [groups].
         *
         * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("groups") @ExcludeMissing fun _groups(): JsonField<String> = groups

        /**
         * Returns the raw JSON value of [password].
         *
         * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

        /**
         * Returns the raw JSON value of [permission].
         *
         * Unlike [permission], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("permission")
        @ExcludeMissing
        fun _permission(): JsonField<Permission> = permission

        /**
         * Returns the raw JSON value of [timezone].
         *
         * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timezone")
        @ExcludeMissing
        fun _timezone(): JsonField<TimezoneEnum> = timezone

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .email()
             * .firstName()
             * .lastName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var email: JsonField<String>? = null
            private var firstName: JsonField<String>? = null
            private var lastName: JsonField<String>? = null
            private var groups: JsonField<String> = JsonMissing.of()
            private var password: JsonField<String> = JsonMissing.of()
            private var permission: JsonField<Permission> = JsonMissing.of()
            private var timezone: JsonField<TimezoneEnum> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                email = body.email
                firstName = body.firstName
                lastName = body.lastName
                groups = body.groups
                password = body.password
                permission = body.permission
                timezone = body.timezone
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /**
             * comma delimited list of groups to add user to, can be full group resource_uri or
             * groupId
             */
            fun groups(groups: String) = groups(JsonField.of(groups))

            /**
             * Sets [Builder.groups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groups] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groups(groups: JsonField<String>) = apply { this.groups = groups }

            /**
             * If not set a verification email is sent. Password must be at least 8 chars, include
             * upper and lower case, with a number and a special character
             */
            fun password(password: String) = password(JsonField.of(password))

            /**
             * Sets [Builder.password] to an arbitrary JSON value.
             *
             * You should usually call [Builder.password] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun password(password: JsonField<String>) = apply { this.password = password }

            /**
             * set user permissions _ 1 - admin _ 2 - create and send docs, team user _ 3 -
             * readonly, team user _ 4 - send only, team user _ 5 - send only, individual user _ 6 -
             * create and send docs, invidual user
             */
            fun permission(permission: Permission) = permission(JsonField.of(permission))

            /**
             * Sets [Builder.permission] to an arbitrary JSON value.
             *
             * You should usually call [Builder.permission] with a well-typed [Permission] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun permission(permission: JsonField<Permission>) = apply {
                this.permission = permission
            }

            /** List of available timezones */
            fun timezone(timezone: TimezoneEnum) = timezone(JsonField.of(timezone))

            /**
             * Sets [Builder.timezone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timezone] with a well-typed [TimezoneEnum] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timezone(timezone: JsonField<TimezoneEnum>) = apply { this.timezone = timezone }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .email()
             * .firstName()
             * .lastName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("email", email),
                    checkRequired("firstName", firstName),
                    checkRequired("lastName", lastName),
                    groups,
                    password,
                    permission,
                    timezone,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            email()
            firstName()
            lastName()
            groups()
            password()
            permission().ifPresent { it.validate() }
            timezone().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LegalesignInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (email.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (if (groups.asKnown().isPresent) 1 else 0) +
                (if (password.asKnown().isPresent) 1 else 0) +
                (permission.asKnown().getOrNull()?.validity() ?: 0) +
                (timezone.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                email == other.email &&
                firstName == other.firstName &&
                lastName == other.lastName &&
                groups == other.groups &&
                password == other.password &&
                permission == other.permission &&
                timezone == other.timezone &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                email,
                firstName,
                lastName,
                groups,
                password,
                permission,
                timezone,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{email=$email, firstName=$firstName, lastName=$lastName, groups=$groups, password=$password, permission=$permission, timezone=$timezone, additionalProperties=$additionalProperties}"
    }

    /**
     * set user permissions _ 1 - admin _ 2 - create and send docs, team user _ 3 - readonly, team
     * user _ 4 - send only, team user _ 5 - send only, individual user _ 6 - create and send docs,
     * invidual user
     */
    class Permission @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val _1 = of("1")

            @JvmField val _2 = of("2")

            @JvmField val _3 = of("3")

            @JvmField val _4 = of("4")

            @JvmField val _5 = of("5")

            @JvmField val _6 = of("6")

            @JvmStatic fun of(value: String) = Permission(JsonField.of(value))
        }

        /** An enum containing [Permission]'s known values. */
        enum class Known {
            _1,
            _2,
            _3,
            _4,
            _5,
            _6,
        }

        /**
         * An enum containing [Permission]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Permission] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _1,
            _2,
            _3,
            _4,
            _5,
            _6,
            /**
             * An enum member indicating that [Permission] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                _1 -> Value._1
                _2 -> Value._2
                _3 -> Value._3
                _4 -> Value._4
                _5 -> Value._5
                _6 -> Value._6
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LegalesignInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                _1 -> Known._1
                _2 -> Known._2
                _3 -> Known._3
                _4 -> Known._4
                _5 -> Known._5
                _6 -> Known._6
                else -> throw LegalesignInvalidDataException("Unknown Permission: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LegalesignInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LegalesignInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Permission = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LegalesignInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Permission && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UserCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
