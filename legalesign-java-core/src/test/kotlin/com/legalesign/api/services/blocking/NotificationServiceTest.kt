// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotificationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationService = client.notifications()

        val notifications = notificationService.list()

        notifications.forEach { it.validate() }
    }
}
