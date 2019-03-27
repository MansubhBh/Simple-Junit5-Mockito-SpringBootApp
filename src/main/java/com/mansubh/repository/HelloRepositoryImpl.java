package com.mansubh.repository;


import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositoryImpl implements HelloRepository {

    @Override
    public String get() {
        return "Hello Junit 5";
    }
}
