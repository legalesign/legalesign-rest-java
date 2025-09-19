// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.subscribe

import com.legalesign.api.models.notifications.WebhookEventFilterEnum
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscribeCreateWebhookParamsTest {

    @Test
    fun create() {
        SubscribeCreateWebhookParams.builder()
            .notify("realtime")
            .url("https://")
            .eventFilter(WebhookEventFilterEnum.EMPTY)
            .group("group")
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscribeCreateWebhookParams.builder()
                .notify("realtime")
                .url("https://")
                .eventFilter(WebhookEventFilterEnum.EMPTY)
                .group("group")
                .build()

        val body = params._body()

        assertThat(body.notify()).isEqualTo("realtime")
        assertThat(body.url()).isEqualTo("https://")
        assertThat(body.eventFilter()).contains(WebhookEventFilterEnum.EMPTY)
        assertThat(body.group()).contains("group")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscribeCreateWebhookParams.builder().notify("realtime").url("https://").build()

        val body = params._body()

        assertThat(body.notify()).isEqualTo("realtime")
        assertThat(body.url()).isEqualTo("https://")
    }
}
