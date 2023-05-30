package com.sarathUniversity.universitymonolithicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.sarathUniversity.controller", "com.sarathUniversity.service"})
@EntityScan({"com.sarathUniversity.entity"})
@EnableJpaRepositories("com.sarathUniversity.repository")
public class UniversityMonolithicAppApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(UniversityMonolithicAppApplication.class, args);
    }

}
