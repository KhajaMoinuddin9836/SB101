package com.ques2;

public class ThreadA extends Thread{

    Common c;
    String name;

    public ThreadA(Common c, String name){

        super();
        this.c = c;
        this.name = name;
    }

    @Override
    public void run() {
        c.fun1(name);
    }
}
