package com.example.javafaker;

import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class JavafakerApplication {

    public static void main(String[] args) {
        //SpringApplication.run(JavafakerApplication.class, args);
        ModelFactory.StudentList(100).forEach(System.out::println);
    }

}
