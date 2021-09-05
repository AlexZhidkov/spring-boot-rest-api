package com.zhidkov.restapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @PostMapping("/postcodenames")
    public void setPostCodeNames(@RequestBody PostCodeName[] newPostCodeNames) {
        postCodeNames = newPostCodeNames;
    }

    @GetMapping("/postcodenames")
    public Response getPostCodeNames(@RequestParam(value = "from", defaultValue = "0") int fromPostCode,
            @RequestParam(value = "to", defaultValue = "0") int toPostCode) {

        List<String> names = Arrays.stream(postCodeNames)
                .filter(x -> x.getPostCode() >= fromPostCode && x.getPostCode() <= toPostCode).map(x -> x.getName())
                .collect(Collectors.toList());

        return new Response(names);
    }
}
