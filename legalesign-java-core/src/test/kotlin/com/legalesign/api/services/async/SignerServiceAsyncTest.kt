// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClientAsync
import com.legalesign.api.models.signer.SignerResetParams
import com.legalesign.api.models.signer.SignerSendReminderParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SignerServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignOkHttpClientAsync.builder()
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
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val signerServiceAsync = client.signer()

        val future = signerServiceAsync.getAccessLink("signerId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getRejectionReason() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val signerServiceAsync = client.signer()

        val responseFuture = signerServiceAsync.getRejectionReason("signerId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun reset() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val signerServiceAsync = client.signer()

        val future =
            signerServiceAsync.reset(
                SignerResetParams.builder().signerId("signerId").email("email").notify(true).build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveFields() {
        val client =
            LegalesignOkHttpClientAsync.builder()
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
            LegalesignOkHttpClientAsync.builder()
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
