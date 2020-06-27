package com.ncbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class NcbsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NcbsApplication.class, args);
    }

}
