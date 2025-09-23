// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.services.blocking

import com.legalesign_sdk.api.TestServerExtension
import com.legalesign_sdk.api.client.okhttp.LegalesignSdkOkHttpClient
import com.legalesign_sdk.api.models.group.GroupCreateParams
import com.legalesign_sdk.api.models.group.GroupListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GroupServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LegalesignSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupService = client.group()

        groupService.create(GroupCreateParams.builder().name("xxxx").xframeAllow(true).build())
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupService = client.group()

        val group = groupService.retrieve("groupId")

        group.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LegalesignSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupService = client.group()

        val groups = groupService.list(GroupListParams.builder().limit(0L).offset(0L).build())

        groups.validate()
    }
}
