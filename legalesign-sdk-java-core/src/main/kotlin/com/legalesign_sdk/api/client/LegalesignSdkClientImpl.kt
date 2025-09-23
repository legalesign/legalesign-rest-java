// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.client

import com.legalesign_sdk.api.core.ClientOptions
import com.legalesign_sdk.api.core.getPackageVersion
import com.legalesign_sdk.api.services.blocking.DocumentService
import com.legalesign_sdk.api.services.blocking.DocumentServiceImpl
import com.legalesign_sdk.api.services.blocking.GroupService
import com.legalesign_sdk.api.services.blocking.GroupServiceImpl
import com.legalesign_sdk.api.services.blocking.PdfService
import com.legalesign_sdk.api.services.blocking.PdfServiceImpl
import com.legalesign_sdk.api.services.blocking.SignerService
import com.legalesign_sdk.api.services.blocking.SignerServiceImpl
import com.legalesign_sdk.api.services.blocking.StatusService
import com.legalesign_sdk.api.services.blocking.StatusServiceImpl
import com.legalesign_sdk.api.services.blocking.TemplateService
import com.legalesign_sdk.api.services.blocking.TemplateServiceImpl
import com.legalesign_sdk.api.services.blocking.TemplatepdfService
import com.legalesign_sdk.api.services.blocking.TemplatepdfServiceImpl
import java.util.function.Consumer

class LegalesignSdkClientImpl(private val clientOptions: ClientOptions) : LegalesignSdkClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: LegalesignSdkClientAsync by lazy {
        LegalesignSdkClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: LegalesignSdkClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val document: DocumentService by lazy {
        DocumentServiceImpl(clientOptionsWithUserAgent)
    }

    private val group: GroupService by lazy { GroupServiceImpl(clientOptionsWithUserAgent) }

    private val pdf: PdfService by lazy { PdfServiceImpl(clientOptionsWithUserAgent) }

    private val signer: SignerService by lazy { SignerServiceImpl(clientOptionsWithUserAgent) }

    private val status: StatusService by lazy { StatusServiceImpl(clientOptionsWithUserAgent) }

    private val template: TemplateService by lazy {
        TemplateServiceImpl(clientOptionsWithUserAgent)
    }

    private val templatepdf: TemplatepdfService by lazy {
        TemplatepdfServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): LegalesignSdkClientAsync = async

    override fun withRawResponse(): LegalesignSdkClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalesignSdkClient =
        LegalesignSdkClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun document(): DocumentService = document

    override fun group(): GroupService = group

    override fun pdf(): PdfService = pdf

    override fun signer(): SignerService = signer

    override fun status(): StatusService = status

    override fun template(): TemplateService = template

    override fun templatepdf(): TemplatepdfService = templatepdf

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LegalesignSdkClient.WithRawResponse {

        private val document: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val group: GroupService.WithRawResponse by lazy {
            GroupServiceImpl.WithRawResponseImpl(clientOptions)
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

        private val template: TemplateService.WithRawResponse by lazy {
            TemplateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val templatepdf: TemplatepdfService.WithRawResponse by lazy {
            TemplatepdfServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LegalesignSdkClient.WithRawResponse =
            LegalesignSdkClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun document(): DocumentService.WithRawResponse = document

        override fun group(): GroupService.WithRawResponse = group

        override fun pdf(): PdfService.WithRawResponse = pdf

        override fun signer(): SignerService.WithRawResponse = signer

        override fun status(): StatusService.WithRawResponse = status

        override fun template(): TemplateService.WithRawResponse = template

        override fun templatepdf(): TemplatepdfService.WithRawResponse = templatepdf
    }
}
