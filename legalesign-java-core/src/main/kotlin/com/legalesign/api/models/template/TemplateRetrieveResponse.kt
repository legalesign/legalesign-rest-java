// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.template

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

class TemplateRetrieveResponse
private constructor(
    private val archive: JsonField<Boolean>,
    private val created: JsonField<OffsetDateTime>,
    private val group: JsonField<String>,
    private val hasFields: JsonField<Boolean>,
    private val latestText: JsonField<String>,
    private val modified: JsonField<OffsetDateTime>,
    private val resourceUri: JsonField<String>,
    private val signeeCount: JsonField<Int>,
    private val title: JsonField<String>,
    private val user: JsonField<String>,
    private val uuid: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("archive") @ExcludeMissing archive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("group") @ExcludeMissing group: JsonField<String> = JsonMissing.of(),
        @JsonProperty("has_fields")
        @ExcludeMissing
        hasFields: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("latest_text")
        @ExcludeMissing
        latestText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modified")
        @ExcludeMissing
        modified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("resource_uri")
        @ExcludeMissing
        resourceUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signee_count")
        @ExcludeMissing
        signeeCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uuid") @ExcludeMissing uuid: JsonField<String> = JsonMissing.of(),
    ) : this(
        archive,
        created,
        group,
        hasFields,
        latestText,
        modified,
        resourceUri,
        signeeCount,
        title,
        user,
        uuid,
        mutableMapOf(),
    )

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archive(): Optional<Boolean> = archive.getOptional("archive")

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
    fun hasFields(): Optional<Boolean> = hasFields.getOptional("has_fields")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestText(): Optional<String> = latestText.getOptional("latest_text")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modified(): Optional<OffsetDateTime> = modified.getOptional("modified")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceUri(): Optional<String> = resourceUri.getOptional("resource_uri")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signeeCount(): Optional<Int> = signeeCount.getOptional("signee_count")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): Optional<String> = user.getOptional("user")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uuid(): Optional<String> = uuid.getOptional("uuid")

    /**
     * Returns the raw JSON value of [archive].
     *
     * Unlike [archive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archive") @ExcludeMissing fun _archive(): JsonField<Boolean> = archive

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
     * Returns the raw JSON value of [hasFields].
     *
     * Unlike [hasFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_fields") @ExcludeMissing fun _hasFields(): JsonField<Boolean> = hasFields

    /**
     * Returns the raw JSON value of [latestText].
     *
     * Unlike [latestText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latest_text") @ExcludeMissing fun _latestText(): JsonField<String> = latestText

    /**
     * Returns the raw JSON value of [modified].
     *
     * Unlike [modified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modified") @ExcludeMissing fun _modified(): JsonField<OffsetDateTime> = modified

    /**
     * Returns the raw JSON value of [resourceUri].
     *
     * Unlike [resourceUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_uri")
    @ExcludeMissing
    fun _resourceUri(): JsonField<String> = resourceUri

    /**
     * Returns the raw JSON value of [signeeCount].
     *
     * Unlike [signeeCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signee_count") @ExcludeMissing fun _signeeCount(): JsonField<Int> = signeeCount

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

        /** Returns a mutable builder for constructing an instance of [TemplateRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TemplateRetrieveResponse]. */
    class Builder internal constructor() {

        private var archive: JsonField<Boolean> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var group: JsonField<String> = JsonMissing.of()
        private var hasFields: JsonField<Boolean> = JsonMissing.of()
        private var latestText: JsonField<String> = JsonMissing.of()
        private var modified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var resourceUri: JsonField<String> = JsonMissing.of()
        private var signeeCount: JsonField<Int> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var uuid: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(templateRetrieveResponse: TemplateRetrieveResponse) = apply {
            archive = templateRetrieveResponse.archive
            created = templateRetrieveResponse.created
            group = templateRetrieveResponse.group
            hasFields = templateRetrieveResponse.hasFields
            latestText = templateRetrieveResponse.latestText
            modified = templateRetrieveResponse.modified
            resourceUri = templateRetrieveResponse.resourceUri
            signeeCount = templateRetrieveResponse.signeeCount
            title = templateRetrieveResponse.title
            user = templateRetrieveResponse.user
            uuid = templateRetrieveResponse.uuid
            additionalProperties = templateRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun archive(archive: Boolean) = archive(JsonField.of(archive))

        /**
         * Sets [Builder.archive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archive] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun archive(archive: JsonField<Boolean>) = apply { this.archive = archive }

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

        fun hasFields(hasFields: Boolean) = hasFields(JsonField.of(hasFields))

        /**
         * Sets [Builder.hasFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasFields] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasFields(hasFields: JsonField<Boolean>) = apply { this.hasFields = hasFields }

        fun latestText(latestText: String) = latestText(JsonField.of(latestText))

        /**
         * Sets [Builder.latestText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun latestText(latestText: JsonField<String>) = apply { this.latestText = latestText }

        fun modified(modified: OffsetDateTime) = modified(JsonField.of(modified))

        /**
         * Sets [Builder.modified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modified] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modified(modified: JsonField<OffsetDateTime>) = apply { this.modified = modified }

        fun resourceUri(resourceUri: String) = resourceUri(JsonField.of(resourceUri))

        /**
         * Sets [Builder.resourceUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceUri(resourceUri: JsonField<String>) = apply { this.resourceUri = resourceUri }

        fun signeeCount(signeeCount: Int) = signeeCount(JsonField.of(signeeCount))

        /**
         * Sets [Builder.signeeCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signeeCount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun signeeCount(signeeCount: JsonField<Int>) = apply { this.signeeCount = signeeCount }

        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        fun user(user: String) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

        fun uuid(uuid: String) = uuid(JsonField.of(uuid))

        /**
         * Sets [Builder.uuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uuid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uuid(uuid: JsonField<String>) = apply { this.uuid = uuid }

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
         * Returns an immutable instance of [TemplateRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TemplateRetrieveResponse =
            TemplateRetrieveResponse(
                archive,
                created,
                group,
                hasFields,
                latestText,
                modified,
                resourceUri,
                signeeCount,
                title,
                user,
                uuid,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TemplateRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        archive()
        created()
        group()
        hasFields()
        latestText()
        modified()
        resourceUri()
        signeeCount()
        title()
        user()
        uuid()
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
        (if (archive.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (group.asKnown().isPresent) 1 else 0) +
            (if (hasFields.asKnown().isPresent) 1 else 0) +
            (if (latestText.asKnown().isPresent) 1 else 0) +
            (if (modified.asKnown().isPresent) 1 else 0) +
            (if (resourceUri.asKnown().isPresent) 1 else 0) +
            (if (signeeCount.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (user.asKnown().isPresent) 1 else 0) +
            (if (uuid.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TemplateRetrieveResponse &&
            archive == other.archive &&
            created == other.created &&
            group == other.group &&
            hasFields == other.hasFields &&
            latestText == other.latestText &&
            modified == other.modified &&
            resourceUri == other.resourceUri &&
            signeeCount == other.signeeCount &&
            title == other.title &&
            user == other.user &&
            uuid == other.uuid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            archive,
            created,
            group,
            hasFields,
            latestText,
            modified,
            resourceUri,
            signeeCount,
            title,
            user,
            uuid,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TemplateRetrieveResponse{archive=$archive, created=$created, group=$group, hasFields=$hasFields, latestText=$latestText, modified=$modified, resourceUri=$resourceUri, signeeCount=$signeeCount, title=$title, user=$user, uuid=$uuid, additionalProperties=$additionalProperties}"
}
