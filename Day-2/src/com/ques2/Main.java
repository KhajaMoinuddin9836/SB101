package com.ques2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PrintList city = new PrintList() {
            @Override
            public void display(List<String> city) {

                System.out.println(city);
            }
        };

        List<String> list = new ArrayList<>();

        list.add("Bangalore");
        list.add("Delhi");
        list.add("Mumbai");
        list.add("Pune");
        list.add("Hyderabad");

        city.display(list);

    }
}

interface PrintList {

    abstract void display(List<String> city);
}

