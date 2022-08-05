package com.ques3;

public class Main {

    public static void main(String[] args) {

        Odd op = new Odd();
        op.odd = true;

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                op.printEven();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                op.printOdd();
            }
        });

        t1.start();
        t2.start();

        try{

            t1.join();
            t2.join();
        }
        catch (InterruptedException e){

            e.printStackTrace();
        }
    }
}
