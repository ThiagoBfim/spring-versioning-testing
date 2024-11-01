package com.bomfim.versioning.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/header")
public class HeaderController {

    @GetMapping(headers = "X-Version=1")
    public ResponseEntity<String> getValuesV1() {
        return ResponseEntity.ok("Header v1");
    }

    @GetMapping(headers = "X-Version=2")
    public ResponseEntity<String> getValuesV2() {
        return ResponseEntity.ok("Header v2");
    }
}
