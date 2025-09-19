// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClientAsync
import com.legalesign.api.models.status.StatusRetrieveAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatusServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val statusServiceAsync = client.status()

        val statusResponseFuture = statusServiceAsync.retrieve("docId")

        val statusResponse = statusResponseFuture.get()
        statusResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAll() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val statusServiceAsync = client.status()

        val responseFuture =
            statusServiceAsync.retrieveAll(
                StatusRetrieveAllParams.builder().filter("filter").limit(0L).offset(0L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
