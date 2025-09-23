// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.document

import com.legalesign_sdk.api.core.Params
import com.legalesign_sdk.api.core.checkRequired
import com.legalesign_sdk.api.core.http.Headers
import com.legalesign_sdk.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List (unarchived) signing documents. Use /status/ if you need high-level information. */
class DocumentListParams
private constructor(
    private val group: String,
    private val archived: String?,
    private val createdGt: OffsetDateTime?,
    private val email: String?,
    private val limit: Long?,
    private val modifiedGt: OffsetDateTime?,
    private val nosigners: String?,
    private val offset: Long?,
    private val status: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by a specific group, required. */
    fun group(): String = group

    /** Filter on archived status, default is false */
    fun archived(): Optional<String> = Optional.ofNullable(archived)

    /** Filter for those documents created after a certain time */
    fun createdGt(): Optional<OffsetDateTime> = Optional.ofNullable(createdGt)

    /** Filter by signer email */
    fun email(): Optional<String> = Optional.ofNullable(email)

    /** Length of dataset to return. Use with offset query to iterate through results. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter for those documents modified after a certain time */
    fun modifiedGt(): Optional<OffsetDateTime> = Optional.ofNullable(modifiedGt)

    /** Add value '1' to remove signers information for a faster query */
    fun nosigners(): Optional<String> = Optional.ofNullable(nosigners)

    /** Offset from start of dataset. Use with the limit query to iterate through dataset. */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Filter on document status */
    fun status(): Optional<Long> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentListParams].
         *
         * The following fields are required:
         * ```java
         * .group()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentListParams]. */
    class Builder internal constructor() {

        private var group: String? = null
        private var archived: String? = null
        private var createdGt: OffsetDateTime? = null
        private var email: String? = null
        private var limit: Long? = null
        private var modifiedGt: OffsetDateTime? = null
        private var nosigners: String? = null
        private var offset: Long? = null
        private var status: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(documentListParams: DocumentListParams) = apply {
            group = documentListParams.group
            archived = documentListParams.archived
            createdGt = documentListParams.createdGt
            email = documentListParams.email
            limit = documentListParams.limit
            modifiedGt = documentListParams.modifiedGt
            nosigners = documentListParams.nosigners
            offset = documentListParams.offset
            status = documentListParams.status
            additionalHeaders = documentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by a specific group, required. */
        fun group(group: String) = apply { this.group = group }

        /** Filter on archived status, default is false */
        fun archived(archived: String?) = apply { this.archived = archived }

        /** Alias for calling [Builder.archived] with `archived.orElse(null)`. */
        fun archived(archived: Optional<String>) = archived(archived.getOrNull())

        /** Filter for those documents created after a certain time */
        fun createdGt(createdGt: OffsetDateTime?) = apply { this.createdGt = createdGt }

        /** Alias for calling [Builder.createdGt] with `createdGt.orElse(null)`. */
        fun createdGt(createdGt: Optional<OffsetDateTime>) = createdGt(createdGt.getOrNull())

        /** Filter by signer email */
        fun email(email: String?) = apply { this.email = email }

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /** Length of dataset to return. Use with offset query to iterate through results. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Filter for those documents modified after a certain time */
        fun modifiedGt(modifiedGt: OffsetDateTime?) = apply { this.modifiedGt = modifiedGt }

        /** Alias for calling [Builder.modifiedGt] with `modifiedGt.orElse(null)`. */
        fun modifiedGt(modifiedGt: Optional<OffsetDateTime>) = modifiedGt(modifiedGt.getOrNull())

        /** Add value '1' to remove signers information for a faster query */
        fun nosigners(nosigners: String?) = apply { this.nosigners = nosigners }

        /** Alias for calling [Builder.nosigners] with `nosigners.orElse(null)`. */
        fun nosigners(nosigners: Optional<String>) = nosigners(nosigners.getOrNull())

        /** Offset from start of dataset. Use with the limit query to iterate through dataset. */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /** Filter on document status */
        fun status(status: Long?) = apply { this.status = status }

        /**
         * Alias for [Builder.status].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun status(status: Long) = status(status as Long?)

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Long>) = status(status.getOrNull())

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
         * Returns an immutable instance of [DocumentListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .group()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentListParams =
            DocumentListParams(
                checkRequired("group", group),
                archived,
                createdGt,
                email,
                limit,
                modifiedGt,
                nosigners,
                offset,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("group", group)
                archived?.let { put("archived", it) }
                createdGt?.let {
                    put("created_gt", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                email?.let { put("email", it) }
                limit?.let { put("limit", it.toString()) }
                modifiedGt?.let {
                    put("modified_gt", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                nosigners?.let { put("nosigners", it) }
                offset?.let { put("offset", it.toString()) }
                status?.let { put("status", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentListParams &&
            group == other.group &&
            archived == other.archived &&
            createdGt == other.createdGt &&
            email == other.email &&
            limit == other.limit &&
            modifiedGt == other.modifiedGt &&
            nosigners == other.nosigners &&
            offset == other.offset &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            group,
            archived,
            createdGt,
            email,
            limit,
            modifiedGt,
            nosigners,
            offset,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DocumentListParams{group=$group, archived=$archived, createdGt=$createdGt, email=$email, limit=$limit, modifiedGt=$modifiedGt, nosigners=$nosigners, offset=$offset, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
