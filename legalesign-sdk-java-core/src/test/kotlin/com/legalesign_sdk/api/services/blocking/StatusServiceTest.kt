// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.blocking

import com.legalesign_sdk.api.TestServerExtension
import com.legalesign_sdk.api.client.okhttp.LegalesignSdkOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatusServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val statusService = client.status()

        val status = statusService.retrieve("docId")

        status.validate()
    }
}
