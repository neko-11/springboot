package com.handchina.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 跨域拦截器   需要允许跨域的Controller继承这个类
 * 或者使用 @CrossOrigin   eg：@CrossOrigin(origins = "http://192.168.1.97:3000", maxAge = 3600)
 * Created by zhushuangfei on 2018/7/21
 */
@Configuration
public class CorsConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")//允许的路径
                .allowedOrigins("http://127.0.0.1:3000","http://localhost:3000")//允许的ip和端口   .allowedOrigins("http://192.168.1.97:3000")
                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH")//允许的方法
                .allowCredentials(true).maxAge(3600);
    }
}