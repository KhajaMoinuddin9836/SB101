package com.ques2;

public class Main {

    public static void main(String[] args) {

        Common c = new Common();

        ThreadA threadA = new ThreadA(c, "Khaja");
        threadA.start();
    }
}
