package com.example.bookstoreapi.metrics;

import org.springframework.stereotype.Component;

@SuppressWarnings("ALL")
@Component
public class CustomMetrics {

    public CustomMetrics(MeterRegistry meterRegistry) {
        meterRegistry.counter("custom.metric", "type", "customCounter").increment();
    }
}
