package com.zhidkov.restapi;

import java.util.List;

public class Response {
    private int totalLength;
    private final List<String> names;

    public Response(List<String> postcodeNames) {
        totalLength = 0;
        postcodeNames.forEach(e -> totalLength += e.length());
        names = postcodeNames;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public List<String> getNames() {
        return names;
    }
}
