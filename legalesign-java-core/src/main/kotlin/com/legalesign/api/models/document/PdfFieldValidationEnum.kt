// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.document

import com.fasterxml.jackson.annotation.JsonCreator
import com.legalesign.api.core.Enum
import com.legalesign.api.core.JsonField
import com.legalesign.api.errors.LegalesignInvalidDataException
import kotlin.jvm.optionals.getOrNull

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
class PdfFieldValidationEnum @JsonCreator private constructor(private val value: JsonField<Long>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

    companion object {

        @JvmField val _1 = of(1L)

        @JvmField val _2 = of(2L)

        @JvmField val _3 = of(3L)

        @JvmField val _4 = of(4L)

        @JvmField val _5 = of(5L)

        @JvmField val _6 = of(6L)

        @JvmField val _7 = of(7L)

        @JvmField val _8 = of(8L)

        @JvmField val _9 = of(9L)

        @JvmField val _10 = of(10L)

        @JvmField val _11 = of(11L)

        @JvmField val _12 = of(12L)

        @JvmField val _13 = of(13L)

        @JvmField val _14 = of(14L)

        @JvmField val _15 = of(15L)

        @JvmField val _16 = of(16L)

        @JvmField val _17 = of(17L)

        @JvmField val _18 = of(18L)

        @JvmField val _19 = of(19L)

        @JvmField val _20 = of(20L)

        @JvmField val _24 = of(24L)

        @JvmField val _25 = of(25L)

        @JvmField val _26 = of(26L)

        @JvmField val _30 = of(30L)

        @JvmField val _31 = of(31L)

        @JvmField val _32 = of(32L)

        @JvmField val _33 = of(33L)

        @JvmField val _34 = of(34L)

        @JvmField val _35 = of(35L)

        @JvmField val _36 = of(36L)

        @JvmField val _37 = of(37L)

        @JvmField val _38 = of(38L)

        @JvmField val _39 = of(39L)

        @JvmField val _40 = of(40L)

        @JvmField val _41 = of(41L)

        @JvmField val _42 = of(42L)

        @JvmField val _43 = of(43L)

        @JvmField val _44 = of(44L)

        @JvmField val _45 = of(45L)

        @JvmField val _46 = of(46L)

        @JvmField val _47 = of(47L)

        @JvmField val _48 = of(48L)

        @JvmField val _50 = of(50L)

        @JvmField val _51 = of(51L)

        @JvmField val _52 = of(52L)

        @JvmField val _53 = of(53L)

        @JvmField val _54 = of(54L)

        @JvmField val _55 = of(55L)

        @JvmField val _56 = of(56L)

        @JvmField val _57 = of(57L)

        @JvmField val _58 = of(58L)

        @JvmField val _59 = of(59L)

        @JvmField val _60 = of(60L)

        @JvmField val _61 = of(61L)

        @JvmField val _62 = of(62L)

        @JvmField val _63 = of(63L)

        @JvmField val _64 = of(64L)

        @JvmField val _65 = of(65L)

        @JvmField val _66 = of(66L)

        @JvmField val _67 = of(67L)

        @JvmField val _68 = of(68L)

        @JvmField val _69 = of(69L)

        @JvmField val _70 = of(70L)

        @JvmField val _71 = of(71L)

        @JvmField val _72 = of(72L)

        @JvmField val _73 = of(73L)

        @JvmField val _74 = of(74L)

        @JvmField val _75 = of(75L)

        @JvmField val _76 = of(76L)

        @JvmField val _77 = of(77L)

        @JvmField val _78 = of(78L)

        @JvmField val _79 = of(79L)

        @JvmField val _80 = of(80L)

        @JvmField val _81 = of(81L)

        @JvmField val _82 = of(82L)

        @JvmField val _83 = of(83L)

        @JvmField val _84 = of(84L)

        @JvmField val _85 = of(85L)

        @JvmField val _90 = of(90L)

        @JvmField val _91 = of(91L)

        @JvmField val _92 = of(92L)

        @JvmStatic fun of(value: Long) = PdfFieldValidationEnum(JsonField.of(value))
    }

    /** An enum containing [PdfFieldValidationEnum]'s known values. */
    enum class Known {
        _1,
        _2,
        _3,
        _4,
        _5,
        _6,
        _7,
        _8,
        _9,
        _10,
        _11,
        _12,
        _13,
        _14,
        _15,
        _16,
        _17,
        _18,
        _19,
        _20,
        _24,
        _25,
        _26,
        _30,
        _31,
        _32,
        _33,
        _34,
        _35,
        _36,
        _37,
        _38,
        _39,
        _40,
        _41,
        _42,
        _43,
        _44,
        _45,
        _46,
        _47,
        _48,
        _50,
        _51,
        _52,
        _53,
        _54,
        _55,
        _56,
        _57,
        _58,
        _59,
        _60,
        _61,
        _62,
        _63,
        _64,
        _65,
        _66,
        _67,
        _68,
        _69,
        _70,
        _71,
        _72,
        _73,
        _74,
        _75,
        _76,
        _77,
        _78,
        _79,
        _80,
        _81,
        _82,
        _83,
        _84,
        _85,
        _90,
        _91,
        _92,
    }

    /**
     * An enum containing [PdfFieldValidationEnum]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [PdfFieldValidationEnum] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        _1,
        _2,
        _3,
        _4,
        _5,
        _6,
        _7,
        _8,
        _9,
        _10,
        _11,
        _12,
        _13,
        _14,
        _15,
        _16,
        _17,
        _18,
        _19,
        _20,
        _24,
        _25,
        _26,
        _30,
        _31,
        _32,
        _33,
        _34,
        _35,
        _36,
        _37,
        _38,
        _39,
        _40,
        _41,
        _42,
        _43,
        _44,
        _45,
        _46,
        _47,
        _48,
        _50,
        _51,
        _52,
        _53,
        _54,
        _55,
        _56,
        _57,
        _58,
        _59,
        _60,
        _61,
        _62,
        _63,
        _64,
        _65,
        _66,
        _67,
        _68,
        _69,
        _70,
        _71,
        _72,
        _73,
        _74,
        _75,
        _76,
        _77,
        _78,
        _79,
        _80,
        _81,
        _82,
        _83,
        _84,
        _85,
        _90,
        _91,
        _92,
        /**
         * An enum member indicating that [PdfFieldValidationEnum] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            _1 -> Value._1
            _2 -> Value._2
            _3 -> Value._3
            _4 -> Value._4
            _5 -> Value._5
            _6 -> Value._6
            _7 -> Value._7
            _8 -> Value._8
            _9 -> Value._9
            _10 -> Value._10
            _11 -> Value._11
            _12 -> Value._12
            _13 -> Value._13
            _14 -> Value._14
            _15 -> Value._15
            _16 -> Value._16
            _17 -> Value._17
            _18 -> Value._18
            _19 -> Value._19
            _20 -> Value._20
            _24 -> Value._24
            _25 -> Value._25
            _26 -> Value._26
            _30 -> Value._30
            _31 -> Value._31
            _32 -> Value._32
            _33 -> Value._33
            _34 -> Value._34
            _35 -> Value._35
            _36 -> Value._36
            _37 -> Value._37
            _38 -> Value._38
            _39 -> Value._39
            _40 -> Value._40
            _41 -> Value._41
            _42 -> Value._42
            _43 -> Value._43
            _44 -> Value._44
            _45 -> Value._45
            _46 -> Value._46
            _47 -> Value._47
            _48 -> Value._48
            _50 -> Value._50
            _51 -> Value._51
            _52 -> Value._52
            _53 -> Value._53
            _54 -> Value._54
            _55 -> Value._55
            _56 -> Value._56
            _57 -> Value._57
            _58 -> Value._58
            _59 -> Value._59
            _60 -> Value._60
            _61 -> Value._61
            _62 -> Value._62
            _63 -> Value._63
            _64 -> Value._64
            _65 -> Value._65
            _66 -> Value._66
            _67 -> Value._67
            _68 -> Value._68
            _69 -> Value._69
            _70 -> Value._70
            _71 -> Value._71
            _72 -> Value._72
            _73 -> Value._73
            _74 -> Value._74
            _75 -> Value._75
            _76 -> Value._76
            _77 -> Value._77
            _78 -> Value._78
            _79 -> Value._79
            _80 -> Value._80
            _81 -> Value._81
            _82 -> Value._82
            _83 -> Value._83
            _84 -> Value._84
            _85 -> Value._85
            _90 -> Value._90
            _91 -> Value._91
            _92 -> Value._92
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LegalesignInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            _1 -> Known._1
            _2 -> Known._2
            _3 -> Known._3
            _4 -> Known._4
            _5 -> Known._5
            _6 -> Known._6
            _7 -> Known._7
            _8 -> Known._8
            _9 -> Known._9
            _10 -> Known._10
            _11 -> Known._11
            _12 -> Known._12
            _13 -> Known._13
            _14 -> Known._14
            _15 -> Known._15
            _16 -> Known._16
            _17 -> Known._17
            _18 -> Known._18
            _19 -> Known._19
            _20 -> Known._20
            _24 -> Known._24
            _25 -> Known._25
            _26 -> Known._26
            _30 -> Known._30
            _31 -> Known._31
            _32 -> Known._32
            _33 -> Known._33
            _34 -> Known._34
            _35 -> Known._35
            _36 -> Known._36
            _37 -> Known._37
            _38 -> Known._38
            _39 -> Known._39
            _40 -> Known._40
            _41 -> Known._41
            _42 -> Known._42
            _43 -> Known._43
            _44 -> Known._44
            _45 -> Known._45
            _46 -> Known._46
            _47 -> Known._47
            _48 -> Known._48
            _50 -> Known._50
            _51 -> Known._51
            _52 -> Known._52
            _53 -> Known._53
            _54 -> Known._54
            _55 -> Known._55
            _56 -> Known._56
            _57 -> Known._57
            _58 -> Known._58
            _59 -> Known._59
            _60 -> Known._60
            _61 -> Known._61
            _62 -> Known._62
            _63 -> Known._63
            _64 -> Known._64
            _65 -> Known._65
            _66 -> Known._66
            _67 -> Known._67
            _68 -> Known._68
            _69 -> Known._69
            _70 -> Known._70
            _71 -> Known._71
            _72 -> Known._72
            _73 -> Known._73
            _74 -> Known._74
            _75 -> Known._75
            _76 -> Known._76
            _77 -> Known._77
            _78 -> Known._78
            _79 -> Known._79
            _80 -> Known._80
            _81 -> Known._81
            _82 -> Known._82
            _83 -> Known._83
            _84 -> Known._84
            _85 -> Known._85
            _90 -> Known._90
            _91 -> Known._91
            _92 -> Known._92
            else -> throw LegalesignInvalidDataException("Unknown PdfFieldValidationEnum: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * @throws LegalesignInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asLong(): Long =
        _value().asNumber().getOrNull()?.let { if (it.toDouble() % 1 == 0.0) it.toLong() else null }
            ?: throw LegalesignInvalidDataException("Value is not a Long")

    private var validated: Boolean = false

    fun validate(): PdfFieldValidationEnum = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PdfFieldValidationEnum && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
