package org.sanqi.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.sanqi.demo.mapper")
public class MpInterceptorDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpInterceptorDemoApplication.class, args);
    }

}
