package com.mansubh.service;

import com.mansubh.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloRepository helloRepository;

    @Override
    public String get() {
        return helloRepository.get();
    }

    @Override
    public String getStateInitials(String statename) {
        if(statename.contains(" ")){
            String[] tokens = statename.split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0 ; i < tokens.length ; i++){
                stringBuilder.append(tokens[i].charAt(0));
            }
            return stringBuilder.toString().toUpperCase();
        }
        return statename.substring(0,3).toUpperCase();
    }
}
