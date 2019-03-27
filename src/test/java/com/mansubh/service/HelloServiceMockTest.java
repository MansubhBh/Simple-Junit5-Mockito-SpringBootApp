package com.mansubh.service;

import com.mansubh.repository.HelloRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceMockTest {

    @Mock
    private HelloRepository helloRepository;

    @InjectMocks
    private HelloService helloService = new HelloServiceImpl();

    @BeforeEach
    public void setMockOutput(){
        Mockito.when(helloRepository.get()).thenReturn("Hello Mockito From Repository");
    }

    @DisplayName("Test MOck hello service + hello Repository")
    @Test
    void testGet(){
        Assertions.assertEquals("Hello Mockito From Repository",helloService.get());
    }


    @DisplayName("Test mock service get state initials method")
    @Test
    public void testGetStateInitials(){
        String param = "Australia Capital Territory";
        String expected = "ACT";
        Assertions.assertEquals(expected, helloService.getStateInitials(param));
    }

}
