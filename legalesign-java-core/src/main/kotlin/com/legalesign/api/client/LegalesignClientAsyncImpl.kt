// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.client

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.core.getPackageVersion
import com.legalesign.api.services.async.AttachmentServiceAsync
import com.legalesign.api.services.async.AttachmentServiceAsyncImpl
import com.legalesign.api.services.async.DocumentServiceAsync
import com.legalesign.api.services.async.DocumentServiceAsyncImpl
import com.legalesign.api.services.async.GroupServiceAsync
import com.legalesign.api.services.async.GroupServiceAsyncImpl
import com.legalesign.api.services.async.InvitedServiceAsync
import com.legalesign.api.services.async.InvitedServiceAsyncImpl
import com.legalesign.api.services.async.MemberServiceAsync
import com.legalesign.api.services.async.MemberServiceAsyncImpl
import com.legalesign.api.services.async.NotificationServiceAsync
import com.legalesign.api.services.async.NotificationServiceAsyncImpl
import com.legalesign.api.services.async.PdfServiceAsync
import com.legalesign.api.services.async.PdfServiceAsyncImpl
import com.legalesign.api.services.async.SignerServiceAsync
import com.legalesign.api.services.async.SignerServiceAsyncImpl
import com.legalesign.api.services.async.StatusServiceAsync
import com.legalesign.api.services.async.StatusServiceAsyncImpl
import com.legalesign.api.services.async.SubscribeServiceAsync
import com.legalesign.api.services.async.SubscribeServiceAsyncImpl
import com.legalesign.api.services.async.TemplateServiceAsync
import com.legalesign.api.services.async.TemplateServiceAsyncImpl
import com.legalesign.api.services.async.TemplatepdfServiceAsync
import com.legalesign.api.services.async.TemplatepdfServiceAsyncImpl
import com.legalesign.api.services.async.UnsubscribeServiceAsync
import com.legalesign.api.services.async.UnsubscribeServiceAsyncImpl
import com.legalesign.api.services.async.UserServiceAsync
import com.legalesign.api.services.async.UserServiceAsyncImpl
import java.util.function.Consumer

class LegalesignClientAsyncImpl(private val clientOptions: ClientOptions) : LegalesignClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: LegalesignClient by lazy { LegalesignClientImpl(clientOptions) }

    private val withRawResponse: LegalesignClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val attachment: AttachmentServiceAsync by lazy {
        AttachmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val document: DocumentServiceAsync by lazy {
        DocumentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val group: GroupServiceAsync by lazy {
        GroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val invited: InvitedServiceAsync by lazy {
        InvitedServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val member: MemberServiceAsync by lazy {
        MemberServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val notifications: NotificationServiceAsync by lazy {
        NotificationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val pdf: PdfServiceAsync by lazy { PdfServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val signer: SignerServiceAsync by lazy {
        SignerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val status: StatusServiceAsync by lazy {
        StatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val subscribe: SubscribeServiceAsync by lazy {
        SubscribeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val template: TemplateServiceAsync by lazy {
        TemplateServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val templatepdf: TemplatepdfServiceAsync by lazy {
        TemplatepdfServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val unsubscribe: UnsubscribeServiceAsync by lazy {
        UnsubscribeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val user: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): LegalesignClient = sync

    override fun withRawResponse(): LegalesignClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalesignClientAsync =
        LegalesignClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun attachment(): AttachmentServiceAsync = attachment

    override fun document(): DocumentServiceAsync = document

    override fun group(): GroupServiceAsync = group

    override fun invited(): InvitedServiceAsync = invited

    override fun member(): MemberServiceAsync = member

    override fun notifications(): NotificationServiceAsync = notifications

    override fun pdf(): PdfServiceAsync = pdf

    override fun signer(): SignerServiceAsync = signer

    override fun status(): StatusServiceAsync = status

    override fun subscribe(): SubscribeServiceAsync = subscribe

    override fun template(): TemplateServiceAsync = template

    override fun templatepdf(): TemplatepdfServiceAsync = templatepdf

    override fun unsubscribe(): UnsubscribeServiceAsync = unsubscribe

    override fun user(): UserServiceAsync = user

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LegalesignClientAsync.WithRawResponse {

        private val attachment: AttachmentServiceAsync.WithRawResponse by lazy {
            AttachmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val document: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val group: GroupServiceAsync.WithRawResponse by lazy {
            GroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val invited: InvitedServiceAsync.WithRawResponse by lazy {
            InvitedServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val member: MemberServiceAsync.WithRawResponse by lazy {
            MemberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val notifications: NotificationServiceAsync.WithRawResponse by lazy {
            NotificationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val pdf: PdfServiceAsync.WithRawResponse by lazy {
            PdfServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val signer: SignerServiceAsync.WithRawResponse by lazy {
            SignerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val status: StatusServiceAsync.WithRawResponse by lazy {
            StatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscribe: SubscribeServiceAsync.WithRawResponse by lazy {
            SubscribeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val template: TemplateServiceAsync.WithRawResponse by lazy {
            TemplateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val templatepdf: TemplatepdfServiceAsync.WithRawResponse by lazy {
            TemplatepdfServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val unsubscribe: UnsubscribeServiceAsync.WithRawResponse by lazy {
            UnsubscribeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LegalesignClientAsync.WithRawResponse =
            LegalesignClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun attachment(): AttachmentServiceAsync.WithRawResponse = attachment

        override fun document(): DocumentServiceAsync.WithRawResponse = document

        override fun group(): GroupServiceAsync.WithRawResponse = group

        override fun invited(): InvitedServiceAsync.WithRawResponse = invited

        override fun member(): MemberServiceAsync.WithRawResponse = member

        override fun notifications(): NotificationServiceAsync.WithRawResponse = notifications

        override fun pdf(): PdfServiceAsync.WithRawResponse = pdf

        override fun signer(): SignerServiceAsync.WithRawResponse = signer

        override fun status(): StatusServiceAsync.WithRawResponse = status

        override fun subscribe(): SubscribeServiceAsync.WithRawResponse = subscribe

        override fun template(): TemplateServiceAsync.WithRawResponse = template

        override fun templatepdf(): TemplatepdfServiceAsync.WithRawResponse = templatepdf

        override fun unsubscribe(): UnsubscribeServiceAsync.WithRawResponse = unsubscribe

        override fun user(): UserServiceAsync.WithRawResponse = user
    }
}
