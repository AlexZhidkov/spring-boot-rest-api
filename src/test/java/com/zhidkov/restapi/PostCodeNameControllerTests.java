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
    public void setAndGetAllPostCodeNames() {
        PostCodeName[] newPostCodeNames = new PostCodeName[] { new PostCodeName(1, "One"), new PostCodeName(2, "Two"),
                new PostCodeName(3, "Three") };
        postCodeNameController.setPostCodeNames(newPostCodeNames);

        Response response = postCodeNameController.getPostCodeNames(1, 3);

        assertEquals(3, response.getNames().size());
    }

    @Test
    public void setAndGetPostCodeNamesTwoThreeAndFour() {
        PostCodeName[] newPostCodeNames = new PostCodeName[] { new PostCodeName(1, "One"), new PostCodeName(2, "Two"),
                new PostCodeName(3, "Three"), new PostCodeName(4, "Four"), new PostCodeName(5, "Five") };
        postCodeNameController.setPostCodeNames(newPostCodeNames);

        Response response = postCodeNameController.getPostCodeNames(2, 4);

        assertEquals(3, response.getNames().size());
    }

}
