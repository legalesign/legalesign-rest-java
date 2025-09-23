// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.blocking

import com.legalesign_sdk.api.TestServerExtension
import com.legalesign_sdk.api.client.okhttp.LegalesignSdkOkHttpClient
import com.legalesign_sdk.api.models.signer.SignerSendReminderParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SignerServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val signerService = client.signer()

        val signer = signerService.retrieve("signerId")

        signer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAccessLink() {
        val client =
            LegalesignSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val signerService = client.signer()

        signerService.getAccessLink("signerId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveFields() {
        val client =
            LegalesignSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val signerService = client.signer()

        val response = signerService.retrieveFields("signerId")

        response.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendReminder() {
        val client =
            LegalesignSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val signerService = client.signer()

        signerService.sendReminder(
            SignerSendReminderParams.builder().signerId("signerId").text("text").build()
        )
    }
}
