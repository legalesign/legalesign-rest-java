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
import kotlin.jvm.optionals.getOrNull

class ListMeta
private constructor(
    private val limit: JsonField<Int>,
    private val next: JsonField<String>,
    private val offset: JsonField<Int>,
    private val previous: JsonField<String>,
    private val totalCount: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("previous") @ExcludeMissing previous: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_count") @ExcludeMissing totalCount: JsonField<Int> = JsonMissing.of(),
    ) : this(limit, next, offset, previous, totalCount, mutableMapOf())

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun limit(): Optional<Int> = limit.getOptional("limit")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun next(): Optional<String> = next.getOptional("next")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun offset(): Optional<Int> = offset.getOptional("offset")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun previous(): Optional<String> = previous.getOptional("previous")

    /**
     * total number of objects
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun totalCount(): Optional<Int> = totalCount.getOptional("total_count")

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Int> = limit

    /**
     * Returns the raw JSON value of [next].
     *
     * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Int> = offset

    /**
     * Returns the raw JSON value of [previous].
     *
     * Unlike [previous], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous") @ExcludeMissing fun _previous(): JsonField<String> = previous

    /**
     * Returns the raw JSON value of [totalCount].
     *
     * Unlike [totalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_count") @ExcludeMissing fun _totalCount(): JsonField<Int> = totalCount

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

        /** Returns a mutable builder for constructing an instance of [ListMeta]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListMeta]. */
    class Builder internal constructor() {

        private var limit: JsonField<Int> = JsonMissing.of()
        private var next: JsonField<String> = JsonMissing.of()
        private var offset: JsonField<Int> = JsonMissing.of()
        private var previous: JsonField<String> = JsonMissing.of()
        private var totalCount: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listMeta: ListMeta) = apply {
            limit = listMeta.limit
            next = listMeta.next
            offset = listMeta.offset
            previous = listMeta.previous
            totalCount = listMeta.totalCount
            additionalProperties = listMeta.additionalProperties.toMutableMap()
        }

        fun limit(limit: Int) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Int>) = apply { this.limit = limit }

        fun next(next: String?) = next(JsonField.ofNullable(next))

        /** Alias for calling [Builder.next] with `next.orElse(null)`. */
        fun next(next: Optional<String>) = next(next.getOrNull())

        /**
         * Sets [Builder.next] to an arbitrary JSON value.
         *
         * You should usually call [Builder.next] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun next(next: JsonField<String>) = apply { this.next = next }

        fun offset(offset: Int) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Int>) = apply { this.offset = offset }

        fun previous(previous: String?) = previous(JsonField.ofNullable(previous))

        /** Alias for calling [Builder.previous] with `previous.orElse(null)`. */
        fun previous(previous: Optional<String>) = previous(previous.getOrNull())

        /**
         * Sets [Builder.previous] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previous] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun previous(previous: JsonField<String>) = apply { this.previous = previous }

        /** total number of objects */
        fun totalCount(totalCount: Int) = totalCount(JsonField.of(totalCount))

        /**
         * Sets [Builder.totalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalCount(totalCount: JsonField<Int>) = apply { this.totalCount = totalCount }

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
         * Returns an immutable instance of [ListMeta].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ListMeta =
            ListMeta(limit, next, offset, previous, totalCount, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ListMeta = apply {
        if (validated) {
            return@apply
        }

        limit()
        next()
        offset()
        previous()
        totalCount()
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
        (if (limit.asKnown().isPresent) 1 else 0) +
            (if (next.asKnown().isPresent) 1 else 0) +
            (if (offset.asKnown().isPresent) 1 else 0) +
            (if (previous.asKnown().isPresent) 1 else 0) +
            (if (totalCount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListMeta &&
            limit == other.limit &&
            next == other.next &&
            offset == other.offset &&
            previous == other.previous &&
            totalCount == other.totalCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(limit, next, offset, previous, totalCount, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListMeta{limit=$limit, next=$next, offset=$offset, previous=$previous, totalCount=$totalCount, additionalProperties=$additionalProperties}"
}
