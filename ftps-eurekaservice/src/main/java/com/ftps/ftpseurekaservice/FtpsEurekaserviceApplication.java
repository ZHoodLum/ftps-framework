package com.ftps.ftpseurekaservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@Slf4j
public class FtpsEurekaserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FtpsEurekaserviceApplication.class, args);
        log.info("ftps-eurekaservice the project started successfully");
    }
}
