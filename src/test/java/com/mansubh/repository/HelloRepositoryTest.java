package com.mansubh.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class HelloRepositoryTest {

    private HelloRepository helloRepository;

    @BeforeEach
    public void beforeTest(){
        helloRepository = new HelloRepositoryImpl();
    }

    @Test
    @DisplayName("Hello repository test get method ")
    public void testGet(){
        Assertions.assertEquals("Hello Junit 5" , helloRepository.get());
    }
}
