// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.document

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.legalesign_sdk.api.core.Enum
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

class DocumentListResponse
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
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun meta(): Optional<ListMeta> = meta.getOptional("meta")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
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

        /** Returns a mutable builder for constructing an instance of [DocumentListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentListResponse]. */
    class Builder internal constructor() {

        private var meta: JsonField<ListMeta> = JsonMissing.of()
        private var objects: JsonField<MutableList<Object>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentListResponse: DocumentListResponse) = apply {
            meta = documentListResponse.meta
            objects = documentListResponse.objects.map { it.toMutableList() }
            additionalProperties = documentListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [DocumentListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocumentListResponse =
            DocumentListResponse(
                meta,
                (objects ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DocumentListResponse = apply {
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

    class Object
    private constructor(
        private val archived: JsonField<Boolean>,
        private val autoArchive: JsonField<Boolean>,
        private val ccEmails: JsonField<String>,
        private val created: JsonField<OffsetDateTime>,
        private val doEmail: JsonField<Boolean>,
        private val downloadFinal: JsonField<Boolean>,
        private val group: JsonField<String>,
        private val modified: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val pdftext: JsonField<String>,
        private val redirect: JsonField<String>,
        private val resourceUri: JsonField<String>,
        private val returnSignerLinks: JsonField<Boolean>,
        private val signers: JsonField<List<List<String>>>,
        private val signersInOrder: JsonField<SignersInOrder>,
        private val status: JsonField<DocumentStatusEnum>,
        private val tag: JsonField<String>,
        private val tag1: JsonField<String>,
        private val tag2: JsonField<String>,
        private val template: JsonField<String>,
        private val templatepdf: JsonField<String>,
        private val text: JsonField<String>,
        private val user: JsonField<String>,
        private val uuid: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("archived")
            @ExcludeMissing
            archived: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("auto_archive")
            @ExcludeMissing
            autoArchive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("cc_emails")
            @ExcludeMissing
            ccEmails: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("do_email")
            @ExcludeMissing
            doEmail: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("download_final")
            @ExcludeMissing
            downloadFinal: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("group") @ExcludeMissing group: JsonField<String> = JsonMissing.of(),
            @JsonProperty("modified")
            @ExcludeMissing
            modified: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pdftext") @ExcludeMissing pdftext: JsonField<String> = JsonMissing.of(),
            @JsonProperty("redirect")
            @ExcludeMissing
            redirect: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resource_uri")
            @ExcludeMissing
            resourceUri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("return_signer_links")
            @ExcludeMissing
            returnSignerLinks: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("signers")
            @ExcludeMissing
            signers: JsonField<List<List<String>>> = JsonMissing.of(),
            @JsonProperty("signers_in_order")
            @ExcludeMissing
            signersInOrder: JsonField<SignersInOrder> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<DocumentStatusEnum> = JsonMissing.of(),
            @JsonProperty("tag") @ExcludeMissing tag: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag1") @ExcludeMissing tag1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag2") @ExcludeMissing tag2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("template")
            @ExcludeMissing
            template: JsonField<String> = JsonMissing.of(),
            @JsonProperty("templatepdf")
            @ExcludeMissing
            templatepdf: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
            @JsonProperty("uuid") @ExcludeMissing uuid: JsonField<String> = JsonMissing.of(),
        ) : this(
            archived,
            autoArchive,
            ccEmails,
            created,
            doEmail,
            downloadFinal,
            group,
            modified,
            name,
            pdftext,
            redirect,
            resourceUri,
            returnSignerLinks,
            signers,
            signersInOrder,
            status,
            tag,
            tag1,
            tag2,
            template,
            templatepdf,
            text,
            user,
            uuid,
            mutableMapOf(),
        )

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun archived(): Optional<Boolean> = archived.getOptional("archived")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun autoArchive(): Optional<Boolean> = autoArchive.getOptional("auto_archive")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ccEmails(): Optional<String> = ccEmails.getOptional("cc_emails")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun created(): Optional<OffsetDateTime> = created.getOptional("created")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun doEmail(): Optional<Boolean> = doEmail.getOptional("do_email")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun downloadFinal(): Optional<Boolean> = downloadFinal.getOptional("download_final")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun group(): Optional<String> = group.getOptional("group")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun modified(): Optional<OffsetDateTime> = modified.getOptional("modified")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pdftext(): Optional<String> = pdftext.getOptional("pdftext")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun redirect(): Optional<String> = redirect.getOptional("redirect")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun resourceUri(): Optional<String> = resourceUri.getOptional("resource_uri")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun returnSignerLinks(): Optional<Boolean> =
            returnSignerLinks.getOptional("return_signer_links")

        /**
         * nested arrays with signer details
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun signers(): Optional<List<List<String>>> = signers.getOptional("signers")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun signersInOrder(): Optional<SignersInOrder> =
            signersInOrder.getOptional("signers_in_order")

        /**
         * Document status options:
         * * 10 - Initial state, check signer status for sent/unsent
         * * 20 - Fields completed
         * * 30 - Signed
         * * 40 - Removed (before signing)
         * * 50 - Rejected
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): Optional<DocumentStatusEnum> = status.getOptional("status")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tag(): Optional<String> = tag.getOptional("tag")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tag1(): Optional<String> = tag1.getOptional("tag1")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tag2(): Optional<String> = tag2.getOptional("tag2")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun template(): Optional<String> = template.getOptional("template")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun templatepdf(): Optional<String> = templatepdf.getOptional("templatepdf")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun user(): Optional<String> = user.getOptional("user")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun uuid(): Optional<String> = uuid.getOptional("uuid")

        /**
         * Returns the raw JSON value of [archived].
         *
         * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

        /**
         * Returns the raw JSON value of [autoArchive].
         *
         * Unlike [autoArchive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auto_archive")
        @ExcludeMissing
        fun _autoArchive(): JsonField<Boolean> = autoArchive

        /**
         * Returns the raw JSON value of [ccEmails].
         *
         * Unlike [ccEmails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cc_emails") @ExcludeMissing fun _ccEmails(): JsonField<String> = ccEmails

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * Returns the raw JSON value of [doEmail].
         *
         * Unlike [doEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("do_email") @ExcludeMissing fun _doEmail(): JsonField<Boolean> = doEmail

        /**
         * Returns the raw JSON value of [downloadFinal].
         *
         * Unlike [downloadFinal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("download_final")
        @ExcludeMissing
        fun _downloadFinal(): JsonField<Boolean> = downloadFinal

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
         * Returns the raw JSON value of [pdftext].
         *
         * Unlike [pdftext], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pdftext") @ExcludeMissing fun _pdftext(): JsonField<String> = pdftext

        /**
         * Returns the raw JSON value of [redirect].
         *
         * Unlike [redirect], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("redirect") @ExcludeMissing fun _redirect(): JsonField<String> = redirect

        /**
         * Returns the raw JSON value of [resourceUri].
         *
         * Unlike [resourceUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resource_uri")
        @ExcludeMissing
        fun _resourceUri(): JsonField<String> = resourceUri

        /**
         * Returns the raw JSON value of [returnSignerLinks].
         *
         * Unlike [returnSignerLinks], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("return_signer_links")
        @ExcludeMissing
        fun _returnSignerLinks(): JsonField<Boolean> = returnSignerLinks

        /**
         * Returns the raw JSON value of [signers].
         *
         * Unlike [signers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signers")
        @ExcludeMissing
        fun _signers(): JsonField<List<List<String>>> = signers

        /**
         * Returns the raw JSON value of [signersInOrder].
         *
         * Unlike [signersInOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("signers_in_order")
        @ExcludeMissing
        fun _signersInOrder(): JsonField<SignersInOrder> = signersInOrder

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<DocumentStatusEnum> = status

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

        /**
         * Returns the raw JSON value of [template].
         *
         * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<String> = template

        /**
         * Returns the raw JSON value of [templatepdf].
         *
         * Unlike [templatepdf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("templatepdf")
        @ExcludeMissing
        fun _templatepdf(): JsonField<String> = templatepdf

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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

            /** Returns a mutable builder for constructing an instance of [Object]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Object]. */
        class Builder internal constructor() {

            private var archived: JsonField<Boolean> = JsonMissing.of()
            private var autoArchive: JsonField<Boolean> = JsonMissing.of()
            private var ccEmails: JsonField<String> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var doEmail: JsonField<Boolean> = JsonMissing.of()
            private var downloadFinal: JsonField<Boolean> = JsonMissing.of()
            private var group: JsonField<String> = JsonMissing.of()
            private var modified: JsonField<OffsetDateTime> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var pdftext: JsonField<String> = JsonMissing.of()
            private var redirect: JsonField<String> = JsonMissing.of()
            private var resourceUri: JsonField<String> = JsonMissing.of()
            private var returnSignerLinks: JsonField<Boolean> = JsonMissing.of()
            private var signers: JsonField<MutableList<List<String>>>? = null
            private var signersInOrder: JsonField<SignersInOrder> = JsonMissing.of()
            private var status: JsonField<DocumentStatusEnum> = JsonMissing.of()
            private var tag: JsonField<String> = JsonMissing.of()
            private var tag1: JsonField<String> = JsonMissing.of()
            private var tag2: JsonField<String> = JsonMissing.of()
            private var template: JsonField<String> = JsonMissing.of()
            private var templatepdf: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var user: JsonField<String> = JsonMissing.of()
            private var uuid: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(object_: Object) = apply {
                archived = object_.archived
                autoArchive = object_.autoArchive
                ccEmails = object_.ccEmails
                created = object_.created
                doEmail = object_.doEmail
                downloadFinal = object_.downloadFinal
                group = object_.group
                modified = object_.modified
                name = object_.name
                pdftext = object_.pdftext
                redirect = object_.redirect
                resourceUri = object_.resourceUri
                returnSignerLinks = object_.returnSignerLinks
                signers = object_.signers.map { it.toMutableList() }
                signersInOrder = object_.signersInOrder
                status = object_.status
                tag = object_.tag
                tag1 = object_.tag1
                tag2 = object_.tag2
                template = object_.template
                templatepdf = object_.templatepdf
                text = object_.text
                user = object_.user
                uuid = object_.uuid
                additionalProperties = object_.additionalProperties.toMutableMap()
            }

            fun archived(archived: Boolean) = archived(JsonField.of(archived))

            /**
             * Sets [Builder.archived] to an arbitrary JSON value.
             *
             * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

            fun autoArchive(autoArchive: Boolean) = autoArchive(JsonField.of(autoArchive))

            /**
             * Sets [Builder.autoArchive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoArchive] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoArchive(autoArchive: JsonField<Boolean>) = apply {
                this.autoArchive = autoArchive
            }

            fun ccEmails(ccEmails: String) = ccEmails(JsonField.of(ccEmails))

            /**
             * Sets [Builder.ccEmails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ccEmails] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ccEmails(ccEmails: JsonField<String>) = apply { this.ccEmails = ccEmails }

            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            fun doEmail(doEmail: Boolean) = doEmail(JsonField.of(doEmail))

            /**
             * Sets [Builder.doEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.doEmail] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun doEmail(doEmail: JsonField<Boolean>) = apply { this.doEmail = doEmail }

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

            fun group(group: String) = group(JsonField.of(group))

            /**
             * Sets [Builder.group] to an arbitrary JSON value.
             *
             * You should usually call [Builder.group] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun pdftext(pdftext: String) = pdftext(JsonField.of(pdftext))

            /**
             * Sets [Builder.pdftext] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pdftext] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pdftext(pdftext: JsonField<String>) = apply { this.pdftext = pdftext }

            fun redirect(redirect: String) = redirect(JsonField.of(redirect))

            /**
             * Sets [Builder.redirect] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redirect] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun redirect(redirect: JsonField<String>) = apply { this.redirect = redirect }

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

            fun returnSignerLinks(returnSignerLinks: Boolean) =
                returnSignerLinks(JsonField.of(returnSignerLinks))

            /**
             * Sets [Builder.returnSignerLinks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnSignerLinks] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnSignerLinks(returnSignerLinks: JsonField<Boolean>) = apply {
                this.returnSignerLinks = returnSignerLinks
            }

            /** nested arrays with signer details */
            fun signers(signers: List<List<String>>) = signers(JsonField.of(signers))

            /**
             * Sets [Builder.signers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signers] with a well-typed `List<List<String>>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun signers(signers: JsonField<List<List<String>>>) = apply {
                this.signers = signers.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<String>] to [signers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSigner(signer: List<String>) = apply {
                signers =
                    (signers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("signers", it).add(signer)
                    }
            }

            fun signersInOrder(signersInOrder: SignersInOrder) =
                signersInOrder(JsonField.of(signersInOrder))

            /**
             * Sets [Builder.signersInOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signersInOrder] with a well-typed [SignersInOrder]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun signersInOrder(signersInOrder: JsonField<SignersInOrder>) = apply {
                this.signersInOrder = signersInOrder
            }

            /**
             * Document status options:
             * * 10 - Initial state, check signer status for sent/unsent
             * * 20 - Fields completed
             * * 30 - Signed
             * * 40 - Removed (before signing)
             * * 50 - Rejected
             */
            fun status(status: DocumentStatusEnum) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [DocumentStatusEnum] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<DocumentStatusEnum>) = apply { this.status = status }

            fun tag(tag: String) = tag(JsonField.of(tag))

            /**
             * Sets [Builder.tag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag(tag: JsonField<String>) = apply { this.tag = tag }

            fun tag1(tag1: String) = tag1(JsonField.of(tag1))

            /**
             * Sets [Builder.tag1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag1] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag1(tag1: JsonField<String>) = apply { this.tag1 = tag1 }

            fun tag2(tag2: String) = tag2(JsonField.of(tag2))

            /**
             * Sets [Builder.tag2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag2] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag2(tag2: JsonField<String>) = apply { this.tag2 = tag2 }

            fun template(template: String?) = template(JsonField.ofNullable(template))

            /** Alias for calling [Builder.template] with `template.orElse(null)`. */
            fun template(template: Optional<String>) = template(template.getOrNull())

            /**
             * Sets [Builder.template] to an arbitrary JSON value.
             *
             * You should usually call [Builder.template] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun template(template: JsonField<String>) = apply { this.template = template }

            fun templatepdf(templatepdf: String?) = templatepdf(JsonField.ofNullable(templatepdf))

            /** Alias for calling [Builder.templatepdf] with `templatepdf.orElse(null)`. */
            fun templatepdf(templatepdf: Optional<String>) = templatepdf(templatepdf.getOrNull())

            /**
             * Sets [Builder.templatepdf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templatepdf] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun templatepdf(templatepdf: JsonField<String>) = apply {
                this.templatepdf = templatepdf
            }

            fun text(text: String?) = text(JsonField.ofNullable(text))

            /** Alias for calling [Builder.text] with `text.orElse(null)`. */
            fun text(text: Optional<String>) = text(text.getOrNull())

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun user(user: String) = user(JsonField.of(user))

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun user(user: JsonField<String>) = apply { this.user = user }

            fun uuid(uuid: String) = uuid(JsonField.of(uuid))

            /**
             * Sets [Builder.uuid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uuid] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Object].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Object =
                Object(
                    archived,
                    autoArchive,
                    ccEmails,
                    created,
                    doEmail,
                    downloadFinal,
                    group,
                    modified,
                    name,
                    pdftext,
                    redirect,
                    resourceUri,
                    returnSignerLinks,
                    (signers ?: JsonMissing.of()).map { it.toImmutable() },
                    signersInOrder,
                    status,
                    tag,
                    tag1,
                    tag2,
                    template,
                    templatepdf,
                    text,
                    user,
                    uuid,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Object = apply {
            if (validated) {
                return@apply
            }

            archived()
            autoArchive()
            ccEmails()
            created()
            doEmail()
            downloadFinal()
            group()
            modified()
            name()
            pdftext()
            redirect()
            resourceUri()
            returnSignerLinks()
            signers()
            signersInOrder().ifPresent { it.validate() }
            status().ifPresent { it.validate() }
            tag()
            tag1()
            tag2()
            template()
            templatepdf()
            text()
            user()
            uuid()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (archived.asKnown().isPresent) 1 else 0) +
                (if (autoArchive.asKnown().isPresent) 1 else 0) +
                (if (ccEmails.asKnown().isPresent) 1 else 0) +
                (if (created.asKnown().isPresent) 1 else 0) +
                (if (doEmail.asKnown().isPresent) 1 else 0) +
                (if (downloadFinal.asKnown().isPresent) 1 else 0) +
                (if (group.asKnown().isPresent) 1 else 0) +
                (if (modified.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (pdftext.asKnown().isPresent) 1 else 0) +
                (if (redirect.asKnown().isPresent) 1 else 0) +
                (if (resourceUri.asKnown().isPresent) 1 else 0) +
                (if (returnSignerLinks.asKnown().isPresent) 1 else 0) +
                (signers.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                (signersInOrder.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (tag.asKnown().isPresent) 1 else 0) +
                (if (tag1.asKnown().isPresent) 1 else 0) +
                (if (tag2.asKnown().isPresent) 1 else 0) +
                (if (template.asKnown().isPresent) 1 else 0) +
                (if (templatepdf.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (user.asKnown().isPresent) 1 else 0) +
                (if (uuid.asKnown().isPresent) 1 else 0)

        class SignersInOrder @JsonCreator private constructor(private val value: JsonField<Int>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Int> = value

            companion object {

                @JvmField val _0 = of(0)

                @JvmField val _1 = of(1)

                @JvmStatic fun of(value: Int) = SignersInOrder(JsonField.of(value))
            }

            /** An enum containing [SignersInOrder]'s known values. */
            enum class Known {
                _0,
                _1,
            }

            /**
             * An enum containing [SignersInOrder]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SignersInOrder] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                _0,
                _1,
                /**
                 * An enum member indicating that [SignersInOrder] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    _0 -> Value._0
                    _1 -> Value._1
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LegalesignSdkInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    _0 -> Known._0
                    _1 -> Known._1
                    else ->
                        throw LegalesignSdkInvalidDataException("Unknown SignersInOrder: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * @throws LegalesignSdkInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asInt(): Int =
                _value().asNumber().getOrNull()?.let {
                    if (it.toDouble() % 1 == 0.0) it.toInt() else null
                } ?: throw LegalesignSdkInvalidDataException("Value is not a Int")

            private var validated: Boolean = false

            fun validate(): SignersInOrder = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SignersInOrder && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Object &&
                archived == other.archived &&
                autoArchive == other.autoArchive &&
                ccEmails == other.ccEmails &&
                created == other.created &&
                doEmail == other.doEmail &&
                downloadFinal == other.downloadFinal &&
                group == other.group &&
                modified == other.modified &&
                name == other.name &&
                pdftext == other.pdftext &&
                redirect == other.redirect &&
                resourceUri == other.resourceUri &&
                returnSignerLinks == other.returnSignerLinks &&
                signers == other.signers &&
                signersInOrder == other.signersInOrder &&
                status == other.status &&
                tag == other.tag &&
                tag1 == other.tag1 &&
                tag2 == other.tag2 &&
                template == other.template &&
                templatepdf == other.templatepdf &&
                text == other.text &&
                user == other.user &&
                uuid == other.uuid &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                archived,
                autoArchive,
                ccEmails,
                created,
                doEmail,
                downloadFinal,
                group,
                modified,
                name,
                pdftext,
                redirect,
                resourceUri,
                returnSignerLinks,
                signers,
                signersInOrder,
                status,
                tag,
                tag1,
                tag2,
                template,
                templatepdf,
                text,
                user,
                uuid,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Object{archived=$archived, autoArchive=$autoArchive, ccEmails=$ccEmails, created=$created, doEmail=$doEmail, downloadFinal=$downloadFinal, group=$group, modified=$modified, name=$name, pdftext=$pdftext, redirect=$redirect, resourceUri=$resourceUri, returnSignerLinks=$returnSignerLinks, signers=$signers, signersInOrder=$signersInOrder, status=$status, tag=$tag, tag1=$tag1, tag2=$tag2, template=$template, templatepdf=$templatepdf, text=$text, user=$user, uuid=$uuid, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentListResponse &&
            meta == other.meta &&
            objects == other.objects &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(meta, objects, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentListResponse{meta=$meta, objects=$objects, additionalProperties=$additionalProperties}"
}
