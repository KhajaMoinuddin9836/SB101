package com.ques3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Allu", 560));
        students.add(new Student(5, "Yash", 350));
        students.add(new Student(12, "Ram", 750));
        students.add(new Student(32, "Prabhas", 450));
        students.add(new Student(25, "Ntr", 850));

        List<Employee> employeeList = students
                .stream()
                .map(s -> {
                    Employee employee = new Employee();
                    employee.setEmployeeId(s.getRoll());
                    employee.setEmployeeName(s.getName());
                    employee.setSalary(1000*s.getMarks());

                    return employee;
                })

                .collect(Collectors.toList());

            for(Employee e : employeeList)
            {
                System.out.println("Employee ID is: "+e.getEmployeeId());
                System.out.println("Employee Name is: "+e.getEmployeeName());
                System.out.println("Employee Salary is: "+e.getSalary());
                System.out.println("===============================");
            }


    }
}
