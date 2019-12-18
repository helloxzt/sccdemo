package com.helloxzt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: Xiazt
 * @Date: 2019-12-18 11:34
 */
@SpringBootApplication
@EnableConfigServer
public class ServerStartUp {

    public static void main(String[] args) {
        SpringApplication.run(ServerStartUp.class,args);
    }

}
