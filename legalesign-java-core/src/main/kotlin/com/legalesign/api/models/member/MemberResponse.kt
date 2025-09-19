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
import com.legalesign.api.errors.LegalesignInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MemberResponse
private constructor(
    private val created: JsonField<OffsetDateTime>,
    private val group: JsonField<String>,
    private val modified: JsonField<OffsetDateTime>,
    private val permission: JsonField<PermissionsEnum>,
    private val resourceUri: JsonField<String>,
    private val user: JsonField<String>,
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
        @JsonProperty("permission")
        @ExcludeMissing
        permission: JsonField<PermissionsEnum> = JsonMissing.of(),
        @JsonProperty("resource_uri")
        @ExcludeMissing
        resourceUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
    ) : this(created, group, modified, permission, resourceUri, user, mutableMapOf())

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
    fun permission(): Optional<PermissionsEnum> = permission.getOptional("permission")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceUri(): Optional<String> = resourceUri.getOptional("resource_uri")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): Optional<String> = user.getOptional("user")

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
     * Returns the raw JSON value of [permission].
     *
     * Unlike [permission], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("permission")
    @ExcludeMissing
    fun _permission(): JsonField<PermissionsEnum> = permission

    /**
     * Returns the raw JSON value of [resourceUri].
     *
     * Unlike [resourceUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_uri")
    @ExcludeMissing
    fun _resourceUri(): JsonField<String> = resourceUri

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

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

        /** Returns a mutable builder for constructing an instance of [MemberResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MemberResponse]. */
    class Builder internal constructor() {

        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var group: JsonField<String> = JsonMissing.of()
        private var modified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var permission: JsonField<PermissionsEnum> = JsonMissing.of()
        private var resourceUri: JsonField<String> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(memberResponse: MemberResponse) = apply {
            created = memberResponse.created
            group = memberResponse.group
            modified = memberResponse.modified
            permission = memberResponse.permission
            resourceUri = memberResponse.resourceUri
            user = memberResponse.user
            additionalProperties = memberResponse.additionalProperties.toMutableMap()
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
         * You should usually call [Builder.permission] with a well-typed [PermissionsEnum] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun permission(permission: JsonField<PermissionsEnum>) = apply {
            this.permission = permission
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

        fun user(user: String) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

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
         * Returns an immutable instance of [MemberResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MemberResponse =
            MemberResponse(
                created,
                group,
                modified,
                permission,
                resourceUri,
                user,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MemberResponse = apply {
        if (validated) {
            return@apply
        }

        created()
        group()
        modified()
        permission().ifPresent { it.validate() }
        resourceUri()
        user()
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
            (permission.asKnown().getOrNull()?.validity() ?: 0) +
            (if (resourceUri.asKnown().isPresent) 1 else 0) +
            (if (user.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemberResponse &&
            created == other.created &&
            group == other.group &&
            modified == other.modified &&
            permission == other.permission &&
            resourceUri == other.resourceUri &&
            user == other.user &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(created, group, modified, permission, resourceUri, user, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MemberResponse{created=$created, group=$group, modified=$modified, permission=$permission, resourceUri=$resourceUri, user=$user, additionalProperties=$additionalProperties}"
}
