// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.templatepdf

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.legalesign.api.core.ExcludeMissing
import com.legalesign.api.core.JsonField
import com.legalesign.api.core.JsonMissing
import com.legalesign.api.core.JsonValue
import com.legalesign.api.errors.LegalesignInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class TemplatePdf
private constructor(
    private val created: JsonField<OffsetDateTime>,
    private val group: JsonField<String>,
    private val modified: JsonField<OffsetDateTime>,
    private val pageCount: JsonField<Long>,
    private val parties: JsonField<String>,
    private val resourceUri: JsonField<String>,
    private val signerCount: JsonField<Long>,
    private val title: JsonField<String>,
    private val user: JsonField<String>,
    private val uuid: JsonField<String>,
    private val valid: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("group") @ExcludeMissing group: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modified")
        @ExcludeMissing
        modified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("page_count") @ExcludeMissing pageCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("parties") @ExcludeMissing parties: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resource_uri")
        @ExcludeMissing
        resourceUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signer_count")
        @ExcludeMissing
        signerCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uuid") @ExcludeMissing uuid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("valid") @ExcludeMissing valid: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        created,
        group,
        modified,
        pageCount,
        parties,
        resourceUri,
        signerCount,
        title,
        user,
        uuid,
        valid,
        mutableMapOf(),
    )

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): Optional<OffsetDateTime> = created.getOptional("created")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun group(): Optional<String> = group.getOptional("group")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modified(): Optional<OffsetDateTime> = modified.getOptional("modified")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageCount(): Optional<Long> = pageCount.getOptional("page_count")

    /**
     * JSON stringified array of document parties
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parties(): Optional<String> = parties.getOptional("parties")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceUri(): Optional<String> = resourceUri.getOptional("resource_uri")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signerCount(): Optional<Long> = signerCount.getOptional("signer_count")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * resource_uri for user
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): Optional<String> = user.getOptional("user")

    /**
     * id for pdf object
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uuid(): Optional<String> = uuid.getOptional("uuid")

    /**
     * Is able to be sent (if fields do not validate)
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun valid(): Optional<Boolean> = valid.getOptional("valid")

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [group].
     *
     * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<String> = group

    /**
     * Returns the raw JSON value of [modified].
     *
     * Unlike [modified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modified") @ExcludeMissing fun _modified(): JsonField<OffsetDateTime> = modified

    /**
     * Returns the raw JSON value of [pageCount].
     *
     * Unlike [pageCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_count") @ExcludeMissing fun _pageCount(): JsonField<Long> = pageCount

    /**
     * Returns the raw JSON value of [parties].
     *
     * Unlike [parties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parties") @ExcludeMissing fun _parties(): JsonField<String> = parties

    /**
     * Returns the raw JSON value of [resourceUri].
     *
     * Unlike [resourceUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_uri")
    @ExcludeMissing
    fun _resourceUri(): JsonField<String> = resourceUri

    /**
     * Returns the raw JSON value of [signerCount].
     *
     * Unlike [signerCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signer_count") @ExcludeMissing fun _signerCount(): JsonField<Long> = signerCount

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

    /**
     * Returns the raw JSON value of [uuid].
     *
     * Unlike [uuid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uuid") @ExcludeMissing fun _uuid(): JsonField<String> = uuid

    /**
     * Returns the raw JSON value of [valid].
     *
     * Unlike [valid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("valid") @ExcludeMissing fun _valid(): JsonField<Boolean> = valid

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

        /** Returns a mutable builder for constructing an instance of [TemplatePdf]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TemplatePdf]. */
    class Builder internal constructor() {

        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var group: JsonField<String> = JsonMissing.of()
        private var modified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var pageCount: JsonField<Long> = JsonMissing.of()
        private var parties: JsonField<String> = JsonMissing.of()
        private var resourceUri: JsonField<String> = JsonMissing.of()
        private var signerCount: JsonField<Long> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var uuid: JsonField<String> = JsonMissing.of()
        private var valid: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(templatePdf: TemplatePdf) = apply {
            created = templatePdf.created
            group = templatePdf.group
            modified = templatePdf.modified
            pageCount = templatePdf.pageCount
            parties = templatePdf.parties
            resourceUri = templatePdf.resourceUri
            signerCount = templatePdf.signerCount
            title = templatePdf.title
            user = templatePdf.user
            uuid = templatePdf.uuid
            valid = templatePdf.valid
            additionalProperties = templatePdf.additionalProperties.toMutableMap()
        }

        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun group(group: String) = group(JsonField.of(group))

        /**
         * Sets [Builder.group] to an arbitrary JSON value.
         *
         * You should usually call [Builder.group] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun group(group: JsonField<String>) = apply { this.group = group }

        fun modified(modified: OffsetDateTime) = modified(JsonField.of(modified))

        /**
         * Sets [Builder.modified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modified] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modified(modified: JsonField<OffsetDateTime>) = apply { this.modified = modified }

        fun pageCount(pageCount: Long) = pageCount(JsonField.of(pageCount))

        /**
         * Sets [Builder.pageCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageCount(pageCount: JsonField<Long>) = apply { this.pageCount = pageCount }

        /** JSON stringified array of document parties */
        fun parties(parties: String) = parties(JsonField.of(parties))

        /**
         * Sets [Builder.parties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parties] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun parties(parties: JsonField<String>) = apply { this.parties = parties }

        fun resourceUri(resourceUri: String) = resourceUri(JsonField.of(resourceUri))

        /**
         * Sets [Builder.resourceUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceUri(resourceUri: JsonField<String>) = apply { this.resourceUri = resourceUri }

        fun signerCount(signerCount: Long) = signerCount(JsonField.of(signerCount))

        /**
         * Sets [Builder.signerCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signerCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signerCount(signerCount: JsonField<Long>) = apply { this.signerCount = signerCount }

        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** resource_uri for user */
        fun user(user: String) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

        /** id for pdf object */
        fun uuid(uuid: String) = uuid(JsonField.of(uuid))

        /**
         * Sets [Builder.uuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uuid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uuid(uuid: JsonField<String>) = apply { this.uuid = uuid }

        /** Is able to be sent (if fields do not validate) */
        fun valid(valid: Boolean) = valid(JsonField.of(valid))

        /**
         * Sets [Builder.valid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valid] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun valid(valid: JsonField<Boolean>) = apply { this.valid = valid }

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
         * Returns an immutable instance of [TemplatePdf].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TemplatePdf =
            TemplatePdf(
                created,
                group,
                modified,
                pageCount,
                parties,
                resourceUri,
                signerCount,
                title,
                user,
                uuid,
                valid,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TemplatePdf = apply {
        if (validated) {
            return@apply
        }

        created()
        group()
        modified()
        pageCount()
        parties()
        resourceUri()
        signerCount()
        title()
        user()
        uuid()
        valid()
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
        (if (created.asKnown().isPresent) 1 else 0) +
            (if (group.asKnown().isPresent) 1 else 0) +
            (if (modified.asKnown().isPresent) 1 else 0) +
            (if (pageCount.asKnown().isPresent) 1 else 0) +
            (if (parties.asKnown().isPresent) 1 else 0) +
            (if (resourceUri.asKnown().isPresent) 1 else 0) +
            (if (signerCount.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (user.asKnown().isPresent) 1 else 0) +
            (if (uuid.asKnown().isPresent) 1 else 0) +
            (if (valid.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TemplatePdf &&
            created == other.created &&
            group == other.group &&
            modified == other.modified &&
            pageCount == other.pageCount &&
            parties == other.parties &&
            resourceUri == other.resourceUri &&
            signerCount == other.signerCount &&
            title == other.title &&
            user == other.user &&
            uuid == other.uuid &&
            valid == other.valid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            created,
            group,
            modified,
            pageCount,
            parties,
            resourceUri,
            signerCount,
            title,
            user,
            uuid,
            valid,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TemplatePdf{created=$created, group=$group, modified=$modified, pageCount=$pageCount, parties=$parties, resourceUri=$resourceUri, signerCount=$signerCount, title=$title, user=$user, uuid=$uuid, valid=$valid, additionalProperties=$additionalProperties}"
}
