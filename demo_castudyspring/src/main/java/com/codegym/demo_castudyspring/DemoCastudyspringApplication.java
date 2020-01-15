package com.codegym.demo_castudyspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.codegym.demo_castudyspring.casestudy.repository")
public class DemoCastudyspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCastudyspringApplication.class, args);
    }

}
