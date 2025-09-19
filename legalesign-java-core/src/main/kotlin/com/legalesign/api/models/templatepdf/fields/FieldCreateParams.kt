// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.templatepdf.fields

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.legalesign.api.core.Enum
import com.legalesign.api.core.ExcludeMissing
import com.legalesign.api.core.JsonField
import com.legalesign.api.core.JsonMissing
import com.legalesign.api.core.Params
import com.legalesign.api.core.checkRequired
import com.legalesign.api.core.http.Headers
import com.legalesign.api.core.http.QueryParams
import com.legalesign.api.core.toImmutable
import com.legalesign.api.errors.LegalesignInvalidDataException
import com.legalesign.api.models.document.PdfFieldValidationEnum
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Replace existing pdf fields with new ones */
class FieldCreateParams
private constructor(
    private val pdfId: String?,
    private val body: List<Body>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pdfId(): Optional<String> = Optional.ofNullable(pdfId)

    fun body(): List<Body> = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FieldCreateParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FieldCreateParams]. */
    class Builder internal constructor() {

        private var pdfId: String? = null
        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fieldCreateParams: FieldCreateParams) = apply {
            pdfId = fieldCreateParams.pdfId
            body = fieldCreateParams.body.toMutableList()
            additionalHeaders = fieldCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = fieldCreateParams.additionalQueryParams.toBuilder()
        }

        fun pdfId(pdfId: String?) = apply { this.pdfId = pdfId }

        /** Alias for calling [Builder.pdfId] with `pdfId.orElse(null)`. */
        fun pdfId(pdfId: Optional<String>) = pdfId(pdfId.getOrNull())

        fun body(body: List<Body>) = apply { this.body = body.toMutableList() }

        /**
         * Adds a single [Body] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: Body) = apply {
            this.body = (this.body ?: mutableListOf()).apply { add(body) }
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
         * Returns an immutable instance of [FieldCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FieldCreateParams =
            FieldCreateParams(
                pdfId,
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pdfId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("ax") @ExcludeMissing private val ax: JsonField<Float>,
        @JsonProperty("ay") @ExcludeMissing private val ay: JsonField<Float>,
        @JsonProperty("bx") @ExcludeMissing private val bx: JsonField<Float>,
        @JsonProperty("by") @ExcludeMissing private val by: JsonField<Float>,
        @JsonProperty("element_type")
        @ExcludeMissing
        private val elementType: JsonField<ElementType>,
        @JsonProperty("page") @ExcludeMissing private val page: JsonField<Int>,
        @JsonProperty("signer") @ExcludeMissing private val signer: JsonField<Int>,
        @JsonProperty("align") @ExcludeMissing private val align: JsonField<Align>,
        @JsonProperty("fieldorder") @ExcludeMissing private val fieldorder: JsonField<Int>,
        @JsonProperty("font_name") @ExcludeMissing private val fontName: JsonField<FontName>,
        @JsonProperty("font_size") @ExcludeMissing private val fontSize: JsonField<Int>,
        @JsonProperty("hide_border") @ExcludeMissing private val hideBorder: JsonField<Boolean>,
        @JsonProperty("label") @ExcludeMissing private val label: JsonField<String>,
        @JsonProperty("label_extra") @ExcludeMissing private val labelExtra: JsonField<String>,
        @JsonProperty("logic_action")
        @ExcludeMissing
        private val logicAction: JsonField<LogicAction>,
        @JsonProperty("logic_group") @ExcludeMissing private val logicGroup: JsonField<String>,
        @JsonProperty("map_to") @ExcludeMissing private val mapTo: JsonField<String>,
        @JsonProperty("optional") @ExcludeMissing private val optional: JsonField<Boolean>,
        @JsonProperty("options") @ExcludeMissing private val options: JsonField<String>,
        @JsonProperty("substantive") @ExcludeMissing private val substantive: JsonField<Boolean>,
        @JsonProperty("validation")
        @ExcludeMissing
        private val validation: JsonField<PdfFieldValidationEnum>,
        @JsonProperty("value") @ExcludeMissing private val value: JsonField<String>,
    ) {

        /**
         * % of page width - left vertical: 0 = left page edge, 1 = right page edge
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ax(): Float = ax.getRequired("ax")

        /**
         * % of page height - upper horizontal: 0 = top page edge, 1 = bottom page edge
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ay(): Float = ay.getRequired("ay")

        /**
         * % of page width - right vertical, 0 = left page edge, 1 = right page edge
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bx(): Float = bx.getRequired("bx")

        /**
         * % of page height lower horizontal. 0 = top page edge, 1 = bottom page edge
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun by(): Float = by.getRequired("by")

        /**
         * Must be one of the following: _ signature - signature field _ initials - initials field _
         * text - signer field (field for signer to complete) _ admin - sender field (field to
         * complete by admin user when sending, use pdftext)
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun elementType(): ElementType = elementType.getRequired("element_type")

        /**
         * which page to place field on
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun page(): Int = page.getRequired("page")

        /**
         * 1-indexed number of signer (witness+100) (approver+200)
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun signer(): Int = signer.getRequired("signer")

        /**
         * one of the following:
         * - 1 - left
         * - 2 - middle
         * - 3 - right
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun align(): Optional<Align> = align.getOptional("align")

        /**
         * Ordering of fields as the signer progresses (top-down by if left blank)
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fieldorder(): Optional<Int> = fieldorder.getOptional("fieldorder")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fontName(): Optional<FontName> = fontName.getOptional("font_name")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fontSize(): Optional<Int> = fontSize.getOptional("font_size")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun hideBorder(): Optional<Boolean> = hideBorder.getOptional("hide_border")

        /**
         * Help a signer/sender understand what to do with the form field
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun label(): Optional<String> = label.getOptional("label")

        /**
         * unused. more label if required
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun labelExtra(): Optional<String> = labelExtra.getOptional("label_extra")

        /**
         * offers options for more advanced forms 1 = One of a set of field - radio group 2 = Sum a
         * set of fields 3 = Conditional upon another field
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun logicAction(): Optional<LogicAction> = logicAction.getOptional("logic_action")

        /**
         * values to enable a given logic_action in the form
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun logicGroup(): Optional<String> = logicGroup.getOptional("logic_group")

        /**
         * custom data for form integrations
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mapTo(): Optional<String> = mapTo.getOptional("map_to")

        /**
         * Set true to allow field to be ignored
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun optional(): Optional<Boolean> = optional.getOptional("optional")

        /**
         * Additional values for certain validation types.
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun options(): Optional<String> = options.getOptional("options")

        /**
         * Set if field substantive to contract terms, if so will not let other sign till this field
         * completed
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun substantive(): Optional<Boolean> = substantive.getOptional("substantive")

        /**
         * fields types and validations:
         * - 1 - Email
         * - 2 - yyyy/mm/dd
         * - 3 - yy/mm/dd
         * - 4 - dd/mm/yyyy
         * - 5 - dd/mm/yy
         * - 6 - mm/dd/yy
         * - 7 - mm/dd/yy
         * - 8 - yyyy.mm.dd
         * - 9 - yy.mm.dd
         * - 10 - dd.mm.yyyy
         * - 11 - dd.mm.yy
         * - 12 - mm.dd.yyyy
         * - 13 - mm.dd.yy
         * - 14 - yyyy-mm-dd
         * - 15 - yy-mm-dd
         * - 16 - dd-mm-yyyy
         * - 17 - dd-mm-yy
         * - 18 - mm-dd-yyyy
         * - 19 - mm-dd-yy
         * - 20 - Dropdown list, use options attribute for items
         * - 24 - Checkbox tick/cross
         * - 25 - Checkbox tick/blank
         * - 26 - Checkbox cross/blank
         * - 30 - yyyy/mm/dd (automatic)
         * - 31 - yy/mm/dd (automatic)
         * - 32 - dd/yy/yyyy (automatic)
         * - 33 - dd/mm/yy (automatic)
         * - 34 - mm/dd/yyyy (automatic)
         * - 35 - mm/dd/yy (automatic)
         * - 36 - yyyy.mm.dd (automatic)
         * - 37 - yy.mm.dd (automatic)
         * - 38 - dd.mm.yyyy (automatic)
         * - 39 - dd.mm.yy (automatic)
         * - 40 - mm.dd.yyyy (automatic)
         * - 41 - mm.dd.yy (automatic)
         * - 42 - yyyy-mm-dd (automatic)
         * - 43 - yy-mm-dd (automatic)
         * - 44 - dd-mm-yyyy (automatic)
         * - 45 - dd-mm-yy (automatic)
         * - 46 - mm-dd-yyyy (automatic)
         * - 47 - mm-dd-yy (automatic)
         * - 48 - d mmmmm yyyy (automatic)
         * - 50 - Whole number
         * - 51 - Number
         * - 52 - Currency (2 decimals)
         * - 53 - 1 number
         * - 54 - 2 numbers
         * - 55 - 3 numbers
         * - 56 - 4 numbers
         * - 57 - 5 numbers
         * - 58 - 6 numbers
         * - 59 - 7 numbers
         * - 60 - 8 numbers
         * - 61 - 9 numbers
         * - 62 - 10 numbers
         * - 63 - 11 numbers
         * - 64 - 12 numbers
         * - 65 - 1 characters (any text)
         * - 66 - 2 characters (any text)
         * - 67 - 3 characters (any text)
         * - 68 - 4 characters (any text)
         * - 69 - 5 characters (any text)
         * - 70 - 6 characters (any text)
         * - 71 - 7 characters (any text)
         * - 72 - 8 characters (any text)
         * - 73 - secret code, add code in options
         * - 74 - file attach, append to email to signer
         * - 75 - file attach, append to final PDF
         * - 76 - file attach, zip with final PDF for internal use, but not signer
         * - 77 - force to title caps
         * - 78 - force to uppercase
         * - 79 - force to lowercase
         * - 80 - mm/yy
         * - 81 - mm/yyyy
         * - 82 - mm.yy
         * - 83 - mm.yyyy
         * - 84 - mm-yy
         * - 85 - mm-yyyy
         * - 90 - drawn field
         * - 91 - countries list
         * - 92 - honorifics list
         *
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun validation(): Optional<PdfFieldValidationEnum> = validation.getOptional("validation")

        /**
         * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [ax].
         *
         * Unlike [ax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ax") @ExcludeMissing fun _ax(): JsonField<Float> = ax

        /**
         * Returns the raw JSON value of [ay].
         *
         * Unlike [ay], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ay") @ExcludeMissing fun _ay(): JsonField<Float> = ay

        /**
         * Returns the raw JSON value of [bx].
         *
         * Unlike [bx], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bx") @ExcludeMissing fun _bx(): JsonField<Float> = bx

        /**
         * Returns the raw JSON value of [by].
         *
         * Unlike [by], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("by") @ExcludeMissing fun _by(): JsonField<Float> = by

        /**
         * Returns the raw JSON value of [elementType].
         *
         * Unlike [elementType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("element_type")
        @ExcludeMissing
        fun _elementType(): JsonField<ElementType> = elementType

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Int> = page

        /**
         * Returns the raw JSON value of [signer].
         *
         * Unlike [signer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signer") @ExcludeMissing fun _signer(): JsonField<Int> = signer

        /**
         * Returns the raw JSON value of [align].
         *
         * Unlike [align], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("align") @ExcludeMissing fun _align(): JsonField<Align> = align

        /**
         * Returns the raw JSON value of [fieldorder].
         *
         * Unlike [fieldorder], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fieldorder") @ExcludeMissing fun _fieldorder(): JsonField<Int> = fieldorder

        /**
         * Returns the raw JSON value of [fontName].
         *
         * Unlike [fontName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("font_name") @ExcludeMissing fun _fontName(): JsonField<FontName> = fontName

        /**
         * Returns the raw JSON value of [fontSize].
         *
         * Unlike [fontSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("font_size") @ExcludeMissing fun _fontSize(): JsonField<Int> = fontSize

        /**
         * Returns the raw JSON value of [hideBorder].
         *
         * Unlike [hideBorder], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hide_border")
        @ExcludeMissing
        fun _hideBorder(): JsonField<Boolean> = hideBorder

        /**
         * Returns the raw JSON value of [label].
         *
         * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

        /**
         * Returns the raw JSON value of [labelExtra].
         *
         * Unlike [labelExtra], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("label_extra")
        @ExcludeMissing
        fun _labelExtra(): JsonField<String> = labelExtra

        /**
         * Returns the raw JSON value of [logicAction].
         *
         * Unlike [logicAction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logic_action")
        @ExcludeMissing
        fun _logicAction(): JsonField<LogicAction> = logicAction

        /**
         * Returns the raw JSON value of [logicGroup].
         *
         * Unlike [logicGroup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logic_group")
        @ExcludeMissing
        fun _logicGroup(): JsonField<String> = logicGroup

        /**
         * Returns the raw JSON value of [mapTo].
         *
         * Unlike [mapTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("map_to") @ExcludeMissing fun _mapTo(): JsonField<String> = mapTo

        /**
         * Returns the raw JSON value of [optional].
         *
         * Unlike [optional], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("optional") @ExcludeMissing fun _optional(): JsonField<Boolean> = optional

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<String> = options

        /**
         * Returns the raw JSON value of [substantive].
         *
         * Unlike [substantive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("substantive")
        @ExcludeMissing
        fun _substantive(): JsonField<Boolean> = substantive

        /**
         * Returns the raw JSON value of [validation].
         *
         * Unlike [validation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("validation")
        @ExcludeMissing
        fun _validation(): JsonField<PdfFieldValidationEnum> = validation

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .ax()
             * .ay()
             * .bx()
             * .by()
             * .elementType()
             * .page()
             * .signer()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var ax: JsonField<Float>? = null
            private var ay: JsonField<Float>? = null
            private var bx: JsonField<Float>? = null
            private var by: JsonField<Float>? = null
            private var elementType: JsonField<ElementType>? = null
            private var page: JsonField<Int>? = null
            private var signer: JsonField<Int>? = null
            private var align: JsonField<Align> = JsonMissing.of()
            private var fieldorder: JsonField<Int> = JsonMissing.of()
            private var fontName: JsonField<FontName> = JsonMissing.of()
            private var fontSize: JsonField<Int> = JsonMissing.of()
            private var hideBorder: JsonField<Boolean> = JsonMissing.of()
            private var label: JsonField<String> = JsonMissing.of()
            private var labelExtra: JsonField<String> = JsonMissing.of()
            private var logicAction: JsonField<LogicAction> = JsonMissing.of()
            private var logicGroup: JsonField<String> = JsonMissing.of()
            private var mapTo: JsonField<String> = JsonMissing.of()
            private var optional: JsonField<Boolean> = JsonMissing.of()
            private var options: JsonField<String> = JsonMissing.of()
            private var substantive: JsonField<Boolean> = JsonMissing.of()
            private var validation: JsonField<PdfFieldValidationEnum> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                ax = body.ax
                ay = body.ay
                bx = body.bx
                by = body.by
                elementType = body.elementType
                page = body.page
                signer = body.signer
                align = body.align
                fieldorder = body.fieldorder
                fontName = body.fontName
                fontSize = body.fontSize
                hideBorder = body.hideBorder
                label = body.label
                labelExtra = body.labelExtra
                logicAction = body.logicAction
                logicGroup = body.logicGroup
                mapTo = body.mapTo
                optional = body.optional
                options = body.options
                substantive = body.substantive
                validation = body.validation
                value = body.value
            }

            /** % of page width - left vertical: 0 = left page edge, 1 = right page edge */
            fun ax(ax: Float) = ax(JsonField.of(ax))

            /**
             * Sets [Builder.ax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ax] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ax(ax: JsonField<Float>) = apply { this.ax = ax }

            /** % of page height - upper horizontal: 0 = top page edge, 1 = bottom page edge */
            fun ay(ay: Float) = ay(JsonField.of(ay))

            /**
             * Sets [Builder.ay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ay] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ay(ay: JsonField<Float>) = apply { this.ay = ay }

            /** % of page width - right vertical, 0 = left page edge, 1 = right page edge */
            fun bx(bx: Float) = bx(JsonField.of(bx))

            /**
             * Sets [Builder.bx] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bx] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun bx(bx: JsonField<Float>) = apply { this.bx = bx }

            /** % of page height lower horizontal. 0 = top page edge, 1 = bottom page edge */
            fun by(by: Float) = by(JsonField.of(by))

            /**
             * Sets [Builder.by] to an arbitrary JSON value.
             *
             * You should usually call [Builder.by] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun by(by: JsonField<Float>) = apply { this.by = by }

            /**
             * Must be one of the following: _ signature - signature field _ initials - initials
             * field _ text - signer field (field for signer to complete) _ admin - sender field
             * (field to complete by admin user when sending, use pdftext)
             */
            fun elementType(elementType: ElementType) = elementType(JsonField.of(elementType))

            /**
             * Sets [Builder.elementType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elementType] with a well-typed [ElementType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun elementType(elementType: JsonField<ElementType>) = apply {
                this.elementType = elementType
            }

            /** which page to place field on */
            fun page(page: Int) = page(JsonField.of(page))

            /**
             * Sets [Builder.page] to an arbitrary JSON value.
             *
             * You should usually call [Builder.page] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun page(page: JsonField<Int>) = apply { this.page = page }

            /** 1-indexed number of signer (witness+100) (approver+200) */
            fun signer(signer: Int) = signer(JsonField.of(signer))

            /**
             * Sets [Builder.signer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signer] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun signer(signer: JsonField<Int>) = apply { this.signer = signer }

            /**
             * one of the following:
             * - 1 - left
             * - 2 - middle
             * - 3 - right
             */
            fun align(align: Align?) = align(JsonField.ofNullable(align))

            /** Alias for calling [Builder.align] with `align.orElse(null)`. */
            fun align(align: Optional<Align>) = align(align.getOrNull())

            /**
             * Sets [Builder.align] to an arbitrary JSON value.
             *
             * You should usually call [Builder.align] with a well-typed [Align] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun align(align: JsonField<Align>) = apply { this.align = align }

            /** Ordering of fields as the signer progresses (top-down by if left blank) */
            fun fieldorder(fieldorder: Int?) = fieldorder(JsonField.ofNullable(fieldorder))

            /**
             * Alias for [Builder.fieldorder].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun fieldorder(fieldorder: Int) = fieldorder(fieldorder as Int?)

            /** Alias for calling [Builder.fieldorder] with `fieldorder.orElse(null)`. */
            fun fieldorder(fieldorder: Optional<Int>) = fieldorder(fieldorder.getOrNull())

            /**
             * Sets [Builder.fieldorder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldorder] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldorder(fieldorder: JsonField<Int>) = apply { this.fieldorder = fieldorder }

            fun fontName(fontName: FontName) = fontName(JsonField.of(fontName))

            /**
             * Sets [Builder.fontName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fontName] with a well-typed [FontName] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fontName(fontName: JsonField<FontName>) = apply { this.fontName = fontName }

            fun fontSize(fontSize: Int) = fontSize(JsonField.of(fontSize))

            /**
             * Sets [Builder.fontSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fontSize] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fontSize(fontSize: JsonField<Int>) = apply { this.fontSize = fontSize }

            fun hideBorder(hideBorder: Boolean) = hideBorder(JsonField.of(hideBorder))

            /**
             * Sets [Builder.hideBorder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hideBorder] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hideBorder(hideBorder: JsonField<Boolean>) = apply { this.hideBorder = hideBorder }

            /** Help a signer/sender understand what to do with the form field */
            fun label(label: String) = label(JsonField.of(label))

            /**
             * Sets [Builder.label] to an arbitrary JSON value.
             *
             * You should usually call [Builder.label] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun label(label: JsonField<String>) = apply { this.label = label }

            /** unused. more label if required */
            @Deprecated("deprecated")
            fun labelExtra(labelExtra: String) = labelExtra(JsonField.of(labelExtra))

            /**
             * Sets [Builder.labelExtra] to an arbitrary JSON value.
             *
             * You should usually call [Builder.labelExtra] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun labelExtra(labelExtra: JsonField<String>) = apply { this.labelExtra = labelExtra }

            /**
             * offers options for more advanced forms 1 = One of a set of field - radio group 2 =
             * Sum a set of fields 3 = Conditional upon another field
             */
            fun logicAction(logicAction: LogicAction) = logicAction(JsonField.of(logicAction))

            /**
             * Sets [Builder.logicAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logicAction] with a well-typed [LogicAction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logicAction(logicAction: JsonField<LogicAction>) = apply {
                this.logicAction = logicAction
            }

            /** values to enable a given logic_action in the form */
            fun logicGroup(logicGroup: String) = logicGroup(JsonField.of(logicGroup))

            /**
             * Sets [Builder.logicGroup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logicGroup] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logicGroup(logicGroup: JsonField<String>) = apply { this.logicGroup = logicGroup }

            /** custom data for form integrations */
            fun mapTo(mapTo: String) = mapTo(JsonField.of(mapTo))

            /**
             * Sets [Builder.mapTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mapTo] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mapTo(mapTo: JsonField<String>) = apply { this.mapTo = mapTo }

            /** Set true to allow field to be ignored */
            fun optional(optional: Boolean) = optional(JsonField.of(optional))

            /**
             * Sets [Builder.optional] to an arbitrary JSON value.
             *
             * You should usually call [Builder.optional] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun optional(optional: JsonField<Boolean>) = apply { this.optional = optional }

            /** Additional values for certain validation types. */
            fun options(options: String) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<String>) = apply { this.options = options }

            /**
             * Set if field substantive to contract terms, if so will not let other sign till this
             * field completed
             */
            fun substantive(substantive: Boolean) = substantive(JsonField.of(substantive))

            /**
             * Sets [Builder.substantive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.substantive] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun substantive(substantive: JsonField<Boolean>) = apply {
                this.substantive = substantive
            }

            /**
             * fields types and validations:
             * - 1 - Email
             * - 2 - yyyy/mm/dd
             * - 3 - yy/mm/dd
             * - 4 - dd/mm/yyyy
             * - 5 - dd/mm/yy
             * - 6 - mm/dd/yy
             * - 7 - mm/dd/yy
             * - 8 - yyyy.mm.dd
             * - 9 - yy.mm.dd
             * - 10 - dd.mm.yyyy
             * - 11 - dd.mm.yy
             * - 12 - mm.dd.yyyy
             * - 13 - mm.dd.yy
             * - 14 - yyyy-mm-dd
             * - 15 - yy-mm-dd
             * - 16 - dd-mm-yyyy
             * - 17 - dd-mm-yy
             * - 18 - mm-dd-yyyy
             * - 19 - mm-dd-yy
             * - 20 - Dropdown list, use options attribute for items
             * - 24 - Checkbox tick/cross
             * - 25 - Checkbox tick/blank
             * - 26 - Checkbox cross/blank
             * - 30 - yyyy/mm/dd (automatic)
             * - 31 - yy/mm/dd (automatic)
             * - 32 - dd/yy/yyyy (automatic)
             * - 33 - dd/mm/yy (automatic)
             * - 34 - mm/dd/yyyy (automatic)
             * - 35 - mm/dd/yy (automatic)
             * - 36 - yyyy.mm.dd (automatic)
             * - 37 - yy.mm.dd (automatic)
             * - 38 - dd.mm.yyyy (automatic)
             * - 39 - dd.mm.yy (automatic)
             * - 40 - mm.dd.yyyy (automatic)
             * - 41 - mm.dd.yy (automatic)
             * - 42 - yyyy-mm-dd (automatic)
             * - 43 - yy-mm-dd (automatic)
             * - 44 - dd-mm-yyyy (automatic)
             * - 45 - dd-mm-yy (automatic)
             * - 46 - mm-dd-yyyy (automatic)
             * - 47 - mm-dd-yy (automatic)
             * - 48 - d mmmmm yyyy (automatic)
             * - 50 - Whole number
             * - 51 - Number
             * - 52 - Currency (2 decimals)
             * - 53 - 1 number
             * - 54 - 2 numbers
             * - 55 - 3 numbers
             * - 56 - 4 numbers
             * - 57 - 5 numbers
             * - 58 - 6 numbers
             * - 59 - 7 numbers
             * - 60 - 8 numbers
             * - 61 - 9 numbers
             * - 62 - 10 numbers
             * - 63 - 11 numbers
             * - 64 - 12 numbers
             * - 65 - 1 characters (any text)
             * - 66 - 2 characters (any text)
             * - 67 - 3 characters (any text)
             * - 68 - 4 characters (any text)
             * - 69 - 5 characters (any text)
             * - 70 - 6 characters (any text)
             * - 71 - 7 characters (any text)
             * - 72 - 8 characters (any text)
             * - 73 - secret code, add code in options
             * - 74 - file attach, append to email to signer
             * - 75 - file attach, append to final PDF
             * - 76 - file attach, zip with final PDF for internal use, but not signer
             * - 77 - force to title caps
             * - 78 - force to uppercase
             * - 79 - force to lowercase
             * - 80 - mm/yy
             * - 81 - mm/yyyy
             * - 82 - mm.yy
             * - 83 - mm.yyyy
             * - 84 - mm-yy
             * - 85 - mm-yyyy
             * - 90 - drawn field
             * - 91 - countries list
             * - 92 - honorifics list
             */
            fun validation(validation: PdfFieldValidationEnum?) =
                validation(JsonField.ofNullable(validation))

            /** Alias for calling [Builder.validation] with `validation.orElse(null)`. */
            fun validation(validation: Optional<PdfFieldValidationEnum>) =
                validation(validation.getOrNull())

            /**
             * Sets [Builder.validation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validation] with a well-typed
             * [PdfFieldValidationEnum] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun validation(validation: JsonField<PdfFieldValidationEnum>) = apply {
                this.validation = validation
            }

            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .ax()
             * .ay()
             * .bx()
             * .by()
             * .elementType()
             * .page()
             * .signer()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("ax", ax),
                    checkRequired("ay", ay),
                    checkRequired("bx", bx),
                    checkRequired("by", by),
                    checkRequired("elementType", elementType),
                    checkRequired("page", page),
                    checkRequired("signer", signer),
                    align,
                    fieldorder,
                    fontName,
                    fontSize,
                    hideBorder,
                    label,
                    labelExtra,
                    logicAction,
                    logicGroup,
                    mapTo,
                    optional,
                    options,
                    substantive,
                    validation,
                    value,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            ax()
            ay()
            bx()
            by()
            elementType().validate()
            page()
            signer()
            align().ifPresent { it.validate() }
            fieldorder()
            fontName().ifPresent { it.validate() }
            fontSize()
            hideBorder()
            label()
            labelExtra()
            logicAction().ifPresent { it.validate() }
            logicGroup()
            mapTo()
            optional()
            options()
            substantive()
            validation().ifPresent { it.validate() }
            value()
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
            (if (ax.asKnown().isPresent) 1 else 0) +
                (if (ay.asKnown().isPresent) 1 else 0) +
                (if (bx.asKnown().isPresent) 1 else 0) +
                (if (by.asKnown().isPresent) 1 else 0) +
                (elementType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (page.asKnown().isPresent) 1 else 0) +
                (if (signer.asKnown().isPresent) 1 else 0) +
                (align.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fieldorder.asKnown().isPresent) 1 else 0) +
                (fontName.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fontSize.asKnown().isPresent) 1 else 0) +
                (if (hideBorder.asKnown().isPresent) 1 else 0) +
                (if (label.asKnown().isPresent) 1 else 0) +
                (if (labelExtra.asKnown().isPresent) 1 else 0) +
                (logicAction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (logicGroup.asKnown().isPresent) 1 else 0) +
                (if (mapTo.asKnown().isPresent) 1 else 0) +
                (if (optional.asKnown().isPresent) 1 else 0) +
                (if (options.asKnown().isPresent) 1 else 0) +
                (if (substantive.asKnown().isPresent) 1 else 0) +
                (validation.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        /**
         * Must be one of the following: _ signature - signature field _ initials - initials field _
         * text - signer field (field for signer to complete) _ admin - sender field (field to
         * complete by admin user when sending, use pdftext)
         */
        class ElementType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SIGNATURE = of("signature")

                @JvmField val INITIALS = of("initials")

                @JvmField val TEXT = of("text")

                @JvmField val ADMIN = of("admin")

                @JvmStatic fun of(value: String) = ElementType(JsonField.of(value))
            }

            /** An enum containing [ElementType]'s known values. */
            enum class Known {
                SIGNATURE,
                INITIALS,
                TEXT,
                ADMIN,
            }

            /**
             * An enum containing [ElementType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ElementType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SIGNATURE,
                INITIALS,
                TEXT,
                ADMIN,
                /**
                 * An enum member indicating that [ElementType] was instantiated with an unknown
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
                    SIGNATURE -> Value.SIGNATURE
                    INITIALS -> Value.INITIALS
                    TEXT -> Value.TEXT
                    ADMIN -> Value.ADMIN
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LegalesignInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    SIGNATURE -> Known.SIGNATURE
                    INITIALS -> Known.INITIALS
                    TEXT -> Known.TEXT
                    ADMIN -> Known.ADMIN
                    else -> throw LegalesignInvalidDataException("Unknown ElementType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LegalesignInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LegalesignInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): ElementType = apply {
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
                } catch (e: LegalesignInvalidDataException) {
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

                return other is ElementType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * one of the following:
         * - 1 - left
         * - 2 - middle
         * - 3 - right
         */
        class Align @JsonCreator private constructor(private val value: JsonField<Long>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

            companion object {

                @JvmField val _1 = of(1L)

                @JvmField val _2 = of(2L)

                @JvmField val _3 = of(3L)

                @JvmStatic fun of(value: Long) = Align(JsonField.of(value))
            }

            /** An enum containing [Align]'s known values. */
            enum class Known {
                _1,
                _2,
                _3,
            }

            /**
             * An enum containing [Align]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Align] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                _1,
                _2,
                _3,
                /**
                 * An enum member indicating that [Align] was instantiated with an unknown value.
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
                    _1 -> Value._1
                    _2 -> Value._2
                    _3 -> Value._3
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LegalesignInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    _1 -> Known._1
                    _2 -> Known._2
                    _3 -> Known._3
                    else -> throw LegalesignInvalidDataException("Unknown Align: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * @throws LegalesignInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asLong(): Long =
                _value().asNumber().getOrNull()?.let {
                    if (it.toDouble() % 1 == 0.0) it.toLong() else null
                } ?: throw LegalesignInvalidDataException("Value is not a Long")

            private var validated: Boolean = false

            fun validate(): Align = apply {
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
                } catch (e: LegalesignInvalidDataException) {
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

                return other is Align && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class FontName @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EMPTY = of("")

                @JvmField val ARIAL = of("arial")

                @JvmField val COURIER = of("courier")

                @JvmField val HELVETICA = of("helvetica")

                @JvmField val LIBERATION = of("liberation")

                @JvmField val VERDANA = of("verdana")

                @JvmStatic fun of(value: String) = FontName(JsonField.of(value))
            }

            /** An enum containing [FontName]'s known values. */
            enum class Known {
                EMPTY,
                ARIAL,
                COURIER,
                HELVETICA,
                LIBERATION,
                VERDANA,
            }

            /**
             * An enum containing [FontName]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FontName] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EMPTY,
                ARIAL,
                COURIER,
                HELVETICA,
                LIBERATION,
                VERDANA,
                /**
                 * An enum member indicating that [FontName] was instantiated with an unknown value.
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
                    EMPTY -> Value.EMPTY
                    ARIAL -> Value.ARIAL
                    COURIER -> Value.COURIER
                    HELVETICA -> Value.HELVETICA
                    LIBERATION -> Value.LIBERATION
                    VERDANA -> Value.VERDANA
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LegalesignInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    EMPTY -> Known.EMPTY
                    ARIAL -> Known.ARIAL
                    COURIER -> Known.COURIER
                    HELVETICA -> Known.HELVETICA
                    LIBERATION -> Known.LIBERATION
                    VERDANA -> Known.VERDANA
                    else -> throw LegalesignInvalidDataException("Unknown FontName: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LegalesignInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LegalesignInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): FontName = apply {
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
                } catch (e: LegalesignInvalidDataException) {
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

                return other is FontName && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * offers options for more advanced forms 1 = One of a set of field - radio group 2 = Sum a
         * set of fields 3 = Conditional upon another field
         */
        class LogicAction @JsonCreator private constructor(private val value: JsonField<Long>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

            companion object {

                @JvmField val _1 = of(1L)

                @JvmField val _2 = of(2L)

                @JvmField val _3 = of(3L)

                @JvmStatic fun of(value: Long) = LogicAction(JsonField.of(value))
            }

            /** An enum containing [LogicAction]'s known values. */
            enum class Known {
                _1,
                _2,
                _3,
            }

            /**
             * An enum containing [LogicAction]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LogicAction] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                _1,
                _2,
                _3,
                /**
                 * An enum member indicating that [LogicAction] was instantiated with an unknown
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
                    _1 -> Value._1
                    _2 -> Value._2
                    _3 -> Value._3
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LegalesignInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    _1 -> Known._1
                    _2 -> Known._2
                    _3 -> Known._3
                    else -> throw LegalesignInvalidDataException("Unknown LogicAction: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * @throws LegalesignInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asLong(): Long =
                _value().asNumber().getOrNull()?.let {
                    if (it.toDouble() % 1 == 0.0) it.toLong() else null
                } ?: throw LegalesignInvalidDataException("Value is not a Long")

            private var validated: Boolean = false

            fun validate(): LogicAction = apply {
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
                } catch (e: LegalesignInvalidDataException) {
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

                return other is LogicAction && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                ax == other.ax &&
                ay == other.ay &&
                bx == other.bx &&
                by == other.by &&
                elementType == other.elementType &&
                page == other.page &&
                signer == other.signer &&
                align == other.align &&
                fieldorder == other.fieldorder &&
                fontName == other.fontName &&
                fontSize == other.fontSize &&
                hideBorder == other.hideBorder &&
                label == other.label &&
                labelExtra == other.labelExtra &&
                logicAction == other.logicAction &&
                logicGroup == other.logicGroup &&
                mapTo == other.mapTo &&
                optional == other.optional &&
                options == other.options &&
                substantive == other.substantive &&
                validation == other.validation &&
                value == other.value
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                ax,
                ay,
                bx,
                by,
                elementType,
                page,
                signer,
                align,
                fieldorder,
                fontName,
                fontSize,
                hideBorder,
                label,
                labelExtra,
                logicAction,
                logicGroup,
                mapTo,
                optional,
                options,
                substantive,
                validation,
                value,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{ax=$ax, ay=$ay, bx=$bx, by=$by, elementType=$elementType, page=$page, signer=$signer, align=$align, fieldorder=$fieldorder, fontName=$fontName, fontSize=$fontSize, hideBorder=$hideBorder, label=$label, labelExtra=$labelExtra, logicAction=$logicAction, logicGroup=$logicGroup, mapTo=$mapTo, optional=$optional, options=$options, substantive=$substantive, validation=$validation, value=$value}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FieldCreateParams &&
            pdfId == other.pdfId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pdfId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FieldCreateParams{pdfId=$pdfId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
