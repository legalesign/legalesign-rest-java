// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.templatepdf

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.legalesign_sdk.api.core.ExcludeMissing
import com.legalesign_sdk.api.core.JsonField
import com.legalesign_sdk.api.core.JsonMissing
import com.legalesign_sdk.api.core.JsonValue
import com.legalesign_sdk.api.core.checkKnown
import com.legalesign_sdk.api.core.toImmutable
import com.legalesign_sdk.api.errors.LegalesignSdkInvalidDataException
import com.legalesign_sdk.api.models.document.ListMeta
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TemplatepdfListResponse
private constructor(
    private val meta: JsonField<ListMeta>,
    private val objects: JsonField<List<TemplatePdf>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<ListMeta> = JsonMissing.of(),
        @JsonProperty("objects")
        @ExcludeMissing
        objects: JsonField<List<TemplatePdf>> = JsonMissing.of(),
    ) : this(meta, objects, mutableMapOf())

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun meta(): Optional<ListMeta> = meta.getOptional("meta")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun objects(): Optional<List<TemplatePdf>> = objects.getOptional("objects")

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<ListMeta> = meta

    /**
     * Returns the raw JSON value of [objects].
     *
     * Unlike [objects], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objects") @ExcludeMissing fun _objects(): JsonField<List<TemplatePdf>> = objects

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

        /** Returns a mutable builder for constructing an instance of [TemplatepdfListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TemplatepdfListResponse]. */
    class Builder internal constructor() {

        private var meta: JsonField<ListMeta> = JsonMissing.of()
        private var objects: JsonField<MutableList<TemplatePdf>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(templatepdfListResponse: TemplatepdfListResponse) = apply {
            meta = templatepdfListResponse.meta
            objects = templatepdfListResponse.objects.map { it.toMutableList() }
            additionalProperties = templatepdfListResponse.additionalProperties.toMutableMap()
        }

        fun meta(meta: ListMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [ListMeta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<ListMeta>) = apply { this.meta = meta }

        fun objects(objects: List<TemplatePdf>) = objects(JsonField.of(objects))

        /**
         * Sets [Builder.objects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objects] with a well-typed `List<TemplatePdf>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objects(objects: JsonField<List<TemplatePdf>>) = apply {
            this.objects = objects.map { it.toMutableList() }
        }

        /**
         * Adds a single [TemplatePdf] to [objects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObject(object_: TemplatePdf) = apply {
            objects =
                (objects ?: JsonField.of(mutableListOf())).also {
                    checkKnown("objects", it).add(object_)
                }
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
         * Returns an immutable instance of [TemplatepdfListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TemplatepdfListResponse =
            TemplatepdfListResponse(
                meta,
                (objects ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TemplatepdfListResponse = apply {
        if (validated) {
            return@apply
        }

        meta().ifPresent { it.validate() }
        objects().ifPresent { it.forEach { it.validate() } }
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
        (meta.asKnown().getOrNull()?.validity() ?: 0) +
            (objects.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TemplatepdfListResponse &&
            meta == other.meta &&
            objects == other.objects &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(meta, objects, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TemplatepdfListResponse{meta=$meta, objects=$objects, additionalProperties=$additionalProperties}"
}
