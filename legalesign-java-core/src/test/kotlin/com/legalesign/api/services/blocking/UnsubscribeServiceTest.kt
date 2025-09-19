// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClient
import com.legalesign.api.models.notifications.WebhookEventFilterEnum
import com.legalesign.api.models.unsubscribe.UnsubscribeDeleteWebhookParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UnsubscribeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteWebhook() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val unsubscribeService = client.unsubscribe()

        unsubscribeService.deleteWebhook(
            UnsubscribeDeleteWebhookParams.builder()
                .url("https://")
                .eventFilter(WebhookEventFilterEnum.EMPTY)
                .group(0L)
                .build()
        )
    }
}
