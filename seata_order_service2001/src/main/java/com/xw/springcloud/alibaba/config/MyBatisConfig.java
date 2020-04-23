package com.xw.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.xw.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
