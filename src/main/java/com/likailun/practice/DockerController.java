package com.likailun.practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @RequestMapping("/docker")
    public String docker() {
        return "Hello! Docker!";
    }
}
