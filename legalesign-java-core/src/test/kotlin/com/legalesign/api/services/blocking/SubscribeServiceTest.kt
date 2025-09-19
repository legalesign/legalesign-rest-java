// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClient
import com.legalesign.api.models.notifications.WebhookEventFilterEnum
import com.legalesign.api.models.subscribe.SubscribeCreateWebhookParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscribeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createWebhook() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscribeService = client.subscribe()

        subscribeService.createWebhook(
            SubscribeCreateWebhookParams.builder()
                .notify("realtime")
                .url("https://")
                .eventFilter(WebhookEventFilterEnum.EMPTY)
                .group("group")
                .build()
        )
    }
}
