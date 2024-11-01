package com.bomfim.versioning.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class QueryParamController {

    @GetMapping(params = "v=1")
    public ResponseEntity<String> getValuesV1() {
        return ResponseEntity.ok("Query v1");
    }

    @GetMapping(params = "v=2")
    public ResponseEntity<String> getValuesV2() {
        return ResponseEntity.ok("Query v2");
    }
}
