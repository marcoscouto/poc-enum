package com.github.marcoscouto.pocenum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PocEnumApplication {

    public static void main(String[] args) {
        SpringApplication.run(PocEnumApplication.class, args);
    }

}
