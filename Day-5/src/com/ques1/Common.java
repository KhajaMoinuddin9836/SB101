package com.ques1;

public class Common {

    public synchronized void fun1(String name) {

        System.out.println("Welcome");

       try {
           Thread.sleep(1000);
       }
       catch (Exception e) {
       }
           System.out.println(name);
    }
}

class ThreadA extends Thread{

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

class ThreadB extends Thread{

    Common c;
    String name;

    public ThreadB(Common c, String name){

        super();

        this.c = c;
        this.name = name;
    }

    @Override
    public void run() {
        c.fun1(name);
    }
}
