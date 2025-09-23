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
import com.legalesign_sdk.api.errors.LegalesignSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DocumentGetFieldsResponse
private constructor(
    private val elementType: JsonField<ElementType>,
    private val fieldorder: JsonField<Long>,
    private val label: JsonField<String>,
    private val labelExtra: JsonField<String>,
    private val signer: JsonField<Long>,
    private val state: JsonField<Boolean>,
    private val validation: JsonField<PdfFieldValidationEnum>,
    private val value: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("element_type")
        @ExcludeMissing
        elementType: JsonField<ElementType> = JsonMissing.of(),
        @JsonProperty("fieldorder") @ExcludeMissing fieldorder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label_extra")
        @ExcludeMissing
        labelExtra: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signer") @ExcludeMissing signer: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("validation")
        @ExcludeMissing
        validation: JsonField<PdfFieldValidationEnum> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
    ) : this(
        elementType,
        fieldorder,
        label,
        labelExtra,
        signer,
        state,
        validation,
        value,
        mutableMapOf(),
    )

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun elementType(): Optional<ElementType> = elementType.getOptional("element_type")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fieldorder(): Optional<Long> = fieldorder.getOptional("fieldorder")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun labelExtra(): Optional<String> = labelExtra.getOptional("label_extra")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signer(): Optional<Long> = signer.getOptional("signer")

    /**
     * if saved by signer
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun state(): Optional<Boolean> = state.getOptional("state")

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
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun validation(): Optional<PdfFieldValidationEnum> = validation.getOptional("validation")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun value(): Optional<String> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [elementType].
     *
     * Unlike [elementType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("element_type")
    @ExcludeMissing
    fun _elementType(): JsonField<ElementType> = elementType

    /**
     * Returns the raw JSON value of [fieldorder].
     *
     * Unlike [fieldorder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fieldorder") @ExcludeMissing fun _fieldorder(): JsonField<Long> = fieldorder

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
    @JsonProperty("label_extra") @ExcludeMissing fun _labelExtra(): JsonField<String> = labelExtra

    /**
     * Returns the raw JSON value of [signer].
     *
     * Unlike [signer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signer") @ExcludeMissing fun _signer(): JsonField<Long> = signer

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<Boolean> = state

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
         * Returns a mutable builder for constructing an instance of [DocumentGetFieldsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentGetFieldsResponse]. */
    class Builder internal constructor() {

        private var elementType: JsonField<ElementType> = JsonMissing.of()
        private var fieldorder: JsonField<Long> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var labelExtra: JsonField<String> = JsonMissing.of()
        private var signer: JsonField<Long> = JsonMissing.of()
        private var state: JsonField<Boolean> = JsonMissing.of()
        private var validation: JsonField<PdfFieldValidationEnum> = JsonMissing.of()
        private var value: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentGetFieldsResponse: DocumentGetFieldsResponse) = apply {
            elementType = documentGetFieldsResponse.elementType
            fieldorder = documentGetFieldsResponse.fieldorder
            label = documentGetFieldsResponse.label
            labelExtra = documentGetFieldsResponse.labelExtra
            signer = documentGetFieldsResponse.signer
            state = documentGetFieldsResponse.state
            validation = documentGetFieldsResponse.validation
            value = documentGetFieldsResponse.value
            additionalProperties = documentGetFieldsResponse.additionalProperties.toMutableMap()
        }

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

        fun fieldorder(fieldorder: Long?) = fieldorder(JsonField.ofNullable(fieldorder))

        /**
         * Alias for [Builder.fieldorder].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun fieldorder(fieldorder: Long) = fieldorder(fieldorder as Long?)

        /** Alias for calling [Builder.fieldorder] with `fieldorder.orElse(null)`. */
        fun fieldorder(fieldorder: Optional<Long>) = fieldorder(fieldorder.getOrNull())

        /**
         * Sets [Builder.fieldorder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldorder] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fieldorder(fieldorder: JsonField<Long>) = apply { this.fieldorder = fieldorder }

        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        fun labelExtra(labelExtra: String?) = labelExtra(JsonField.ofNullable(labelExtra))

        /** Alias for calling [Builder.labelExtra] with `labelExtra.orElse(null)`. */
        fun labelExtra(labelExtra: Optional<String>) = labelExtra(labelExtra.getOrNull())

        /**
         * Sets [Builder.labelExtra] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labelExtra] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun labelExtra(labelExtra: JsonField<String>) = apply { this.labelExtra = labelExtra }

        fun signer(signer: Long) = signer(JsonField.of(signer))

        /**
         * Sets [Builder.signer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signer] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun signer(signer: JsonField<Long>) = apply { this.signer = signer }

        /** if saved by signer */
        fun state(state: Boolean) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<Boolean>) = apply { this.state = state }

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
         * You should usually call [Builder.validation] with a well-typed [PdfFieldValidationEnum]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun validation(validation: JsonField<PdfFieldValidationEnum>) = apply {
            this.validation = validation
        }

        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [DocumentGetFieldsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocumentGetFieldsResponse =
            DocumentGetFieldsResponse(
                elementType,
                fieldorder,
                label,
                labelExtra,
                signer,
                state,
                validation,
                value,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DocumentGetFieldsResponse = apply {
        if (validated) {
            return@apply
        }

        elementType().ifPresent { it.validate() }
        fieldorder()
        label()
        labelExtra()
        signer()
        state()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (elementType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fieldorder.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (labelExtra.asKnown().isPresent) 1 else 0) +
            (if (signer.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (validation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (value.asKnown().isPresent) 1 else 0)

    class ElementType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SIGNATURE = of("signature")

            @JvmField val INITIALS = of("initials")

            @JvmField val ADMIN = of("admin")

            @JvmField val TEXT = of("text")

            @JvmStatic fun of(value: String) = ElementType(JsonField.of(value))
        }

        /** An enum containing [ElementType]'s known values. */
        enum class Known {
            SIGNATURE,
            INITIALS,
            ADMIN,
            TEXT,
        }

        /**
         * An enum containing [ElementType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ElementType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SIGNATURE,
            INITIALS,
            ADMIN,
            TEXT,
            /**
             * An enum member indicating that [ElementType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SIGNATURE -> Value.SIGNATURE
                INITIALS -> Value.INITIALS
                ADMIN -> Value.ADMIN
                TEXT -> Value.TEXT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LegalesignSdkInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SIGNATURE -> Known.SIGNATURE
                INITIALS -> Known.INITIALS
                ADMIN -> Known.ADMIN
                TEXT -> Known.TEXT
                else -> throw LegalesignSdkInvalidDataException("Unknown ElementType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LegalesignSdkInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentGetFieldsResponse &&
            elementType == other.elementType &&
            fieldorder == other.fieldorder &&
            label == other.label &&
            labelExtra == other.labelExtra &&
            signer == other.signer &&
            state == other.state &&
            validation == other.validation &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            elementType,
            fieldorder,
            label,
            labelExtra,
            signer,
            state,
            validation,
            value,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentGetFieldsResponse{elementType=$elementType, fieldorder=$fieldorder, label=$label, labelExtra=$labelExtra, signer=$signer, state=$state, validation=$validation, value=$value, additionalProperties=$additionalProperties}"
}
