// File generated from our OpenAPI spec by Stainless.

package com.legalesign_sdk.api.models.document

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.legalesign_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentGetFieldsResponseTest {

    @Test
    fun create() {
        val documentGetFieldsResponse =
            DocumentGetFieldsResponse.builder()
                .elementType(DocumentGetFieldsResponse.ElementType.SIGNATURE)
                .fieldorder(0L)
                .label("label")
                .labelExtra("label_extra")
                .signer(0L)
                .state(true)
                .validation(PdfFieldValidationEnum._1)
                .value("value")
                .build()

        assertThat(documentGetFieldsResponse.elementType())
            .contains(DocumentGetFieldsResponse.ElementType.SIGNATURE)
        assertThat(documentGetFieldsResponse.fieldorder()).contains(0L)
        assertThat(documentGetFieldsResponse.label()).contains("label")
        assertThat(documentGetFieldsResponse.labelExtra()).contains("label_extra")
        assertThat(documentGetFieldsResponse.signer()).contains(0L)
        assertThat(documentGetFieldsResponse.state()).contains(true)
        assertThat(documentGetFieldsResponse.validation()).contains(PdfFieldValidationEnum._1)
        assertThat(documentGetFieldsResponse.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentGetFieldsResponse =
            DocumentGetFieldsResponse.builder()
                .elementType(DocumentGetFieldsResponse.ElementType.SIGNATURE)
                .fieldorder(0L)
                .label("label")
                .labelExtra("label_extra")
                .signer(0L)
                .state(true)
                .validation(PdfFieldValidationEnum._1)
                .value("value")
                .build()

        val roundtrippedDocumentGetFieldsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentGetFieldsResponse),
                jacksonTypeRef<DocumentGetFieldsResponse>(),
            )

        assertThat(roundtrippedDocumentGetFieldsResponse).isEqualTo(documentGetFieldsResponse)
    }
}
