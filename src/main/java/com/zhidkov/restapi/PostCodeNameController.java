package com.zhidkov.restapi;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostCodeNameController {

    private PostCodeName[] postCodeNames;

    PostCodeNameController() {
        postCodeNames = new PostCodeName[0];
    }

    @GetMapping("/postcodename")
    public PostCodeName getPostCodeName(@RequestParam(value = "postcode", defaultValue = "0") int postCode) {
        Optional<PostCodeName> result = Arrays.stream(postCodeNames).filter(x -> x.getPostCode() == postCode).findAny();
        return result.get();
    }

    @PostMapping("/postcodename")
    public void setPostCodeNames(@RequestBody PostCodeName[] newPostCodeNames) {
        postCodeNames = newPostCodeNames;
    }

    @GetMapping("/postcodenames")
    public PostCodeName[] getPostCodeNames(@RequestParam(value = "from", defaultValue = "0") int fromPostCode,
            @RequestParam(value = "to", defaultValue = "0") int toPostCode) {
        return postCodeNames;
    }
}
