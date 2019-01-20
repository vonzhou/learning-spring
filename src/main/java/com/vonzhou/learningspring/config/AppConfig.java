package com.vonzhou.learningspring.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(value = "com.vonzhou.spitter.mappers")
public class AppConfig {

}
