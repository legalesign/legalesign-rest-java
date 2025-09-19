// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.user

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.legalesign.api.core.ExcludeMissing
import com.legalesign.api.core.JsonField
import com.legalesign.api.core.JsonMissing
import com.legalesign.api.core.JsonValue
import com.legalesign.api.core.checkKnown
import com.legalesign.api.core.toImmutable
import com.legalesign.api.errors.LegalesignInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UserRetrieveResponse
private constructor(
    private val dateJoined: JsonField<OffsetDateTime>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val groups: JsonField<List<String>>,
    private val lastLogin: JsonField<OffsetDateTime>,
    private val lastName: JsonField<String>,
    private val resourceUri: JsonField<String>,
    private val timezone: JsonField<TimezoneEnum>,
    private val username: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("date_joined")
        @ExcludeMissing
        dateJoined: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("groups") @ExcludeMissing groups: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("last_login")
        @ExcludeMissing
        lastLogin: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("last_name") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resource_uri")
        @ExcludeMissing
        resourceUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timezone")
        @ExcludeMissing
        timezone: JsonField<TimezoneEnum> = JsonMissing.of(),
        @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
    ) : this(
        dateJoined,
        email,
        firstName,
        groups,
        lastLogin,
        lastName,
        resourceUri,
        timezone,
        username,
        mutableMapOf(),
    )

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateJoined(): Optional<OffsetDateTime> = dateJoined.getOptional("date_joined")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("first_name")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groups(): Optional<List<String>> = groups.getOptional("groups")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastLogin(): Optional<OffsetDateTime> = lastLogin.getOptional("last_login")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("last_name")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceUri(): Optional<String> = resourceUri.getOptional("resource_uri")

    /**
     * List of available timezones
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezone(): Optional<TimezoneEnum> = timezone.getOptional("timezone")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun username(): Optional<String> = username.getOptional("username")

    /**
     * Returns the raw JSON value of [dateJoined].
     *
     * Unlike [dateJoined], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_joined")
    @ExcludeMissing
    fun _dateJoined(): JsonField<OffsetDateTime> = dateJoined

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
     * Returns the raw JSON value of [groups].
     *
     * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groups") @ExcludeMissing fun _groups(): JsonField<List<String>> = groups

    /**
     * Returns the raw JSON value of [lastLogin].
     *
     * Unlike [lastLogin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_login")
    @ExcludeMissing
    fun _lastLogin(): JsonField<OffsetDateTime> = lastLogin

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [resourceUri].
     *
     * Unlike [resourceUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_uri")
    @ExcludeMissing
    fun _resourceUri(): JsonField<String> = resourceUri

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<TimezoneEnum> = timezone

    /**
     * Returns the raw JSON value of [username].
     *
     * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

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

        /** Returns a mutable builder for constructing an instance of [UserRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserRetrieveResponse]. */
    class Builder internal constructor() {

        private var dateJoined: JsonField<OffsetDateTime> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var groups: JsonField<MutableList<String>>? = null
        private var lastLogin: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var resourceUri: JsonField<String> = JsonMissing.of()
        private var timezone: JsonField<TimezoneEnum> = JsonMissing.of()
        private var username: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userRetrieveResponse: UserRetrieveResponse) = apply {
            dateJoined = userRetrieveResponse.dateJoined
            email = userRetrieveResponse.email
            firstName = userRetrieveResponse.firstName
            groups = userRetrieveResponse.groups.map { it.toMutableList() }
            lastLogin = userRetrieveResponse.lastLogin
            lastName = userRetrieveResponse.lastName
            resourceUri = userRetrieveResponse.resourceUri
            timezone = userRetrieveResponse.timezone
            username = userRetrieveResponse.username
            additionalProperties = userRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun dateJoined(dateJoined: OffsetDateTime) = dateJoined(JsonField.of(dateJoined))

        /**
         * Sets [Builder.dateJoined] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateJoined] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateJoined(dateJoined: JsonField<OffsetDateTime>) = apply {
            this.dateJoined = dateJoined
        }

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        fun groups(groups: List<String>) = groups(JsonField.of(groups))

        /**
         * Sets [Builder.groups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groups] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groups(groups: JsonField<List<String>>) = apply {
            this.groups = groups.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [groups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroup(group: String) = apply {
            groups =
                (groups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groups", it).add(group)
                }
        }

        fun lastLogin(lastLogin: OffsetDateTime) = lastLogin(JsonField.of(lastLogin))

        /**
         * Sets [Builder.lastLogin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastLogin] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastLogin(lastLogin: JsonField<OffsetDateTime>) = apply { this.lastLogin = lastLogin }

        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        fun resourceUri(resourceUri: String) = resourceUri(JsonField.of(resourceUri))

        /**
         * Sets [Builder.resourceUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceUri(resourceUri: JsonField<String>) = apply { this.resourceUri = resourceUri }

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

        fun username(username: String) = username(JsonField.of(username))

        /**
         * Sets [Builder.username] to an arbitrary JSON value.
         *
         * You should usually call [Builder.username] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun username(username: JsonField<String>) = apply { this.username = username }

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
         * Returns an immutable instance of [UserRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserRetrieveResponse =
            UserRetrieveResponse(
                dateJoined,
                email,
                firstName,
                (groups ?: JsonMissing.of()).map { it.toImmutable() },
                lastLogin,
                lastName,
                resourceUri,
                timezone,
                username,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        dateJoined()
        email()
        firstName()
        groups()
        lastLogin()
        lastName()
        resourceUri()
        timezone().ifPresent { it.validate() }
        username()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (dateJoined.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (groups.asKnown().getOrNull()?.size ?: 0) +
            (if (lastLogin.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (resourceUri.asKnown().isPresent) 1 else 0) +
            (timezone.asKnown().getOrNull()?.validity() ?: 0) +
            (if (username.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserRetrieveResponse &&
            dateJoined == other.dateJoined &&
            email == other.email &&
            firstName == other.firstName &&
            groups == other.groups &&
            lastLogin == other.lastLogin &&
            lastName == other.lastName &&
            resourceUri == other.resourceUri &&
            timezone == other.timezone &&
            username == other.username &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            dateJoined,
            email,
            firstName,
            groups,
            lastLogin,
            lastName,
            resourceUri,
            timezone,
            username,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserRetrieveResponse{dateJoined=$dateJoined, email=$email, firstName=$firstName, groups=$groups, lastLogin=$lastLogin, lastName=$lastName, resourceUri=$resourceUri, timezone=$timezone, username=$username, additionalProperties=$additionalProperties}"
}
