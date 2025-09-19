// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.blocking

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClient
import com.legalesign.api.models.user.TimezoneEnum
import com.legalesign.api.models.user.UserCreateParams
import com.legalesign.api.models.user.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.user()

        userService.create(
            UserCreateParams.builder()
                .email("dev@stainless.com")
                .firstName("first_name")
                .lastName("last_name")
                .groups("/api/v1/group/IK-GV--w1tvt/")
                .password("password")
                .permission(UserCreateParams.Permission._1)
                .timezone(TimezoneEnum.AFRICA_ABIDJAN)
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
        val userService = client.user()

        val user = userService.retrieve("userId")

        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LegalesignOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.user()

        userService.update(
            UserUpdateParams.builder()
                .userId("userId")
                .firstName("first_name")
                .lastName("last_name")
                .build()
        )
    }
}
