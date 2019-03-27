package com.mansubh.controller;

import com.mansubh.Application;
import com.mansubh.service.HelloService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import java.net.URL;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = Application.class)
public class MainControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private HelloService helloService;

    @LocalServerPort
    private int port;

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String>response = restTemplate.getForEntity(new URL("http://localhost:" + port+ "/get").toString(),String.class);
        Assertions.assertEquals(helloService.get(), response.getBody());
    }

    @Test
    public void getStateInitials() throws Exception {
        String params = "New South wales";
        ResponseEntity<String>response = restTemplate.getForEntity(new URL("http://localhost:" + port+ "/getState?state="+params).toString(),String.class);
        Assertions.assertEquals(helloService.getStateInitials(params) , response.getBody());
    }
}
