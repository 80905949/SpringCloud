package com.services.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallHelloService {

    @Value("${app.service-url}")
    private String appServiceUrl;

    @Autowired
    private RestTemplate restTemplate;

    public String callHello(String name) {
        // 是一个http client
        ResponseEntity result = restTemplate.postForEntity(appServiceUrl + "hello/" + name, null, String.class);
        return result.getBody().toString();
    }
}