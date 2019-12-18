package com.helloxzt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Xiazt
 * @Date: 2019-12-18 11:51
 */
@SpringBootApplication
@RestController
public class ClientStartUp {

    @Value("${guestname}")
    String name;

    @RequestMapping("")
    public String sayHello(){
        return "Hello " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientStartUp.class,args);
    }

}
