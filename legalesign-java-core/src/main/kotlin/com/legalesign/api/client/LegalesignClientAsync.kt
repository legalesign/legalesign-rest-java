// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.client

import com.legalesign.api.core.ClientOptions
import com.legalesign.api.services.async.AttachmentServiceAsync
import com.legalesign.api.services.async.DocumentServiceAsync
import com.legalesign.api.services.async.GroupServiceAsync
import com.legalesign.api.services.async.InvitedServiceAsync
import com.legalesign.api.services.async.MemberServiceAsync
import com.legalesign.api.services.async.NotificationServiceAsync
import com.legalesign.api.services.async.PdfServiceAsync
import com.legalesign.api.services.async.SignerServiceAsync
import com.legalesign.api.services.async.StatusServiceAsync
import com.legalesign.api.services.async.SubscribeServiceAsync
import com.legalesign.api.services.async.TemplateServiceAsync
import com.legalesign.api.services.async.TemplatepdfServiceAsync
import com.legalesign.api.services.async.UnsubscribeServiceAsync
import com.legalesign.api.services.async.UserServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the Legalesign REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface LegalesignClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): LegalesignClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalesignClientAsync

    fun attachment(): AttachmentServiceAsync

    fun document(): DocumentServiceAsync

    fun group(): GroupServiceAsync

    fun invited(): InvitedServiceAsync

    fun member(): MemberServiceAsync

    fun notifications(): NotificationServiceAsync

    fun pdf(): PdfServiceAsync

    fun signer(): SignerServiceAsync

    fun status(): StatusServiceAsync

    fun subscribe(): SubscribeServiceAsync

    fun template(): TemplateServiceAsync

    fun templatepdf(): TemplatepdfServiceAsync

    fun unsubscribe(): UnsubscribeServiceAsync

    fun user(): UserServiceAsync

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
     * A view of [LegalesignClientAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LegalesignClientAsync.WithRawResponse

        fun attachment(): AttachmentServiceAsync.WithRawResponse

        fun document(): DocumentServiceAsync.WithRawResponse

        fun group(): GroupServiceAsync.WithRawResponse

        fun invited(): InvitedServiceAsync.WithRawResponse

        fun member(): MemberServiceAsync.WithRawResponse

        fun notifications(): NotificationServiceAsync.WithRawResponse

        fun pdf(): PdfServiceAsync.WithRawResponse

        fun signer(): SignerServiceAsync.WithRawResponse

        fun status(): StatusServiceAsync.WithRawResponse

        fun subscribe(): SubscribeServiceAsync.WithRawResponse

        fun template(): TemplateServiceAsync.WithRawResponse

        fun templatepdf(): TemplatepdfServiceAsync.WithRawResponse

        fun unsubscribe(): UnsubscribeServiceAsync.WithRawResponse

        fun user(): UserServiceAsync.WithRawResponse
    }
}
