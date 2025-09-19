// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.client

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.services.blocking.AttachmentService
import com.legalesign.api.services.blocking.DocumentService
import com.legalesign.api.services.blocking.GroupService
import com.legalesign.api.services.blocking.InvitedService
import com.legalesign.api.services.blocking.MemberService
import com.legalesign.api.services.blocking.NotificationService
import com.legalesign.api.services.blocking.PdfService
import com.legalesign.api.services.blocking.SignerService
import com.legalesign.api.services.blocking.StatusService
import com.legalesign.api.services.blocking.SubscribeService
import com.legalesign.api.services.blocking.TemplateService
import com.legalesign.api.services.blocking.TemplatepdfService
import com.legalesign.api.services.blocking.UnsubscribeService
import com.legalesign.api.services.blocking.UserService
import java.util.function.Consumer

/**
 * A client for interacting with the Legalesign REST API synchronously. You can also switch to
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
interface LegalesignClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): LegalesignClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalesignClient

    fun attachment(): AttachmentService

    fun document(): DocumentService

    fun group(): GroupService

    fun invited(): InvitedService

    fun member(): MemberService

    fun notifications(): NotificationService

    fun pdf(): PdfService

    fun signer(): SignerService

    fun status(): StatusService

    fun subscribe(): SubscribeService

    fun template(): TemplateService

    fun templatepdf(): TemplatepdfService

    fun unsubscribe(): UnsubscribeService

    fun user(): UserService

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

    /** A view of [LegalesignClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalesignClient.WithRawResponse

        fun attachment(): AttachmentService.WithRawResponse

        fun document(): DocumentService.WithRawResponse

        fun group(): GroupService.WithRawResponse

        fun invited(): InvitedService.WithRawResponse

        fun member(): MemberService.WithRawResponse

        fun notifications(): NotificationService.WithRawResponse

        fun pdf(): PdfService.WithRawResponse

        fun signer(): SignerService.WithRawResponse

        fun status(): StatusService.WithRawResponse

        fun subscribe(): SubscribeService.WithRawResponse

        fun template(): TemplateService.WithRawResponse

        fun templatepdf(): TemplatepdfService.WithRawResponse

        fun unsubscribe(): UnsubscribeService.WithRawResponse

        fun user(): UserService.WithRawResponse
    }
}
