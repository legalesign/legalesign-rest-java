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
import com.legalesign_sdk.api.core.Params
import com.legalesign_sdk.api.core.checkKnown
import com.legalesign_sdk.api.core.checkRequired
import com.legalesign_sdk.api.core.http.Headers
import com.legalesign_sdk.api.core.http.QueryParams
import com.legalesign_sdk.api.core.toImmutable
import com.legalesign_sdk.api.errors.LegalesignSdkInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create signing document */
class DocumentCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun group(): String = body.group()

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun signers(): List<Signer> = body.signers()

    /**
     * Append Legalesign validation info to final PDF. If not included uses the group default.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun appendPdf(): Optional<Boolean> = body.appendPdf()

    /**
     * Send to archive soon after signing. Keeps web app clutter free
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun autoArchive(): Optional<Boolean> = body.autoArchive()

    /**
     * Comma delimited string of email addresses that are notified of signing or rejection.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ccEmails(): Optional<String> = body.ccEmails()

    /**
     * If any sender fields are left blank, convert them to fields for the first recipient.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun convertSenderToSigner(): Optional<Boolean> = body.convertSenderToSigner()

    /**
     * Use Legalesign email to send notification emails. If false suppresses all emails.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun doEmail(): Optional<Boolean> = body.doEmail()

    /**
     * Text doc only. The footer for the final pdf. Use keyword \"default\" to use group default
     * footer.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun footer(): Optional<String> = body.footer()

    /**
     * Text based doc only. Pixel height of PDF footer, if used. 1px = 0.025cm
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun footerHeight(): Optional<Long> = body.footerHeight()

    /**
     * Text based doc only. The header for the final pdf. Use keyword \"default\" to use group
     * header footer.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun header(): Optional<String> = body.header()

    /**
     * Text based doc only. Pixel height of final PDF footer, if used. 1px = 0.025cm
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun headerHeight(): Optional<Long> = body.headerHeight()

    /**
     * Set a password. Must be ascii encode-able, you must also set signature_type to 4 and choose a
     * pdf_password_type.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pdfPassword(): Optional<String> = body.pdfPassword()

    /**
     * 1 to store password, 2 for to delete from our records upon final signing.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pdfPasswordType(): Optional<PdfPasswordType> = body.pdfPasswordType()

    /**
     * Assign values to PDF sender fields, use field labels as keys. Requires unique fields labels.
     * See also strict_fields.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pdftext(): Optional<Pdftext> = body.pdftext()

    /**
     * URL to send the signer to after signing (instead of download page). Your URL will include
     * query parameters with ID and state information as follows:
     * YOUR-URL?signer=[signer_uid]&doc=[doc_id]&group=[group_id]&signer_state=[signer_status]&doc_state=[doc_status]
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun redirect(): Optional<String> = body.redirect()

    /**
     * Put 'default' if you wish to use the default reminder schedule in the group (go to web app to
     * set default schedule)
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reminders(): Optional<String> = body.reminders()

    /**
     * Return document links for signers in the response BODY.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun returnSignerLinks(): Optional<Boolean> = body.returnSignerLinks()

    /**
     * Use 4 to get your executed PDF Certified. Recommended. Defaults to 1 (uses a sha256 hash for
     * document integrity).
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signatureType(): Optional<Long> = body.signatureType()

    /**
     * Notify signers in their order sequence. If false all are notified simulataneously.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signersInOrder(): Optional<Boolean> = body.signersInOrder()

    /**
     * Add custom placeholders to signer fields, using labels as keys in an object (as for pdftext).
     * Relies on unique labelling.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signertext(): Optional<Signertext> = body.signertext()

    /**
     * pdftext fails silently for invalid field value, set to true to return an error
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun strictFields(): Optional<Boolean> = body.strictFields()

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tag(): Optional<String> = body.tag()

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tag1(): Optional<String> = body.tag1()

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tag2(): Optional<String> = body.tag2()

    /**
     * Resource URI of text template object. This call must contain either one of the attributes
     * text, templatepdf, template.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun template(): Optional<String> = body.template()

    /**
     * Resource URI of templatepdf object. This API call must contain either one of the attributes
     * text, templatepdf, template.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun templatepdf(): Optional<String> = body.templatepdf()

    /**
     * Raw html. This API call must contain either one of the attributes text, templatepdf,
     * template.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun text(): Optional<String> = body.text()

    /**
     * Assign document another user in the group. Defaults to API
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun user(): Optional<String> = body.user()

    /**
     * Returns the raw JSON value of [group].
     *
     * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _group(): JsonField<String> = body._group()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [signers].
     *
     * Unlike [signers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signers(): JsonField<List<Signer>> = body._signers()

    /**
     * Returns the raw JSON value of [appendPdf].
     *
     * Unlike [appendPdf], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _appendPdf(): JsonField<Boolean> = body._appendPdf()

    /**
     * Returns the raw JSON value of [autoArchive].
     *
     * Unlike [autoArchive], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoArchive(): JsonField<Boolean> = body._autoArchive()

    /**
     * Returns the raw JSON value of [ccEmails].
     *
     * Unlike [ccEmails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ccEmails(): JsonField<String> = body._ccEmails()

    /**
     * Returns the raw JSON value of [convertSenderToSigner].
     *
     * Unlike [convertSenderToSigner], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _convertSenderToSigner(): JsonField<Boolean> = body._convertSenderToSigner()

    /**
     * Returns the raw JSON value of [doEmail].
     *
     * Unlike [doEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _doEmail(): JsonField<Boolean> = body._doEmail()

    /**
     * Returns the raw JSON value of [footer].
     *
     * Unlike [footer], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _footer(): JsonField<String> = body._footer()

    /**
     * Returns the raw JSON value of [footerHeight].
     *
     * Unlike [footerHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _footerHeight(): JsonField<Long> = body._footerHeight()

    /**
     * Returns the raw JSON value of [header].
     *
     * Unlike [header], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _header(): JsonField<String> = body._header()

    /**
     * Returns the raw JSON value of [headerHeight].
     *
     * Unlike [headerHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _headerHeight(): JsonField<Long> = body._headerHeight()

    /**
     * Returns the raw JSON value of [pdfPassword].
     *
     * Unlike [pdfPassword], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pdfPassword(): JsonField<String> = body._pdfPassword()

    /**
     * Returns the raw JSON value of [pdfPasswordType].
     *
     * Unlike [pdfPasswordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pdfPasswordType(): JsonField<PdfPasswordType> = body._pdfPasswordType()

    /**
     * Returns the raw JSON value of [pdftext].
     *
     * Unlike [pdftext], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pdftext(): JsonField<Pdftext> = body._pdftext()

    /**
     * Returns the raw JSON value of [redirect].
     *
     * Unlike [redirect], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _redirect(): JsonField<String> = body._redirect()

    /**
     * Returns the raw JSON value of [reminders].
     *
     * Unlike [reminders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reminders(): JsonField<String> = body._reminders()

    /**
     * Returns the raw JSON value of [returnSignerLinks].
     *
     * Unlike [returnSignerLinks], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _returnSignerLinks(): JsonField<Boolean> = body._returnSignerLinks()

    /**
     * Returns the raw JSON value of [signatureType].
     *
     * Unlike [signatureType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signatureType(): JsonField<Long> = body._signatureType()

    /**
     * Returns the raw JSON value of [signersInOrder].
     *
     * Unlike [signersInOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signersInOrder(): JsonField<Boolean> = body._signersInOrder()

    /**
     * Returns the raw JSON value of [signertext].
     *
     * Unlike [signertext], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signertext(): JsonField<Signertext> = body._signertext()

    /**
     * Returns the raw JSON value of [strictFields].
     *
     * Unlike [strictFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _strictFields(): JsonField<Boolean> = body._strictFields()

    /**
     * Returns the raw JSON value of [tag].
     *
     * Unlike [tag], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag(): JsonField<String> = body._tag()

    /**
     * Returns the raw JSON value of [tag1].
     *
     * Unlike [tag1], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag1(): JsonField<String> = body._tag1()

    /**
     * Returns the raw JSON value of [tag2].
     *
     * Unlike [tag2], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tag2(): JsonField<String> = body._tag2()

    /**
     * Returns the raw JSON value of [template].
     *
     * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _template(): JsonField<String> = body._template()

    /**
     * Returns the raw JSON value of [templatepdf].
     *
     * Unlike [templatepdf], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _templatepdf(): JsonField<String> = body._templatepdf()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<String> = body._text()

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _user(): JsonField<String> = body._user()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentCreateParams].
         *
         * The following fields are required:
         * ```java
         * .group()
         * .name()
         * .signers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(documentCreateParams: DocumentCreateParams) = apply {
            body = documentCreateParams.body.toBuilder()
            additionalHeaders = documentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = documentCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [group]
         * - [name]
         * - [signers]
         * - [appendPdf]
         * - [autoArchive]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun group(group: String) = apply { body.group(group) }

        /**
         * Sets [Builder.group] to an arbitrary JSON value.
         *
         * You should usually call [Builder.group] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun group(group: JsonField<String>) = apply { body.group(group) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun signers(signers: List<Signer>) = apply { body.signers(signers) }

        /**
         * Sets [Builder.signers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signers] with a well-typed `List<Signer>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signers(signers: JsonField<List<Signer>>) = apply { body.signers(signers) }

        /**
         * Adds a single [Signer] to [signers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSigner(signer: Signer) = apply { body.addSigner(signer) }

        /**
         * Append Legalesign validation info to final PDF. If not included uses the group default.
         */
        fun appendPdf(appendPdf: Boolean) = apply { body.appendPdf(appendPdf) }

        /**
         * Sets [Builder.appendPdf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appendPdf] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun appendPdf(appendPdf: JsonField<Boolean>) = apply { body.appendPdf(appendPdf) }

        /** Send to archive soon after signing. Keeps web app clutter free */
        fun autoArchive(autoArchive: Boolean) = apply { body.autoArchive(autoArchive) }

        /**
         * Sets [Builder.autoArchive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoArchive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoArchive(autoArchive: JsonField<Boolean>) = apply { body.autoArchive(autoArchive) }

        /** Comma delimited string of email addresses that are notified of signing or rejection. */
        fun ccEmails(ccEmails: String) = apply { body.ccEmails(ccEmails) }

        /**
         * Sets [Builder.ccEmails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ccEmails] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ccEmails(ccEmails: JsonField<String>) = apply { body.ccEmails(ccEmails) }

        /** If any sender fields are left blank, convert them to fields for the first recipient. */
        fun convertSenderToSigner(convertSenderToSigner: Boolean) = apply {
            body.convertSenderToSigner(convertSenderToSigner)
        }

        /**
         * Sets [Builder.convertSenderToSigner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.convertSenderToSigner] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun convertSenderToSigner(convertSenderToSigner: JsonField<Boolean>) = apply {
            body.convertSenderToSigner(convertSenderToSigner)
        }

        /** Use Legalesign email to send notification emails. If false suppresses all emails. */
        fun doEmail(doEmail: Boolean) = apply { body.doEmail(doEmail) }

        /**
         * Sets [Builder.doEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doEmail] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun doEmail(doEmail: JsonField<Boolean>) = apply { body.doEmail(doEmail) }

        /**
         * Text doc only. The footer for the final pdf. Use keyword \"default\" to use group default
         * footer.
         */
        fun footer(footer: String) = apply { body.footer(footer) }

        /**
         * Sets [Builder.footer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.footer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun footer(footer: JsonField<String>) = apply { body.footer(footer) }

        /** Text based doc only. Pixel height of PDF footer, if used. 1px = 0.025cm */
        fun footerHeight(footerHeight: Long) = apply { body.footerHeight(footerHeight) }

        /**
         * Sets [Builder.footerHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.footerHeight] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun footerHeight(footerHeight: JsonField<Long>) = apply { body.footerHeight(footerHeight) }

        /**
         * Text based doc only. The header for the final pdf. Use keyword \"default\" to use group
         * header footer.
         */
        fun header(header: String) = apply { body.header(header) }

        /**
         * Sets [Builder.header] to an arbitrary JSON value.
         *
         * You should usually call [Builder.header] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun header(header: JsonField<String>) = apply { body.header(header) }

        /** Text based doc only. Pixel height of final PDF footer, if used. 1px = 0.025cm */
        fun headerHeight(headerHeight: Long) = apply { body.headerHeight(headerHeight) }

        /**
         * Sets [Builder.headerHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headerHeight] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun headerHeight(headerHeight: JsonField<Long>) = apply { body.headerHeight(headerHeight) }

        /**
         * Set a password. Must be ascii encode-able, you must also set signature_type to 4 and
         * choose a pdf_password_type.
         */
        fun pdfPassword(pdfPassword: String) = apply { body.pdfPassword(pdfPassword) }

        /**
         * Sets [Builder.pdfPassword] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pdfPassword] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pdfPassword(pdfPassword: JsonField<String>) = apply { body.pdfPassword(pdfPassword) }

        /** 1 to store password, 2 for to delete from our records upon final signing. */
        fun pdfPasswordType(pdfPasswordType: PdfPasswordType) = apply {
            body.pdfPasswordType(pdfPasswordType)
        }

        /**
         * Sets [Builder.pdfPasswordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pdfPasswordType] with a well-typed [PdfPasswordType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pdfPasswordType(pdfPasswordType: JsonField<PdfPasswordType>) = apply {
            body.pdfPasswordType(pdfPasswordType)
        }

        /**
         * Assign values to PDF sender fields, use field labels as keys. Requires unique fields
         * labels. See also strict_fields.
         */
        fun pdftext(pdftext: Pdftext) = apply { body.pdftext(pdftext) }

        /**
         * Sets [Builder.pdftext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pdftext] with a well-typed [Pdftext] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pdftext(pdftext: JsonField<Pdftext>) = apply { body.pdftext(pdftext) }

        /**
         * URL to send the signer to after signing (instead of download page). Your URL will include
         * query parameters with ID and state information as follows:
         * YOUR-URL?signer=[signer_uid]&doc=[doc_id]&group=[group_id]&signer_state=[signer_status]&doc_state=[doc_status]
         */
        fun redirect(redirect: String) = apply { body.redirect(redirect) }

        /**
         * Sets [Builder.redirect] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirect] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun redirect(redirect: JsonField<String>) = apply { body.redirect(redirect) }

        /**
         * Put 'default' if you wish to use the default reminder schedule in the group (go to web
         * app to set default schedule)
         */
        fun reminders(reminders: String) = apply { body.reminders(reminders) }

        /**
         * Sets [Builder.reminders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reminders] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reminders(reminders: JsonField<String>) = apply { body.reminders(reminders) }

        /** Return document links for signers in the response BODY. */
        fun returnSignerLinks(returnSignerLinks: Boolean) = apply {
            body.returnSignerLinks(returnSignerLinks)
        }

        /**
         * Sets [Builder.returnSignerLinks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnSignerLinks] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun returnSignerLinks(returnSignerLinks: JsonField<Boolean>) = apply {
            body.returnSignerLinks(returnSignerLinks)
        }

        /**
         * Use 4 to get your executed PDF Certified. Recommended. Defaults to 1 (uses a sha256 hash
         * for document integrity).
         */
        fun signatureType(signatureType: Long) = apply { body.signatureType(signatureType) }

        /**
         * Sets [Builder.signatureType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signatureType] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signatureType(signatureType: JsonField<Long>) = apply {
            body.signatureType(signatureType)
        }

        /** Notify signers in their order sequence. If false all are notified simulataneously. */
        fun signersInOrder(signersInOrder: Boolean) = apply { body.signersInOrder(signersInOrder) }

        /**
         * Sets [Builder.signersInOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signersInOrder] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun signersInOrder(signersInOrder: JsonField<Boolean>) = apply {
            body.signersInOrder(signersInOrder)
        }

        /**
         * Add custom placeholders to signer fields, using labels as keys in an object (as for
         * pdftext). Relies on unique labelling.
         */
        fun signertext(signertext: Signertext) = apply { body.signertext(signertext) }

        /**
         * Sets [Builder.signertext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signertext] with a well-typed [Signertext] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun signertext(signertext: JsonField<Signertext>) = apply { body.signertext(signertext) }

        /** pdftext fails silently for invalid field value, set to true to return an error */
        fun strictFields(strictFields: Boolean) = apply { body.strictFields(strictFields) }

        /**
         * Sets [Builder.strictFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.strictFields] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun strictFields(strictFields: JsonField<Boolean>) = apply {
            body.strictFields(strictFields)
        }

        fun tag(tag: String) = apply { body.tag(tag) }

        /**
         * Sets [Builder.tag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag(tag: JsonField<String>) = apply { body.tag(tag) }

        fun tag1(tag1: String) = apply { body.tag1(tag1) }

        /**
         * Sets [Builder.tag1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag1(tag1: JsonField<String>) = apply { body.tag1(tag1) }

        fun tag2(tag2: String) = apply { body.tag2(tag2) }

        /**
         * Sets [Builder.tag2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag2(tag2: JsonField<String>) = apply { body.tag2(tag2) }

        /**
         * Resource URI of text template object. This call must contain either one of the attributes
         * text, templatepdf, template.
         */
        fun template(template: String) = apply { body.template(template) }

        /**
         * Sets [Builder.template] to an arbitrary JSON value.
         *
         * You should usually call [Builder.template] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun template(template: JsonField<String>) = apply { body.template(template) }

        /**
         * Resource URI of templatepdf object. This API call must contain either one of the
         * attributes text, templatepdf, template.
         */
        fun templatepdf(templatepdf: String) = apply { body.templatepdf(templatepdf) }

        /**
         * Sets [Builder.templatepdf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templatepdf] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templatepdf(templatepdf: JsonField<String>) = apply { body.templatepdf(templatepdf) }

        /**
         * Raw html. This API call must contain either one of the attributes text, templatepdf,
         * template.
         */
        fun text(text: String) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

        /** Assign document another user in the group. Defaults to API */
        fun user(user: String) = apply { body.user(user) }

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { body.user(user) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [DocumentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .group()
         * .name()
         * .signers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentCreateParams =
            DocumentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Send a document to be signed. In addition to the required fields, the POST must also contain
     * either text (raw html) or a reference to a saved template (html) or a templatepdf (uploaded
     * pdf). Also recommended - do_email, auto_archive and pdftext (if using pdf).
     */
    class Body
    private constructor(
        private val group: JsonField<String>,
        private val name: JsonField<String>,
        private val signers: JsonField<List<Signer>>,
        private val appendPdf: JsonField<Boolean>,
        private val autoArchive: JsonField<Boolean>,
        private val ccEmails: JsonField<String>,
        private val convertSenderToSigner: JsonField<Boolean>,
        private val doEmail: JsonField<Boolean>,
        private val footer: JsonField<String>,
        private val footerHeight: JsonField<Long>,
        private val header: JsonField<String>,
        private val headerHeight: JsonField<Long>,
        private val pdfPassword: JsonField<String>,
        private val pdfPasswordType: JsonField<PdfPasswordType>,
        private val pdftext: JsonField<Pdftext>,
        private val redirect: JsonField<String>,
        private val reminders: JsonField<String>,
        private val returnSignerLinks: JsonField<Boolean>,
        private val signatureType: JsonField<Long>,
        private val signersInOrder: JsonField<Boolean>,
        private val signertext: JsonField<Signertext>,
        private val strictFields: JsonField<Boolean>,
        private val tag: JsonField<String>,
        private val tag1: JsonField<String>,
        private val tag2: JsonField<String>,
        private val template: JsonField<String>,
        private val templatepdf: JsonField<String>,
        private val text: JsonField<String>,
        private val user: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("group") @ExcludeMissing group: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("signers")
            @ExcludeMissing
            signers: JsonField<List<Signer>> = JsonMissing.of(),
            @JsonProperty("append_pdf")
            @ExcludeMissing
            appendPdf: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("auto_archive")
            @ExcludeMissing
            autoArchive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("cc_emails")
            @ExcludeMissing
            ccEmails: JsonField<String> = JsonMissing.of(),
            @JsonProperty("convert_sender_to_signer")
            @ExcludeMissing
            convertSenderToSigner: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("do_email")
            @ExcludeMissing
            doEmail: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("footer") @ExcludeMissing footer: JsonField<String> = JsonMissing.of(),
            @JsonProperty("footer_height")
            @ExcludeMissing
            footerHeight: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("header") @ExcludeMissing header: JsonField<String> = JsonMissing.of(),
            @JsonProperty("header_height")
            @ExcludeMissing
            headerHeight: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("pdf_password")
            @ExcludeMissing
            pdfPassword: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pdf_password_type")
            @ExcludeMissing
            pdfPasswordType: JsonField<PdfPasswordType> = JsonMissing.of(),
            @JsonProperty("pdftext") @ExcludeMissing pdftext: JsonField<Pdftext> = JsonMissing.of(),
            @JsonProperty("redirect")
            @ExcludeMissing
            redirect: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reminders")
            @ExcludeMissing
            reminders: JsonField<String> = JsonMissing.of(),
            @JsonProperty("return_signer_links")
            @ExcludeMissing
            returnSignerLinks: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("signature_type")
            @ExcludeMissing
            signatureType: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("signers_in_order")
            @ExcludeMissing
            signersInOrder: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("signertext")
            @ExcludeMissing
            signertext: JsonField<Signertext> = JsonMissing.of(),
            @JsonProperty("strict_fields")
            @ExcludeMissing
            strictFields: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tag") @ExcludeMissing tag: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag1") @ExcludeMissing tag1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag2") @ExcludeMissing tag2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("template")
            @ExcludeMissing
            template: JsonField<String> = JsonMissing.of(),
            @JsonProperty("templatepdf")
            @ExcludeMissing
            templatepdf: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        ) : this(
            group,
            name,
            signers,
            appendPdf,
            autoArchive,
            ccEmails,
            convertSenderToSigner,
            doEmail,
            footer,
            footerHeight,
            header,
            headerHeight,
            pdfPassword,
            pdfPasswordType,
            pdftext,
            redirect,
            reminders,
            returnSignerLinks,
            signatureType,
            signersInOrder,
            signertext,
            strictFields,
            tag,
            tag1,
            tag2,
            template,
            templatepdf,
            text,
            user,
            mutableMapOf(),
        )

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun group(): String = group.getRequired("group")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun signers(): List<Signer> = signers.getRequired("signers")

        /**
         * Append Legalesign validation info to final PDF. If not included uses the group default.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun appendPdf(): Optional<Boolean> = appendPdf.getOptional("append_pdf")

        /**
         * Send to archive soon after signing. Keeps web app clutter free
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun autoArchive(): Optional<Boolean> = autoArchive.getOptional("auto_archive")

        /**
         * Comma delimited string of email addresses that are notified of signing or rejection.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ccEmails(): Optional<String> = ccEmails.getOptional("cc_emails")

        /**
         * If any sender fields are left blank, convert them to fields for the first recipient.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun convertSenderToSigner(): Optional<Boolean> =
            convertSenderToSigner.getOptional("convert_sender_to_signer")

        /**
         * Use Legalesign email to send notification emails. If false suppresses all emails.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun doEmail(): Optional<Boolean> = doEmail.getOptional("do_email")

        /**
         * Text doc only. The footer for the final pdf. Use keyword \"default\" to use group default
         * footer.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun footer(): Optional<String> = footer.getOptional("footer")

        /**
         * Text based doc only. Pixel height of PDF footer, if used. 1px = 0.025cm
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun footerHeight(): Optional<Long> = footerHeight.getOptional("footer_height")

        /**
         * Text based doc only. The header for the final pdf. Use keyword \"default\" to use group
         * header footer.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun header(): Optional<String> = header.getOptional("header")

        /**
         * Text based doc only. Pixel height of final PDF footer, if used. 1px = 0.025cm
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun headerHeight(): Optional<Long> = headerHeight.getOptional("header_height")

        /**
         * Set a password. Must be ascii encode-able, you must also set signature_type to 4 and
         * choose a pdf_password_type.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pdfPassword(): Optional<String> = pdfPassword.getOptional("pdf_password")

        /**
         * 1 to store password, 2 for to delete from our records upon final signing.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pdfPasswordType(): Optional<PdfPasswordType> =
            pdfPasswordType.getOptional("pdf_password_type")

        /**
         * Assign values to PDF sender fields, use field labels as keys. Requires unique fields
         * labels. See also strict_fields.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pdftext(): Optional<Pdftext> = pdftext.getOptional("pdftext")

        /**
         * URL to send the signer to after signing (instead of download page). Your URL will include
         * query parameters with ID and state information as follows:
         * YOUR-URL?signer=[signer_uid]&doc=[doc_id]&group=[group_id]&signer_state=[signer_status]&doc_state=[doc_status]
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun redirect(): Optional<String> = redirect.getOptional("redirect")

        /**
         * Put 'default' if you wish to use the default reminder schedule in the group (go to web
         * app to set default schedule)
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun reminders(): Optional<String> = reminders.getOptional("reminders")

        /**
         * Return document links for signers in the response BODY.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun returnSignerLinks(): Optional<Boolean> =
            returnSignerLinks.getOptional("return_signer_links")

        /**
         * Use 4 to get your executed PDF Certified. Recommended. Defaults to 1 (uses a sha256 hash
         * for document integrity).
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun signatureType(): Optional<Long> = signatureType.getOptional("signature_type")

        /**
         * Notify signers in their order sequence. If false all are notified simulataneously.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun signersInOrder(): Optional<Boolean> = signersInOrder.getOptional("signers_in_order")

        /**
         * Add custom placeholders to signer fields, using labels as keys in an object (as for
         * pdftext). Relies on unique labelling.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun signertext(): Optional<Signertext> = signertext.getOptional("signertext")

        /**
         * pdftext fails silently for invalid field value, set to true to return an error
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun strictFields(): Optional<Boolean> = strictFields.getOptional("strict_fields")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tag(): Optional<String> = tag.getOptional("tag")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tag1(): Optional<String> = tag1.getOptional("tag1")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tag2(): Optional<String> = tag2.getOptional("tag2")

        /**
         * Resource URI of text template object. This call must contain either one of the attributes
         * text, templatepdf, template.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun template(): Optional<String> = template.getOptional("template")

        /**
         * Resource URI of templatepdf object. This API call must contain either one of the
         * attributes text, templatepdf, template.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun templatepdf(): Optional<String> = templatepdf.getOptional("templatepdf")

        /**
         * Raw html. This API call must contain either one of the attributes text, templatepdf,
         * template.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Assign document another user in the group. Defaults to API
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun user(): Optional<String> = user.getOptional("user")

        /**
         * Returns the raw JSON value of [group].
         *
         * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<String> = group

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [signers].
         *
         * Unlike [signers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signers") @ExcludeMissing fun _signers(): JsonField<List<Signer>> = signers

        /**
         * Returns the raw JSON value of [appendPdf].
         *
         * Unlike [appendPdf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("append_pdf") @ExcludeMissing fun _appendPdf(): JsonField<Boolean> = appendPdf

        /**
         * Returns the raw JSON value of [autoArchive].
         *
         * Unlike [autoArchive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auto_archive")
        @ExcludeMissing
        fun _autoArchive(): JsonField<Boolean> = autoArchive

        /**
         * Returns the raw JSON value of [ccEmails].
         *
         * Unlike [ccEmails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cc_emails") @ExcludeMissing fun _ccEmails(): JsonField<String> = ccEmails

        /**
         * Returns the raw JSON value of [convertSenderToSigner].
         *
         * Unlike [convertSenderToSigner], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("convert_sender_to_signer")
        @ExcludeMissing
        fun _convertSenderToSigner(): JsonField<Boolean> = convertSenderToSigner

        /**
         * Returns the raw JSON value of [doEmail].
         *
         * Unlike [doEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("do_email") @ExcludeMissing fun _doEmail(): JsonField<Boolean> = doEmail

        /**
         * Returns the raw JSON value of [footer].
         *
         * Unlike [footer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonField<String> = footer

        /**
         * Returns the raw JSON value of [footerHeight].
         *
         * Unlike [footerHeight], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("footer_height")
        @ExcludeMissing
        fun _footerHeight(): JsonField<Long> = footerHeight

        /**
         * Returns the raw JSON value of [header].
         *
         * Unlike [header], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("header") @ExcludeMissing fun _header(): JsonField<String> = header

        /**
         * Returns the raw JSON value of [headerHeight].
         *
         * Unlike [headerHeight], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("header_height")
        @ExcludeMissing
        fun _headerHeight(): JsonField<Long> = headerHeight

        /**
         * Returns the raw JSON value of [pdfPassword].
         *
         * Unlike [pdfPassword], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pdf_password")
        @ExcludeMissing
        fun _pdfPassword(): JsonField<String> = pdfPassword

        /**
         * Returns the raw JSON value of [pdfPasswordType].
         *
         * Unlike [pdfPasswordType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pdf_password_type")
        @ExcludeMissing
        fun _pdfPasswordType(): JsonField<PdfPasswordType> = pdfPasswordType

        /**
         * Returns the raw JSON value of [pdftext].
         *
         * Unlike [pdftext], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pdftext") @ExcludeMissing fun _pdftext(): JsonField<Pdftext> = pdftext

        /**
         * Returns the raw JSON value of [redirect].
         *
         * Unlike [redirect], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("redirect") @ExcludeMissing fun _redirect(): JsonField<String> = redirect

        /**
         * Returns the raw JSON value of [reminders].
         *
         * Unlike [reminders], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reminders") @ExcludeMissing fun _reminders(): JsonField<String> = reminders

        /**
         * Returns the raw JSON value of [returnSignerLinks].
         *
         * Unlike [returnSignerLinks], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("return_signer_links")
        @ExcludeMissing
        fun _returnSignerLinks(): JsonField<Boolean> = returnSignerLinks

        /**
         * Returns the raw JSON value of [signatureType].
         *
         * Unlike [signatureType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("signature_type")
        @ExcludeMissing
        fun _signatureType(): JsonField<Long> = signatureType

        /**
         * Returns the raw JSON value of [signersInOrder].
         *
         * Unlike [signersInOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("signers_in_order")
        @ExcludeMissing
        fun _signersInOrder(): JsonField<Boolean> = signersInOrder

        /**
         * Returns the raw JSON value of [signertext].
         *
         * Unlike [signertext], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signertext")
        @ExcludeMissing
        fun _signertext(): JsonField<Signertext> = signertext

        /**
         * Returns the raw JSON value of [strictFields].
         *
         * Unlike [strictFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("strict_fields")
        @ExcludeMissing
        fun _strictFields(): JsonField<Boolean> = strictFields

        /**
         * Returns the raw JSON value of [tag].
         *
         * Unlike [tag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag") @ExcludeMissing fun _tag(): JsonField<String> = tag

        /**
         * Returns the raw JSON value of [tag1].
         *
         * Unlike [tag1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag1") @ExcludeMissing fun _tag1(): JsonField<String> = tag1

        /**
         * Returns the raw JSON value of [tag2].
         *
         * Unlike [tag2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag2") @ExcludeMissing fun _tag2(): JsonField<String> = tag2

        /**
         * Returns the raw JSON value of [template].
         *
         * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<String> = template

        /**
         * Returns the raw JSON value of [templatepdf].
         *
         * Unlike [templatepdf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("templatepdf")
        @ExcludeMissing
        fun _templatepdf(): JsonField<String> = templatepdf

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [user].
         *
         * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .group()
             * .name()
             * .signers()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var group: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var signers: JsonField<MutableList<Signer>>? = null
            private var appendPdf: JsonField<Boolean> = JsonMissing.of()
            private var autoArchive: JsonField<Boolean> = JsonMissing.of()
            private var ccEmails: JsonField<String> = JsonMissing.of()
            private var convertSenderToSigner: JsonField<Boolean> = JsonMissing.of()
            private var doEmail: JsonField<Boolean> = JsonMissing.of()
            private var footer: JsonField<String> = JsonMissing.of()
            private var footerHeight: JsonField<Long> = JsonMissing.of()
            private var header: JsonField<String> = JsonMissing.of()
            private var headerHeight: JsonField<Long> = JsonMissing.of()
            private var pdfPassword: JsonField<String> = JsonMissing.of()
            private var pdfPasswordType: JsonField<PdfPasswordType> = JsonMissing.of()
            private var pdftext: JsonField<Pdftext> = JsonMissing.of()
            private var redirect: JsonField<String> = JsonMissing.of()
            private var reminders: JsonField<String> = JsonMissing.of()
            private var returnSignerLinks: JsonField<Boolean> = JsonMissing.of()
            private var signatureType: JsonField<Long> = JsonMissing.of()
            private var signersInOrder: JsonField<Boolean> = JsonMissing.of()
            private var signertext: JsonField<Signertext> = JsonMissing.of()
            private var strictFields: JsonField<Boolean> = JsonMissing.of()
            private var tag: JsonField<String> = JsonMissing.of()
            private var tag1: JsonField<String> = JsonMissing.of()
            private var tag2: JsonField<String> = JsonMissing.of()
            private var template: JsonField<String> = JsonMissing.of()
            private var templatepdf: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var user: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                group = body.group
                name = body.name
                signers = body.signers.map { it.toMutableList() }
                appendPdf = body.appendPdf
                autoArchive = body.autoArchive
                ccEmails = body.ccEmails
                convertSenderToSigner = body.convertSenderToSigner
                doEmail = body.doEmail
                footer = body.footer
                footerHeight = body.footerHeight
                header = body.header
                headerHeight = body.headerHeight
                pdfPassword = body.pdfPassword
                pdfPasswordType = body.pdfPasswordType
                pdftext = body.pdftext
                redirect = body.redirect
                reminders = body.reminders
                returnSignerLinks = body.returnSignerLinks
                signatureType = body.signatureType
                signersInOrder = body.signersInOrder
                signertext = body.signertext
                strictFields = body.strictFields
                tag = body.tag
                tag1 = body.tag1
                tag2 = body.tag2
                template = body.template
                templatepdf = body.templatepdf
                text = body.text
                user = body.user
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun group(group: String) = group(JsonField.of(group))

            /**
             * Sets [Builder.group] to an arbitrary JSON value.
             *
             * You should usually call [Builder.group] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun group(group: JsonField<String>) = apply { this.group = group }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun signers(signers: List<Signer>) = signers(JsonField.of(signers))

            /**
             * Sets [Builder.signers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signers] with a well-typed `List<Signer>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signers(signers: JsonField<List<Signer>>) = apply {
                this.signers = signers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Signer] to [signers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSigner(signer: Signer) = apply {
                signers =
                    (signers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("signers", it).add(signer)
                    }
            }

            /**
             * Append Legalesign validation info to final PDF. If not included uses the group
             * default.
             */
            fun appendPdf(appendPdf: Boolean) = appendPdf(JsonField.of(appendPdf))

            /**
             * Sets [Builder.appendPdf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appendPdf] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun appendPdf(appendPdf: JsonField<Boolean>) = apply { this.appendPdf = appendPdf }

            /** Send to archive soon after signing. Keeps web app clutter free */
            fun autoArchive(autoArchive: Boolean) = autoArchive(JsonField.of(autoArchive))

            /**
             * Sets [Builder.autoArchive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoArchive] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoArchive(autoArchive: JsonField<Boolean>) = apply {
                this.autoArchive = autoArchive
            }

            /**
             * Comma delimited string of email addresses that are notified of signing or rejection.
             */
            fun ccEmails(ccEmails: String) = ccEmails(JsonField.of(ccEmails))

            /**
             * Sets [Builder.ccEmails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ccEmails] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ccEmails(ccEmails: JsonField<String>) = apply { this.ccEmails = ccEmails }

            /**
             * If any sender fields are left blank, convert them to fields for the first recipient.
             */
            fun convertSenderToSigner(convertSenderToSigner: Boolean) =
                convertSenderToSigner(JsonField.of(convertSenderToSigner))

            /**
             * Sets [Builder.convertSenderToSigner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.convertSenderToSigner] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun convertSenderToSigner(convertSenderToSigner: JsonField<Boolean>) = apply {
                this.convertSenderToSigner = convertSenderToSigner
            }

            /** Use Legalesign email to send notification emails. If false suppresses all emails. */
            fun doEmail(doEmail: Boolean) = doEmail(JsonField.of(doEmail))

            /**
             * Sets [Builder.doEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.doEmail] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun doEmail(doEmail: JsonField<Boolean>) = apply { this.doEmail = doEmail }

            /**
             * Text doc only. The footer for the final pdf. Use keyword \"default\" to use group
             * default footer.
             */
            fun footer(footer: String) = footer(JsonField.of(footer))

            /**
             * Sets [Builder.footer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.footer] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun footer(footer: JsonField<String>) = apply { this.footer = footer }

            /** Text based doc only. Pixel height of PDF footer, if used. 1px = 0.025cm */
            fun footerHeight(footerHeight: Long) = footerHeight(JsonField.of(footerHeight))

            /**
             * Sets [Builder.footerHeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.footerHeight] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun footerHeight(footerHeight: JsonField<Long>) = apply {
                this.footerHeight = footerHeight
            }

            /**
             * Text based doc only. The header for the final pdf. Use keyword \"default\" to use
             * group header footer.
             */
            fun header(header: String) = header(JsonField.of(header))

            /**
             * Sets [Builder.header] to an arbitrary JSON value.
             *
             * You should usually call [Builder.header] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun header(header: JsonField<String>) = apply { this.header = header }

            /** Text based doc only. Pixel height of final PDF footer, if used. 1px = 0.025cm */
            fun headerHeight(headerHeight: Long) = headerHeight(JsonField.of(headerHeight))

            /**
             * Sets [Builder.headerHeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headerHeight] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headerHeight(headerHeight: JsonField<Long>) = apply {
                this.headerHeight = headerHeight
            }

            /**
             * Set a password. Must be ascii encode-able, you must also set signature_type to 4 and
             * choose a pdf_password_type.
             */
            fun pdfPassword(pdfPassword: String) = pdfPassword(JsonField.of(pdfPassword))

            /**
             * Sets [Builder.pdfPassword] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pdfPassword] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pdfPassword(pdfPassword: JsonField<String>) = apply {
                this.pdfPassword = pdfPassword
            }

            /** 1 to store password, 2 for to delete from our records upon final signing. */
            fun pdfPasswordType(pdfPasswordType: PdfPasswordType) =
                pdfPasswordType(JsonField.of(pdfPasswordType))

            /**
             * Sets [Builder.pdfPasswordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pdfPasswordType] with a well-typed [PdfPasswordType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun pdfPasswordType(pdfPasswordType: JsonField<PdfPasswordType>) = apply {
                this.pdfPasswordType = pdfPasswordType
            }

            /**
             * Assign values to PDF sender fields, use field labels as keys. Requires unique fields
             * labels. See also strict_fields.
             */
            fun pdftext(pdftext: Pdftext) = pdftext(JsonField.of(pdftext))

            /**
             * Sets [Builder.pdftext] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pdftext] with a well-typed [Pdftext] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pdftext(pdftext: JsonField<Pdftext>) = apply { this.pdftext = pdftext }

            /**
             * URL to send the signer to after signing (instead of download page). Your URL will
             * include query parameters with ID and state information as follows:
             * YOUR-URL?signer=[signer_uid]&doc=[doc_id]&group=[group_id]&signer_state=[signer_status]&doc_state=[doc_status]
             */
            fun redirect(redirect: String) = redirect(JsonField.of(redirect))

            /**
             * Sets [Builder.redirect] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redirect] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun redirect(redirect: JsonField<String>) = apply { this.redirect = redirect }

            /**
             * Put 'default' if you wish to use the default reminder schedule in the group (go to
             * web app to set default schedule)
             */
            fun reminders(reminders: String) = reminders(JsonField.of(reminders))

            /**
             * Sets [Builder.reminders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reminders] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reminders(reminders: JsonField<String>) = apply { this.reminders = reminders }

            /** Return document links for signers in the response BODY. */
            fun returnSignerLinks(returnSignerLinks: Boolean) =
                returnSignerLinks(JsonField.of(returnSignerLinks))

            /**
             * Sets [Builder.returnSignerLinks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnSignerLinks] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnSignerLinks(returnSignerLinks: JsonField<Boolean>) = apply {
                this.returnSignerLinks = returnSignerLinks
            }

            /**
             * Use 4 to get your executed PDF Certified. Recommended. Defaults to 1 (uses a sha256
             * hash for document integrity).
             */
            fun signatureType(signatureType: Long) = signatureType(JsonField.of(signatureType))

            /**
             * Sets [Builder.signatureType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signatureType] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signatureType(signatureType: JsonField<Long>) = apply {
                this.signatureType = signatureType
            }

            /**
             * Notify signers in their order sequence. If false all are notified simulataneously.
             */
            fun signersInOrder(signersInOrder: Boolean) =
                signersInOrder(JsonField.of(signersInOrder))

            /**
             * Sets [Builder.signersInOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signersInOrder] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signersInOrder(signersInOrder: JsonField<Boolean>) = apply {
                this.signersInOrder = signersInOrder
            }

            /**
             * Add custom placeholders to signer fields, using labels as keys in an object (as for
             * pdftext). Relies on unique labelling.
             */
            fun signertext(signertext: Signertext) = signertext(JsonField.of(signertext))

            /**
             * Sets [Builder.signertext] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signertext] with a well-typed [Signertext] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signertext(signertext: JsonField<Signertext>) = apply {
                this.signertext = signertext
            }

            /** pdftext fails silently for invalid field value, set to true to return an error */
            fun strictFields(strictFields: Boolean) = strictFields(JsonField.of(strictFields))

            /**
             * Sets [Builder.strictFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.strictFields] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun strictFields(strictFields: JsonField<Boolean>) = apply {
                this.strictFields = strictFields
            }

            fun tag(tag: String) = tag(JsonField.of(tag))

            /**
             * Sets [Builder.tag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag(tag: JsonField<String>) = apply { this.tag = tag }

            fun tag1(tag1: String) = tag1(JsonField.of(tag1))

            /**
             * Sets [Builder.tag1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag1] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag1(tag1: JsonField<String>) = apply { this.tag1 = tag1 }

            fun tag2(tag2: String) = tag2(JsonField.of(tag2))

            /**
             * Sets [Builder.tag2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tag2] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tag2(tag2: JsonField<String>) = apply { this.tag2 = tag2 }

            /**
             * Resource URI of text template object. This call must contain either one of the
             * attributes text, templatepdf, template.
             */
            fun template(template: String) = template(JsonField.of(template))

            /**
             * Sets [Builder.template] to an arbitrary JSON value.
             *
             * You should usually call [Builder.template] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun template(template: JsonField<String>) = apply { this.template = template }

            /**
             * Resource URI of templatepdf object. This API call must contain either one of the
             * attributes text, templatepdf, template.
             */
            fun templatepdf(templatepdf: String) = templatepdf(JsonField.of(templatepdf))

            /**
             * Sets [Builder.templatepdf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templatepdf] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun templatepdf(templatepdf: JsonField<String>) = apply {
                this.templatepdf = templatepdf
            }

            /**
             * Raw html. This API call must contain either one of the attributes text, templatepdf,
             * template.
             */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** Assign document another user in the group. Defaults to API */
            fun user(user: String) = user(JsonField.of(user))

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun user(user: JsonField<String>) = apply { this.user = user }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .group()
             * .name()
             * .signers()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("group", group),
                    checkRequired("name", name),
                    checkRequired("signers", signers).map { it.toImmutable() },
                    appendPdf,
                    autoArchive,
                    ccEmails,
                    convertSenderToSigner,
                    doEmail,
                    footer,
                    footerHeight,
                    header,
                    headerHeight,
                    pdfPassword,
                    pdfPasswordType,
                    pdftext,
                    redirect,
                    reminders,
                    returnSignerLinks,
                    signatureType,
                    signersInOrder,
                    signertext,
                    strictFields,
                    tag,
                    tag1,
                    tag2,
                    template,
                    templatepdf,
                    text,
                    user,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            group()
            name()
            signers().forEach { it.validate() }
            appendPdf()
            autoArchive()
            ccEmails()
            convertSenderToSigner()
            doEmail()
            footer()
            footerHeight()
            header()
            headerHeight()
            pdfPassword()
            pdfPasswordType().ifPresent { it.validate() }
            pdftext().ifPresent { it.validate() }
            redirect()
            reminders()
            returnSignerLinks()
            signatureType()
            signersInOrder()
            signertext().ifPresent { it.validate() }
            strictFields()
            tag()
            tag1()
            tag2()
            template()
            templatepdf()
            text()
            user()
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
            (if (group.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (signers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (appendPdf.asKnown().isPresent) 1 else 0) +
                (if (autoArchive.asKnown().isPresent) 1 else 0) +
                (if (ccEmails.asKnown().isPresent) 1 else 0) +
                (if (convertSenderToSigner.asKnown().isPresent) 1 else 0) +
                (if (doEmail.asKnown().isPresent) 1 else 0) +
                (if (footer.asKnown().isPresent) 1 else 0) +
                (if (footerHeight.asKnown().isPresent) 1 else 0) +
                (if (header.asKnown().isPresent) 1 else 0) +
                (if (headerHeight.asKnown().isPresent) 1 else 0) +
                (if (pdfPassword.asKnown().isPresent) 1 else 0) +
                (pdfPasswordType.asKnown().getOrNull()?.validity() ?: 0) +
                (pdftext.asKnown().getOrNull()?.validity() ?: 0) +
                (if (redirect.asKnown().isPresent) 1 else 0) +
                (if (reminders.asKnown().isPresent) 1 else 0) +
                (if (returnSignerLinks.asKnown().isPresent) 1 else 0) +
                (if (signatureType.asKnown().isPresent) 1 else 0) +
                (if (signersInOrder.asKnown().isPresent) 1 else 0) +
                (signertext.asKnown().getOrNull()?.validity() ?: 0) +
                (if (strictFields.asKnown().isPresent) 1 else 0) +
                (if (tag.asKnown().isPresent) 1 else 0) +
                (if (tag1.asKnown().isPresent) 1 else 0) +
                (if (tag2.asKnown().isPresent) 1 else 0) +
                (if (template.asKnown().isPresent) 1 else 0) +
                (if (templatepdf.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (user.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                group == other.group &&
                name == other.name &&
                signers == other.signers &&
                appendPdf == other.appendPdf &&
                autoArchive == other.autoArchive &&
                ccEmails == other.ccEmails &&
                convertSenderToSigner == other.convertSenderToSigner &&
                doEmail == other.doEmail &&
                footer == other.footer &&
                footerHeight == other.footerHeight &&
                header == other.header &&
                headerHeight == other.headerHeight &&
                pdfPassword == other.pdfPassword &&
                pdfPasswordType == other.pdfPasswordType &&
                pdftext == other.pdftext &&
                redirect == other.redirect &&
                reminders == other.reminders &&
                returnSignerLinks == other.returnSignerLinks &&
                signatureType == other.signatureType &&
                signersInOrder == other.signersInOrder &&
                signertext == other.signertext &&
                strictFields == other.strictFields &&
                tag == other.tag &&
                tag1 == other.tag1 &&
                tag2 == other.tag2 &&
                template == other.template &&
                templatepdf == other.templatepdf &&
                text == other.text &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                group,
                name,
                signers,
                appendPdf,
                autoArchive,
                ccEmails,
                convertSenderToSigner,
                doEmail,
                footer,
                footerHeight,
                header,
                headerHeight,
                pdfPassword,
                pdfPasswordType,
                pdftext,
                redirect,
                reminders,
                returnSignerLinks,
                signatureType,
                signersInOrder,
                signertext,
                strictFields,
                tag,
                tag1,
                tag2,
                template,
                templatepdf,
                text,
                user,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{group=$group, name=$name, signers=$signers, appendPdf=$appendPdf, autoArchive=$autoArchive, ccEmails=$ccEmails, convertSenderToSigner=$convertSenderToSigner, doEmail=$doEmail, footer=$footer, footerHeight=$footerHeight, header=$header, headerHeight=$headerHeight, pdfPassword=$pdfPassword, pdfPasswordType=$pdfPasswordType, pdftext=$pdftext, redirect=$redirect, reminders=$reminders, returnSignerLinks=$returnSignerLinks, signatureType=$signatureType, signersInOrder=$signersInOrder, signertext=$signertext, strictFields=$strictFields, tag=$tag, tag1=$tag1, tag2=$tag2, template=$template, templatepdf=$templatepdf, text=$text, user=$user, additionalProperties=$additionalProperties}"
    }

    class Signer
    private constructor(
        private val email: JsonField<String>,
        private val firstname: JsonField<String>,
        private val lastname: JsonField<String>,
        private val attachments: JsonField<List<String>>,
        private val behalfof: JsonField<String>,
        private val decideLater: JsonField<Boolean>,
        private val expires: JsonField<OffsetDateTime>,
        private val message: JsonField<String>,
        private val order: JsonField<Int>,
        private val reviewers: JsonField<List<Reviewer>>,
        private val role: JsonField<Role>,
        private val sms: JsonField<String>,
        private val subject: JsonField<String>,
        private val timezone: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("firstname")
            @ExcludeMissing
            firstname: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastname")
            @ExcludeMissing
            lastname: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attachments")
            @ExcludeMissing
            attachments: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("behalfof")
            @ExcludeMissing
            behalfof: JsonField<String> = JsonMissing.of(),
            @JsonProperty("decide_later")
            @ExcludeMissing
            decideLater: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("expires")
            @ExcludeMissing
            expires: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("reviewers")
            @ExcludeMissing
            reviewers: JsonField<List<Reviewer>> = JsonMissing.of(),
            @JsonProperty("role") @ExcludeMissing role: JsonField<Role> = JsonMissing.of(),
            @JsonProperty("sms") @ExcludeMissing sms: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        ) : this(
            email,
            firstname,
            lastname,
            attachments,
            behalfof,
            decideLater,
            expires,
            message,
            order,
            reviewers,
            role,
            sms,
            subject,
            timezone,
            mutableMapOf(),
        )

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstname(): String = firstname.getRequired("firstname")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastname(): String = lastname.getRequired("lastname")

        /**
         * List of attachment resource URIs
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun attachments(): Optional<List<String>> = attachments.getOptional("attachments")

        /**
         * deprecated, do not use
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun behalfof(): Optional<String> = behalfof.getOptional("behalfof")

        /**
         * Add this you want the previous signer or approver to decide who the next person should
         * be. Commonly used for witnesses (see \"role\"). If you use this leave all other
         * attributes blank. First signer cannot use this attribute.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun decideLater(): Optional<Boolean> = decideLater.getOptional("decide_later")

        /**
         * ISO8601 formed datetime, set to TZ of sender or timezone if used
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expires(): Optional<OffsetDateTime> = expires.getOptional("expires")

        /**
         * Your personal message for the party, entered in the centre of the group email template.
         * Use the name of a saved email template preceeded by a hash symbol to use that template.
         * If there is more than one template of the same name it will select the one last modified.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun message(): Optional<String> = message.getOptional("message")

        /**
         * Zero-indexed signer ordering, deprecated. Ordering of signers/witnesses/approvers is now
         * the natural order of your signers list.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun order(): Optional<Int> = order.getOptional("order")

        /**
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun reviewers(): Optional<List<Reviewer>> = reviewers.getOptional("reviewers")

        /**
         * If this person is a witness use \"witness\". Required where a witness is defined in your
         * PDF. If this person is a normal signer, use \"approver\" to switch to an approver role.
         * Witnesses and witnessed signers also require \"sms\" (see also \"decide_later\").
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun role(): Optional<Role> = role.getOptional("role")

        /**
         * Use international format number to add SMS verification. Required if a witness or a
         * witnessed signer.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sms(): Optional<String> = sms.getOptional("sms")

        /**
         * Subject line for outbound email
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun subject(): Optional<String> = subject.getOptional("subject")

        /**
         * TZ of the signer, must be valid TZ as per timezoneenum (see User for timezoneenum
         * details). If blank uses tz of the sender.
         *
         * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun timezone(): Optional<String> = timezone.getOptional("timezone")

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [firstname].
         *
         * Unlike [firstname], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("firstname") @ExcludeMissing fun _firstname(): JsonField<String> = firstname

        /**
         * Returns the raw JSON value of [lastname].
         *
         * Unlike [lastname], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastname") @ExcludeMissing fun _lastname(): JsonField<String> = lastname

        /**
         * Returns the raw JSON value of [attachments].
         *
         * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attachments")
        @ExcludeMissing
        fun _attachments(): JsonField<List<String>> = attachments

        /**
         * Returns the raw JSON value of [behalfof].
         *
         * Unlike [behalfof], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("behalfof")
        @ExcludeMissing
        fun _behalfof(): JsonField<String> = behalfof

        /**
         * Returns the raw JSON value of [decideLater].
         *
         * Unlike [decideLater], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("decide_later")
        @ExcludeMissing
        fun _decideLater(): JsonField<Boolean> = decideLater

        /**
         * Returns the raw JSON value of [expires].
         *
         * Unlike [expires], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires") @ExcludeMissing fun _expires(): JsonField<OffsetDateTime> = expires

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("order")
        @ExcludeMissing
        fun _order(): JsonField<Int> = order

        /**
         * Returns the raw JSON value of [reviewers].
         *
         * Unlike [reviewers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reviewers")
        @ExcludeMissing
        fun _reviewers(): JsonField<List<Reviewer>> = reviewers

        /**
         * Returns the raw JSON value of [role].
         *
         * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("role")
        @ExcludeMissing
        fun _role(): JsonField<Role> = role

        /**
         * Returns the raw JSON value of [sms].
         *
         * Unlike [sms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sms") @ExcludeMissing fun _sms(): JsonField<String> = sms

        /**
         * Returns the raw JSON value of [subject].
         *
         * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

        /**
         * Returns the raw JSON value of [timezone].
         *
         * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

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
             * Returns a mutable builder for constructing an instance of [Signer].
             *
             * The following fields are required:
             * ```java
             * .email()
             * .firstname()
             * .lastname()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Signer]. */
        class Builder internal constructor() {

            private var email: JsonField<String>? = null
            private var firstname: JsonField<String>? = null
            private var lastname: JsonField<String>? = null
            private var attachments: JsonField<MutableList<String>>? = null
            private var behalfof: JsonField<String> = JsonMissing.of()
            private var decideLater: JsonField<Boolean> = JsonMissing.of()
            private var expires: JsonField<OffsetDateTime> = JsonMissing.of()
            private var message: JsonField<String> = JsonMissing.of()
            private var order: JsonField<Int> = JsonMissing.of()
            private var reviewers: JsonField<MutableList<Reviewer>>? = null
            private var role: JsonField<Role> = JsonMissing.of()
            private var sms: JsonField<String> = JsonMissing.of()
            private var subject: JsonField<String> = JsonMissing.of()
            private var timezone: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(signer: Signer) = apply {
                email = signer.email
                firstname = signer.firstname
                lastname = signer.lastname
                attachments = signer.attachments.map { it.toMutableList() }
                behalfof = signer.behalfof
                decideLater = signer.decideLater
                expires = signer.expires
                message = signer.message
                order = signer.order
                reviewers = signer.reviewers.map { it.toMutableList() }
                role = signer.role
                sms = signer.sms
                subject = signer.subject
                timezone = signer.timezone
                additionalProperties = signer.additionalProperties.toMutableMap()
            }

            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun firstname(firstname: String) = firstname(JsonField.of(firstname))

            /**
             * Sets [Builder.firstname] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstname] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstname(firstname: JsonField<String>) = apply { this.firstname = firstname }

            fun lastname(lastname: String) = lastname(JsonField.of(lastname))

            /**
             * Sets [Builder.lastname] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastname] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastname(lastname: JsonField<String>) = apply { this.lastname = lastname }

            /** List of attachment resource URIs */
            fun attachments(attachments: List<String>) = attachments(JsonField.of(attachments))

            /**
             * Sets [Builder.attachments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachments] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attachments(attachments: JsonField<List<String>>) = apply {
                this.attachments = attachments.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [attachments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttachment(attachment: String) = apply {
                attachments =
                    (attachments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("attachments", it).add(attachment)
                    }
            }

            /** deprecated, do not use */
            @Deprecated("deprecated")
            fun behalfof(behalfof: String) = behalfof(JsonField.of(behalfof))

            /**
             * Sets [Builder.behalfof] to an arbitrary JSON value.
             *
             * You should usually call [Builder.behalfof] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun behalfof(behalfof: JsonField<String>) = apply { this.behalfof = behalfof }

            /**
             * Add this you want the previous signer or approver to decide who the next person
             * should be. Commonly used for witnesses (see \"role\"). If you use this leave all
             * other attributes blank. First signer cannot use this attribute.
             */
            fun decideLater(decideLater: Boolean) = decideLater(JsonField.of(decideLater))

            /**
             * Sets [Builder.decideLater] to an arbitrary JSON value.
             *
             * You should usually call [Builder.decideLater] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun decideLater(decideLater: JsonField<Boolean>) = apply {
                this.decideLater = decideLater
            }

            /** ISO8601 formed datetime, set to TZ of sender or timezone if used */
            fun expires(expires: OffsetDateTime?) = expires(JsonField.ofNullable(expires))

            /** Alias for calling [Builder.expires] with `expires.orElse(null)`. */
            fun expires(expires: Optional<OffsetDateTime>) = expires(expires.getOrNull())

            /**
             * Sets [Builder.expires] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expires] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expires(expires: JsonField<OffsetDateTime>) = apply { this.expires = expires }

            /**
             * Your personal message for the party, entered in the centre of the group email
             * template. Use the name of a saved email template preceeded by a hash symbol to use
             * that template. If there is more than one template of the same name it will select the
             * one last modified.
             */
            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /**
             * Zero-indexed signer ordering, deprecated. Ordering of signers/witnesses/approvers is
             * now the natural order of your signers list.
             */
            @Deprecated("deprecated") fun order(order: Int) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            @Deprecated("deprecated")
            fun order(order: JsonField<Int>) = apply { this.order = order }

            fun reviewers(reviewers: List<Reviewer>) = reviewers(JsonField.of(reviewers))

            /**
             * Sets [Builder.reviewers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reviewers] with a well-typed `List<Reviewer>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reviewers(reviewers: JsonField<List<Reviewer>>) = apply {
                this.reviewers = reviewers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Reviewer] to [reviewers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReviewer(reviewer: Reviewer) = apply {
                reviewers =
                    (reviewers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("reviewers", it).add(reviewer)
                    }
            }

            /**
             * If this person is a witness use \"witness\". Required where a witness is defined in
             * your PDF. If this person is a normal signer, use \"approver\" to switch to an
             * approver role. Witnesses and witnessed signers also require \"sms\" (see also
             * \"decide_later\").
             */
            @Deprecated("deprecated") fun role(role: Role) = role(JsonField.of(role))

            /**
             * Sets [Builder.role] to an arbitrary JSON value.
             *
             * You should usually call [Builder.role] with a well-typed [Role] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            @Deprecated("deprecated") fun role(role: JsonField<Role>) = apply { this.role = role }

            /**
             * Use international format number to add SMS verification. Required if a witness or a
             * witnessed signer.
             */
            fun sms(sms: String) = sms(JsonField.of(sms))

            /**
             * Sets [Builder.sms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sms] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sms(sms: JsonField<String>) = apply { this.sms = sms }

            /** Subject line for outbound email */
            fun subject(subject: String) = subject(JsonField.of(subject))

            /**
             * Sets [Builder.subject] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subject] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subject(subject: JsonField<String>) = apply { this.subject = subject }

            /**
             * TZ of the signer, must be valid TZ as per timezoneenum (see User for timezoneenum
             * details). If blank uses tz of the sender.
             */
            fun timezone(timezone: String) = timezone(JsonField.of(timezone))

            /**
             * Sets [Builder.timezone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timezone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
             * Returns an immutable instance of [Signer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .email()
             * .firstname()
             * .lastname()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Signer =
                Signer(
                    checkRequired("email", email),
                    checkRequired("firstname", firstname),
                    checkRequired("lastname", lastname),
                    (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                    behalfof,
                    decideLater,
                    expires,
                    message,
                    order,
                    (reviewers ?: JsonMissing.of()).map { it.toImmutable() },
                    role,
                    sms,
                    subject,
                    timezone,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Signer = apply {
            if (validated) {
                return@apply
            }

            email()
            firstname()
            lastname()
            attachments()
            behalfof()
            decideLater()
            expires()
            message()
            order()
            reviewers().ifPresent { it.forEach { it.validate() } }
            role().ifPresent { it.validate() }
            sms()
            subject()
            timezone()
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
            (if (email.asKnown().isPresent) 1 else 0) +
                (if (firstname.asKnown().isPresent) 1 else 0) +
                (if (lastname.asKnown().isPresent) 1 else 0) +
                (attachments.asKnown().getOrNull()?.size ?: 0) +
                (if (behalfof.asKnown().isPresent) 1 else 0) +
                (if (decideLater.asKnown().isPresent) 1 else 0) +
                (if (expires.asKnown().isPresent) 1 else 0) +
                (if (message.asKnown().isPresent) 1 else 0) +
                (if (order.asKnown().isPresent) 1 else 0) +
                (reviewers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (role.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sms.asKnown().isPresent) 1 else 0) +
                (if (subject.asKnown().isPresent) 1 else 0) +
                (if (timezone.asKnown().isPresent) 1 else 0)

        /**
         * Create a reviewer. A reviewer is linked to a signer and receives emailed copies of draft
         * and signed documents. N.B. they only receive them if their associated signer does.
         * Therefore make sure your admin/experience settings are set to attach PDFs to your signer
         * emails. You can set to include the signing link to a reviewer, and thereby hit the use
         * case to send a document to a group of people where the first who signs, signs.
         */
        class Reviewer
        private constructor(
            private val email: JsonField<String>,
            private val firstname: JsonField<String>,
            private val includeLink: JsonField<Boolean>,
            private val lastname: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("firstname")
                @ExcludeMissing
                firstname: JsonField<String> = JsonMissing.of(),
                @JsonProperty("include_link")
                @ExcludeMissing
                includeLink: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("lastname")
                @ExcludeMissing
                lastname: JsonField<String> = JsonMissing.of(),
            ) : this(email, firstname, includeLink, lastname, mutableMapOf())

            /**
             * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun email(): String = email.getRequired("email")

            /**
             * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun firstname(): Optional<String> = firstname.getOptional("firstname")

            /**
             * include a link to the signing pages enabling a reviewer to signer
             *
             * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun includeLink(): Optional<Boolean> = includeLink.getOptional("include_link")

            /**
             * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lastname(): Optional<String> = lastname.getOptional("lastname")

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [firstname].
             *
             * Unlike [firstname], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("firstname")
            @ExcludeMissing
            fun _firstname(): JsonField<String> = firstname

            /**
             * Returns the raw JSON value of [includeLink].
             *
             * Unlike [includeLink], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("include_link")
            @ExcludeMissing
            fun _includeLink(): JsonField<Boolean> = includeLink

            /**
             * Returns the raw JSON value of [lastname].
             *
             * Unlike [lastname], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("lastname") @ExcludeMissing fun _lastname(): JsonField<String> = lastname

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
                 * Returns a mutable builder for constructing an instance of [Reviewer].
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Reviewer]. */
            class Builder internal constructor() {

                private var email: JsonField<String>? = null
                private var firstname: JsonField<String> = JsonMissing.of()
                private var includeLink: JsonField<Boolean> = JsonMissing.of()
                private var lastname: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(reviewer: Reviewer) = apply {
                    email = reviewer.email
                    firstname = reviewer.firstname
                    includeLink = reviewer.includeLink
                    lastname = reviewer.lastname
                    additionalProperties = reviewer.additionalProperties.toMutableMap()
                }

                fun email(email: String) = email(JsonField.of(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                fun firstname(firstname: String) = firstname(JsonField.of(firstname))

                /**
                 * Sets [Builder.firstname] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.firstname] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun firstname(firstname: JsonField<String>) = apply { this.firstname = firstname }

                /** include a link to the signing pages enabling a reviewer to signer */
                fun includeLink(includeLink: Boolean) = includeLink(JsonField.of(includeLink))

                /**
                 * Sets [Builder.includeLink] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.includeLink] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun includeLink(includeLink: JsonField<Boolean>) = apply {
                    this.includeLink = includeLink
                }

                fun lastname(lastname: String) = lastname(JsonField.of(lastname))

                /**
                 * Sets [Builder.lastname] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastname] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lastname(lastname: JsonField<String>) = apply { this.lastname = lastname }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Reviewer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Reviewer =
                    Reviewer(
                        checkRequired("email", email),
                        firstname,
                        includeLink,
                        lastname,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Reviewer = apply {
                if (validated) {
                    return@apply
                }

                email()
                firstname()
                includeLink()
                lastname()
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
                (if (email.asKnown().isPresent) 1 else 0) +
                    (if (firstname.asKnown().isPresent) 1 else 0) +
                    (if (includeLink.asKnown().isPresent) 1 else 0) +
                    (if (lastname.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Reviewer &&
                    email == other.email &&
                    firstname == other.firstname &&
                    includeLink == other.includeLink &&
                    lastname == other.lastname &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(email, firstname, includeLink, lastname, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Reviewer{email=$email, firstname=$firstname, includeLink=$includeLink, lastname=$lastname, additionalProperties=$additionalProperties}"
        }

        /**
         * If this person is a witness use \"witness\". Required where a witness is defined in your
         * PDF. If this person is a normal signer, use \"approver\" to switch to an approver role.
         * Witnesses and witnessed signers also require \"sms\" (see also \"decide_later\").
         */
        @Deprecated("deprecated")
        class Role @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val WITNESS = of("witness")

                @JvmField val APPROVER = of("approver")

                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
            }

            /** An enum containing [Role]'s known values. */
            enum class Known {
                WITNESS,
                APPROVER,
            }

            /**
             * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Role] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WITNESS,
                APPROVER,
                /** An enum member indicating that [Role] was instantiated with an unknown value. */
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
                    WITNESS -> Value.WITNESS
                    APPROVER -> Value.APPROVER
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
                    WITNESS -> Known.WITNESS
                    APPROVER -> Known.APPROVER
                    else -> throw LegalesignSdkInvalidDataException("Unknown Role: $value")
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

            fun validate(): Role = apply {
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

                return other is Role && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Signer &&
                email == other.email &&
                firstname == other.firstname &&
                lastname == other.lastname &&
                attachments == other.attachments &&
                behalfof == other.behalfof &&
                decideLater == other.decideLater &&
                expires == other.expires &&
                message == other.message &&
                order == other.order &&
                reviewers == other.reviewers &&
                role == other.role &&
                sms == other.sms &&
                subject == other.subject &&
                timezone == other.timezone &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                email,
                firstname,
                lastname,
                attachments,
                behalfof,
                decideLater,
                expires,
                message,
                order,
                reviewers,
                role,
                sms,
                subject,
                timezone,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Signer{email=$email, firstname=$firstname, lastname=$lastname, attachments=$attachments, behalfof=$behalfof, decideLater=$decideLater, expires=$expires, message=$message, order=$order, reviewers=$reviewers, role=$role, sms=$sms, subject=$subject, timezone=$timezone, additionalProperties=$additionalProperties}"
    }

    /** 1 to store password, 2 for to delete from our records upon final signing. */
    class PdfPasswordType @JsonCreator private constructor(private val value: JsonField<Long>) :
        Enum {

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

            @JvmStatic fun of(value: Long) = PdfPasswordType(JsonField.of(value))
        }

        /** An enum containing [PdfPasswordType]'s known values. */
        enum class Known {
            _1,
            _2,
        }

        /**
         * An enum containing [PdfPasswordType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PdfPasswordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _1,
            _2,
            /**
             * An enum member indicating that [PdfPasswordType] was instantiated with an unknown
             * value.
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
                _1 -> Known._1
                _2 -> Known._2
                else -> throw LegalesignSdkInvalidDataException("Unknown PdfPasswordType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws LegalesignSdkInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asLong(): Long =
            _value().asNumber().getOrNull()?.let {
                if (it.toDouble() % 1 == 0.0) it.toLong() else null
            } ?: throw LegalesignSdkInvalidDataException("Value is not a Long")

        private var validated: Boolean = false

        fun validate(): PdfPasswordType = apply {
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

            return other is PdfPasswordType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Assign values to PDF sender fields, use field labels as keys. Requires unique fields labels.
     * See also strict_fields.
     */
    class Pdftext
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Pdftext]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Pdftext]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pdftext: Pdftext) = apply {
                additionalProperties = pdftext.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Pdftext].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Pdftext = Pdftext(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Pdftext = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pdftext && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Pdftext{additionalProperties=$additionalProperties}"
    }

    /**
     * Add custom placeholders to signer fields, using labels as keys in an object (as for pdftext).
     * Relies on unique labelling.
     */
    class Signertext
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Signertext]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Signertext]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(signertext: Signertext) = apply {
                additionalProperties = signertext.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Signertext].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Signertext = Signertext(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Signertext = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Signertext && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Signertext{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DocumentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
