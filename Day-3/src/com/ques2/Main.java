package com.ques2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(10, "Akshay", 850));
        students.add(new Student(12, "Salman", 750));
        students.add(new Student(13, "Shahrukh", 650));
        students.add(new Student(14, "Hrithik", 950));
        students.add(new Student(15, "Amir", 750));

        List<Student> studentList = students.stream()
                .filter(s -> s.getMarks()<800).collect(Collectors.toList());

        System.out.println(studentList);
    }
}
