package com.suns.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 见贤不思齐
 */
@SpringBootApplication
@MapperScan(value = "com.suns.mybatisplus.mapper")
public class MybatisPlusGeneratorDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusGeneratorDemoApplication.class, args);
    }
}
