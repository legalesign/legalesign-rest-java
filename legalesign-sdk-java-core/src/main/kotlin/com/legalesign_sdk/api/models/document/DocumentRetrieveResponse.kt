// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.document

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.legalesign_sdk.api.core.ExcludeMissing
import com.legalesign_sdk.api.core.JsonField
import com.legalesign_sdk.api.core.JsonMissing
import com.legalesign_sdk.api.core.JsonValue
import com.legalesign_sdk.api.core.checkKnown
import com.legalesign_sdk.api.core.toImmutable
import com.legalesign_sdk.api.errors.LegalesignSdkInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DocumentRetrieveResponse
private constructor(
    private val archived: JsonField<Boolean>,
    private val autoArchive: JsonField<Boolean>,
    private val ccEmails: JsonField<String>,
    private val created: JsonField<OffsetDateTime>,
    private val doEmail: JsonField<Boolean>,
    private val downloadFinal: JsonField<Boolean>,
    private val footer: JsonField<String>,
    private val footerHeight: JsonField<Long>,
    private val group: JsonField<String>,
    private val hasFields: JsonField<Boolean>,
    private val hashValue: JsonField<String>,
    private val header: JsonField<String>,
    private val headerHeight: JsonField<Long>,
    private val modified: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val pdfPassword: JsonField<String>,
    private val pdfPasswordType: JsonField<String>,
    private val pdftext: JsonField<String>,
    private val redirect: JsonField<String>,
    private val resourceUri: JsonField<String>,
    private val returnSignerLinks: JsonField<Boolean>,
    private val signMouse: JsonField<Boolean>,
    private val signTime: JsonField<OffsetDateTime>,
    private val signType: JsonField<Boolean>,
    private val signUpload: JsonField<Boolean>,
    private val signaturePlacement: JsonField<Long>,
    private val signatureType: JsonField<Long>,
    private val signers: JsonField<List<List<String>>>,
    private val signersInOrder: JsonField<Boolean>,
    private val status: JsonField<DocumentStatusEnum>,
    private val tag: JsonField<String>,
    private val tag1: JsonField<String>,
    private val tag2: JsonField<String>,
    private val template: JsonField<String>,
    private val templatepdf: JsonField<String>,
    private val text: JsonField<String>,
    private val user: JsonField<String>,
    private val uuid: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("auto_archive")
        @ExcludeMissing
        autoArchive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("cc_emails") @ExcludeMissing ccEmails: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("do_email") @ExcludeMissing doEmail: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("download_final")
        @ExcludeMissing
        downloadFinal: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("footer") @ExcludeMissing footer: JsonField<String> = JsonMissing.of(),
        @JsonProperty("footer_height")
        @ExcludeMissing
        footerHeight: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("group") @ExcludeMissing group: JsonField<String> = JsonMissing.of(),
        @JsonProperty("has_fields")
        @ExcludeMissing
        hasFields: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hash_value") @ExcludeMissing hashValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("header") @ExcludeMissing header: JsonField<String> = JsonMissing.of(),
        @JsonProperty("header_height")
        @ExcludeMissing
        headerHeight: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("modified")
        @ExcludeMissing
        modified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pdf_password")
        @ExcludeMissing
        pdfPassword: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pdf_password_type")
        @ExcludeMissing
        pdfPasswordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pdftext") @ExcludeMissing pdftext: JsonField<String> = JsonMissing.of(),
        @JsonProperty("redirect") @ExcludeMissing redirect: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resource_uri")
        @ExcludeMissing
        resourceUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("return_signer_links")
        @ExcludeMissing
        returnSignerLinks: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sign_mouse")
        @ExcludeMissing
        signMouse: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sign_time")
        @ExcludeMissing
        signTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sign_type") @ExcludeMissing signType: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sign_upload")
        @ExcludeMissing
        signUpload: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("signature_placement")
        @ExcludeMissing
        signaturePlacement: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("signature_type")
        @ExcludeMissing
        signatureType: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("signers")
        @ExcludeMissing
        signers: JsonField<List<List<String>>> = JsonMissing.of(),
        @JsonProperty("signers_in_order")
        @ExcludeMissing
        signersInOrder: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<DocumentStatusEnum> = JsonMissing.of(),
        @JsonProperty("tag") @ExcludeMissing tag: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tag1") @ExcludeMissing tag1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tag2") @ExcludeMissing tag2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("template") @ExcludeMissing template: JsonField<String> = JsonMissing.of(),
        @JsonProperty("templatepdf")
        @ExcludeMissing
        templatepdf: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uuid") @ExcludeMissing uuid: JsonField<String> = JsonMissing.of(),
    ) : this(
        archived,
        autoArchive,
        ccEmails,
        created,
        doEmail,
        downloadFinal,
        footer,
        footerHeight,
        group,
        hasFields,
        hashValue,
        header,
        headerHeight,
        modified,
        name,
        pdfPassword,
        pdfPasswordType,
        pdftext,
        redirect,
        resourceUri,
        returnSignerLinks,
        signMouse,
        signTime,
        signType,
        signUpload,
        signaturePlacement,
        signatureType,
        signers,
        signersInOrder,
        status,
        tag,
        tag1,
        tag2,
        template,
        templatepdf,
        text,
        user,
        uuid,
        mutableMapOf(),
    )

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun archived(): Optional<Boolean> = archived.getOptional("archived")

    /**
     * Send document archive very soon after signing.
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun autoArchive(): Optional<Boolean> = autoArchive.getOptional("auto_archive")

    /**
     * who will be cc'd with sender on email notification when signed
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ccEmails(): Optional<String> = ccEmails.getOptional("cc_emails")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun created(): Optional<OffsetDateTime> = created.getOptional("created")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun doEmail(): Optional<Boolean> = doEmail.getOptional("do_email")

    /**
     * Final PDF is available to download
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun downloadFinal(): Optional<Boolean> = downloadFinal.getOptional("download_final")

    /**
     * HTML docs - text for footer if used
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun footer(): Optional<String> = footer.getOptional("footer")

    /**
     * HTMl docs - px height of footer if used
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun footerHeight(): Optional<Long> = footerHeight.getOptional("footer_height")

    /**
     * Resource URI of group
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun group(): Optional<String> = group.getOptional("group")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun hasFields(): Optional<Boolean> = hasFields.getOptional("has_fields")

    /**
     * SHA256 checksum of final doc, use this to validate your final PDF download
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun hashValue(): Optional<String> = hashValue.getOptional("hash_value")

    /**
     * HTML docs - text for header if used
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun header(): Optional<String> = header.getOptional("header")

    /**
     * HTMl docs - px height of header if used
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun headerHeight(): Optional<Long> = headerHeight.getOptional("header_height")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun modified(): Optional<OffsetDateTime> = modified.getOptional("modified")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * PDF password if used and if save-able
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pdfPassword(): Optional<String> = pdfPassword.getOptional("pdf_password")

    /**
     * how pdf password is retained
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pdfPasswordType(): Optional<String> = pdfPasswordType.getOptional("pdf_password_type")

    /**
     * ignore this
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pdftext(): Optional<String> = pdftext.getOptional("pdftext")

    /**
     * url for signer redirect after signing
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun redirect(): Optional<String> = redirect.getOptional("redirect")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun resourceUri(): Optional<String> = resourceUri.getOptional("resource_uri")

    /**
     * ignore
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun returnSignerLinks(): Optional<Boolean> =
        returnSignerLinks.getOptional("return_signer_links")

    /**
     * legacy
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signMouse(): Optional<Boolean> = signMouse.getOptional("sign_mouse")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signTime(): Optional<OffsetDateTime> = signTime.getOptional("sign_time")

    /**
     * legacy
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signType(): Optional<Boolean> = signType.getOptional("sign_type")

    /**
     * legacy
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signUpload(): Optional<Boolean> = signUpload.getOptional("sign_upload")

    /**
     * legacy
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signaturePlacement(): Optional<Long> = signaturePlacement.getOptional("signature_placement")

    /**
     * legacy - always 4
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signatureType(): Optional<Long> = signatureType.getOptional("signature_type")

    /**
     * nested arrays with signer details
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signers(): Optional<List<List<String>>> = signers.getOptional("signers")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signersInOrder(): Optional<Boolean> = signersInOrder.getOptional("signers_in_order")

    /**
     * Document status options:
     * * 10 - Initial state, check signer status for sent/unsent
     * * 20 - Fields completed
     * * 30 - Signed
     * * 40 - Removed (before signing)
     * * 50 - Rejected
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<DocumentStatusEnum> = status.getOptional("status")

    /**
     * your reference
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tag(): Optional<String> = tag.getOptional("tag")

    /**
     * your reference
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tag1(): Optional<String> = tag1.getOptional("tag1")

    /**
     * your reference
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tag2(): Optional<String> = tag2.getOptional("tag2")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun template(): Optional<String> = template.getOptional("template")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun templatepdf(): Optional<String> = templatepdf.getOptional("templatepdf")

    /**
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

    /**
     * Resource URI of user
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun user(): Optional<String> = user.getOptional("user")

    /**
     * Object ID alone
     *
     * @throws LegalesignSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun uuid(): Optional<String> = uuid.getOptional("uuid")

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

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
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [doEmail].
     *
     * Unlike [doEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("do_email") @ExcludeMissing fun _doEmail(): JsonField<Boolean> = doEmail

    /**
     * Returns the raw JSON value of [downloadFinal].
     *
     * Unlike [downloadFinal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("download_final")
    @ExcludeMissing
    fun _downloadFinal(): JsonField<Boolean> = downloadFinal

    /**
     * Returns the raw JSON value of [footer].
     *
     * Unlike [footer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonField<String> = footer

    /**
     * Returns the raw JSON value of [footerHeight].
     *
     * Unlike [footerHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("footer_height")
    @ExcludeMissing
    fun _footerHeight(): JsonField<Long> = footerHeight

    /**
     * Returns the raw JSON value of [group].
     *
     * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<String> = group

    /**
     * Returns the raw JSON value of [hasFields].
     *
     * Unlike [hasFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_fields") @ExcludeMissing fun _hasFields(): JsonField<Boolean> = hasFields

    /**
     * Returns the raw JSON value of [hashValue].
     *
     * Unlike [hashValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hash_value") @ExcludeMissing fun _hashValue(): JsonField<String> = hashValue

    /**
     * Returns the raw JSON value of [header].
     *
     * Unlike [header], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("header") @ExcludeMissing fun _header(): JsonField<String> = header

    /**
     * Returns the raw JSON value of [headerHeight].
     *
     * Unlike [headerHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("header_height")
    @ExcludeMissing
    fun _headerHeight(): JsonField<Long> = headerHeight

    /**
     * Returns the raw JSON value of [modified].
     *
     * Unlike [modified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modified") @ExcludeMissing fun _modified(): JsonField<OffsetDateTime> = modified

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Unlike [pdfPasswordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pdf_password_type")
    @ExcludeMissing
    fun _pdfPasswordType(): JsonField<String> = pdfPasswordType

    /**
     * Returns the raw JSON value of [pdftext].
     *
     * Unlike [pdftext], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pdftext") @ExcludeMissing fun _pdftext(): JsonField<String> = pdftext

    /**
     * Returns the raw JSON value of [redirect].
     *
     * Unlike [redirect], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redirect") @ExcludeMissing fun _redirect(): JsonField<String> = redirect

    /**
     * Returns the raw JSON value of [resourceUri].
     *
     * Unlike [resourceUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_uri")
    @ExcludeMissing
    fun _resourceUri(): JsonField<String> = resourceUri

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
     * Returns the raw JSON value of [signMouse].
     *
     * Unlike [signMouse], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sign_mouse") @ExcludeMissing fun _signMouse(): JsonField<Boolean> = signMouse

    /**
     * Returns the raw JSON value of [signTime].
     *
     * Unlike [signTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sign_time") @ExcludeMissing fun _signTime(): JsonField<OffsetDateTime> = signTime

    /**
     * Returns the raw JSON value of [signType].
     *
     * Unlike [signType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sign_type") @ExcludeMissing fun _signType(): JsonField<Boolean> = signType

    /**
     * Returns the raw JSON value of [signUpload].
     *
     * Unlike [signUpload], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sign_upload") @ExcludeMissing fun _signUpload(): JsonField<Boolean> = signUpload

    /**
     * Returns the raw JSON value of [signaturePlacement].
     *
     * Unlike [signaturePlacement], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("signature_placement")
    @ExcludeMissing
    fun _signaturePlacement(): JsonField<Long> = signaturePlacement

    /**
     * Returns the raw JSON value of [signatureType].
     *
     * Unlike [signatureType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signature_type")
    @ExcludeMissing
    fun _signatureType(): JsonField<Long> = signatureType

    /**
     * Returns the raw JSON value of [signers].
     *
     * Unlike [signers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signers") @ExcludeMissing fun _signers(): JsonField<List<List<String>>> = signers

    /**
     * Returns the raw JSON value of [signersInOrder].
     *
     * Unlike [signersInOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signers_in_order")
    @ExcludeMissing
    fun _signersInOrder(): JsonField<Boolean> = signersInOrder

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<DocumentStatusEnum> = status

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
    @JsonProperty("templatepdf") @ExcludeMissing fun _templatepdf(): JsonField<String> = templatepdf

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

    /**
     * Returns the raw JSON value of [uuid].
     *
     * Unlike [uuid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uuid") @ExcludeMissing fun _uuid(): JsonField<String> = uuid

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

        /** Returns a mutable builder for constructing an instance of [DocumentRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentRetrieveResponse]. */
    class Builder internal constructor() {

        private var archived: JsonField<Boolean> = JsonMissing.of()
        private var autoArchive: JsonField<Boolean> = JsonMissing.of()
        private var ccEmails: JsonField<String> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var doEmail: JsonField<Boolean> = JsonMissing.of()
        private var downloadFinal: JsonField<Boolean> = JsonMissing.of()
        private var footer: JsonField<String> = JsonMissing.of()
        private var footerHeight: JsonField<Long> = JsonMissing.of()
        private var group: JsonField<String> = JsonMissing.of()
        private var hasFields: JsonField<Boolean> = JsonMissing.of()
        private var hashValue: JsonField<String> = JsonMissing.of()
        private var header: JsonField<String> = JsonMissing.of()
        private var headerHeight: JsonField<Long> = JsonMissing.of()
        private var modified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var pdfPassword: JsonField<String> = JsonMissing.of()
        private var pdfPasswordType: JsonField<String> = JsonMissing.of()
        private var pdftext: JsonField<String> = JsonMissing.of()
        private var redirect: JsonField<String> = JsonMissing.of()
        private var resourceUri: JsonField<String> = JsonMissing.of()
        private var returnSignerLinks: JsonField<Boolean> = JsonMissing.of()
        private var signMouse: JsonField<Boolean> = JsonMissing.of()
        private var signTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var signType: JsonField<Boolean> = JsonMissing.of()
        private var signUpload: JsonField<Boolean> = JsonMissing.of()
        private var signaturePlacement: JsonField<Long> = JsonMissing.of()
        private var signatureType: JsonField<Long> = JsonMissing.of()
        private var signers: JsonField<MutableList<List<String>>>? = null
        private var signersInOrder: JsonField<Boolean> = JsonMissing.of()
        private var status: JsonField<DocumentStatusEnum> = JsonMissing.of()
        private var tag: JsonField<String> = JsonMissing.of()
        private var tag1: JsonField<String> = JsonMissing.of()
        private var tag2: JsonField<String> = JsonMissing.of()
        private var template: JsonField<String> = JsonMissing.of()
        private var templatepdf: JsonField<String> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var user: JsonField<String> = JsonMissing.of()
        private var uuid: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentRetrieveResponse: DocumentRetrieveResponse) = apply {
            archived = documentRetrieveResponse.archived
            autoArchive = documentRetrieveResponse.autoArchive
            ccEmails = documentRetrieveResponse.ccEmails
            created = documentRetrieveResponse.created
            doEmail = documentRetrieveResponse.doEmail
            downloadFinal = documentRetrieveResponse.downloadFinal
            footer = documentRetrieveResponse.footer
            footerHeight = documentRetrieveResponse.footerHeight
            group = documentRetrieveResponse.group
            hasFields = documentRetrieveResponse.hasFields
            hashValue = documentRetrieveResponse.hashValue
            header = documentRetrieveResponse.header
            headerHeight = documentRetrieveResponse.headerHeight
            modified = documentRetrieveResponse.modified
            name = documentRetrieveResponse.name
            pdfPassword = documentRetrieveResponse.pdfPassword
            pdfPasswordType = documentRetrieveResponse.pdfPasswordType
            pdftext = documentRetrieveResponse.pdftext
            redirect = documentRetrieveResponse.redirect
            resourceUri = documentRetrieveResponse.resourceUri
            returnSignerLinks = documentRetrieveResponse.returnSignerLinks
            signMouse = documentRetrieveResponse.signMouse
            signTime = documentRetrieveResponse.signTime
            signType = documentRetrieveResponse.signType
            signUpload = documentRetrieveResponse.signUpload
            signaturePlacement = documentRetrieveResponse.signaturePlacement
            signatureType = documentRetrieveResponse.signatureType
            signers = documentRetrieveResponse.signers.map { it.toMutableList() }
            signersInOrder = documentRetrieveResponse.signersInOrder
            status = documentRetrieveResponse.status
            tag = documentRetrieveResponse.tag
            tag1 = documentRetrieveResponse.tag1
            tag2 = documentRetrieveResponse.tag2
            template = documentRetrieveResponse.template
            templatepdf = documentRetrieveResponse.templatepdf
            text = documentRetrieveResponse.text
            user = documentRetrieveResponse.user
            uuid = documentRetrieveResponse.uuid
            additionalProperties = documentRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        /** Send document archive very soon after signing. */
        fun autoArchive(autoArchive: Boolean) = autoArchive(JsonField.of(autoArchive))

        /**
         * Sets [Builder.autoArchive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoArchive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoArchive(autoArchive: JsonField<Boolean>) = apply { this.autoArchive = autoArchive }

        /** who will be cc'd with sender on email notification when signed */
        fun ccEmails(ccEmails: String) = ccEmails(JsonField.of(ccEmails))

        /**
         * Sets [Builder.ccEmails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ccEmails] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ccEmails(ccEmails: JsonField<String>) = apply { this.ccEmails = ccEmails }

        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun doEmail(doEmail: Boolean) = doEmail(JsonField.of(doEmail))

        /**
         * Sets [Builder.doEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doEmail] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun doEmail(doEmail: JsonField<Boolean>) = apply { this.doEmail = doEmail }

        /** Final PDF is available to download */
        fun downloadFinal(downloadFinal: Boolean) = downloadFinal(JsonField.of(downloadFinal))

        /**
         * Sets [Builder.downloadFinal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadFinal] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun downloadFinal(downloadFinal: JsonField<Boolean>) = apply {
            this.downloadFinal = downloadFinal
        }

        /** HTML docs - text for footer if used */
        fun footer(footer: String) = footer(JsonField.of(footer))

        /**
         * Sets [Builder.footer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.footer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun footer(footer: JsonField<String>) = apply { this.footer = footer }

        /** HTMl docs - px height of footer if used */
        fun footerHeight(footerHeight: Long) = footerHeight(JsonField.of(footerHeight))

        /**
         * Sets [Builder.footerHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.footerHeight] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun footerHeight(footerHeight: JsonField<Long>) = apply { this.footerHeight = footerHeight }

        /** Resource URI of group */
        fun group(group: String) = group(JsonField.of(group))

        /**
         * Sets [Builder.group] to an arbitrary JSON value.
         *
         * You should usually call [Builder.group] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun group(group: JsonField<String>) = apply { this.group = group }

        fun hasFields(hasFields: Boolean) = hasFields(JsonField.of(hasFields))

        /**
         * Sets [Builder.hasFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasFields] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasFields(hasFields: JsonField<Boolean>) = apply { this.hasFields = hasFields }

        /** SHA256 checksum of final doc, use this to validate your final PDF download */
        fun hashValue(hashValue: String) = hashValue(JsonField.of(hashValue))

        /**
         * Sets [Builder.hashValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hashValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hashValue(hashValue: JsonField<String>) = apply { this.hashValue = hashValue }

        /** HTML docs - text for header if used */
        fun header(header: String) = header(JsonField.of(header))

        /**
         * Sets [Builder.header] to an arbitrary JSON value.
         *
         * You should usually call [Builder.header] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun header(header: JsonField<String>) = apply { this.header = header }

        /** HTMl docs - px height of header if used */
        fun headerHeight(headerHeight: Long) = headerHeight(JsonField.of(headerHeight))

        /**
         * Sets [Builder.headerHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headerHeight] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun headerHeight(headerHeight: JsonField<Long>) = apply { this.headerHeight = headerHeight }

        fun modified(modified: OffsetDateTime) = modified(JsonField.of(modified))

        /**
         * Sets [Builder.modified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modified] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modified(modified: JsonField<OffsetDateTime>) = apply { this.modified = modified }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** PDF password if used and if save-able */
        fun pdfPassword(pdfPassword: String) = pdfPassword(JsonField.of(pdfPassword))

        /**
         * Sets [Builder.pdfPassword] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pdfPassword] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pdfPassword(pdfPassword: JsonField<String>) = apply { this.pdfPassword = pdfPassword }

        /** how pdf password is retained */
        fun pdfPasswordType(pdfPasswordType: String) =
            pdfPasswordType(JsonField.of(pdfPasswordType))

        /**
         * Sets [Builder.pdfPasswordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pdfPasswordType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pdfPasswordType(pdfPasswordType: JsonField<String>) = apply {
            this.pdfPasswordType = pdfPasswordType
        }

        /** ignore this */
        fun pdftext(pdftext: String) = pdftext(JsonField.of(pdftext))

        /**
         * Sets [Builder.pdftext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pdftext] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pdftext(pdftext: JsonField<String>) = apply { this.pdftext = pdftext }

        /** url for signer redirect after signing */
        fun redirect(redirect: String) = redirect(JsonField.of(redirect))

        /**
         * Sets [Builder.redirect] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirect] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun redirect(redirect: JsonField<String>) = apply { this.redirect = redirect }

        fun resourceUri(resourceUri: String) = resourceUri(JsonField.of(resourceUri))

        /**
         * Sets [Builder.resourceUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceUri(resourceUri: JsonField<String>) = apply { this.resourceUri = resourceUri }

        /** ignore */
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

        /** legacy */
        fun signMouse(signMouse: Boolean) = signMouse(JsonField.of(signMouse))

        /**
         * Sets [Builder.signMouse] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signMouse] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signMouse(signMouse: JsonField<Boolean>) = apply { this.signMouse = signMouse }

        fun signTime(signTime: OffsetDateTime) = signTime(JsonField.of(signTime))

        /**
         * Sets [Builder.signTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun signTime(signTime: JsonField<OffsetDateTime>) = apply { this.signTime = signTime }

        /** legacy */
        fun signType(signType: Boolean) = signType(JsonField.of(signType))

        /**
         * Sets [Builder.signType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signType] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signType(signType: JsonField<Boolean>) = apply { this.signType = signType }

        /** legacy */
        fun signUpload(signUpload: Boolean) = signUpload(JsonField.of(signUpload))

        /**
         * Sets [Builder.signUpload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signUpload] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signUpload(signUpload: JsonField<Boolean>) = apply { this.signUpload = signUpload }

        /** legacy */
        fun signaturePlacement(signaturePlacement: Long) =
            signaturePlacement(JsonField.of(signaturePlacement))

        /**
         * Sets [Builder.signaturePlacement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signaturePlacement] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun signaturePlacement(signaturePlacement: JsonField<Long>) = apply {
            this.signaturePlacement = signaturePlacement
        }

        /** legacy - always 4 */
        fun signatureType(signatureType: Long) = signatureType(JsonField.of(signatureType))

        /**
         * Sets [Builder.signatureType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signatureType] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signatureType(signatureType: JsonField<Long>) = apply {
            this.signatureType = signatureType
        }

        /** nested arrays with signer details */
        fun signers(signers: List<List<String>>) = signers(JsonField.of(signers))

        /**
         * Sets [Builder.signers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signers] with a well-typed `List<List<String>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun signers(signers: JsonField<List<List<String>>>) = apply {
            this.signers = signers.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<String>] to [signers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSigner(signer: List<String>) = apply {
            signers =
                (signers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("signers", it).add(signer)
                }
        }

        fun signersInOrder(signersInOrder: Boolean) = signersInOrder(JsonField.of(signersInOrder))

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
         * Document status options:
         * * 10 - Initial state, check signer status for sent/unsent
         * * 20 - Fields completed
         * * 30 - Signed
         * * 40 - Removed (before signing)
         * * 50 - Rejected
         */
        fun status(status: DocumentStatusEnum) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [DocumentStatusEnum] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<DocumentStatusEnum>) = apply { this.status = status }

        /** your reference */
        fun tag(tag: String) = tag(JsonField.of(tag))

        /**
         * Sets [Builder.tag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag(tag: JsonField<String>) = apply { this.tag = tag }

        /** your reference */
        fun tag1(tag1: String) = tag1(JsonField.of(tag1))

        /**
         * Sets [Builder.tag1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag1(tag1: JsonField<String>) = apply { this.tag1 = tag1 }

        /** your reference */
        fun tag2(tag2: String) = tag2(JsonField.of(tag2))

        /**
         * Sets [Builder.tag2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag2(tag2: JsonField<String>) = apply { this.tag2 = tag2 }

        fun template(template: String) = template(JsonField.of(template))

        /**
         * Sets [Builder.template] to an arbitrary JSON value.
         *
         * You should usually call [Builder.template] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun template(template: JsonField<String>) = apply { this.template = template }

        fun templatepdf(templatepdf: String) = templatepdf(JsonField.of(templatepdf))

        /**
         * Sets [Builder.templatepdf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templatepdf] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templatepdf(templatepdf: JsonField<String>) = apply { this.templatepdf = templatepdf }

        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        /** Resource URI of user */
        fun user(user: String) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<String>) = apply { this.user = user }

        /** Object ID alone */
        fun uuid(uuid: String) = uuid(JsonField.of(uuid))

        /**
         * Sets [Builder.uuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uuid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uuid(uuid: JsonField<String>) = apply { this.uuid = uuid }

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
         * Returns an immutable instance of [DocumentRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocumentRetrieveResponse =
            DocumentRetrieveResponse(
                archived,
                autoArchive,
                ccEmails,
                created,
                doEmail,
                downloadFinal,
                footer,
                footerHeight,
                group,
                hasFields,
                hashValue,
                header,
                headerHeight,
                modified,
                name,
                pdfPassword,
                pdfPasswordType,
                pdftext,
                redirect,
                resourceUri,
                returnSignerLinks,
                signMouse,
                signTime,
                signType,
                signUpload,
                signaturePlacement,
                signatureType,
                (signers ?: JsonMissing.of()).map { it.toImmutable() },
                signersInOrder,
                status,
                tag,
                tag1,
                tag2,
                template,
                templatepdf,
                text,
                user,
                uuid,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DocumentRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        archived()
        autoArchive()
        ccEmails()
        created()
        doEmail()
        downloadFinal()
        footer()
        footerHeight()
        group()
        hasFields()
        hashValue()
        header()
        headerHeight()
        modified()
        name()
        pdfPassword()
        pdfPasswordType()
        pdftext()
        redirect()
        resourceUri()
        returnSignerLinks()
        signMouse()
        signTime()
        signType()
        signUpload()
        signaturePlacement()
        signatureType()
        signers()
        signersInOrder()
        status().ifPresent { it.validate() }
        tag()
        tag1()
        tag2()
        template()
        templatepdf()
        text()
        user()
        uuid()
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
        (if (archived.asKnown().isPresent) 1 else 0) +
            (if (autoArchive.asKnown().isPresent) 1 else 0) +
            (if (ccEmails.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (doEmail.asKnown().isPresent) 1 else 0) +
            (if (downloadFinal.asKnown().isPresent) 1 else 0) +
            (if (footer.asKnown().isPresent) 1 else 0) +
            (if (footerHeight.asKnown().isPresent) 1 else 0) +
            (if (group.asKnown().isPresent) 1 else 0) +
            (if (hasFields.asKnown().isPresent) 1 else 0) +
            (if (hashValue.asKnown().isPresent) 1 else 0) +
            (if (header.asKnown().isPresent) 1 else 0) +
            (if (headerHeight.asKnown().isPresent) 1 else 0) +
            (if (modified.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (pdfPassword.asKnown().isPresent) 1 else 0) +
            (if (pdfPasswordType.asKnown().isPresent) 1 else 0) +
            (if (pdftext.asKnown().isPresent) 1 else 0) +
            (if (redirect.asKnown().isPresent) 1 else 0) +
            (if (resourceUri.asKnown().isPresent) 1 else 0) +
            (if (returnSignerLinks.asKnown().isPresent) 1 else 0) +
            (if (signMouse.asKnown().isPresent) 1 else 0) +
            (if (signTime.asKnown().isPresent) 1 else 0) +
            (if (signType.asKnown().isPresent) 1 else 0) +
            (if (signUpload.asKnown().isPresent) 1 else 0) +
            (if (signaturePlacement.asKnown().isPresent) 1 else 0) +
            (if (signatureType.asKnown().isPresent) 1 else 0) +
            (signers.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
            (if (signersInOrder.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tag.asKnown().isPresent) 1 else 0) +
            (if (tag1.asKnown().isPresent) 1 else 0) +
            (if (tag2.asKnown().isPresent) 1 else 0) +
            (if (template.asKnown().isPresent) 1 else 0) +
            (if (templatepdf.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (user.asKnown().isPresent) 1 else 0) +
            (if (uuid.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentRetrieveResponse &&
            archived == other.archived &&
            autoArchive == other.autoArchive &&
            ccEmails == other.ccEmails &&
            created == other.created &&
            doEmail == other.doEmail &&
            downloadFinal == other.downloadFinal &&
            footer == other.footer &&
            footerHeight == other.footerHeight &&
            group == other.group &&
            hasFields == other.hasFields &&
            hashValue == other.hashValue &&
            header == other.header &&
            headerHeight == other.headerHeight &&
            modified == other.modified &&
            name == other.name &&
            pdfPassword == other.pdfPassword &&
            pdfPasswordType == other.pdfPasswordType &&
            pdftext == other.pdftext &&
            redirect == other.redirect &&
            resourceUri == other.resourceUri &&
            returnSignerLinks == other.returnSignerLinks &&
            signMouse == other.signMouse &&
            signTime == other.signTime &&
            signType == other.signType &&
            signUpload == other.signUpload &&
            signaturePlacement == other.signaturePlacement &&
            signatureType == other.signatureType &&
            signers == other.signers &&
            signersInOrder == other.signersInOrder &&
            status == other.status &&
            tag == other.tag &&
            tag1 == other.tag1 &&
            tag2 == other.tag2 &&
            template == other.template &&
            templatepdf == other.templatepdf &&
            text == other.text &&
            user == other.user &&
            uuid == other.uuid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            archived,
            autoArchive,
            ccEmails,
            created,
            doEmail,
            downloadFinal,
            footer,
            footerHeight,
            group,
            hasFields,
            hashValue,
            header,
            headerHeight,
            modified,
            name,
            pdfPassword,
            pdfPasswordType,
            pdftext,
            redirect,
            resourceUri,
            returnSignerLinks,
            signMouse,
            signTime,
            signType,
            signUpload,
            signaturePlacement,
            signatureType,
            signers,
            signersInOrder,
            status,
            tag,
            tag1,
            tag2,
            template,
            templatepdf,
            text,
            user,
            uuid,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentRetrieveResponse{archived=$archived, autoArchive=$autoArchive, ccEmails=$ccEmails, created=$created, doEmail=$doEmail, downloadFinal=$downloadFinal, footer=$footer, footerHeight=$footerHeight, group=$group, hasFields=$hasFields, hashValue=$hashValue, header=$header, headerHeight=$headerHeight, modified=$modified, name=$name, pdfPassword=$pdfPassword, pdfPasswordType=$pdfPasswordType, pdftext=$pdftext, redirect=$redirect, resourceUri=$resourceUri, returnSignerLinks=$returnSignerLinks, signMouse=$signMouse, signTime=$signTime, signType=$signType, signUpload=$signUpload, signaturePlacement=$signaturePlacement, signatureType=$signatureType, signers=$signers, signersInOrder=$signersInOrder, status=$status, tag=$tag, tag1=$tag1, tag2=$tag2, template=$template, templatepdf=$templatepdf, text=$text, user=$user, uuid=$uuid, additionalProperties=$additionalProperties}"
}
