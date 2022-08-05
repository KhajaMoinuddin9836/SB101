package com.ques1;

public class Calculate implements Runnable{


    @Override
    public void run() {

        int product = 1*2*3*4*5;
        System.out.println(product);
    }

    public static void main(String[] args) {

        Calculate calculate = new Calculate();
        Thread thread = new Thread(calculate);
        thread.start();
    }
}
