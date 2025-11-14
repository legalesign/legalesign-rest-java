// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.signer

import com.fasterxml.jackson.annotation.JsonCreator
import com.legalesign_sdk.api.core.Enum
import com.legalesign_sdk.api.core.JsonField
import com.legalesign_sdk.api.errors.LegalesignSdkInvalidDataException
import kotlin.jvm.optionals.getOrNull

/**
 * Signer status options:
 * * 4 - unsent
 * * 5 - scheduled to be sent
 * * 10 - sent
 * * 15 - email opened
 * * 20 - visited
 * * 30 - fields complete
 * * 35 - fields complete ex signature
 * * 39 - waiting for witness to complete
 * * 40 - signed
 * * 50 - downloaded
 * * 60 - rejected
 */
class SignerStatusEnum @JsonCreator private constructor(private val value: JsonField<Long>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

    companion object {

        /** Unsent */
        @JvmField val _4 = of(4L)

        /** Schedule to send */
        @JvmField val _5 = of(5L)

        /** Sent */
        @JvmField val _10 = of(10L)

        /** Email opened */
        @JvmField val _15 = of(15L)

        /** Visited */
        @JvmField val _20 = of(20L)

        /** Fields completed */
        @JvmField val _30 = of(30L)

        /** Fields complete except signature */
        @JvmField val _35 = of(35L)

        /** Witness to sign */
        @JvmField val _39 = of(39L)

        /** Signed */
        @JvmField val _40 = of(40L)

        /** Downloaded */
        @JvmField val _50 = of(50L)

        /** Rejected */
        @JvmField val _60 = of(60L)

        @JvmStatic fun of(value: Long) = SignerStatusEnum(JsonField.of(value))
    }

    /** An enum containing [SignerStatusEnum]'s known values. */
    enum class Known {
        /** Unsent */
        _4,
        /** Schedule to send */
        _5,
        /** Sent */
        _10,
        /** Email opened */
        _15,
        /** Visited */
        _20,
        /** Fields completed */
        _30,
        /** Fields complete except signature */
        _35,
        /** Witness to sign */
        _39,
        /** Signed */
        _40,
        /** Downloaded */
        _50,
        /** Rejected */
        _60,
    }

    /**
     * An enum containing [SignerStatusEnum]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [SignerStatusEnum] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        /** Unsent */
        _4,
        /** Schedule to send */
        _5,
        /** Sent */
        _10,
        /** Email opened */
        _15,
        /** Visited */
        _20,
        /** Fields completed */
        _30,
        /** Fields complete except signature */
        _35,
        /** Witness to sign */
        _39,
        /** Signed */
        _40,
        /** Downloaded */
        _50,
        /** Rejected */
        _60,
        /**
         * An enum member indicating that [SignerStatusEnum] was instantiated with an unknown value.
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
            _4 -> Value._4
            _5 -> Value._5
            _10 -> Value._10
            _15 -> Value._15
            _20 -> Value._20
            _30 -> Value._30
            _35 -> Value._35
            _39 -> Value._39
            _40 -> Value._40
            _50 -> Value._50
            _60 -> Value._60
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LegalesignSdkInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            _4 -> Known._4
            _5 -> Known._5
            _10 -> Known._10
            _15 -> Known._15
            _20 -> Known._20
            _30 -> Known._30
            _35 -> Known._35
            _39 -> Known._39
            _40 -> Known._40
            _50 -> Known._50
            _60 -> Known._60
            else -> throw LegalesignSdkInvalidDataException("Unknown SignerStatusEnum: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * @throws LegalesignSdkInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asLong(): Long =
        _value().asNumber().getOrNull()?.let { if (it.toDouble() % 1 == 0.0) it.toLong() else null }
            ?: throw LegalesignSdkInvalidDataException("Value is not a Long")

    private var validated: Boolean = false

    fun validate(): SignerStatusEnum = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SignerStatusEnum && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
