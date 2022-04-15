package com.ftps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FileTransferServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileTransferServiceApplication.class, args);
    }

}
