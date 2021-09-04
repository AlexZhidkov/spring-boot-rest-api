package com.zhidkov.restapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PostCodeNameControllerTests {
    PostCodeNameController postCodeNameController;

    @BeforeEach
    public void setUp() {
        postCodeNameController = new PostCodeNameController();
    }

    @Test
    public void getTestPostCodeName() {
        PostCodeName result = postCodeNameController.getPostCodeName(3);
        assertEquals("TEST", result.getName());
    }

    @Test
    public void setAndGetPostCodeName() {
        PostCodeName newPostCodeName = new PostCodeName(2, "Two");
        postCodeNameController.setPostCodeNames(newPostCodeName);
        PostCodeName result = postCodeNameController.getPostCodeName(3);
        assertEquals(2, result.getPostCode());
        assertEquals("Two", result.getName());
    }

}
