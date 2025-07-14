package com.denizcanbagdatlioglu.dummyspringstarterapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.denizcanbagdatlioglu.springstarter.dummyspringstarter.DummyService;

@SpringBootApplication
public class DummyspringstarterapplicationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DummyspringstarterapplicationApplication.class, args);
        DummyService service = context.getBean(DummyService.class);
        System.out.println(service.message());
    }

}
