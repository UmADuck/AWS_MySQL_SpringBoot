package com.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class})

public class DbLab5Application {

    public static void main(String[] args) {
        SpringApplication.run(DbLab5Application.class, args);
    }

}
