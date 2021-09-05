package com.zhidkov.restapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class ResponseTest {

    @Test
    public void responseGetTotalLengthOfThreeStrings() {
        List<String> names = Arrays.asList("One", "Two", "Three");

        Response response = new Response(names);

        assertEquals(3, response.getNames().size());
        assertEquals(11, response.getTotalLength());
    }

    @Test
    public void responseNamesAreSorted() {
        List<String> names = Arrays.asList("Z", "H", "A", "Ab", "Aa");

        Response response = new Response(names);

        assertEquals("A-Aa-Ab-H-Z", response.getNames().stream().collect(Collectors.joining("-")));
    }
}
