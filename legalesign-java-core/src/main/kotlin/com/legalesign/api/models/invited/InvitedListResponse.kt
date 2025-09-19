// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.invited

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
import com.legalesign.api.models.attachment.ListMeta
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InvitedListResponse
private constructor(
    private val meta: JsonField<ListMeta>,
    private val objects: JsonField<List<Object>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<ListMeta> = JsonMissing.of(),
        @JsonProperty("objects") @ExcludeMissing objects: JsonField<List<Object>> = JsonMissing.of(),
    ) : this(meta, objects, mutableMapOf())

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<ListMeta> = meta.getOptional("meta")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objects(): Optional<List<Object>> = objects.getOptional("objects")

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
    @JsonProperty("objects") @ExcludeMissing fun _objects(): JsonField<List<Object>> = objects

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

        /** Returns a mutable builder for constructing an instance of [InvitedListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvitedListResponse]. */
    class Builder internal constructor() {

        private var meta: JsonField<ListMeta> = JsonMissing.of()
        private var objects: JsonField<MutableList<Object>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invitedListResponse: InvitedListResponse) = apply {
            meta = invitedListResponse.meta
            objects = invitedListResponse.objects.map { it.toMutableList() }
            additionalProperties = invitedListResponse.additionalProperties.toMutableMap()
        }

        fun meta(meta: ListMeta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [ListMeta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<ListMeta>) = apply { this.meta = meta }

        fun objects(objects: List<Object>) = objects(JsonField.of(objects))

        /**
         * Sets [Builder.objects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objects] with a well-typed `List<Object>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objects(objects: JsonField<List<Object>>) = apply {
            this.objects = objects.map { it.toMutableList() }
        }

        /**
         * Adds a single [Object] to [objects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObject(object_: Object) = apply {
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
         * Returns an immutable instance of [InvitedListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InvitedListResponse =
            InvitedListResponse(
                meta,
                (objects ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InvitedListResponse = apply {
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
        (meta.asKnown().getOrNull()?.validity() ?: 0) +
            (objects.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Object
    private constructor(
        private val created: JsonField<OffsetDateTime>,
        private val email: JsonField<String>,
        private val group: JsonField<String>,
        private val resourceUri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("group") @ExcludeMissing group: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resource_uri")
            @ExcludeMissing
            resourceUri: JsonField<String> = JsonMissing.of(),
        ) : this(created, email, group, resourceUri, mutableMapOf())

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun created(): Optional<OffsetDateTime> = created.getOptional("created")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun group(): Optional<String> = group.getOptional("group")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun resourceUri(): Optional<String> = resourceUri.getOptional("resource_uri")

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [group].
         *
         * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<String> = group

        /**
         * Returns the raw JSON value of [resourceUri].
         *
         * Unlike [resourceUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resource_uri")
        @ExcludeMissing
        fun _resourceUri(): JsonField<String> = resourceUri

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

            /** Returns a mutable builder for constructing an instance of [Object]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Object]. */
        class Builder internal constructor() {

            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var group: JsonField<String> = JsonMissing.of()
            private var resourceUri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(object_: Object) = apply {
                created = object_.created
                email = object_.email
                group = object_.group
                resourceUri = object_.resourceUri
                additionalProperties = object_.additionalProperties.toMutableMap()
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

            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun group(group: String) = group(JsonField.of(group))

            /**
             * Sets [Builder.group] to an arbitrary JSON value.
             *
             * You should usually call [Builder.group] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun group(group: JsonField<String>) = apply { this.group = group }

            fun resourceUri(resourceUri: String) = resourceUri(JsonField.of(resourceUri))

            /**
             * Sets [Builder.resourceUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resourceUri] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resourceUri(resourceUri: JsonField<String>) = apply {
                this.resourceUri = resourceUri
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
             * Returns an immutable instance of [Object].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Object =
                Object(created, email, group, resourceUri, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Object = apply {
            if (validated) {
                return@apply
            }

            created()
            email()
            group()
            resourceUri()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (created.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (group.asKnown().isPresent) 1 else 0) +
                (if (resourceUri.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Object &&
                created == other.created &&
                email == other.email &&
                group == other.group &&
                resourceUri == other.resourceUri &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(created, email, group, resourceUri, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Object{created=$created, email=$email, group=$group, resourceUri=$resourceUri, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvitedListResponse &&
            meta == other.meta &&
            objects == other.objects &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(meta, objects, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvitedListResponse{meta=$meta, objects=$objects, additionalProperties=$additionalProperties}"
}
