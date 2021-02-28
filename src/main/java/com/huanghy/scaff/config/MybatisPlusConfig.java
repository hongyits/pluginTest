package com.huanghy.scaff.config;


import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * @Author HuangHy
 * @Description MyBatis分页插件
 * @Date 17:08 2021/2/28
 * @Param 
 * @return 
 **/


public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    
}
