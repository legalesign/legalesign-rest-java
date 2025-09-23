// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.client

import com.legalesign_sdk.api.core.ClientOptions
import com.legalesign_sdk.api.services.blocking.DocumentService
import com.legalesign_sdk.api.services.blocking.GroupService
import com.legalesign_sdk.api.services.blocking.PdfService
import com.legalesign_sdk.api.services.blocking.SignerService
import com.legalesign_sdk.api.services.blocking.StatusService
import com.legalesign_sdk.api.services.blocking.TemplateService
import com.legalesign_sdk.api.services.blocking.TemplatepdfService
import java.util.function.Consumer

/**
 * A client for interacting with the Legalesign SDK REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface LegalesignSdkClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): LegalesignSdkClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalesignSdkClient

    fun document(): DocumentService

    fun group(): GroupService

    fun pdf(): PdfService

    fun signer(): SignerService

    fun status(): StatusService

    fun template(): TemplateService

    fun templatepdf(): TemplatepdfService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [LegalesignSdkClient] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LegalesignSdkClient.WithRawResponse

        fun document(): DocumentService.WithRawResponse

        fun group(): GroupService.WithRawResponse

        fun pdf(): PdfService.WithRawResponse

        fun signer(): SignerService.WithRawResponse

        fun status(): StatusService.WithRawResponse

        fun template(): TemplateService.WithRawResponse

        fun templatepdf(): TemplatepdfService.WithRawResponse
    }
}
