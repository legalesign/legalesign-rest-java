// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.templatepdf.fields

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
import com.legalesign_sdk.api.core.checkRequired
import com.legalesign_sdk.api.core.toImmutable
import com.legalesign_sdk.api.errors.LegalesignSdkInvalidDataException
import com.legalesign_sdk.api.models.document.ListMeta
import com.legalesign_sdk.api.models.document.PdfFieldValidationEnum
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FieldListResponse
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

        /** Returns a mutable builder for constructing an instance of [FieldListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FieldListResponse]. */
    class Builder internal constructor() {

        private var meta: JsonField<ListMeta> = JsonMissing.of()
        private var objects: JsonField<MutableList<Object>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fieldListResponse: FieldListResponse) = apply {
            meta = fieldListResponse.meta
            objects = fieldListResponse.objects.map { it.toMutableList() }
            additionalProperties = fieldListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [FieldListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FieldListResponse =
            FieldListResponse(
                meta,
                (objects ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FieldListResponse = apply {
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
        private val ax: JsonField<Float>,
        private val ay: JsonField<Float>,
        private val bx: JsonField<Float>,
        private val by: JsonField<Float>,
        private val elementType: JsonField<ElementType>,
        private val page: JsonField<Int>,
        private val signer: JsonField<Int>,
        private val align: JsonField<Align>,
        private val fieldorder: JsonField<Int>,
        private val fontName: JsonField<FontName>,
        private val fontSize: JsonField<Long>,
        private val hideBorder: JsonField<Boolean>,
        private val label: JsonField<String>,
        private val labelExtra: JsonField<String>,
        private val logicAction: JsonField<LogicAction>,
        private val logicGroup: JsonField<String>,
        private val mapTo: JsonField<String>,
        private val optional: JsonField<Boolean>,
        private val options: JsonField<String>,
        private val substantive: JsonField<Boolean>,
        private val validation: JsonField<PdfFieldValidationEnum>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ax") @ExcludeMissing ax: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("ay") @ExcludeMissing ay: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("bx") @ExcludeMissing bx: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("by") @ExcludeMissing by: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("element_type")
            @ExcludeMissing
            elementType: JsonField<ElementType> = JsonMissing.of(),
            @JsonProperty("page") @ExcludeMissing page: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("signer") @ExcludeMissing signer: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("align") @ExcludeMissing align: JsonField<Align> = JsonMissing.of(),
            @JsonProperty("fieldorder")
            @ExcludeMissing
            fieldorder: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("font_name")
            @ExcludeMissing
            fontName: JsonField<FontName> = JsonMissing.of(),
            @JsonProperty("font_size") @ExcludeMissing fontSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("hide_border")
            @ExcludeMissing
            hideBorder: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
            @JsonProperty("label_extra")
            @ExcludeMissing
            labelExtra: JsonField<String> = JsonMissing.of(),
            @JsonProperty("logic_action")
            @ExcludeMissing
            logicAction: JsonField<LogicAction> = JsonMissing.of(),
            @JsonProperty("logic_group")
            @ExcludeMissing
            logicGroup: JsonField<String> = JsonMissing.of(),
            @JsonProperty("map_to") @ExcludeMissing mapTo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("optional")
            @ExcludeMissing
            optional: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("options") @ExcludeMissing options: JsonField<String> = JsonMissing.of(),
            @JsonProperty("substantive")
            @ExcludeMissing
            substantive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("validation")
            @ExcludeMissing
            validation: JsonField<PdfFieldValidationEnum> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(
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
            mutableMapOf(),
        )

        /**
         * left vertical, 0 = left page edge, 1 = right page edge
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ax(): Float = ax.getRequired("ax")

        /**
         * upper horizontal, 0 = top page edge, 1 = bottom page edge
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ay(): Float = ay.getRequired("ay")

        /**
         * right vertical, 0 = left page edge, 1 = right page edge
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bx(): Float = bx.getRequired("bx")

        /**
         * lower horizontal. 0 = top page edge, 1 = bottom page edge
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun by(): Float = by.getRequired("by")

        /**
         * Must be one of the following: * signature - signature field * initials - initials field *
         * text - signer field (field for signer to complete) * admin - sender field (field to
         * complete by admin user when sending)
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun elementType(): ElementType = elementType.getRequired("element_type")

        /**
         * which page to place field on
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun page(): Int = page.getRequired("page")

        /**
         * 1-Index number for signer (witness+100) (approver+200). Null if sender field.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun signer(): Optional<Int> = signer.getOptional("signer")

        /**
         * one of the following:
         * * 1 - left
         * * 2 - middle
         * * 3 - right
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun align(): Optional<Align> = align.getOptional("align")

        /**
         * order signer progresses through fields, top-down if blank
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fieldorder(): Optional<Int> = fieldorder.getOptional("fieldorder")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fontName(): Optional<FontName> = fontName.getOptional("font_name")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fontSize(): Optional<Long> = fontSize.getOptional("font_size")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun hideBorder(): Optional<Boolean> = hideBorder.getOptional("hide_border")

        /**
         * help signer/sender understand what to do
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun label(): Optional<String> = label.getOptional("label")

        /**
         * not in use
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun labelExtra(): Optional<String> = labelExtra.getOptional("label_extra")

        /**
         * offers options for more advanced forms 1 = One of a set of field (radio group), 2 = Sum a
         * set of fields, 3 = Conditional upon another field
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun logicAction(): Optional<LogicAction> = logicAction.getOptional("logic_action")

        /**
         * values to enable a given logic_action in the form
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun logicGroup(): Optional<String> = logicGroup.getOptional("logic_group")

        /**
         * custom data for form integrations
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun mapTo(): Optional<String> = mapTo.getOptional("map_to")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun optional(): Optional<Boolean> = optional.getOptional("optional")

        /**
         * user for certain validation types
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun options(): Optional<String> = options.getOptional("options")

        /**
         * Set if field substantive to contract terms, if so will not let others sign till this
         * field completed
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun substantive(): Optional<Boolean> = substantive.getOptional("substantive")

        /**
         * fields types and validations:
         * * 1 - Email
         * * 2 - yyyy/mm/dd
         * * 3 - yy/mm/dd
         * * 4 - dd/mm/yyyy
         * * 5 - dd/mm/yy
         * * 6 - mm/dd/yy
         * * 7 - mm/dd/yy
         * * 8 - yyyy.mm.dd
         * * 9 - yy.mm.dd
         * * 10 - dd.mm.yyyy
         * * 11 - dd.mm.yy
         * * 12 - mm.dd.yyyy
         * * 13 - mm.dd.yy
         * * 14 - yyyy-mm-dd
         * * 15 - yy-mm-dd
         * * 16 - dd-mm-yyyy
         * * 17 - dd-mm-yy
         * * 18 - mm-dd-yyyy
         * * 19 - mm-dd-yy
         * * 20 - Dropdown list, use options attribute for items
         * * 24 - Checkbox tick/cross
         * * 25 - Checkbox tick/blank
         * * 26 - Checkbox cross/blank
         * * 30 - yyyy/mm/dd (automatic)
         * * 31 - yy/mm/dd (automatic)
         * * 32 - dd/yy/yyyy (automatic)
         * * 33 - dd/mm/yy (automatic)
         * * 34 - mm/dd/yyyy (automatic)
         * * 35 - mm/dd/yy (automatic)
         * * 36 - yyyy.mm.dd (automatic)
         * * 37 - yy.mm.dd (automatic)
         * * 38 - dd.mm.yyyy (automatic)
         * * 39 - dd.mm.yy (automatic)
         * * 40 - mm.dd.yyyy (automatic)
         * * 41 - mm.dd.yy (automatic)
         * * 42 - yyyy-mm-dd (automatic)
         * * 43 - yy-mm-dd (automatic)
         * * 44 - dd-mm-yyyy (automatic)
         * * 45 - dd-mm-yy (automatic)
         * * 46 - mm-dd-yyyy (automatic)
         * * 47 - mm-dd-yy (automatic)
         * * 48 - d mmmmm yyyy (automatic)
         * * 50 - Whole number
         * * 51 - Number
         * * 52 - Currency (2 decimals)
         * * 53 - 1 number
         * * 54 - 2 numbers
         * * 55 - 3 numbers
         * * 56 - 4 numbers
         * * 57 - 5 numbers
         * * 58 - 6 numbers
         * * 59 - 7 numbers
         * * 60 - 8 numbers
         * * 61 - 9 numbers
         * * 62 - 10 numbers
         * * 63 - 11 numbers
         * * 64 - 12 numbers
         * * 65 - 1 characters (any text)
         * * 66 - 2 characters (any text)
         * * 67 - 3 characters (any text)
         * * 68 - 4 characters (any text)
         * * 69 - 5 characters (any text)
         * * 70 - 6 characters (any text)
         * * 71 - 7 characters (any text)
         * * 72 - 8 characters (any text)
         * * 73 - secret code, add code in options
         * * 74 - file attach, append to email to signer
         * * 75 - file attach, append to final PDF
         * * 76 - file attach, zip with final PDF for internal use, but not signer
         * * 77 - force to title caps
         * * 78 - force to uppercase
         * * 79 - force to lowercase
         * * 80 - mm/yy
         * * 81 - mm/yyyy
         * * 82 - mm.yy
         * * 83 - mm.yyyy
         * * 84 - mm-yy
         * * 85 - mm-yyyy
         * * 90 - drawn field
         * * 91 - countries list
         * * 92 - honorifics list
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun validation(): Optional<PdfFieldValidationEnum> = validation.getOptional("validation")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
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
        @JsonProperty("font_size") @ExcludeMissing fun _fontSize(): JsonField<Long> = fontSize

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
        @Deprecated("deprecated")
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
             * Returns a mutable builder for constructing an instance of [Object].
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

        /** A builder for [Object]. */
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
            private var fontSize: JsonField<Long> = JsonMissing.of()
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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(object_: Object) = apply {
                ax = object_.ax
                ay = object_.ay
                bx = object_.bx
                by = object_.by
                elementType = object_.elementType
                page = object_.page
                signer = object_.signer
                align = object_.align
                fieldorder = object_.fieldorder
                fontName = object_.fontName
                fontSize = object_.fontSize
                hideBorder = object_.hideBorder
                label = object_.label
                labelExtra = object_.labelExtra
                logicAction = object_.logicAction
                logicGroup = object_.logicGroup
                mapTo = object_.mapTo
                optional = object_.optional
                options = object_.options
                substantive = object_.substantive
                validation = object_.validation
                value = object_.value
                additionalProperties = object_.additionalProperties.toMutableMap()
            }

            /** left vertical, 0 = left page edge, 1 = right page edge */
            fun ax(ax: Float) = ax(JsonField.of(ax))

            /**
             * Sets [Builder.ax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ax] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ax(ax: JsonField<Float>) = apply { this.ax = ax }

            /** upper horizontal, 0 = top page edge, 1 = bottom page edge */
            fun ay(ay: Float) = ay(JsonField.of(ay))

            /**
             * Sets [Builder.ay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ay] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ay(ay: JsonField<Float>) = apply { this.ay = ay }

            /** right vertical, 0 = left page edge, 1 = right page edge */
            fun bx(bx: Float) = bx(JsonField.of(bx))

            /**
             * Sets [Builder.bx] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bx] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun bx(bx: JsonField<Float>) = apply { this.bx = bx }

            /** lower horizontal. 0 = top page edge, 1 = bottom page edge */
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
             * Must be one of the following: * signature - signature field * initials - initials
             * field * text - signer field (field for signer to complete) * admin - sender field
             * (field to complete by admin user when sending)
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

            /** 1-Index number for signer (witness+100) (approver+200). Null if sender field. */
            fun signer(signer: Int?) = signer(JsonField.ofNullable(signer))

            /**
             * Alias for [Builder.signer].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun signer(signer: Int) = signer(signer as Int?)

            /** Alias for calling [Builder.signer] with `signer.orElse(null)`. */
            fun signer(signer: Optional<Int>) = signer(signer.getOrNull())

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
             * * 1 - left
             * * 2 - middle
             * * 3 - right
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

            /** order signer progresses through fields, top-down if blank */
            fun fieldorder(fieldorder: Int) = fieldorder(JsonField.of(fieldorder))

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

            fun fontSize(fontSize: Long) = fontSize(JsonField.of(fontSize))

            /**
             * Sets [Builder.fontSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fontSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fontSize(fontSize: JsonField<Long>) = apply { this.fontSize = fontSize }

            fun hideBorder(hideBorder: Boolean) = hideBorder(JsonField.of(hideBorder))

            /**
             * Sets [Builder.hideBorder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hideBorder] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hideBorder(hideBorder: JsonField<Boolean>) = apply { this.hideBorder = hideBorder }

            /** help signer/sender understand what to do */
            fun label(label: String) = label(JsonField.of(label))

            /**
             * Sets [Builder.label] to an arbitrary JSON value.
             *
             * You should usually call [Builder.label] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun label(label: JsonField<String>) = apply { this.label = label }

            /** not in use */
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
             * offers options for more advanced forms 1 = One of a set of field (radio group), 2 =
             * Sum a set of fields, 3 = Conditional upon another field
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

            fun optional(optional: Boolean) = optional(JsonField.of(optional))

            /**
             * Sets [Builder.optional] to an arbitrary JSON value.
             *
             * You should usually call [Builder.optional] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun optional(optional: JsonField<Boolean>) = apply { this.optional = optional }

            /** user for certain validation types */
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
             * Set if field substantive to contract terms, if so will not let others sign till this
             * field completed
             */
            @Deprecated("deprecated")
            fun substantive(substantive: Boolean) = substantive(JsonField.of(substantive))

            /**
             * Sets [Builder.substantive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.substantive] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun substantive(substantive: JsonField<Boolean>) = apply {
                this.substantive = substantive
            }

            /**
             * fields types and validations:
             * * 1 - Email
             * * 2 - yyyy/mm/dd
             * * 3 - yy/mm/dd
             * * 4 - dd/mm/yyyy
             * * 5 - dd/mm/yy
             * * 6 - mm/dd/yy
             * * 7 - mm/dd/yy
             * * 8 - yyyy.mm.dd
             * * 9 - yy.mm.dd
             * * 10 - dd.mm.yyyy
             * * 11 - dd.mm.yy
             * * 12 - mm.dd.yyyy
             * * 13 - mm.dd.yy
             * * 14 - yyyy-mm-dd
             * * 15 - yy-mm-dd
             * * 16 - dd-mm-yyyy
             * * 17 - dd-mm-yy
             * * 18 - mm-dd-yyyy
             * * 19 - mm-dd-yy
             * * 20 - Dropdown list, use options attribute for items
             * * 24 - Checkbox tick/cross
             * * 25 - Checkbox tick/blank
             * * 26 - Checkbox cross/blank
             * * 30 - yyyy/mm/dd (automatic)
             * * 31 - yy/mm/dd (automatic)
             * * 32 - dd/yy/yyyy (automatic)
             * * 33 - dd/mm/yy (automatic)
             * * 34 - mm/dd/yyyy (automatic)
             * * 35 - mm/dd/yy (automatic)
             * * 36 - yyyy.mm.dd (automatic)
             * * 37 - yy.mm.dd (automatic)
             * * 38 - dd.mm.yyyy (automatic)
             * * 39 - dd.mm.yy (automatic)
             * * 40 - mm.dd.yyyy (automatic)
             * * 41 - mm.dd.yy (automatic)
             * * 42 - yyyy-mm-dd (automatic)
             * * 43 - yy-mm-dd (automatic)
             * * 44 - dd-mm-yyyy (automatic)
             * * 45 - dd-mm-yy (automatic)
             * * 46 - mm-dd-yyyy (automatic)
             * * 47 - mm-dd-yy (automatic)
             * * 48 - d mmmmm yyyy (automatic)
             * * 50 - Whole number
             * * 51 - Number
             * * 52 - Currency (2 decimals)
             * * 53 - 1 number
             * * 54 - 2 numbers
             * * 55 - 3 numbers
             * * 56 - 4 numbers
             * * 57 - 5 numbers
             * * 58 - 6 numbers
             * * 59 - 7 numbers
             * * 60 - 8 numbers
             * * 61 - 9 numbers
             * * 62 - 10 numbers
             * * 63 - 11 numbers
             * * 64 - 12 numbers
             * * 65 - 1 characters (any text)
             * * 66 - 2 characters (any text)
             * * 67 - 3 characters (any text)
             * * 68 - 4 characters (any text)
             * * 69 - 5 characters (any text)
             * * 70 - 6 characters (any text)
             * * 71 - 7 characters (any text)
             * * 72 - 8 characters (any text)
             * * 73 - secret code, add code in options
             * * 74 - file attach, append to email to signer
             * * 75 - file attach, append to final PDF
             * * 76 - file attach, zip with final PDF for internal use, but not signer
             * * 77 - force to title caps
             * * 78 - force to uppercase
             * * 79 - force to lowercase
             * * 80 - mm/yy
             * * 81 - mm/yyyy
             * * 82 - mm.yy
             * * 83 - mm.yyyy
             * * 84 - mm-yy
             * * 85 - mm-yyyy
             * * 90 - drawn field
             * * 91 - countries list
             * * 92 - honorifics list
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
            fun build(): Object =
                Object(
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
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Object = apply {
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
         * Must be one of the following: * signature - signature field * initials - initials field *
         * text - signer field (field for signer to complete) * admin - sender field (field to
         * complete by admin user when sending)
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
             * @throws LegalesignSdkInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    SIGNATURE -> Known.SIGNATURE
                    INITIALS -> Known.INITIALS
                    TEXT -> Known.TEXT
                    ADMIN -> Known.ADMIN
                    else -> throw LegalesignSdkInvalidDataException("Unknown ElementType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LegalesignSdkInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LegalesignSdkInvalidDataException("Value is not a String")
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

                return other is ElementType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * one of the following:
         * * 1 - left
         * * 2 - middle
         * * 3 - right
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
             * @throws LegalesignSdkInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    _1 -> Known._1
                    _2 -> Known._2
                    _3 -> Known._3
                    else -> throw LegalesignSdkInvalidDataException("Unknown Align: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * @throws LegalesignSdkInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asLong(): Long =
                _value().asNumber().getOrNull()?.let {
                    if (it.toDouble() % 1 == 0.0) it.toLong() else null
                } ?: throw LegalesignSdkInvalidDataException("Value is not a Long")

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
             * @throws LegalesignSdkInvalidDataException if this class instance's value is a not a
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
                    else -> throw LegalesignSdkInvalidDataException("Unknown FontName: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LegalesignSdkInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LegalesignSdkInvalidDataException("Value is not a String")
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

                return other is FontName && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * offers options for more advanced forms 1 = One of a set of field (radio group), 2 = Sum a
         * set of fields, 3 = Conditional upon another field
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
             * @throws LegalesignSdkInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    _1 -> Known._1
                    _2 -> Known._2
                    _3 -> Known._3
                    else -> throw LegalesignSdkInvalidDataException("Unknown LogicAction: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * @throws LegalesignSdkInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asLong(): Long =
                _value().asNumber().getOrNull()?.let {
                    if (it.toDouble() % 1 == 0.0) it.toLong() else null
                } ?: throw LegalesignSdkInvalidDataException("Value is not a Long")

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

                return other is LogicAction && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Object &&
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
                value == other.value &&
                additionalProperties == other.additionalProperties
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
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Object{ax=$ax, ay=$ay, bx=$bx, by=$by, elementType=$elementType, page=$page, signer=$signer, align=$align, fieldorder=$fieldorder, fontName=$fontName, fontSize=$fontSize, hideBorder=$hideBorder, label=$label, labelExtra=$labelExtra, logicAction=$logicAction, logicGroup=$logicGroup, mapTo=$mapTo, optional=$optional, options=$options, substantive=$substantive, validation=$validation, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FieldListResponse &&
            meta == other.meta &&
            objects == other.objects &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(meta, objects, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FieldListResponse{meta=$meta, objects=$objects, additionalProperties=$additionalProperties}"
}
