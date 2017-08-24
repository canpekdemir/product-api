package com.craftsmanship.product.api;

import com.craftsmanship.product.api.infrastructure.interceptor.CorrelationIdInterceptor;
import com.craftsmanship.product.api.infrastructure.interceptor.LogExecutionInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
    }

    @Bean
    public WebMvcConfigurerAdapter adapter() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new CorrelationIdInterceptor());
                registry.addInterceptor(new LogExecutionInterceptor());
            }
        };
    }
}
