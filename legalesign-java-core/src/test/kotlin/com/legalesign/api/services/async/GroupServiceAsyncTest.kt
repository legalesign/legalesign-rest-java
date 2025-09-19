// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClientAsync
import com.legalesign.api.models.group.GroupCreateParams
import com.legalesign.api.models.group.GroupListParams
import com.legalesign.api.models.group.GroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GroupServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupServiceAsync = client.group()

        val future =
            groupServiceAsync.create(
                GroupCreateParams.builder().name("xxxx").xframeAllow(true).build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupServiceAsync = client.group()

        val groupFuture = groupServiceAsync.retrieve("groupId")

        val group = groupFuture.get()
        group.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupServiceAsync = client.group()

        val future =
            groupServiceAsync.update(
                GroupUpdateParams.builder().groupId("groupId").publicName("public_name").build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupServiceAsync = client.group()

        val groupsFuture =
            groupServiceAsync.list(GroupListParams.builder().limit(0L).offset(0L).build())

        val groups = groupsFuture.get()
        groups.validate()
    }
}
