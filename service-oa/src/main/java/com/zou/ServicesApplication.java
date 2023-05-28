package com.zou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("package com.zou.mappers;")
public class ServicesApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServicesApplication.class,args);
    }
}
