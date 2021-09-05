package com.zhidkov.restapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ResponseTest {

    @Test
    public void responseGetTotalLengthOfThreeStrings() {
        List<String> names = Arrays.asList("One", "Two", "Three");

        Response response = new Response(names);

        assertEquals(3, response.getNames().size());
        assertEquals(11, response.getTotalLength());
    }

}
