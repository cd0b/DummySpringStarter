package com.denizcanbagdatlioglu.springstarter.dummyspringstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public DummyService dummyService() {
        return new DummyService();
    }

}