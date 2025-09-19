// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClient
import com.legalesign.api.models.member.MemberCreateParams
import com.legalesign.api.models.member.MemberListParams
import com.legalesign.api.models.member.PermissionsEnum
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MemberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memberService = client.member()

        memberService.create(
            MemberCreateParams.builder()
                .email("dev@stainless.com")
                .group("/api/v1/group/IK-GV--w1tvt/")
                .doEmail(true)
                .permission(PermissionsEnum._1)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memberService = client.member()

        val memberResponse = memberService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        memberResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memberService = client.member()

        val members =
            memberService.list(
                MemberListParams.builder().group("group").limit(0L).offset(0L).build()
            )

        members.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memberService = client.member()

        memberService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
