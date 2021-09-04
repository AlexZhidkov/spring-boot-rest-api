package com.zhidkov.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostCodeNameController {

    private PostCodeName postCodeName;

    PostCodeNameController() {
        postCodeName = new PostCodeName(0, "TEST");
    }

    @GetMapping("/postcodename")
    public PostCodeName getPostCodeName(@RequestParam(value = "postcode", defaultValue = "1") int postCode) {
        return postCodeName;
    }

    @PostMapping("/postcodename")
    public void setPostCodeNames(@RequestBody PostCodeName newPostCodeName) {
        postCodeName = newPostCodeName;
    }
}
