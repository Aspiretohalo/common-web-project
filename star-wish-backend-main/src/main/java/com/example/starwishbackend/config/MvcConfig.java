package com.example.starwishbackend.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Slf4j
@Configuration
public class MvcConfig implements WebMvcConfigurer{

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry){
//        registry.addViewController("static/index.html").setViewName("login");
//    }
//设置静态资源映射
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry){
//        log.info("开始静态资源映射");
//        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
//    }
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowCredentials(false)
                        .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                        .allowedOrigins("*");
            }
        };
    }

}


