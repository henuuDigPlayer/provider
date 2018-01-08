package com.lindj;

/**
 * Created by lindongjie on 17/12/2.
 */


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by lindongjie on 17/12/1.
 */

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.lindj")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}