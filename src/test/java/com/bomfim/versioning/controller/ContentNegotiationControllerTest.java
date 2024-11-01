package com.bomfim.versioning.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.assertj.MockMvcTester;

import static org.assertj.core.api.Assertions.assertThat;


class ContentNegotiationControllerTest {

    private final MockMvcTester mockMvc = MockMvcTester.of(new ContentNegotiationController());

    @DisplayName("Should return content from v1")
    @Test
    void testGetValuesV1() {
        org.assertj.core.api.Assertions.assertThat(mockMvc
                .get()
                .uri("/content-negotiation")
                .accept("application/vnd.my.api.v1+json"))
                .hasStatusOk()
                .hasBodyTextEqualTo("Content Negotiation v1");
    }

    @DisplayName("Should return content from v2")
    @Test
    void testGetValuesV2() {
        assertThat(mockMvc
                .get()
                .uri("/content-negotiation")
                .accept("application/vnd.my.api.v2+json"))
                .hasStatusOk()
                .hasBodyTextEqualTo("Content Negotiation v2");
    }
}