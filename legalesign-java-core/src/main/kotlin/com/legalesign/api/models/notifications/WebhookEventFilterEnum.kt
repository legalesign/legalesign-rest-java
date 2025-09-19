// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.notifications

import com.fasterxml.jackson.annotation.JsonCreator
import com.legalesign.api.core.Enum
import com.legalesign.api.core.JsonField
import com.legalesign.api.errors.LegalesignInvalidDataException

class WebhookEventFilterEnum
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val EMPTY = of("")

        @JvmField val DOCUMENT = of("document.*")

        @JvmField val DOCUMENT_CREATED = of("document.created")

        @JvmField val DOCUMENT_REJECTED = of("document.rejected")

        @JvmField val DOCUMENT_FINAL_PDF_CREATED = of("document.finalPdfCreated")

        @JvmField val RECIPIENT = of("recipient.*")

        @JvmField val RECIPIENT_COMPLETED = of("recipient.completed")

        @JvmField val RECIPIENT_REJECTED = of("recipient.rejected")

        @JvmField val RECIPIENT_EMAIL_OPENED = of("recipient.emailOpened")

        @JvmField val RECIPIENT_VISITING = of("recipient.visiting")

        @JvmField val RECIPIENT_BOUNCED = of("recipient.bounced")

        @JvmStatic fun of(value: String) = WebhookEventFilterEnum(JsonField.of(value))
    }

    /** An enum containing [WebhookEventFilterEnum]'s known values. */
    enum class Known {
        EMPTY,
        DOCUMENT,
        DOCUMENT_CREATED,
        DOCUMENT_REJECTED,
        DOCUMENT_FINAL_PDF_CREATED,
        RECIPIENT,
        RECIPIENT_COMPLETED,
        RECIPIENT_REJECTED,
        RECIPIENT_EMAIL_OPENED,
        RECIPIENT_VISITING,
        RECIPIENT_BOUNCED,
    }

    /**
     * An enum containing [WebhookEventFilterEnum]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [WebhookEventFilterEnum] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        EMPTY,
        DOCUMENT,
        DOCUMENT_CREATED,
        DOCUMENT_REJECTED,
        DOCUMENT_FINAL_PDF_CREATED,
        RECIPIENT,
        RECIPIENT_COMPLETED,
        RECIPIENT_REJECTED,
        RECIPIENT_EMAIL_OPENED,
        RECIPIENT_VISITING,
        RECIPIENT_BOUNCED,
        /**
         * An enum member indicating that [WebhookEventFilterEnum] was instantiated with an unknown
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
            EMPTY -> Value.EMPTY
            DOCUMENT -> Value.DOCUMENT
            DOCUMENT_CREATED -> Value.DOCUMENT_CREATED
            DOCUMENT_REJECTED -> Value.DOCUMENT_REJECTED
            DOCUMENT_FINAL_PDF_CREATED -> Value.DOCUMENT_FINAL_PDF_CREATED
            RECIPIENT -> Value.RECIPIENT
            RECIPIENT_COMPLETED -> Value.RECIPIENT_COMPLETED
            RECIPIENT_REJECTED -> Value.RECIPIENT_REJECTED
            RECIPIENT_EMAIL_OPENED -> Value.RECIPIENT_EMAIL_OPENED
            RECIPIENT_VISITING -> Value.RECIPIENT_VISITING
            RECIPIENT_BOUNCED -> Value.RECIPIENT_BOUNCED
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
            EMPTY -> Known.EMPTY
            DOCUMENT -> Known.DOCUMENT
            DOCUMENT_CREATED -> Known.DOCUMENT_CREATED
            DOCUMENT_REJECTED -> Known.DOCUMENT_REJECTED
            DOCUMENT_FINAL_PDF_CREATED -> Known.DOCUMENT_FINAL_PDF_CREATED
            RECIPIENT -> Known.RECIPIENT
            RECIPIENT_COMPLETED -> Known.RECIPIENT_COMPLETED
            RECIPIENT_REJECTED -> Known.RECIPIENT_REJECTED
            RECIPIENT_EMAIL_OPENED -> Known.RECIPIENT_EMAIL_OPENED
            RECIPIENT_VISITING -> Known.RECIPIENT_VISITING
            RECIPIENT_BOUNCED -> Known.RECIPIENT_BOUNCED
            else -> throw LegalesignInvalidDataException("Unknown WebhookEventFilterEnum: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LegalesignInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { LegalesignInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): WebhookEventFilterEnum = apply {
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

        return other is WebhookEventFilterEnum && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
