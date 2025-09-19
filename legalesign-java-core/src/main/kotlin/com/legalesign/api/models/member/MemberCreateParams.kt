// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.member

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

/**
 * If the email is a registered user then access to group will be immediate, otherise an invitation
 * will be created and emailed.
 */
class MemberCreateParams
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
    fun group(): String = body.group()

    /**
     * use legalesign to send email notification to new user
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun doEmail(): Optional<Boolean> = body.doEmail()

    /**
     * Permissions options:
     * - 1 - administrator
     * - 2 - team docs visible, create & send
     * - 3 - team docs visible, send only
     * - 4 - no team sent docs visible, send only
     * - 5 - no team docs visible, create & send
     * - 6 - team docs visible, read only
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permission(): Optional<PermissionsEnum> = body.permission()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [group].
     *
     * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _group(): JsonField<String> = body._group()

    /**
     * Returns the raw JSON value of [doEmail].
     *
     * Unlike [doEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _doEmail(): JsonField<Boolean> = body._doEmail()

    /**
     * Returns the raw JSON value of [permission].
     *
     * Unlike [permission], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _permission(): JsonField<PermissionsEnum> = body._permission()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MemberCreateParams].
         *
         * The following fields are required:
         * ```java
         * .email()
         * .group()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MemberCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(memberCreateParams: MemberCreateParams) = apply {
            body = memberCreateParams.body.toBuilder()
            additionalHeaders = memberCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = memberCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [email]
         * - [group]
         * - [doEmail]
         * - [permission]
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

        fun group(group: String) = apply { body.group(group) }

        /**
         * Sets [Builder.group] to an arbitrary JSON value.
         *
         * You should usually call [Builder.group] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun group(group: JsonField<String>) = apply { body.group(group) }

        /** use legalesign to send email notification to new user */
        fun doEmail(doEmail: Boolean) = apply { body.doEmail(doEmail) }

        /**
         * Sets [Builder.doEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doEmail] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun doEmail(doEmail: JsonField<Boolean>) = apply { body.doEmail(doEmail) }

        /**
         * Permissions options:
         * - 1 - administrator
         * - 2 - team docs visible, create & send
         * - 3 - team docs visible, send only
         * - 4 - no team sent docs visible, send only
         * - 5 - no team docs visible, create & send
         * - 6 - team docs visible, read only
         */
        fun permission(permission: PermissionsEnum) = apply { body.permission(permission) }

        /**
         * Sets [Builder.permission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permission] with a well-typed [PermissionsEnum] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun permission(permission: JsonField<PermissionsEnum>) = apply {
            body.permission(permission)
        }

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
         * Returns an immutable instance of [MemberCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .email()
         * .group()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MemberCreateParams =
            MemberCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val email: JsonField<String>,
        private val group: JsonField<String>,
        private val doEmail: JsonField<Boolean>,
        private val permission: JsonField<PermissionsEnum>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("group") @ExcludeMissing group: JsonField<String> = JsonMissing.of(),
            @JsonProperty("do_email")
            @ExcludeMissing
            doEmail: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("permission")
            @ExcludeMissing
            permission: JsonField<PermissionsEnum> = JsonMissing.of(),
        ) : this(email, group, doEmail, permission, mutableMapOf())

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun group(): String = group.getRequired("group")

        /**
         * use legalesign to send email notification to new user
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun doEmail(): Optional<Boolean> = doEmail.getOptional("do_email")

        /**
         * Permissions options:
         * - 1 - administrator
         * - 2 - team docs visible, create & send
         * - 3 - team docs visible, send only
         * - 4 - no team sent docs visible, send only
         * - 5 - no team docs visible, create & send
         * - 6 - team docs visible, read only
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun permission(): Optional<PermissionsEnum> = permission.getOptional("permission")

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [group].
         *
         * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<String> = group

        /**
         * Returns the raw JSON value of [doEmail].
         *
         * Unlike [doEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("do_email") @ExcludeMissing fun _doEmail(): JsonField<Boolean> = doEmail

        /**
         * Returns the raw JSON value of [permission].
         *
         * Unlike [permission], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("permission")
        @ExcludeMissing
        fun _permission(): JsonField<PermissionsEnum> = permission

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
             * .group()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var email: JsonField<String>? = null
            private var group: JsonField<String>? = null
            private var doEmail: JsonField<Boolean> = JsonMissing.of()
            private var permission: JsonField<PermissionsEnum> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                email = body.email
                group = body.group
                doEmail = body.doEmail
                permission = body.permission
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

            fun group(group: String) = group(JsonField.of(group))

            /**
             * Sets [Builder.group] to an arbitrary JSON value.
             *
             * You should usually call [Builder.group] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun group(group: JsonField<String>) = apply { this.group = group }

            /** use legalesign to send email notification to new user */
            fun doEmail(doEmail: Boolean) = doEmail(JsonField.of(doEmail))

            /**
             * Sets [Builder.doEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.doEmail] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun doEmail(doEmail: JsonField<Boolean>) = apply { this.doEmail = doEmail }

            /**
             * Permissions options:
             * - 1 - administrator
             * - 2 - team docs visible, create & send
             * - 3 - team docs visible, send only
             * - 4 - no team sent docs visible, send only
             * - 5 - no team docs visible, create & send
             * - 6 - team docs visible, read only
             */
            fun permission(permission: PermissionsEnum) = permission(JsonField.of(permission))

            /**
             * Sets [Builder.permission] to an arbitrary JSON value.
             *
             * You should usually call [Builder.permission] with a well-typed [PermissionsEnum]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun permission(permission: JsonField<PermissionsEnum>) = apply {
                this.permission = permission
            }

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
             * .group()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("email", email),
                    checkRequired("group", group),
                    doEmail,
                    permission,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            email()
            group()
            doEmail()
            permission().ifPresent { it.validate() }
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
                (if (group.asKnown().isPresent) 1 else 0) +
                (if (doEmail.asKnown().isPresent) 1 else 0) +
                (permission.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                email == other.email &&
                group == other.group &&
                doEmail == other.doEmail &&
                permission == other.permission &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(email, group, doEmail, permission, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{email=$email, group=$group, doEmail=$doEmail, permission=$permission, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemberCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MemberCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
