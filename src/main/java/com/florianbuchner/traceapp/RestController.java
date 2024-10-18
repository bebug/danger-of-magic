package com.florianbuchner.traceapp;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final TraceContext traceContext;

    public RestController(TraceContext traceContext) {
        this.traceContext = traceContext;
    }

    @GetMapping("/")
    public String getTrace() {
        return "TraceId: " + traceContext.getTraceId();
    }

}
