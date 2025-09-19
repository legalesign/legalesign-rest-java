// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClient
import com.legalesign.api.models.status.StatusRetrieveAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatusServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val statusService = client.status()

        val statusResponse = statusService.retrieve("docId")

        statusResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAll() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val statusService = client.status()

        val response =
            statusService.retrieveAll(
                StatusRetrieveAllParams.builder().filter("filter").limit(0L).offset(0L).build()
            )

        response.validate()
    }
}
