// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.group

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign.api.core.jsonMapper
import com.legalesign.api.models.attachment.ListMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupListResponseTest {

    @Test
    fun create() {
        val groupListResponse =
            GroupListResponse.builder()
                .meta(
                    ListMeta.builder()
                        .limit(0)
                        .next("next")
                        .offset(0)
                        .previous("previous")
                        .totalCount(0)
                        .build()
                )
                .addObject(
                    GroupListResponse.Object.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isActive(true)
                        .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .publicName("public_name")
                        .resourceUri("https://example.com")
                        .slug("slug")
                        .user("user")
                        .xframeAllow(true)
                        .xframeAllowPdfEdit(true)
                        .build()
                )
                .build()

        assertThat(groupListResponse.meta())
            .contains(
                ListMeta.builder()
                    .limit(0)
                    .next("next")
                    .offset(0)
                    .previous("previous")
                    .totalCount(0)
                    .build()
            )
        assertThat(groupListResponse.objects().getOrNull())
            .containsExactly(
                GroupListResponse.Object.builder()
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isActive(true)
                    .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .publicName("public_name")
                    .resourceUri("https://example.com")
                    .slug("slug")
                    .user("user")
                    .xframeAllow(true)
                    .xframeAllowPdfEdit(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupListResponse =
            GroupListResponse.builder()
                .meta(
                    ListMeta.builder()
                        .limit(0)
                        .next("next")
                        .offset(0)
                        .previous("previous")
                        .totalCount(0)
                        .build()
                )
                .addObject(
                    GroupListResponse.Object.builder()
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isActive(true)
                        .modified(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .publicName("public_name")
                        .resourceUri("https://example.com")
                        .slug("slug")
                        .user("user")
                        .xframeAllow(true)
                        .xframeAllowPdfEdit(true)
                        .build()
                )
                .build()

        val roundtrippedGroupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupListResponse),
                jacksonTypeRef<GroupListResponse>(),
            )

        assertThat(roundtrippedGroupListResponse).isEqualTo(groupListResponse)
    }
}
