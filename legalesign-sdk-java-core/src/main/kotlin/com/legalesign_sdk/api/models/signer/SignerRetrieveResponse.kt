// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.signer

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.legalesign_sdk.api.core.ExcludeMissing
import com.legalesign_sdk.api.core.JsonField
import com.legalesign_sdk.api.core.JsonMissing
import com.legalesign_sdk.api.core.JsonValue
import com.legalesign_sdk.api.errors.LegalesignSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SignerRetrieveResponse
private constructor(
    private val document: JsonField<String>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val hasFields: JsonField<Boolean>,
    private val lastName: JsonField<String>,
    private val order: JsonField<Int>,
    private val resourceUri: JsonField<String>,
    private val status: JsonField<SignerStatusEnum>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("document") @ExcludeMissing document: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("first_name") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("has_fields")
        @ExcludeMissing
        hasFields: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("last_name") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("resource_uri")
        @ExcludeMissing
        resourceUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<SignerStatusEnum> = JsonMissing.of(),
    ) : this(
        document,
        email,
        firstName,
        hasFields,
        lastName,
        order,
        resourceUri,
        status,
        mutableMapOf(),
    )

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun document(): Optional<String> = document.getOptional("document")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("first_name")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun hasFields(): Optional<Boolean> = hasFields.getOptional("has_fields")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("last_name")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun order(): Optional<Int> = order.getOptional("order")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun resourceUri(): Optional<String> = resourceUri.getOptional("resource_uri")

    /**
     * Signer status options:
     * * 4 - unsent
     * * 5 - scheduled to be sent
     * * 10 - sent
     * * 15 - email opened
     * * 20 - visited
     * * 30 - fields complete
     * * 35 - fields complete ex signature
     * * 39 - waiting for witness to complete
     * * 40 - signed
     * * 50 - downloaded
     * * 60 - rejected
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<SignerStatusEnum> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [document].
     *
     * Unlike [document], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document") @ExcludeMissing fun _document(): JsonField<String> = document

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
     * Returns the raw JSON value of [hasFields].
     *
     * Unlike [hasFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_fields") @ExcludeMissing fun _hasFields(): JsonField<Boolean> = hasFields

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [order].
     *
     * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Int> = order

    /**
     * Returns the raw JSON value of [resourceUri].
     *
     * Unlike [resourceUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_uri")
    @ExcludeMissing
    fun _resourceUri(): JsonField<String> = resourceUri

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<SignerStatusEnum> = status

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

        /** Returns a mutable builder for constructing an instance of [SignerRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SignerRetrieveResponse]. */
    class Builder internal constructor() {

        private var document: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var hasFields: JsonField<Boolean> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var order: JsonField<Int> = JsonMissing.of()
        private var resourceUri: JsonField<String> = JsonMissing.of()
        private var status: JsonField<SignerStatusEnum> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(signerRetrieveResponse: SignerRetrieveResponse) = apply {
            document = signerRetrieveResponse.document
            email = signerRetrieveResponse.email
            firstName = signerRetrieveResponse.firstName
            hasFields = signerRetrieveResponse.hasFields
            lastName = signerRetrieveResponse.lastName
            order = signerRetrieveResponse.order
            resourceUri = signerRetrieveResponse.resourceUri
            status = signerRetrieveResponse.status
            additionalProperties = signerRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun document(document: String) = document(JsonField.of(document))

        /**
         * Sets [Builder.document] to an arbitrary JSON value.
         *
         * You should usually call [Builder.document] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun document(document: JsonField<String>) = apply { this.document = document }

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

        fun hasFields(hasFields: Boolean) = hasFields(JsonField.of(hasFields))

        /**
         * Sets [Builder.hasFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasFields] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasFields(hasFields: JsonField<Boolean>) = apply { this.hasFields = hasFields }

        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        fun order(order: Int) = order(JsonField.of(order))

        /**
         * Sets [Builder.order] to an arbitrary JSON value.
         *
         * You should usually call [Builder.order] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun order(order: JsonField<Int>) = apply { this.order = order }

        fun resourceUri(resourceUri: String) = resourceUri(JsonField.of(resourceUri))

        /**
         * Sets [Builder.resourceUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceUri(resourceUri: JsonField<String>) = apply { this.resourceUri = resourceUri }

        /**
         * Signer status options:
         * * 4 - unsent
         * * 5 - scheduled to be sent
         * * 10 - sent
         * * 15 - email opened
         * * 20 - visited
         * * 30 - fields complete
         * * 35 - fields complete ex signature
         * * 39 - waiting for witness to complete
         * * 40 - signed
         * * 50 - downloaded
         * * 60 - rejected
         */
        fun status(status: SignerStatusEnum) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [SignerStatusEnum] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<SignerStatusEnum>) = apply { this.status = status }

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
         * Returns an immutable instance of [SignerRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SignerRetrieveResponse =
            SignerRetrieveResponse(
                document,
                email,
                firstName,
                hasFields,
                lastName,
                order,
                resourceUri,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SignerRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        document()
        email()
        firstName()
        hasFields()
        lastName()
        order()
        resourceUri()
        status().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LegalesignSdkInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (document.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (hasFields.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (if (order.asKnown().isPresent) 1 else 0) +
            (if (resourceUri.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SignerRetrieveResponse &&
            document == other.document &&
            email == other.email &&
            firstName == other.firstName &&
            hasFields == other.hasFields &&
            lastName == other.lastName &&
            order == other.order &&
            resourceUri == other.resourceUri &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            document,
            email,
            firstName,
            hasFields,
            lastName,
            order,
            resourceUri,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SignerRetrieveResponse{document=$document, email=$email, firstName=$firstName, hasFields=$hasFields, lastName=$lastName, order=$order, resourceUri=$resourceUri, status=$status, additionalProperties=$additionalProperties}"
}
