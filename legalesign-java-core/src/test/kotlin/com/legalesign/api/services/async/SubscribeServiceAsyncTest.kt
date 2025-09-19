// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClientAsync
import com.legalesign.api.models.notifications.WebhookEventFilterEnum
import com.legalesign.api.models.subscribe.SubscribeCreateWebhookParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscribeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createWebhook() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscribeServiceAsync = client.subscribe()

        val future =
            subscribeServiceAsync.createWebhook(
                SubscribeCreateWebhookParams.builder()
                    .notify("realtime")
                    .url("https://")
                    .eventFilter(WebhookEventFilterEnum.EMPTY)
                    .group("group")
                    .build()
            )

        val response = future.get()
    }
}
