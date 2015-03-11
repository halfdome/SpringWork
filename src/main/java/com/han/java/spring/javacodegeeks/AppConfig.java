package com.han.java.spring.javacodegeeks;

/**
 * Created by yhan on 3/10/15.
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="helloWorldBean")
    public HelloWorldService helloWorldService() {
        return new HelloWorldService();
    }

}