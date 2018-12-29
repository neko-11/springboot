package com.hand.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域拦截器   需要允许跨域的Controller继承这个类
 * 或者使用 @CrossOrigin   eg：@CrossOrigin(origins = "http://192.168.1.97:3000", maxAge = 3600)
 *
 * @author Mr zhu
 */
@Configuration
public class CorConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 允许的路径
        registry.addMapping("/api/**")
                // 允许的ip和端口   .allowedOrigins("http://192.168.1.97:3000")
                .allowedOrigins("http://127.0.0.1:3000", "http://localhost:3000")
                // 允许的方法
                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH")
                .allowCredentials(true).maxAge(3600);
    }
}