// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.services.async

import com.legalesign.api.TestServerExtension
import com.legalesign.api.client.okhttp.LegalesignOkHttpClientAsync
import com.legalesign.api.models.user.TimezoneEnum
import com.legalesign.api.models.user.UserCreateParams
import com.legalesign.api.models.user.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val future =
            userServiceAsync.create(
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
        val userServiceAsync = client.user()

        val userFuture = userServiceAsync.retrieve("userId")

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LegalesignOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val future =
            userServiceAsync.update(
                UserUpdateParams.builder()
                    .userId("userId")
                    .firstName("first_name")
                    .lastName("last_name")
                    .build()
            )

        val response = future.get()
    }
}
