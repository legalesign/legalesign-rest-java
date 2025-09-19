// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.unsubscribe

import com.legalesign.api.models.notifications.WebhookEventFilterEnum
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UnsubscribeDeleteWebhookParamsTest {

    @Test
    fun create() {
        UnsubscribeDeleteWebhookParams.builder()
            .url("https://")
            .eventFilter(WebhookEventFilterEnum.EMPTY)
            .group(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            UnsubscribeDeleteWebhookParams.builder()
                .url("https://")
                .eventFilter(WebhookEventFilterEnum.EMPTY)
                .group(0L)
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://")
        assertThat(body.eventFilter()).contains(WebhookEventFilterEnum.EMPTY)
        assertThat(body.group()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UnsubscribeDeleteWebhookParams.builder().url("https://").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://")
    }
}
