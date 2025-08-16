package org.aryan.config;

import org.aryan.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public  Desktop desktop(){
        return new Desktop();
    }
}
