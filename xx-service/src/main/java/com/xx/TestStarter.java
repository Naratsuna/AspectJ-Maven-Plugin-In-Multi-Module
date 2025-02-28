package com.xx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestStarter {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(TestStarter.class);
        application.run(args);
    }

}
