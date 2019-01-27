package com.services.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("hello/{name}")
    public String hello(@PathVariable String name) {
        return name + " say hello";
    }

}