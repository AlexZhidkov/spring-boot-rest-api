package com.zhidkov.restapi;

public class PostCodeName {

    private final int postCode;
    private final String name;

    public PostCodeName(int postCode, String name) {
        this.postCode = postCode;
        this.name = name;
    }

    public int getPostCode() {
        return postCode;
    }

    public String getName() {
        return name;
    }
}
