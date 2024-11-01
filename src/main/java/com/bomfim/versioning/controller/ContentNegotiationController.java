package com.bomfim.versioning.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/content-negotiation")
public class ContentNegotiationController {

    @GetMapping(produces = "application/vnd.my.api.v1+json")
    public ResponseEntity<String> getValuesV1() {
        return ResponseEntity.ok("Content Negotiation v1");
    }

    @GetMapping(produces = "application/vnd.my.api.v2+json")
    public ResponseEntity<String> getValuesV2() {
        return ResponseEntity.ok("Content Negotiation v2");
    }
}
