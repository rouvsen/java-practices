package com.rouvsen.practice.lambdawithfunctionalinterface;

public class Main {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello World!");
//            }
//        };
//
//        runnable.run();

//        Runnable runnable = () -> System.out.println("Hello World");
//        runnable.run();

        Runnable runnable = System.out::println;
        runnable.run();
    }
}
