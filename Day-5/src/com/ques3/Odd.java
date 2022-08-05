package com.ques3;

public class Odd {

    boolean odd;
    int count =1;
    int num = 20;

    public void printOdd() {

        synchronized (this) {

            while (count < num)
            {
                System.out.println("Odd");

                while(!odd)
                {
                    try{
                        System.out.println("Odd waiting : "+count);
                        wait();
                        System.out.println("Odd Notified : "+count);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Thread is : "+count);
                count++;
                odd = false;
                notify();
            }
        }
    }

    public void printEven() {

        try{

            Thread.sleep(1000);
        }
        catch (InterruptedException e1)
        {
            e1.printStackTrace();
        }
        synchronized (this) {

            while (count<num){

                System.out.println("Even");

                while (odd)
                {
                    try{
                        System.out.println("Even waiting : "+count);
                        wait();
                        System.out.println("Even Notified : "+count);
                    }
                    catch (InterruptedException e){

                        e.printStackTrace();
                    }
                }
                System.out.println("Even Thread : "+count);
                count++;
                odd=true;
                notify();
            }
        }
    }
}
