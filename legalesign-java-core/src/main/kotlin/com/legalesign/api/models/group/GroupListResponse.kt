// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.group

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

class GroupListResponse
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

        /** Returns a mutable builder for constructing an instance of [GroupListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GroupListResponse]. */
    class Builder internal constructor() {

        private var meta: JsonField<ListMeta> = JsonMissing.of()
        private var objects: JsonField<MutableList<Object>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(groupListResponse: GroupListResponse) = apply {
            meta = groupListResponse.meta
            objects = groupListResponse.objects.map { it.toMutableList() }
            additionalProperties = groupListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [GroupListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GroupListResponse =
            GroupListResponse(
                meta,
                (objects ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GroupListResponse = apply {
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
        private val isActive: JsonField<Boolean>,
        private val modified: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val publicName: JsonField<String>,
        private val resourceUri: JsonField<String>,
        private val slug: JsonField<String>,
        private val user: JsonField<String>,
        private val xframeAllow: JsonField<Boolean>,
        private val xframeAllowPdfEdit: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("is_active")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("modified")
            @ExcludeMissing
            modified: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("public_name")
            @ExcludeMissing
            publicName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resource_uri")
            @ExcludeMissing
            resourceUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
            @JsonProperty("xframe_allow")
            @ExcludeMissing
            xframeAllow: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("xframe_allow_pdf_edit")
            @ExcludeMissing
            xframeAllowPdfEdit: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            created,
            isActive,
            modified,
            name,
            publicName,
            resourceUri,
            slug,
            user,
            xframeAllow,
            xframeAllowPdfEdit,
            mutableMapOf(),
        )

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun created(): Optional<OffsetDateTime> = created.getOptional("created")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun modified(): Optional<OffsetDateTime> = modified.getOptional("modified")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun publicName(): Optional<String> = publicName.getOptional("public_name")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun resourceUri(): Optional<String> = resourceUri.getOptional("resource_uri")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun slug(): Optional<String> = slug.getOptional("slug")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun user(): Optional<String> = user.getOptional("user")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun xframeAllow(): Optional<Boolean> = xframeAllow.getOptional("xframe_allow")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun xframeAllowPdfEdit(): Optional<Boolean> =
            xframeAllowPdfEdit.getOptional("xframe_allow_pdf_edit")

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * Returns the raw JSON value of [isActive].
         *
         * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

        /**
         * Returns the raw JSON value of [modified].
         *
         * Unlike [modified], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modified")
        @ExcludeMissing
        fun _modified(): JsonField<OffsetDateTime> = modified

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [publicName].
         *
         * Unlike [publicName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("public_name")
        @ExcludeMissing
        fun _publicName(): JsonField<String> = publicName

        /**
         * Returns the raw JSON value of [resourceUri].
         *
         * Unlike [resourceUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resource_uri")
        @ExcludeMissing
        fun _resourceUri(): JsonField<String> = resourceUri

        /**
         * Returns the raw JSON value of [slug].
         *
         * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

        /**
         * Returns the raw JSON value of [user].
         *
         * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

        /**
         * Returns the raw JSON value of [xframeAllow].
         *
         * Unlike [xframeAllow], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("xframe_allow")
        @ExcludeMissing
        fun _xframeAllow(): JsonField<Boolean> = xframeAllow

        /**
         * Returns the raw JSON value of [xframeAllowPdfEdit].
         *
         * Unlike [xframeAllowPdfEdit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("xframe_allow_pdf_edit")
        @ExcludeMissing
        fun _xframeAllowPdfEdit(): JsonField<Boolean> = xframeAllowPdfEdit

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
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var modified: JsonField<OffsetDateTime> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var publicName: JsonField<String> = JsonMissing.of()
            private var resourceUri: JsonField<String> = JsonMissing.of()
            private var slug: JsonField<String> = JsonMissing.of()
            private var user: JsonField<String> = JsonMissing.of()
            private var xframeAllow: JsonField<Boolean> = JsonMissing.of()
            private var xframeAllowPdfEdit: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(object_: Object) = apply {
                created = object_.created
                isActive = object_.isActive
                modified = object_.modified
                name = object_.name
                publicName = object_.publicName
                resourceUri = object_.resourceUri
                slug = object_.slug
                user = object_.user
                xframeAllow = object_.xframeAllow
                xframeAllowPdfEdit = object_.xframeAllowPdfEdit
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

            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            fun modified(modified: OffsetDateTime) = modified(JsonField.of(modified))

            /**
             * Sets [Builder.modified] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modified] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modified(modified: JsonField<OffsetDateTime>) = apply { this.modified = modified }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun publicName(publicName: String) = publicName(JsonField.of(publicName))

            /**
             * Sets [Builder.publicName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.publicName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun publicName(publicName: JsonField<String>) = apply { this.publicName = publicName }

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

            fun slug(slug: String) = slug(JsonField.of(slug))

            /**
             * Sets [Builder.slug] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slug] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

            fun user(user: String) = user(JsonField.of(user))

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun user(user: JsonField<String>) = apply { this.user = user }

            fun xframeAllow(xframeAllow: Boolean) = xframeAllow(JsonField.of(xframeAllow))

            /**
             * Sets [Builder.xframeAllow] to an arbitrary JSON value.
             *
             * You should usually call [Builder.xframeAllow] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun xframeAllow(xframeAllow: JsonField<Boolean>) = apply {
                this.xframeAllow = xframeAllow
            }

            fun xframeAllowPdfEdit(xframeAllowPdfEdit: Boolean) =
                xframeAllowPdfEdit(JsonField.of(xframeAllowPdfEdit))

            /**
             * Sets [Builder.xframeAllowPdfEdit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.xframeAllowPdfEdit] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun xframeAllowPdfEdit(xframeAllowPdfEdit: JsonField<Boolean>) = apply {
                this.xframeAllowPdfEdit = xframeAllowPdfEdit
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
                Object(
                    created,
                    isActive,
                    modified,
                    name,
                    publicName,
                    resourceUri,
                    slug,
                    user,
                    xframeAllow,
                    xframeAllowPdfEdit,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Object = apply {
            if (validated) {
                return@apply
            }

            created()
            isActive()
            modified()
            name()
            publicName()
            resourceUri()
            slug()
            user()
            xframeAllow()
            xframeAllowPdfEdit()
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
                (if (isActive.asKnown().isPresent) 1 else 0) +
                (if (modified.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (publicName.asKnown().isPresent) 1 else 0) +
                (if (resourceUri.asKnown().isPresent) 1 else 0) +
                (if (slug.asKnown().isPresent) 1 else 0) +
                (if (user.asKnown().isPresent) 1 else 0) +
                (if (xframeAllow.asKnown().isPresent) 1 else 0) +
                (if (xframeAllowPdfEdit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Object &&
                created == other.created &&
                isActive == other.isActive &&
                modified == other.modified &&
                name == other.name &&
                publicName == other.publicName &&
                resourceUri == other.resourceUri &&
                slug == other.slug &&
                user == other.user &&
                xframeAllow == other.xframeAllow &&
                xframeAllowPdfEdit == other.xframeAllowPdfEdit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                created,
                isActive,
                modified,
                name,
                publicName,
                resourceUri,
                slug,
                user,
                xframeAllow,
                xframeAllowPdfEdit,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Object{created=$created, isActive=$isActive, modified=$modified, name=$name, publicName=$publicName, resourceUri=$resourceUri, slug=$slug, user=$user, xframeAllow=$xframeAllow, xframeAllowPdfEdit=$xframeAllowPdfEdit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GroupListResponse &&
            meta == other.meta &&
            objects == other.objects &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(meta, objects, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GroupListResponse{meta=$meta, objects=$objects, additionalProperties=$additionalProperties}"
}
