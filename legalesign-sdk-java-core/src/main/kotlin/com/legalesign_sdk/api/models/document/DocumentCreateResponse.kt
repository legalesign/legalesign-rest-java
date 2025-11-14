// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.document

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

class DocumentCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val signer1: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("signer_1") @ExcludeMissing signer1: JsonField<String> = JsonMissing.of()
    ) : this(signer1, mutableMapOf())

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signer1(): Optional<String> = signer1.getOptional("signer_1")

    /**
     * Returns the raw JSON value of [signer1].
     *
     * Unlike [signer1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signer_1") @ExcludeMissing fun _signer1(): JsonField<String> = signer1

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

        /** Returns a mutable builder for constructing an instance of [DocumentCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentCreateResponse]. */
    class Builder internal constructor() {

        private var signer1: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentCreateResponse: DocumentCreateResponse) = apply {
            signer1 = documentCreateResponse.signer1
            additionalProperties = documentCreateResponse.additionalProperties.toMutableMap()
        }

        fun signer1(signer1: String) = signer1(JsonField.of(signer1))

        /**
         * Sets [Builder.signer1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signer1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun signer1(signer1: JsonField<String>) = apply { this.signer1 = signer1 }

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
         * Returns an immutable instance of [DocumentCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocumentCreateResponse =
            DocumentCreateResponse(signer1, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): DocumentCreateResponse = apply {
        if (validated) {
            return@apply
        }

        signer1()
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
    @JvmSynthetic internal fun validity(): Int = (if (signer1.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentCreateResponse &&
            signer1 == other.signer1 &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(signer1, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentCreateResponse{signer1=$signer1, additionalProperties=$additionalProperties}"
}
