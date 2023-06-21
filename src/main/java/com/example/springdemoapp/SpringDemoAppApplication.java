package com.example.springdemoapp;

import com.example.springdemoapp.model.Kris;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoAppApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=SpringApplication.run(SpringDemoAppApplication.class, args);

        User user=context.getBean(User.class);
        user.userTalking();
        System.out.println(user.toString());





    }

}
