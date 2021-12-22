package com.eureka.eurekaserver8090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@SpringBootApplication
public class ConfigServer9999Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer9999Application.class, args);
    }

}
