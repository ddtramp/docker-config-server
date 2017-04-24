package com.config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by jack on 21/04/2017.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerAppApplication.class, args);
    }
}
