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
import com.legalesign_sdk.api.core.Params
import com.legalesign_sdk.api.core.checkRequired
import com.legalesign_sdk.api.core.http.Headers
import com.legalesign_sdk.api.core.http.QueryParams
import com.legalesign_sdk.api.errors.LegalesignSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Upload a PDF document you want to send to be signed */
class TemplatepdfCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun group(): String = body.group()

    /**
     * base64 encoded PDF file data
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pdfFile(): String = body.pdfFile()

    /**
     * archive PDF when sent
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun archiveUponSend(): Optional<Boolean> = body.archiveUponSend()

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun processTags(): Optional<Boolean> = body.processTags()

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun title(): Optional<String> = body.title()

    /**
     * assign to group member if not api user
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun user(): Optional<String> = body.user()

    /**
     * Returns the raw JSON value of [group].
     *
     * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _group(): JsonField<String> = body._group()

    /**
     * Returns the raw JSON value of [pdfFile].
     *
     * Unlike [pdfFile], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pdfFile(): JsonField<String> = body._pdfFile()

    /**
     * Returns the raw JSON value of [archiveUponSend].
     *
     * Unlike [archiveUponSend], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _archiveUponSend(): JsonField<Boolean> = body._archiveUponSend()

    /**
     * Returns the raw JSON value of [processTags].
     *
     * Unlike [processTags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _processTags(): JsonField<Boolean> = body._processTags()

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _title(): JsonField<String> = body._title()

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _user(): JsonField<String> = body._user()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TemplatepdfCreateParams].
         *
         * The following fields are required:
         * ```java
         * .group()
         * .pdfFile()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TemplatepdfCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(templatepdfCreateParams: TemplatepdfCreateParams) = apply {
            body = templatepdfCreateParams.body.toBuilder()
            additionalHeaders = templatepdfCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = templatepdfCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [group]
         * - [pdfFile]
         * - [archiveUponSend]
         * - [processTags]
         * - [title]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun group(group: String) = apply { body.group(group) }

        /**
         * Sets [Builder.group] to an arbitrary JSON value.
         *
         * You should usually call [Builder.group] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun group(group: JsonField<String>) = apply { body.group(group) }

        /** base64 encoded PDF file data */
        fun pdfFile(pdfFile: String) = apply { body.pdfFile(pdfFile) }

        /**
         * Sets [Builder.pdfFile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pdfFile] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pdfFile(pdfFile: JsonField<String>) = apply { body.pdfFile(pdfFile) }

        /** archive PDF when sent */
        fun archiveUponSend(archiveUponSend: Boolean) = apply {
            body.archiveUponSend(archiveUponSend)
        }

        /**
         * Sets [Builder.archiveUponSend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archiveUponSend] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun archiveUponSend(archiveUponSend: JsonField<Boolean>) = apply {
            body.archiveUponSend(archiveUponSend)
        }

        fun processTags(processTags: Boolean) = apply { body.processTags(processTags) }

        /**
         * Sets [Builder.processTags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processTags] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun processTags(processTags: JsonField<Boolean>) = apply { body.processTags(processTags) }

        fun title(title: String) = apply { body.title(title) }

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { body.title(title) }

        /** assign to group member if not api user */
        fun user(user: String) = apply { body.user(user) }

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { body.user(user) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [TemplatepdfCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .group()
         * .pdfFile()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TemplatepdfCreateParams =
            TemplatepdfCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val group: JsonField<String>,
        private val pdfFile: JsonField<String>,
        private val archiveUponSend: JsonField<Boolean>,
        private val processTags: JsonField<Boolean>,
        private val title: JsonField<String>,
        private val user: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("group") @ExcludeMissing group: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pdf_file") @ExcludeMissing pdfFile: JsonField<String> = JsonMissing.of(),
            @JsonProperty("archive_upon_send")
            @ExcludeMissing
            archiveUponSend: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("process_tags")
            @ExcludeMissing
            processTags: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        ) : this(group, pdfFile, archiveUponSend, processTags, title, user, mutableMapOf())

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun group(): String = group.getRequired("group")

        /**
         * base64 encoded PDF file data
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pdfFile(): String = pdfFile.getRequired("pdf_file")

        /**
         * archive PDF when sent
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun archiveUponSend(): Optional<Boolean> = archiveUponSend.getOptional("archive_upon_send")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun processTags(): Optional<Boolean> = processTags.getOptional("process_tags")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * assign to group member if not api user
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun user(): Optional<String> = user.getOptional("user")

        /**
         * Returns the raw JSON value of [group].
         *
         * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<String> = group

        /**
         * Returns the raw JSON value of [pdfFile].
         *
         * Unlike [pdfFile], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pdf_file") @ExcludeMissing fun _pdfFile(): JsonField<String> = pdfFile

        /**
         * Returns the raw JSON value of [archiveUponSend].
         *
         * Unlike [archiveUponSend], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("archive_upon_send")
        @ExcludeMissing
        fun _archiveUponSend(): JsonField<Boolean> = archiveUponSend

        /**
         * Returns the raw JSON value of [processTags].
         *
         * Unlike [processTags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("process_tags")
        @ExcludeMissing
        fun _processTags(): JsonField<Boolean> = processTags

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .group()
             * .pdfFile()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var group: JsonField<String>? = null
            private var pdfFile: JsonField<String>? = null
            private var archiveUponSend: JsonField<Boolean> = JsonMissing.of()
            private var processTags: JsonField<Boolean> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var user: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                group = body.group
                pdfFile = body.pdfFile
                archiveUponSend = body.archiveUponSend
                processTags = body.processTags
                title = body.title
                user = body.user
                additionalProperties = body.additionalProperties.toMutableMap()
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

            /** base64 encoded PDF file data */
            fun pdfFile(pdfFile: String) = pdfFile(JsonField.of(pdfFile))

            /**
             * Sets [Builder.pdfFile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pdfFile] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pdfFile(pdfFile: JsonField<String>) = apply { this.pdfFile = pdfFile }

            /** archive PDF when sent */
            fun archiveUponSend(archiveUponSend: Boolean) =
                archiveUponSend(JsonField.of(archiveUponSend))

            /**
             * Sets [Builder.archiveUponSend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.archiveUponSend] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun archiveUponSend(archiveUponSend: JsonField<Boolean>) = apply {
                this.archiveUponSend = archiveUponSend
            }

            fun processTags(processTags: Boolean) = processTags(JsonField.of(processTags))

            /**
             * Sets [Builder.processTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.processTags] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun processTags(processTags: JsonField<Boolean>) = apply {
                this.processTags = processTags
            }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            /** assign to group member if not api user */
            fun user(user: String) = user(JsonField.of(user))

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .group()
             * .pdfFile()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("group", group),
                    checkRequired("pdfFile", pdfFile),
                    archiveUponSend,
                    processTags,
                    title,
                    user,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            group()
            pdfFile()
            archiveUponSend()
            processTags()
            title()
            user()
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
            (if (group.asKnown().isPresent) 1 else 0) +
                (if (pdfFile.asKnown().isPresent) 1 else 0) +
                (if (archiveUponSend.asKnown().isPresent) 1 else 0) +
                (if (processTags.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (if (user.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                group == other.group &&
                pdfFile == other.pdfFile &&
                archiveUponSend == other.archiveUponSend &&
                processTags == other.processTags &&
                title == other.title &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                group,
                pdfFile,
                archiveUponSend,
                processTags,
                title,
                user,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{group=$group, pdfFile=$pdfFile, archiveUponSend=$archiveUponSend, processTags=$processTags, title=$title, user=$user, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TemplatepdfCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TemplatepdfCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
