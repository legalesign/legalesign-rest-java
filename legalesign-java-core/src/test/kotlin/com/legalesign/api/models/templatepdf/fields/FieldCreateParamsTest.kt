// File generated from our OpenAPI spec by Stainless.

package com.legalesign.api.models.templatepdf.fields

import com.legalesign.api.models.document.PdfFieldValidationEnum
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FieldCreateParamsTest {

    @Test
    fun create() {
        FieldCreateParams.builder()
            .pdfId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addBody(
                FieldCreateParams.Body.builder()
                    .ax(0.0f)
                    .ay(0.0f)
                    .bx(0.0f)
                    .by(0.0f)
                    .elementType(FieldCreateParams.Body.ElementType.SIGNATURE)
                    .page(0)
                    .signer(1)
                    .align(FieldCreateParams.Body.Align._1)
                    .fieldorder(0)
                    .fontName(FieldCreateParams.Body.FontName.EMPTY)
                    .fontSize(6)
                    .hideBorder(true)
                    .label("label")
                    .labelExtra("label_extra")
                    .logicAction(FieldCreateParams.Body.LogicAction._1)
                    .logicGroup("logic_group")
                    .mapTo("map_to")
                    .optional(true)
                    .options("options")
                    .substantive(true)
                    .validation(PdfFieldValidationEnum._1)
                    .value("value")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FieldCreateParams.builder()
                .pdfId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    FieldCreateParams.Body.builder()
                        .ax(0.0f)
                        .ay(0.0f)
                        .bx(0.0f)
                        .by(0.0f)
                        .elementType(FieldCreateParams.Body.ElementType.SIGNATURE)
                        .page(0)
                        .signer(1)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FieldCreateParams.builder()
                .pdfId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    FieldCreateParams.Body.builder()
                        .ax(0.0f)
                        .ay(0.0f)
                        .bx(0.0f)
                        .by(0.0f)
                        .elementType(FieldCreateParams.Body.ElementType.SIGNATURE)
                        .page(0)
                        .signer(1)
                        .align(FieldCreateParams.Body.Align._1)
                        .fieldorder(0)
                        .fontName(FieldCreateParams.Body.FontName.EMPTY)
                        .fontSize(6)
                        .hideBorder(true)
                        .label("label")
                        .labelExtra("label_extra")
                        .logicAction(FieldCreateParams.Body.LogicAction._1)
                        .logicGroup("logic_group")
                        .mapTo("map_to")
                        .optional(true)
                        .options("options")
                        .substantive(true)
                        .validation(PdfFieldValidationEnum._1)
                        .value("value")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                FieldCreateParams.Body.builder()
                    .ax(0.0f)
                    .ay(0.0f)
                    .bx(0.0f)
                    .by(0.0f)
                    .elementType(FieldCreateParams.Body.ElementType.SIGNATURE)
                    .page(0)
                    .signer(1)
                    .align(FieldCreateParams.Body.Align._1)
                    .fieldorder(0)
                    .fontName(FieldCreateParams.Body.FontName.EMPTY)
                    .fontSize(6)
                    .hideBorder(true)
                    .label("label")
                    .labelExtra("label_extra")
                    .logicAction(FieldCreateParams.Body.LogicAction._1)
                    .logicGroup("logic_group")
                    .mapTo("map_to")
                    .optional(true)
                    .options("options")
                    .substantive(true)
                    .validation(PdfFieldValidationEnum._1)
                    .value("value")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FieldCreateParams.builder()
                .pdfId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    FieldCreateParams.Body.builder()
                        .ax(0.0f)
                        .ay(0.0f)
                        .bx(0.0f)
                        .by(0.0f)
                        .elementType(FieldCreateParams.Body.ElementType.SIGNATURE)
                        .page(0)
                        .signer(1)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                FieldCreateParams.Body.builder()
                    .ax(0.0f)
                    .ay(0.0f)
                    .bx(0.0f)
                    .by(0.0f)
                    .elementType(FieldCreateParams.Body.ElementType.SIGNATURE)
                    .page(0)
                    .signer(1)
                    .build()
            )
    }
}
