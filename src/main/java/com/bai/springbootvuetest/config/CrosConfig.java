package com.bai.springbootvuetest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: SpringBoot
 * @description: 解决跨域配置类
 * @author: BaiWenHui
 * @create: 2022-08-16 13:14
 */
@Configuration
public class CrosConfig implements WebMvcConfigurer {

    //重写add方法
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedMethods("GET","HEAD","POST","PUT","DELETE","OPTIONS")
                .allowCredentials(true)
                .maxAge(3600)
                .allowedHeaders("*");
    }
}
