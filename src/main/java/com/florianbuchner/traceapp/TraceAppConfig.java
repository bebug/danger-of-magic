package com.florianbuchner.traceapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
public class TraceAppConfig {

    @Bean
    @RequestScope
    TraceContext traceContext() {
        return new TraceContext();
    }
}
