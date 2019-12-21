package com.aaa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.aaa.dao")   // 扫描mybatis接口
@EnableTransactionManagement
public class DemoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAppApplication.class, args);
    }

}
