package com.nailexams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("com.nailexams.repository")
//@ComponentScan(basePackages = {"com1.nailexams"})
//@EntityScan("com.nailexams.model")

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
