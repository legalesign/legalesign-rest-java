// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.client

import com.legalesign_sdk.api.core.ClientOptions
import com.legalesign_sdk.api.core.getPackageVersion
import com.legalesign_sdk.api.services.async.DocumentServiceAsync
import com.legalesign_sdk.api.services.async.DocumentServiceAsyncImpl
import com.legalesign_sdk.api.services.async.GroupServiceAsync
import com.legalesign_sdk.api.services.async.GroupServiceAsyncImpl
import com.legalesign_sdk.api.services.async.PdfServiceAsync
import com.legalesign_sdk.api.services.async.PdfServiceAsyncImpl
import com.legalesign_sdk.api.services.async.SignerServiceAsync
import com.legalesign_sdk.api.services.async.SignerServiceAsyncImpl
import com.legalesign_sdk.api.services.async.StatusServiceAsync
import com.legalesign_sdk.api.services.async.StatusServiceAsyncImpl
import com.legalesign_sdk.api.services.async.TemplateServiceAsync
import com.legalesign_sdk.api.services.async.TemplateServiceAsyncImpl
import com.legalesign_sdk.api.services.async.TemplatepdfServiceAsync
import com.legalesign_sdk.api.services.async.TemplatepdfServiceAsyncImpl
import java.util.function.Consumer

class LegalesignSdkClientAsyncImpl(private val clientOptions: ClientOptions) :
    LegalesignSdkClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: LegalesignSdkClient by lazy { LegalesignSdkClientImpl(clientOptions) }

    private val withRawResponse: LegalesignSdkClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val document: DocumentServiceAsync by lazy {
        DocumentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val group: GroupServiceAsync by lazy {
        GroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val pdf: PdfServiceAsync by lazy { PdfServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val signer: SignerServiceAsync by lazy {
        SignerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val status: StatusServiceAsync by lazy {
        StatusServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val template: TemplateServiceAsync by lazy {
        TemplateServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val templatepdf: TemplatepdfServiceAsync by lazy {
        TemplatepdfServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): LegalesignSdkClient = sync

    override fun withRawResponse(): LegalesignSdkClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalesignSdkClientAsync =
        LegalesignSdkClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun document(): DocumentServiceAsync = document

    override fun group(): GroupServiceAsync = group

    override fun pdf(): PdfServiceAsync = pdf

    override fun signer(): SignerServiceAsync = signer

    override fun status(): StatusServiceAsync = status

    override fun template(): TemplateServiceAsync = template

    override fun templatepdf(): TemplatepdfServiceAsync = templatepdf

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LegalesignSdkClientAsync.WithRawResponse {

        private val document: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val group: GroupServiceAsync.WithRawResponse by lazy {
            GroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        private val template: TemplateServiceAsync.WithRawResponse by lazy {
            TemplateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val templatepdf: TemplatepdfServiceAsync.WithRawResponse by lazy {
            TemplatepdfServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LegalesignSdkClientAsync.WithRawResponse =
            LegalesignSdkClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun document(): DocumentServiceAsync.WithRawResponse = document

        override fun group(): GroupServiceAsync.WithRawResponse = group

        override fun pdf(): PdfServiceAsync.WithRawResponse = pdf

        override fun signer(): SignerServiceAsync.WithRawResponse = signer

        override fun status(): StatusServiceAsync.WithRawResponse = status

        override fun template(): TemplateServiceAsync.WithRawResponse = template

        override fun templatepdf(): TemplatepdfServiceAsync.WithRawResponse = templatepdf
    }
}
