// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.async

import com.legalesign_sdk.api.TestServerExtension
import com.legalesign_sdk.api.client.okhttp.LegalesignSdkOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatusServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val statusServiceAsync = client.status()

        val statusFuture = statusServiceAsync.retrieve("docId")

        val status = statusFuture.get()
        status.validate()
    }
}
