package com.ques1;

public class Race {

    /*
    * Race Condition :-> A race condition is a concurrency problem that may occur inside a critical section.
    *
    * if thread A is reading data from the list and another thread B is trying to sort the same data.
    * This process leads to a race condition that may result in run time error.
    * For solving this condition we use synchronized keyword(for thread safety).
    * */


    public static void main(String[] args) {

        Common c = new Common();
        c.fun1("Ram");
        ThreadA threadA = new ThreadA(c, "Shyam");
        threadA.start();
        ThreadB threadB = new ThreadB(c,"xyz");
        threadB.start();
    }
}
