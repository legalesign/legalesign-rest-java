// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.async

import com.legalesign_sdk.api.TestServerExtension
import com.legalesign_sdk.api.client.okhttp.LegalesignSdkOkHttpClientAsync
import com.legalesign_sdk.api.models.signer.SignerSendReminderParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SignerServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val signerServiceAsync = client.signer()

        val signerFuture = signerServiceAsync.retrieve("signerId")

        val signer = signerFuture.get()
        signer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAccessLink() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val signerServiceAsync = client.signer()

        val future = signerServiceAsync.getAccessLink("signerId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveFields() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val signerServiceAsync = client.signer()

        val responseFuture = signerServiceAsync.retrieveFields("signerId")

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendReminder() {
        val client =
            LegalesignSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val signerServiceAsync = client.signer()

        val future =
            signerServiceAsync.sendReminder(
                SignerSendReminderParams.builder().signerId("signerId").text("text").build()
            )

        val response = future.get()
    }
}
