package com.watchesos.os;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.watchesos.os.dao.mapper")
@SpringBootApplication
public class OsApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(OsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(OsApplication.class, args);
    }
}
