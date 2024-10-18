package com.florianbuchner.traceapp;

import java.util.Random;

public class TraceContext {

    private Integer traceId;

    /**
     * Never make this final!
     */
    public int getTraceId() {
        if (traceId == null) {
            traceId = new Random().nextInt();
        }

        return traceId;
    }
}
