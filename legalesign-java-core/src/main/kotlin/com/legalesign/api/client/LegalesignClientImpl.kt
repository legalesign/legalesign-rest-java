// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.client

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.getPackageVersion
import com.legalesign.api.services.blocking.AttachmentService
import com.legalesign.api.services.blocking.AttachmentServiceImpl
import com.legalesign.api.services.blocking.DocumentService
import com.legalesign.api.services.blocking.DocumentServiceImpl
import com.legalesign.api.services.blocking.GroupService
import com.legalesign.api.services.blocking.GroupServiceImpl
import com.legalesign.api.services.blocking.InvitedService
import com.legalesign.api.services.blocking.InvitedServiceImpl
import com.legalesign.api.services.blocking.MemberService
import com.legalesign.api.services.blocking.MemberServiceImpl
import com.legalesign.api.services.blocking.NotificationService
import com.legalesign.api.services.blocking.NotificationServiceImpl
import com.legalesign.api.services.blocking.PdfService
import com.legalesign.api.services.blocking.PdfServiceImpl
import com.legalesign.api.services.blocking.SignerService
import com.legalesign.api.services.blocking.SignerServiceImpl
import com.legalesign.api.services.blocking.StatusService
import com.legalesign.api.services.blocking.StatusServiceImpl
import com.legalesign.api.services.blocking.SubscribeService
import com.legalesign.api.services.blocking.SubscribeServiceImpl
import com.legalesign.api.services.blocking.TemplateService
import com.legalesign.api.services.blocking.TemplateServiceImpl
import com.legalesign.api.services.blocking.TemplatepdfService
import com.legalesign.api.services.blocking.TemplatepdfServiceImpl
import com.legalesign.api.services.blocking.UnsubscribeService
import com.legalesign.api.services.blocking.UnsubscribeServiceImpl
import com.legalesign.api.services.blocking.UserService
import com.legalesign.api.services.blocking.UserServiceImpl
import java.util.function.Consumer

class LegalesignClientImpl(private val clientOptions: ClientOptions) : LegalesignClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: LegalesignClientAsync by lazy { LegalesignClientAsyncImpl(clientOptions) }

    private val withRawResponse: LegalesignClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val attachment: AttachmentService by lazy {
        AttachmentServiceImpl(clientOptionsWithUserAgent)
    }

    private val document: DocumentService by lazy {
        DocumentServiceImpl(clientOptionsWithUserAgent)
    }

    private val group: GroupService by lazy { GroupServiceImpl(clientOptionsWithUserAgent) }

    private val invited: InvitedService by lazy { InvitedServiceImpl(clientOptionsWithUserAgent) }

    private val member: MemberService by lazy { MemberServiceImpl(clientOptionsWithUserAgent) }

    private val notifications: NotificationService by lazy {
        NotificationServiceImpl(clientOptionsWithUserAgent)
    }

    private val pdf: PdfService by lazy { PdfServiceImpl(clientOptionsWithUserAgent) }

    private val signer: SignerService by lazy { SignerServiceImpl(clientOptionsWithUserAgent) }

    private val status: StatusService by lazy { StatusServiceImpl(clientOptionsWithUserAgent) }

    private val subscribe: SubscribeService by lazy {
        SubscribeServiceImpl(clientOptionsWithUserAgent)
    }

    private val template: TemplateService by lazy {
        TemplateServiceImpl(clientOptionsWithUserAgent)
    }

    private val templatepdf: TemplatepdfService by lazy {
        TemplatepdfServiceImpl(clientOptionsWithUserAgent)
    }

    private val unsubscribe: UnsubscribeService by lazy {
        UnsubscribeServiceImpl(clientOptionsWithUserAgent)
    }

    private val user: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): LegalesignClientAsync = async

    override fun withRawResponse(): LegalesignClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalesignClient =
        LegalesignClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun attachment(): AttachmentService = attachment

    override fun document(): DocumentService = document

    override fun group(): GroupService = group

    override fun invited(): InvitedService = invited

    override fun member(): MemberService = member

    override fun notifications(): NotificationService = notifications

    override fun pdf(): PdfService = pdf

    override fun signer(): SignerService = signer

    override fun status(): StatusService = status

    override fun subscribe(): SubscribeService = subscribe

    override fun template(): TemplateService = template

    override fun templatepdf(): TemplatepdfService = templatepdf

    override fun unsubscribe(): UnsubscribeService = unsubscribe

    override fun user(): UserService = user

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LegalesignClient.WithRawResponse {

        private val attachment: AttachmentService.WithRawResponse by lazy {
            AttachmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val document: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val group: GroupService.WithRawResponse by lazy {
            GroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val invited: InvitedService.WithRawResponse by lazy {
            InvitedServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val member: MemberService.WithRawResponse by lazy {
            MemberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val notifications: NotificationService.WithRawResponse by lazy {
            NotificationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val pdf: PdfService.WithRawResponse by lazy {
            PdfServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val signer: SignerService.WithRawResponse by lazy {
            SignerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val status: StatusService.WithRawResponse by lazy {
            StatusServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscribe: SubscribeService.WithRawResponse by lazy {
            SubscribeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val template: TemplateService.WithRawResponse by lazy {
            TemplateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val templatepdf: TemplatepdfService.WithRawResponse by lazy {
            TemplatepdfServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val unsubscribe: UnsubscribeService.WithRawResponse by lazy {
            UnsubscribeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LegalesignClient.WithRawResponse =
            LegalesignClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun attachment(): AttachmentService.WithRawResponse = attachment

        override fun document(): DocumentService.WithRawResponse = document

        override fun group(): GroupService.WithRawResponse = group

        override fun invited(): InvitedService.WithRawResponse = invited

        override fun member(): MemberService.WithRawResponse = member

        override fun notifications(): NotificationService.WithRawResponse = notifications

        override fun pdf(): PdfService.WithRawResponse = pdf

        override fun signer(): SignerService.WithRawResponse = signer

        override fun status(): StatusService.WithRawResponse = status

        override fun subscribe(): SubscribeService.WithRawResponse = subscribe

        override fun template(): TemplateService.WithRawResponse = template

        override fun templatepdf(): TemplatepdfService.WithRawResponse = templatepdf

        override fun unsubscribe(): UnsubscribeService.WithRawResponse = unsubscribe

        override fun user(): UserService.WithRawResponse = user
    }
}
