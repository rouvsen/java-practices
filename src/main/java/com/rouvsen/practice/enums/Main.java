package com.rouvsen.practice.enums;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car("BMW", Color.WHITE);
        System.out.println(bmw);
        System.out.println(bmw.getColor().selectedColor());

    }
}
