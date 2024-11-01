package com.bomfim.versioning.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathController {

    @GetMapping("/v1/path")
    public ResponseEntity<String> getValuesV1() {
        return ResponseEntity.ok("Path v1");
    }

    @GetMapping("/v2/path")
    public ResponseEntity<String> getValuesV2() {
        return ResponseEntity.ok("Path v2");
    }
}
