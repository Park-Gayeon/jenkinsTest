package com.example.jenkinstest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Hello, Jenkins!");
        System.out.println("새로운 브랜치 테스트중입니다");
        System.out.println("마지막 테스트입니다");
    }

}
