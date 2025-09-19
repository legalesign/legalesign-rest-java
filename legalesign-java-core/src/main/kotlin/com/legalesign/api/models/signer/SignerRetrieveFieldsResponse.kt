// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.signer

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.legalesign.api.core.ExcludeMissing
import com.legalesign.api.core.JsonField
import com.legalesign.api.core.JsonMissing
import com.legalesign.api.core.JsonValue
import com.legalesign.api.errors.LegalesignInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SignerRetrieveFieldsResponse
private constructor(
    private val fieldorder: JsonField<Long>,
    private val label: JsonField<String>,
    private val labelExtra: JsonField<String>,
    private val state: JsonField<Boolean>,
    private val value: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fieldorder") @ExcludeMissing fieldorder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label_extra")
        @ExcludeMissing
        labelExtra: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
    ) : this(fieldorder, label, labelExtra, state, value, mutableMapOf())

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldorder(): Optional<Long> = fieldorder.getOptional("fieldorder")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun labelExtra(): Optional<String> = labelExtra.getOptional("label_extra")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<Boolean> = state.getOptional("state")

    /**
     * If the field is a signer file this value will be a short lived download URL
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<String> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [fieldorder].
     *
     * Unlike [fieldorder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fieldorder") @ExcludeMissing fun _fieldorder(): JsonField<Long> = fieldorder

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [labelExtra].
     *
     * Unlike [labelExtra], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label_extra") @ExcludeMissing fun _labelExtra(): JsonField<String> = labelExtra

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<Boolean> = state

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
         * Returns a mutable builder for constructing an instance of [SignerRetrieveFieldsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SignerRetrieveFieldsResponse]. */
    class Builder internal constructor() {

        private var fieldorder: JsonField<Long> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var labelExtra: JsonField<String> = JsonMissing.of()
        private var state: JsonField<Boolean> = JsonMissing.of()
        private var value: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(signerRetrieveFieldsResponse: SignerRetrieveFieldsResponse) = apply {
            fieldorder = signerRetrieveFieldsResponse.fieldorder
            label = signerRetrieveFieldsResponse.label
            labelExtra = signerRetrieveFieldsResponse.labelExtra
            state = signerRetrieveFieldsResponse.state
            value = signerRetrieveFieldsResponse.value
            additionalProperties = signerRetrieveFieldsResponse.additionalProperties.toMutableMap()
        }

        fun fieldorder(fieldorder: Long?) = fieldorder(JsonField.ofNullable(fieldorder))

        /**
         * Alias for [Builder.fieldorder].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun fieldorder(fieldorder: Long) = fieldorder(fieldorder as Long?)

        /** Alias for calling [Builder.fieldorder] with `fieldorder.orElse(null)`. */
        fun fieldorder(fieldorder: Optional<Long>) = fieldorder(fieldorder.getOrNull())

        /**
         * Sets [Builder.fieldorder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldorder] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fieldorder(fieldorder: JsonField<Long>) = apply { this.fieldorder = fieldorder }

        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        fun labelExtra(labelExtra: String) = labelExtra(JsonField.of(labelExtra))

        /**
         * Sets [Builder.labelExtra] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labelExtra] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun labelExtra(labelExtra: JsonField<String>) = apply { this.labelExtra = labelExtra }

        fun state(state: Boolean) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<Boolean>) = apply { this.state = state }

        /** If the field is a signer file this value will be a short lived download URL */
        fun value(value: String?) = value(JsonField.ofNullable(value))

        /** Alias for calling [Builder.value] with `value.orElse(null)`. */
        fun value(value: Optional<String>) = value(value.getOrNull())

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

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
         * Returns an immutable instance of [SignerRetrieveFieldsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SignerRetrieveFieldsResponse =
            SignerRetrieveFieldsResponse(
                fieldorder,
                label,
                labelExtra,
                state,
                value,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SignerRetrieveFieldsResponse = apply {
        if (validated) {
            return@apply
        }

        fieldorder()
        label()
        labelExtra()
        state()
        value()
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
        (if (fieldorder.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (labelExtra.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SignerRetrieveFieldsResponse &&
            fieldorder == other.fieldorder &&
            label == other.label &&
            labelExtra == other.labelExtra &&
            state == other.state &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fieldorder, label, labelExtra, state, value, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SignerRetrieveFieldsResponse{fieldorder=$fieldorder, label=$label, labelExtra=$labelExtra, state=$state, value=$value, additionalProperties=$additionalProperties}"
}
