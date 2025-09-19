// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.document

import com.fasterxml.jackson.annotation.JsonCreator
import com.legalesign.api.core.Enum
import com.legalesign.api.core.JsonField
import com.legalesign.api.errors.LegalesignInvalidDataException
import kotlin.jvm.optionals.getOrNull

/**
 * Document status options:
 * - 10 - Initial state, check signer status for sent/unsent
 * - 20 - Fields completed
 * - 30 - Signed
 * - 40 - Removed (before signing)
 * - 50 - Rejected
 */
class DocumentStatusEnum @JsonCreator private constructor(private val value: JsonField<Long>) :
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

        /** Created */
        @JvmField val _10 = of(10L)

        /** Fields completed */
        @JvmField val _20 = of(20L)

        /** Signed */
        @JvmField val _30 = of(30L)

        /** Removed */
        @JvmField val _40 = of(40L)

        /** Rejected */
        @JvmField val _50 = of(50L)

        @JvmStatic fun of(value: Long) = DocumentStatusEnum(JsonField.of(value))
    }

    /** An enum containing [DocumentStatusEnum]'s known values. */
    enum class Known {
        /** Created */
        _10,
        /** Fields completed */
        _20,
        /** Signed */
        _30,
        /** Removed */
        _40,
        /** Rejected */
        _50,
    }

    /**
     * An enum containing [DocumentStatusEnum]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [DocumentStatusEnum] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        /** Created */
        _10,
        /** Fields completed */
        _20,
        /** Signed */
        _30,
        /** Removed */
        _40,
        /** Rejected */
        _50,
        /**
         * An enum member indicating that [DocumentStatusEnum] was instantiated with an unknown
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
            _10 -> Value._10
            _20 -> Value._20
            _30 -> Value._30
            _40 -> Value._40
            _50 -> Value._50
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
            _10 -> Known._10
            _20 -> Known._20
            _30 -> Known._30
            _40 -> Known._40
            _50 -> Known._50
            else -> throw LegalesignInvalidDataException("Unknown DocumentStatusEnum: $value")
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

    fun validate(): DocumentStatusEnum = apply {
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

        return other is DocumentStatusEnum && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
