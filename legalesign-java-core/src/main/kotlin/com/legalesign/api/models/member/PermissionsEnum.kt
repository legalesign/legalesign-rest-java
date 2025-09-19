// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.member

import com.fasterxml.jackson.annotation.JsonCreator
import com.legalesign.api.core.Enum
import com.legalesign.api.core.JsonField
import com.legalesign.api.errors.LegalesignInvalidDataException
import kotlin.jvm.optionals.getOrNull

/**
 * Permissions options:
 * - 1 - administrator
 * - 2 - team docs visible, create & send
 * - 3 - team docs visible, send only
 * - 4 - no team sent docs visible, send only
 * - 5 - no team docs visible, create & send
 * - 6 - team docs visible, read only
 */
class PermissionsEnum @JsonCreator private constructor(private val value: JsonField<Long>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

    companion object {

        /** Admin */
        @JvmField val _1 = of(1L)

        /** Team visible, create and send */
        @JvmField val _2 = of(2L)

        /** Team visible, send only */
        @JvmField val _3 = of(3L)

        /** Team not visible, send only */
        @JvmField val _4 = of(4L)

        /** Team not visible, create and send */
        @JvmField val _5 = of(5L)

        /** Team visible, read only */
        @JvmField val _6 = of(6L)

        @JvmStatic fun of(value: Long) = PermissionsEnum(JsonField.of(value))
    }

    /** An enum containing [PermissionsEnum]'s known values. */
    enum class Known {
        /** Admin */
        _1,
        /** Team visible, create and send */
        _2,
        /** Team visible, send only */
        _3,
        /** Team not visible, send only */
        _4,
        /** Team not visible, create and send */
        _5,
        /** Team visible, read only */
        _6,
    }

    /**
     * An enum containing [PermissionsEnum]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [PermissionsEnum] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        /** Admin */
        _1,
        /** Team visible, create and send */
        _2,
        /** Team visible, send only */
        _3,
        /** Team not visible, send only */
        _4,
        /** Team not visible, create and send */
        _5,
        /** Team visible, read only */
        _6,
        /**
         * An enum member indicating that [PermissionsEnum] was instantiated with an unknown value.
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
            else -> throw LegalesignInvalidDataException("Unknown PermissionsEnum: $value")
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

    fun validate(): PermissionsEnum = apply {
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

        return other is PermissionsEnum && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
