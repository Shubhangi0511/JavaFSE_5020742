package com.example.bookstoreapi.metrics;

import java.util.concurrent.atomic.LongAdder;

public class MeterRegistry {
    private final LongAdder counter;

    public MeterRegistry() {
        this.counter = new LongAdder();
    }

    public void incrementCounter() {
        this.counter.increment();
    }

    public long getCounterValue() {
        return this.counter.sum();
    }
    
    public LongAdder counter(String s, String type, String customCounter) {
        return this.counter;
    }
}
