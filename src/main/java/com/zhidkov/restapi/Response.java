package com.zhidkov.restapi;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Response {
    private final int totalLength;
    private final List<String> names;

    public Response(List<String> postcodeNames) {
        AtomicInteger total = new AtomicInteger(0);
        postcodeNames.forEach(e -> total.accumulateAndGet(e.length(), (x, y) -> (x + y)));
        totalLength = total.intValue();

        java.util.Collections.sort(postcodeNames);
        names = postcodeNames;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public List<String> getNames() {
        return names;
    }
}
