package com.ques3;

public class MyThread {

    public static void main(String[] args) {

        Thread thread = new Thread(new Printing());

        thread.start();

    }
}

class Printing implements Runnable {


    @Override
    public void run() {

        for(int i=1; i<=10; i++)
        {
            try {

                if(i==6)
                {
                    Thread.sleep(5000);

                    System.out.println(i);
                }
                else
                {
                    System.out.println(i);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
