package com.entrytest.contactmanager.counter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "counter")
public class RequestCounter {
    @Autowired
    HttpTraceRepository httpTraceRepository;

    private Map<String, Object> counter = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Object> count() {
        int numberOfRequests = httpTraceRepository.findAll().size();
        counter.put("Number of Requests", numberOfRequests);
        return counter;
    }
}