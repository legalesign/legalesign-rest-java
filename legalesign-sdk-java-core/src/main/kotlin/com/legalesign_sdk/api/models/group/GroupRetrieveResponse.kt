// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.group

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class GroupRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val created: JsonField<OffsetDateTime>,
    private val defaultEmail: JsonField<String>,
    private val defaultExtraemail: JsonField<String>,
    private val footer: JsonField<String>,
    private val footerHeight: JsonField<Long>,
    private val header: JsonField<String>,
    private val isActive: JsonField<Boolean>,
    private val members: JsonField<List<String>>,
    private val modified: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val pagesize: JsonField<Int>,
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
        @JsonProperty("default_email")
        @ExcludeMissing
        defaultEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default_extraemail")
        @ExcludeMissing
        defaultExtraemail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("footer") @ExcludeMissing footer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("footer_height")
        @ExcludeMissing
        footerHeight: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("header") @ExcludeMissing header: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_active") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("members")
        @ExcludeMissing
        members: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("modified")
        @ExcludeMissing
        modified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pagesize") @ExcludeMissing pagesize: JsonField<Int> = JsonMissing.of(),
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
        defaultEmail,
        defaultExtraemail,
        footer,
        footerHeight,
        header,
        isActive,
        members,
        modified,
        name,
        pagesize,
        publicName,
        resourceUri,
        slug,
        user,
        xframeAllow,
        xframeAllowPdfEdit,
        mutableMapOf(),
    )

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun created(): Optional<OffsetDateTime> = created.getOptional("created")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun defaultEmail(): Optional<String> = defaultEmail.getOptional("default_email")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun defaultExtraemail(): Optional<String> = defaultExtraemail.getOptional("default_extraemail")

    /**
     * html of content
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun footer(): Optional<String> = footer.getOptional("footer")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun footerHeight(): Optional<Long> = footerHeight.getOptional("footer_height")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun header(): Optional<String> = header.getOptional("header")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

    /**
     * list of members uris
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun members(): Optional<List<String>> = members.getOptional("members")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun modified(): Optional<OffsetDateTime> = modified.getOptional("modified")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pagesize(): Optional<Int> = pagesize.getOptional("pagesize")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun publicName(): Optional<String> = publicName.getOptional("public_name")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun resourceUri(): Optional<String> = resourceUri.getOptional("resource_uri")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun slug(): Optional<String> = slug.getOptional("slug")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun user(): Optional<String> = user.getOptional("user")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun xframeAllow(): Optional<Boolean> = xframeAllow.getOptional("xframe_allow")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
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
     * Returns the raw JSON value of [defaultEmail].
     *
     * Unlike [defaultEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("default_email")
    @ExcludeMissing
    fun _defaultEmail(): JsonField<String> = defaultEmail

    /**
     * Returns the raw JSON value of [defaultExtraemail].
     *
     * Unlike [defaultExtraemail], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_extraemail")
    @ExcludeMissing
    fun _defaultExtraemail(): JsonField<String> = defaultExtraemail

    /**
     * Returns the raw JSON value of [footer].
     *
     * Unlike [footer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonField<String> = footer

    /**
     * Returns the raw JSON value of [footerHeight].
     *
     * Unlike [footerHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("footer_height")
    @ExcludeMissing
    fun _footerHeight(): JsonField<Long> = footerHeight

    /**
     * Returns the raw JSON value of [header].
     *
     * Unlike [header], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("header") @ExcludeMissing fun _header(): JsonField<String> = header

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [members].
     *
     * Unlike [members], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("members") @ExcludeMissing fun _members(): JsonField<List<String>> = members

    /**
     * Returns the raw JSON value of [modified].
     *
     * Unlike [modified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modified") @ExcludeMissing fun _modified(): JsonField<OffsetDateTime> = modified

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [pagesize].
     *
     * Unlike [pagesize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pagesize") @ExcludeMissing fun _pagesize(): JsonField<Int> = pagesize

    /**
     * Returns the raw JSON value of [publicName].
     *
     * Unlike [publicName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("public_name") @ExcludeMissing fun _publicName(): JsonField<String> = publicName

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
     * Unlike [xframeAllowPdfEdit], this method doesn't throw if the JSON field has an unexpected
     * type.
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

        /** Returns a mutable builder for constructing an instance of [GroupRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GroupRetrieveResponse]. */
    class Builder internal constructor() {

        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var defaultEmail: JsonField<String> = JsonMissing.of()
        private var defaultExtraemail: JsonField<String> = JsonMissing.of()
        private var footer: JsonField<String> = JsonMissing.of()
        private var footerHeight: JsonField<Long> = JsonMissing.of()
        private var header: JsonField<String> = JsonMissing.of()
        private var isActive: JsonField<Boolean> = JsonMissing.of()
        private var members: JsonField<MutableList<String>>? = null
        private var modified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var pagesize: JsonField<Int> = JsonMissing.of()
        private var publicName: JsonField<String> = JsonMissing.of()
        private var resourceUri: JsonField<String> = JsonMissing.of()
        private var slug: JsonField<String> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var xframeAllow: JsonField<Boolean> = JsonMissing.of()
        private var xframeAllowPdfEdit: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(groupRetrieveResponse: GroupRetrieveResponse) = apply {
            created = groupRetrieveResponse.created
            defaultEmail = groupRetrieveResponse.defaultEmail
            defaultExtraemail = groupRetrieveResponse.defaultExtraemail
            footer = groupRetrieveResponse.footer
            footerHeight = groupRetrieveResponse.footerHeight
            header = groupRetrieveResponse.header
            isActive = groupRetrieveResponse.isActive
            members = groupRetrieveResponse.members.map { it.toMutableList() }
            modified = groupRetrieveResponse.modified
            name = groupRetrieveResponse.name
            pagesize = groupRetrieveResponse.pagesize
            publicName = groupRetrieveResponse.publicName
            resourceUri = groupRetrieveResponse.resourceUri
            slug = groupRetrieveResponse.slug
            user = groupRetrieveResponse.user
            xframeAllow = groupRetrieveResponse.xframeAllow
            xframeAllowPdfEdit = groupRetrieveResponse.xframeAllowPdfEdit
            additionalProperties = groupRetrieveResponse.additionalProperties.toMutableMap()
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

        fun defaultEmail(defaultEmail: String) = defaultEmail(JsonField.of(defaultEmail))

        /**
         * Sets [Builder.defaultEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultEmail(defaultEmail: JsonField<String>) = apply {
            this.defaultEmail = defaultEmail
        }

        fun defaultExtraemail(defaultExtraemail: String) =
            defaultExtraemail(JsonField.of(defaultExtraemail))

        /**
         * Sets [Builder.defaultExtraemail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultExtraemail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultExtraemail(defaultExtraemail: JsonField<String>) = apply {
            this.defaultExtraemail = defaultExtraemail
        }

        /** html of content */
        fun footer(footer: String) = footer(JsonField.of(footer))

        /**
         * Sets [Builder.footer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.footer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun footer(footer: JsonField<String>) = apply { this.footer = footer }

        fun footerHeight(footerHeight: Long) = footerHeight(JsonField.of(footerHeight))

        /**
         * Sets [Builder.footerHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.footerHeight] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun footerHeight(footerHeight: JsonField<Long>) = apply { this.footerHeight = footerHeight }

        fun header(header: String) = header(JsonField.of(header))

        /**
         * Sets [Builder.header] to an arbitrary JSON value.
         *
         * You should usually call [Builder.header] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun header(header: JsonField<String>) = apply { this.header = header }

        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /** list of members uris */
        fun members(members: List<String>) = members(JsonField.of(members))

        /**
         * Sets [Builder.members] to an arbitrary JSON value.
         *
         * You should usually call [Builder.members] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun members(members: JsonField<List<String>>) = apply {
            this.members = members.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [members].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMember(member: String) = apply {
            members =
                (members ?: JsonField.of(mutableListOf())).also {
                    checkKnown("members", it).add(member)
                }
        }

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
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun pagesize(pagesize: Int) = pagesize(JsonField.of(pagesize))

        /**
         * Sets [Builder.pagesize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pagesize] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pagesize(pagesize: JsonField<Int>) = apply { this.pagesize = pagesize }

        fun publicName(publicName: String) = publicName(JsonField.of(publicName))

        /**
         * Sets [Builder.publicName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun publicName(publicName: JsonField<String>) = apply { this.publicName = publicName }

        fun resourceUri(resourceUri: String) = resourceUri(JsonField.of(resourceUri))

        /**
         * Sets [Builder.resourceUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceUri(resourceUri: JsonField<String>) = apply { this.resourceUri = resourceUri }

        fun slug(slug: String) = slug(JsonField.of(slug))

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        fun user(user: String) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

        fun xframeAllow(xframeAllow: Boolean) = xframeAllow(JsonField.of(xframeAllow))

        /**
         * Sets [Builder.xframeAllow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xframeAllow] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun xframeAllow(xframeAllow: JsonField<Boolean>) = apply { this.xframeAllow = xframeAllow }

        fun xframeAllowPdfEdit(xframeAllowPdfEdit: Boolean) =
            xframeAllowPdfEdit(JsonField.of(xframeAllowPdfEdit))

        /**
         * Sets [Builder.xframeAllowPdfEdit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.xframeAllowPdfEdit] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Returns an immutable instance of [GroupRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GroupRetrieveResponse =
            GroupRetrieveResponse(
                created,
                defaultEmail,
                defaultExtraemail,
                footer,
                footerHeight,
                header,
                isActive,
                (members ?: JsonMissing.of()).map { it.toImmutable() },
                modified,
                name,
                pagesize,
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

    fun validate(): GroupRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        created()
        defaultEmail()
        defaultExtraemail()
        footer()
        footerHeight()
        header()
        isActive()
        members()
        modified()
        name()
        pagesize()
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
        (if (created.asKnown().isPresent) 1 else 0) +
            (if (defaultEmail.asKnown().isPresent) 1 else 0) +
            (if (defaultExtraemail.asKnown().isPresent) 1 else 0) +
            (if (footer.asKnown().isPresent) 1 else 0) +
            (if (footerHeight.asKnown().isPresent) 1 else 0) +
            (if (header.asKnown().isPresent) 1 else 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (members.asKnown().getOrNull()?.size ?: 0) +
            (if (modified.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (pagesize.asKnown().isPresent) 1 else 0) +
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

        return other is GroupRetrieveResponse &&
            created == other.created &&
            defaultEmail == other.defaultEmail &&
            defaultExtraemail == other.defaultExtraemail &&
            footer == other.footer &&
            footerHeight == other.footerHeight &&
            header == other.header &&
            isActive == other.isActive &&
            members == other.members &&
            modified == other.modified &&
            name == other.name &&
            pagesize == other.pagesize &&
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
            defaultEmail,
            defaultExtraemail,
            footer,
            footerHeight,
            header,
            isActive,
            members,
            modified,
            name,
            pagesize,
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
        "GroupRetrieveResponse{created=$created, defaultEmail=$defaultEmail, defaultExtraemail=$defaultExtraemail, footer=$footer, footerHeight=$footerHeight, header=$header, isActive=$isActive, members=$members, modified=$modified, name=$name, pagesize=$pagesize, publicName=$publicName, resourceUri=$resourceUri, slug=$slug, user=$user, xframeAllow=$xframeAllow, xframeAllowPdfEdit=$xframeAllowPdfEdit, additionalProperties=$additionalProperties}"
}
