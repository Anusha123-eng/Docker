package net.javaguides.springboot_docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerController {

    @GetMapping("/docker")
    public String dockerDemo(){
        return "Dockerizing Spring boot application";
    }
}
