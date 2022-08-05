package com.ques1;

public class Demo {

    public static void main(String[] args) {

        OwnGeneric<String, Integer> obj = new OwnGeneric<>("Khaja", 126);

        obj.myGeneric();
    }

}

class OwnGeneric<T, U> {

    T obj1;
    U obj2;

    OwnGeneric(T obj1, U obj2){

        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void myGeneric() {

        System.out.println(obj1);
        System.out.println(obj2);
    }
}