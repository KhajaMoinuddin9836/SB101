package com.ques2;

public class Common implements Runnable{

    public void fun1(String name){

        System.out.println("Welcome");

        synchronized (Common.class){

            System.out.println("Name is: ");
        }
        System.out.println(name);
    }

    @Override
    public void run() {

    }
}


