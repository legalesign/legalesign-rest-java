// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.notifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationListResponseTest {

    @Test
    fun create() {
        val notificationListResponse =
            NotificationListResponse.builder()
                .active(true)
                .eventFilter(WebhookEventFilterEnum.EMPTY)
                .groupId(0L)
                .notifyWhen(NotificationListResponse.NotifyWhen._1)
                .url("https://mywebsite.com/callback/")
                .build()

        assertThat(notificationListResponse.active()).contains(true)
        assertThat(notificationListResponse.eventFilter()).contains(WebhookEventFilterEnum.EMPTY)
        assertThat(notificationListResponse.groupId()).contains(0L)
        assertThat(notificationListResponse.notifyWhen())
            .contains(NotificationListResponse.NotifyWhen._1)
        assertThat(notificationListResponse.url()).contains("https://mywebsite.com/callback/")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationListResponse =
            NotificationListResponse.builder()
                .active(true)
                .eventFilter(WebhookEventFilterEnum.EMPTY)
                .groupId(0L)
                .notifyWhen(NotificationListResponse.NotifyWhen._1)
                .url("https://mywebsite.com/callback/")
                .build()

        val roundtrippedNotificationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationListResponse),
                jacksonTypeRef<NotificationListResponse>(),
            )

        assertThat(roundtrippedNotificationListResponse).isEqualTo(notificationListResponse)
    }
}
