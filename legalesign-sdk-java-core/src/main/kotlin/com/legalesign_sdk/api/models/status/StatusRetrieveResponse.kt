// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.status

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.legalesign_sdk.api.core.ExcludeMissing
import com.legalesign_sdk.api.core.JsonField
import com.legalesign_sdk.api.core.JsonMissing
import com.legalesign_sdk.api.core.JsonValue
import com.legalesign_sdk.api.errors.LegalesignSdkInvalidDataException
import com.legalesign_sdk.api.models.signer.SignerStatusEnum
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class StatusRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val archived: JsonField<Boolean>,
    private val downloadFinal: JsonField<Boolean>,
    private val resourceUri: JsonField<String>,
    private val status: JsonField<SignerStatusEnum>,
    private val tag: JsonField<String>,
    private val tag1: JsonField<String>,
    private val tag2: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("download_final")
        @ExcludeMissing
        downloadFinal: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("resource_uri")
        @ExcludeMissing
        resourceUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<SignerStatusEnum> = JsonMissing.of(),
        @JsonProperty("tag") @ExcludeMissing tag: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tag1") @ExcludeMissing tag1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tag2") @ExcludeMissing tag2: JsonField<String> = JsonMissing.of(),
    ) : this(archived, downloadFinal, resourceUri, status, tag, tag1, tag2, mutableMapOf())

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun archived(): Optional<Boolean> = archived.getOptional("archived")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun downloadFinal(): Optional<Boolean> = downloadFinal.getOptional("download_final")

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
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tag(): Optional<String> = tag.getOptional("tag")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tag1(): Optional<String> = tag1.getOptional("tag1")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tag2(): Optional<String> = tag2.getOptional("tag2")

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [downloadFinal].
     *
     * Unlike [downloadFinal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("download_final")
    @ExcludeMissing
    fun _downloadFinal(): JsonField<Boolean> = downloadFinal

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

    /**
     * Returns the raw JSON value of [tag].
     *
     * Unlike [tag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tag") @ExcludeMissing fun _tag(): JsonField<String> = tag

    /**
     * Returns the raw JSON value of [tag1].
     *
     * Unlike [tag1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tag1") @ExcludeMissing fun _tag1(): JsonField<String> = tag1

    /**
     * Returns the raw JSON value of [tag2].
     *
     * Unlike [tag2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tag2") @ExcludeMissing fun _tag2(): JsonField<String> = tag2

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

        /** Returns a mutable builder for constructing an instance of [StatusRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatusRetrieveResponse]. */
    class Builder internal constructor() {

        private var archived: JsonField<Boolean> = JsonMissing.of()
        private var downloadFinal: JsonField<Boolean> = JsonMissing.of()
        private var resourceUri: JsonField<String> = JsonMissing.of()
        private var status: JsonField<SignerStatusEnum> = JsonMissing.of()
        private var tag: JsonField<String> = JsonMissing.of()
        private var tag1: JsonField<String> = JsonMissing.of()
        private var tag2: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(statusRetrieveResponse: StatusRetrieveResponse) = apply {
            archived = statusRetrieveResponse.archived
            downloadFinal = statusRetrieveResponse.downloadFinal
            resourceUri = statusRetrieveResponse.resourceUri
            status = statusRetrieveResponse.status
            tag = statusRetrieveResponse.tag
            tag1 = statusRetrieveResponse.tag1
            tag2 = statusRetrieveResponse.tag2
            additionalProperties = statusRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        fun downloadFinal(downloadFinal: Boolean) = downloadFinal(JsonField.of(downloadFinal))

        /**
         * Sets [Builder.downloadFinal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadFinal] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun downloadFinal(downloadFinal: JsonField<Boolean>) = apply {
            this.downloadFinal = downloadFinal
        }

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

        fun tag(tag: String) = tag(JsonField.of(tag))

        /**
         * Sets [Builder.tag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag(tag: JsonField<String>) = apply { this.tag = tag }

        fun tag1(tag1: String) = tag1(JsonField.of(tag1))

        /**
         * Sets [Builder.tag1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag1(tag1: JsonField<String>) = apply { this.tag1 = tag1 }

        fun tag2(tag2: String) = tag2(JsonField.of(tag2))

        /**
         * Sets [Builder.tag2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag2(tag2: JsonField<String>) = apply { this.tag2 = tag2 }

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
         * Returns an immutable instance of [StatusRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StatusRetrieveResponse =
            StatusRetrieveResponse(
                archived,
                downloadFinal,
                resourceUri,
                status,
                tag,
                tag1,
                tag2,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StatusRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        archived()
        downloadFinal()
        resourceUri()
        status().ifPresent { it.validate() }
        tag()
        tag1()
        tag2()
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
        (if (archived.asKnown().isPresent) 1 else 0) +
            (if (downloadFinal.asKnown().isPresent) 1 else 0) +
            (if (resourceUri.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tag.asKnown().isPresent) 1 else 0) +
            (if (tag1.asKnown().isPresent) 1 else 0) +
            (if (tag2.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatusRetrieveResponse &&
            archived == other.archived &&
            downloadFinal == other.downloadFinal &&
            resourceUri == other.resourceUri &&
            status == other.status &&
            tag == other.tag &&
            tag1 == other.tag1 &&
            tag2 == other.tag2 &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            archived,
            downloadFinal,
            resourceUri,
            status,
            tag,
            tag1,
            tag2,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StatusRetrieveResponse{archived=$archived, downloadFinal=$downloadFinal, resourceUri=$resourceUri, status=$status, tag=$tag, tag1=$tag1, tag2=$tag2, additionalProperties=$additionalProperties}"
}
