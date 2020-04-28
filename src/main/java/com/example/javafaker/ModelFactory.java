package com.example.javafaker;


import com.github.javafaker.Faker;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModelFactory {
    private static Faker faker = new Faker(Locale.CHINA);

    public static List<Student> StudentList(final int number){
        return Stream.generate(() -> new Student(faker.name().fullName(), faker.number().randomDouble(2, 1, number))).limit(number).collect(Collectors.toList());
    }
}
