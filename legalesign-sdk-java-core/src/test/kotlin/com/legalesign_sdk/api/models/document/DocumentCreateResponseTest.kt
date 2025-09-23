// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.document

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentCreateResponseTest {

    @Test
    fun create() {
        val documentCreateResponse = DocumentCreateResponse.builder().signer1("signer_1").build()

        assertThat(documentCreateResponse.signer1()).contains("signer_1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentCreateResponse = DocumentCreateResponse.builder().signer1("signer_1").build()

        val roundtrippedDocumentCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentCreateResponse),
                jacksonTypeRef<DocumentCreateResponse>(),
            )

        assertThat(roundtrippedDocumentCreateResponse).isEqualTo(documentCreateResponse)
    }
}
