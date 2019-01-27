package com.services.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallHelloController {

    @Autowired
    private CallHelloService callHelloService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(String name) {
        String result = callHelloService.callHello(name);
        return result;
    }

}
