package com.ques1;

public class Student {

    int RollNo;
    String Name;
    int marks;

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", Name='" + Name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Student(int RollNo, String Name, int marks) {

        this.RollNo = RollNo;
        this.Name = Name;
        this.marks = marks;
    }
}
