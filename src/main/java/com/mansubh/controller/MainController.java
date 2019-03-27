package com.mansubh.controller;

import com.mansubh.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/get")
    public String hello(){
        return helloService.get();
    }

    @GetMapping("/getState")
    public String getStateInitials(@RequestParam("state") String state){
        return helloService.getStateInitials(state);
    }

}
