package com.example.jenkinstest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Hello, Jenkins!");
        System.err.println("변경사항을 추가한다");
    }

}
