// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.pdf

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.legalesign.api.core.ExcludeMissing
import com.legalesign.api.core.JsonField
import com.legalesign.api.core.JsonMissing
import com.legalesign.api.core.JsonValue
import com.legalesign.api.core.Params
import com.legalesign.api.core.checkRequired
import com.legalesign.api.core.http.Headers
import com.legalesign.api.core.http.QueryParams
import com.legalesign.api.errors.LegalesignInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** text/html document as pdf preview */
class PdfCreatePreviewParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun group(): String = body.group()

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isSignaturePerPage(): Long = body.isSignaturePerPage()

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun signatureType(): Long = body.signatureType()

    /**
     * number of signers
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun signeeCount(): Int = body.signeeCount()

    /**
     * raw html
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = body.text()

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun footer(): Optional<String> = body.footer()

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun footerHeight(): Optional<Long> = body.footerHeight()

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun header(): Optional<String> = body.header()

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headerHeight(): Optional<Long> = body.headerHeight()

    /**
     * Set to true to use group default
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pdfheader(): Optional<Boolean> = body.pdfheader()

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = body.title()

    /**
     * Returns the raw JSON value of [group].
     *
     * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _group(): JsonField<String> = body._group()

    /**
     * Returns the raw JSON value of [isSignaturePerPage].
     *
     * Unlike [isSignaturePerPage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _isSignaturePerPage(): JsonField<Long> = body._isSignaturePerPage()

    /**
     * Returns the raw JSON value of [signatureType].
     *
     * Unlike [signatureType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signatureType(): JsonField<Long> = body._signatureType()

    /**
     * Returns the raw JSON value of [signeeCount].
     *
     * Unlike [signeeCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signeeCount(): JsonField<Int> = body._signeeCount()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<String> = body._text()

    /**
     * Returns the raw JSON value of [footer].
     *
     * Unlike [footer], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _footer(): JsonField<String> = body._footer()

    /**
     * Returns the raw JSON value of [footerHeight].
     *
     * Unlike [footerHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _footerHeight(): JsonField<Long> = body._footerHeight()

    /**
     * Returns the raw JSON value of [header].
     *
     * Unlike [header], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _header(): JsonField<String> = body._header()

    /**
     * Returns the raw JSON value of [headerHeight].
     *
     * Unlike [headerHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _headerHeight(): JsonField<Long> = body._headerHeight()

    /**
     * Returns the raw JSON value of [pdfheader].
     *
     * Unlike [pdfheader], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pdfheader(): JsonField<Boolean> = body._pdfheader()

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _title(): JsonField<String> = body._title()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PdfCreatePreviewParams].
         *
         * The following fields are required:
         * ```java
         * .group()
         * .isSignaturePerPage()
         * .signatureType()
         * .signeeCount()
         * .text()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PdfCreatePreviewParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(pdfCreatePreviewParams: PdfCreatePreviewParams) = apply {
            body = pdfCreatePreviewParams.body.toBuilder()
            additionalHeaders = pdfCreatePreviewParams.additionalHeaders.toBuilder()
            additionalQueryParams = pdfCreatePreviewParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [group]
         * - [isSignaturePerPage]
         * - [signatureType]
         * - [signeeCount]
         * - [text]
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

        fun isSignaturePerPage(isSignaturePerPage: Long) = apply {
            body.isSignaturePerPage(isSignaturePerPage)
        }

        /**
         * Sets [Builder.isSignaturePerPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isSignaturePerPage] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isSignaturePerPage(isSignaturePerPage: JsonField<Long>) = apply {
            body.isSignaturePerPage(isSignaturePerPage)
        }

        fun signatureType(signatureType: Long) = apply { body.signatureType(signatureType) }

        /**
         * Sets [Builder.signatureType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signatureType] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signatureType(signatureType: JsonField<Long>) = apply {
            body.signatureType(signatureType)
        }

        /** number of signers */
        fun signeeCount(signeeCount: Int) = apply { body.signeeCount(signeeCount) }

        /**
         * Sets [Builder.signeeCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signeeCount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun signeeCount(signeeCount: JsonField<Int>) = apply { body.signeeCount(signeeCount) }

        /** raw html */
        fun text(text: String) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

        fun footer(footer: String) = apply { body.footer(footer) }

        /**
         * Sets [Builder.footer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.footer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun footer(footer: JsonField<String>) = apply { body.footer(footer) }

        fun footerHeight(footerHeight: Long) = apply { body.footerHeight(footerHeight) }

        /**
         * Sets [Builder.footerHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.footerHeight] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun footerHeight(footerHeight: JsonField<Long>) = apply { body.footerHeight(footerHeight) }

        fun header(header: String) = apply { body.header(header) }

        /**
         * Sets [Builder.header] to an arbitrary JSON value.
         *
         * You should usually call [Builder.header] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun header(header: JsonField<String>) = apply { body.header(header) }

        fun headerHeight(headerHeight: Long) = apply { body.headerHeight(headerHeight) }

        /**
         * Sets [Builder.headerHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headerHeight] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun headerHeight(headerHeight: JsonField<Long>) = apply { body.headerHeight(headerHeight) }

        /** Set to true to use group default */
        fun pdfheader(pdfheader: Boolean) = apply { body.pdfheader(pdfheader) }

        /**
         * Sets [Builder.pdfheader] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pdfheader] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pdfheader(pdfheader: JsonField<Boolean>) = apply { body.pdfheader(pdfheader) }

        fun title(title: String) = apply { body.title(title) }

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { body.title(title) }

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
         * Returns an immutable instance of [PdfCreatePreviewParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .group()
         * .isSignaturePerPage()
         * .signatureType()
         * .signeeCount()
         * .text()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PdfCreatePreviewParams =
            PdfCreatePreviewParams(
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
        private val isSignaturePerPage: JsonField<Long>,
        private val signatureType: JsonField<Long>,
        private val signeeCount: JsonField<Int>,
        private val text: JsonField<String>,
        private val footer: JsonField<String>,
        private val footerHeight: JsonField<Long>,
        private val header: JsonField<String>,
        private val headerHeight: JsonField<Long>,
        private val pdfheader: JsonField<Boolean>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("group") @ExcludeMissing group: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_signature_per_page")
            @ExcludeMissing
            isSignaturePerPage: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("signature_type")
            @ExcludeMissing
            signatureType: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("signee_count")
            @ExcludeMissing
            signeeCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("footer") @ExcludeMissing footer: JsonField<String> = JsonMissing.of(),
            @JsonProperty("footer_height")
            @ExcludeMissing
            footerHeight: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("header") @ExcludeMissing header: JsonField<String> = JsonMissing.of(),
            @JsonProperty("header_height")
            @ExcludeMissing
            headerHeight: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("pdfheader")
            @ExcludeMissing
            pdfheader: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(
            group,
            isSignaturePerPage,
            signatureType,
            signeeCount,
            text,
            footer,
            footerHeight,
            header,
            headerHeight,
            pdfheader,
            title,
            mutableMapOf(),
        )

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun group(): String = group.getRequired("group")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isSignaturePerPage(): Long = isSignaturePerPage.getRequired("is_signature_per_page")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun signatureType(): Long = signatureType.getRequired("signature_type")

        /**
         * number of signers
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun signeeCount(): Int = signeeCount.getRequired("signee_count")

        /**
         * raw html
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun footer(): Optional<String> = footer.getOptional("footer")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun footerHeight(): Optional<Long> = footerHeight.getOptional("footer_height")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun header(): Optional<String> = header.getOptional("header")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun headerHeight(): Optional<Long> = headerHeight.getOptional("header_height")

        /**
         * Set to true to use group default
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pdfheader(): Optional<Boolean> = pdfheader.getOptional("pdfheader")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [group].
         *
         * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<String> = group

        /**
         * Returns the raw JSON value of [isSignaturePerPage].
         *
         * Unlike [isSignaturePerPage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("is_signature_per_page")
        @ExcludeMissing
        fun _isSignaturePerPage(): JsonField<Long> = isSignaturePerPage

        /**
         * Returns the raw JSON value of [signatureType].
         *
         * Unlike [signatureType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("signature_type")
        @ExcludeMissing
        fun _signatureType(): JsonField<Long> = signatureType

        /**
         * Returns the raw JSON value of [signeeCount].
         *
         * Unlike [signeeCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signee_count")
        @ExcludeMissing
        fun _signeeCount(): JsonField<Int> = signeeCount

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [footer].
         *
         * Unlike [footer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonField<String> = footer

        /**
         * Returns the raw JSON value of [footerHeight].
         *
         * Unlike [footerHeight], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [headerHeight].
         *
         * Unlike [headerHeight], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("header_height")
        @ExcludeMissing
        fun _headerHeight(): JsonField<Long> = headerHeight

        /**
         * Returns the raw JSON value of [pdfheader].
         *
         * Unlike [pdfheader], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pdfheader") @ExcludeMissing fun _pdfheader(): JsonField<Boolean> = pdfheader

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
             * .isSignaturePerPage()
             * .signatureType()
             * .signeeCount()
             * .text()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var group: JsonField<String>? = null
            private var isSignaturePerPage: JsonField<Long>? = null
            private var signatureType: JsonField<Long>? = null
            private var signeeCount: JsonField<Int>? = null
            private var text: JsonField<String>? = null
            private var footer: JsonField<String> = JsonMissing.of()
            private var footerHeight: JsonField<Long> = JsonMissing.of()
            private var header: JsonField<String> = JsonMissing.of()
            private var headerHeight: JsonField<Long> = JsonMissing.of()
            private var pdfheader: JsonField<Boolean> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                group = body.group
                isSignaturePerPage = body.isSignaturePerPage
                signatureType = body.signatureType
                signeeCount = body.signeeCount
                text = body.text
                footer = body.footer
                footerHeight = body.footerHeight
                header = body.header
                headerHeight = body.headerHeight
                pdfheader = body.pdfheader
                title = body.title
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

            fun isSignaturePerPage(isSignaturePerPage: Long) =
                isSignaturePerPage(JsonField.of(isSignaturePerPage))

            /**
             * Sets [Builder.isSignaturePerPage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isSignaturePerPage] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isSignaturePerPage(isSignaturePerPage: JsonField<Long>) = apply {
                this.isSignaturePerPage = isSignaturePerPage
            }

            fun signatureType(signatureType: Long) = signatureType(JsonField.of(signatureType))

            /**
             * Sets [Builder.signatureType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signatureType] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signatureType(signatureType: JsonField<Long>) = apply {
                this.signatureType = signatureType
            }

            /** number of signers */
            fun signeeCount(signeeCount: Int) = signeeCount(JsonField.of(signeeCount))

            /**
             * Sets [Builder.signeeCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signeeCount] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signeeCount(signeeCount: JsonField<Int>) = apply { this.signeeCount = signeeCount }

            /** raw html */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun footer(footer: String) = footer(JsonField.of(footer))

            /**
             * Sets [Builder.footer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.footer] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun footer(footer: JsonField<String>) = apply { this.footer = footer }

            fun footerHeight(footerHeight: Long) = footerHeight(JsonField.of(footerHeight))

            /**
             * Sets [Builder.footerHeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.footerHeight] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun footerHeight(footerHeight: JsonField<Long>) = apply {
                this.footerHeight = footerHeight
            }

            fun header(header: String) = header(JsonField.of(header))

            /**
             * Sets [Builder.header] to an arbitrary JSON value.
             *
             * You should usually call [Builder.header] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun header(header: JsonField<String>) = apply { this.header = header }

            fun headerHeight(headerHeight: Long) = headerHeight(JsonField.of(headerHeight))

            /**
             * Sets [Builder.headerHeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headerHeight] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headerHeight(headerHeight: JsonField<Long>) = apply {
                this.headerHeight = headerHeight
            }

            /** Set to true to use group default */
            fun pdfheader(pdfheader: Boolean) = pdfheader(JsonField.of(pdfheader))

            /**
             * Sets [Builder.pdfheader] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pdfheader] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pdfheader(pdfheader: JsonField<Boolean>) = apply { this.pdfheader = pdfheader }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * .isSignaturePerPage()
             * .signatureType()
             * .signeeCount()
             * .text()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("group", group),
                    checkRequired("isSignaturePerPage", isSignaturePerPage),
                    checkRequired("signatureType", signatureType),
                    checkRequired("signeeCount", signeeCount),
                    checkRequired("text", text),
                    footer,
                    footerHeight,
                    header,
                    headerHeight,
                    pdfheader,
                    title,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            group()
            isSignaturePerPage()
            signatureType()
            signeeCount()
            text()
            footer()
            footerHeight()
            header()
            headerHeight()
            pdfheader()
            title()
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
            (if (group.asKnown().isPresent) 1 else 0) +
                (if (isSignaturePerPage.asKnown().isPresent) 1 else 0) +
                (if (signatureType.asKnown().isPresent) 1 else 0) +
                (if (signeeCount.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (footer.asKnown().isPresent) 1 else 0) +
                (if (footerHeight.asKnown().isPresent) 1 else 0) +
                (if (header.asKnown().isPresent) 1 else 0) +
                (if (headerHeight.asKnown().isPresent) 1 else 0) +
                (if (pdfheader.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                group == other.group &&
                isSignaturePerPage == other.isSignaturePerPage &&
                signatureType == other.signatureType &&
                signeeCount == other.signeeCount &&
                text == other.text &&
                footer == other.footer &&
                footerHeight == other.footerHeight &&
                header == other.header &&
                headerHeight == other.headerHeight &&
                pdfheader == other.pdfheader &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                group,
                isSignaturePerPage,
                signatureType,
                signeeCount,
                text,
                footer,
                footerHeight,
                header,
                headerHeight,
                pdfheader,
                title,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{group=$group, isSignaturePerPage=$isSignaturePerPage, signatureType=$signatureType, signeeCount=$signeeCount, text=$text, footer=$footer, footerHeight=$footerHeight, header=$header, headerHeight=$headerHeight, pdfheader=$pdfheader, title=$title, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PdfCreatePreviewParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PdfCreatePreviewParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
