package com.huanghy.scaff;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author HuangHy
 * @Description TODO 启动类
 * @Date 17:43 2021/2/28
 * @Param 
 * @return 
 **/

@SpringBootApplication
@MapperScan("com.huanghy.scaff.mapper")
public class HhyScaffApplication {

    public static void main(String[] args) {
        SpringApplication.run(HhyScaffApplication.class, args);
    }

}
