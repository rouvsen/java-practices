package com.rouvsen.practice.lists;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

//        String[] names = {"Name-1", "Name-2", "Name-3"};
//        List<String> list = Arrays.asList(names);
//        list.set(0, "Name-1 updated");
//        System.out.println(list);

        List<String> unmodifiableList = List.of("Name-1", "Name-2", "Name-3");
        unmodifiableList.set(0, "Name-1 updated");//UnsupportedOperationException
        System.out.println(unmodifiableList);
        //List.of doesn't support null values!
        //but Arrays.asList support null values!

    }
}
