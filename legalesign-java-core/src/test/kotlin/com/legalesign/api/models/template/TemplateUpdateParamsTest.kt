// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.template

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateUpdateParamsTest {

    @Test
    fun create() {
        TemplateUpdateParams.builder()
            .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .body("body")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TemplateUpdateParams.builder()
                .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body("body")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TemplateUpdateParams.builder()
                .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .body("body")
                .build()

        val body = params._body()

        assertThat(body).isEqualTo("body")
    }
}
