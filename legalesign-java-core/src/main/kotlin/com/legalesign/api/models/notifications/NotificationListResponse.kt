// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.notifications

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.legalesign.api.core.Enum
import com.legalesign.api.core.ExcludeMissing
import com.legalesign.api.core.JsonField
import com.legalesign.api.core.JsonMissing
import com.legalesign.api.core.JsonValue
import com.legalesign.api.errors.LegalesignInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NotificationListResponse
private constructor(
    private val active: JsonField<Boolean>,
    private val eventFilter: JsonField<WebhookEventFilterEnum>,
    private val groupId: JsonField<Long>,
    private val notifyWhen: JsonField<NotifyWhen>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("event_filter")
        @ExcludeMissing
        eventFilter: JsonField<WebhookEventFilterEnum> = JsonMissing.of(),
        @JsonProperty("group_id") @ExcludeMissing groupId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("notify_when")
        @ExcludeMissing
        notifyWhen: JsonField<NotifyWhen> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(active, eventFilter, groupId, notifyWhen, url, mutableMapOf())

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun active(): Optional<Boolean> = active.getOptional("active")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventFilter(): Optional<WebhookEventFilterEnum> = eventFilter.getOptional("event_filter")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupId(): Optional<Long> = groupId.getOptional("group_id")

    /**
     * 1 = every 6 minutes, 2 = upon signing, 3 = sent, 4 = rejected, 10 = realtime
     *
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notifyWhen(): Optional<NotifyWhen> = notifyWhen.getOptional("notify_when")

    /**
     * @throws LegalesignInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * Returns the raw JSON value of [eventFilter].
     *
     * Unlike [eventFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_filter")
    @ExcludeMissing
    fun _eventFilter(): JsonField<WebhookEventFilterEnum> = eventFilter

    /**
     * Returns the raw JSON value of [groupId].
     *
     * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_id") @ExcludeMissing fun _groupId(): JsonField<Long> = groupId

    /**
     * Returns the raw JSON value of [notifyWhen].
     *
     * Unlike [notifyWhen], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notify_when")
    @ExcludeMissing
    fun _notifyWhen(): JsonField<NotifyWhen> = notifyWhen

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

        /** Returns a mutable builder for constructing an instance of [NotificationListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationListResponse]. */
    class Builder internal constructor() {

        private var active: JsonField<Boolean> = JsonMissing.of()
        private var eventFilter: JsonField<WebhookEventFilterEnum> = JsonMissing.of()
        private var groupId: JsonField<Long> = JsonMissing.of()
        private var notifyWhen: JsonField<NotifyWhen> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationListResponse: NotificationListResponse) = apply {
            active = notificationListResponse.active
            eventFilter = notificationListResponse.eventFilter
            groupId = notificationListResponse.groupId
            notifyWhen = notificationListResponse.notifyWhen
            url = notificationListResponse.url
            additionalProperties = notificationListResponse.additionalProperties.toMutableMap()
        }

        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        fun eventFilter(eventFilter: WebhookEventFilterEnum) =
            eventFilter(JsonField.of(eventFilter))

        /**
         * Sets [Builder.eventFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventFilter] with a well-typed [WebhookEventFilterEnum]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun eventFilter(eventFilter: JsonField<WebhookEventFilterEnum>) = apply {
            this.eventFilter = eventFilter
        }

        fun groupId(groupId: Long) = groupId(JsonField.of(groupId))

        /**
         * Sets [Builder.groupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupId(groupId: JsonField<Long>) = apply { this.groupId = groupId }

        /** 1 = every 6 minutes, 2 = upon signing, 3 = sent, 4 = rejected, 10 = realtime */
        fun notifyWhen(notifyWhen: NotifyWhen) = notifyWhen(JsonField.of(notifyWhen))

        /**
         * Sets [Builder.notifyWhen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notifyWhen] with a well-typed [NotifyWhen] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notifyWhen(notifyWhen: JsonField<NotifyWhen>) = apply { this.notifyWhen = notifyWhen }

        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [NotificationListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NotificationListResponse =
            NotificationListResponse(
                active,
                eventFilter,
                groupId,
                notifyWhen,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NotificationListResponse = apply {
        if (validated) {
            return@apply
        }

        active()
        eventFilter().ifPresent { it.validate() }
        groupId()
        notifyWhen().ifPresent { it.validate() }
        url()
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
    @JvmSynthetic
    internal fun validity(): Int =
        (if (active.asKnown().isPresent) 1 else 0) +
            (eventFilter.asKnown().getOrNull()?.validity() ?: 0) +
            (if (groupId.asKnown().isPresent) 1 else 0) +
            (notifyWhen.asKnown().getOrNull()?.validity() ?: 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    /** 1 = every 6 minutes, 2 = upon signing, 3 = sent, 4 = rejected, 10 = realtime */
    class NotifyWhen @JsonCreator private constructor(private val value: JsonField<Long>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

        companion object {

            @JvmField val _1 = of(1L)

            @JvmField val _2 = of(2L)

            @JvmField val _3 = of(3L)

            @JvmField val _4 = of(4L)

            @JvmField val _10 = of(10L)

            @JvmStatic fun of(value: Long) = NotifyWhen(JsonField.of(value))
        }

        /** An enum containing [NotifyWhen]'s known values. */
        enum class Known {
            _1,
            _2,
            _3,
            _4,
            _10,
        }

        /**
         * An enum containing [NotifyWhen]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [NotifyWhen] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _1,
            _2,
            _3,
            _4,
            _10,
            /**
             * An enum member indicating that [NotifyWhen] was instantiated with an unknown value.
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
                _1 -> Value._1
                _2 -> Value._2
                _3 -> Value._3
                _4 -> Value._4
                _10 -> Value._10
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
                _10 -> Known._10
                else -> throw LegalesignInvalidDataException("Unknown NotifyWhen: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws LegalesignInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asLong(): Long =
            _value().asNumber().getOrNull()?.let {
                if (it.toDouble() % 1 == 0.0) it.toLong() else null
            } ?: throw LegalesignInvalidDataException("Value is not a Long")

        private var validated: Boolean = false

        fun validate(): NotifyWhen = apply {
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

            return other is NotifyWhen && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationListResponse &&
            active == other.active &&
            eventFilter == other.eventFilter &&
            groupId == other.groupId &&
            notifyWhen == other.notifyWhen &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(active, eventFilter, groupId, notifyWhen, url, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationListResponse{active=$active, eventFilter=$eventFilter, groupId=$groupId, notifyWhen=$notifyWhen, url=$url, additionalProperties=$additionalProperties}"
}
