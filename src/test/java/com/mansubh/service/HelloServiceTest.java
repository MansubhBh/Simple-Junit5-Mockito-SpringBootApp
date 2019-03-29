package com.mansubh.service;

import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    //integration test

    @DisplayName("Test spring @Autowired Integration")
    @Test
    void testGet(){
        Assertions.assertEquals("Hello Junit 5", helloService.get());
    }

    @Test
    public void testGetStateIntials(){
        String params = "New south wales";
        String params2 = "Queensland";
        String expected = "NSW";
        String expected2 = "QUE";
        Assertions.assertEquals(expected, helloService.getStateInitials(params));
        Assertions.assertEquals(expected2, helloService.getStateInitials(params2));
    }

    @Test
    public void testSum(){
        Assertions.assertEquals(6,helloService.sum(new int[]{1,2,3}));
    }
}
