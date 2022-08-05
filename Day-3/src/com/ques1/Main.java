package com.ques1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(

                new Student(5, "Doremon", 450),
                new Student(3, "Nobita", 200),
                new Student(2, "Jiyan", 150),
                new Student(1, "Shinchan", 500),
                new Student(4, "Shizuka", 300)
        );

        students
                .stream()
                .filter(s -> s.marks < 250)
                .forEach(s -> System.out.println(s.Name));

    }
}


