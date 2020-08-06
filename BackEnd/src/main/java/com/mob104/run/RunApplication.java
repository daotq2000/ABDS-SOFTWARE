package com.mob104.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.mob104.model")
@SpringBootApplication(scanBasePackages = {"com.mob104.model", "com.mob104.dao","com.mob104.mapper","com.mob104.controller"})
public class RunApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }

}
