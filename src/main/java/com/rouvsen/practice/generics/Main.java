package com.rouvsen.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("John"));
        consumer(list);
        producer(list);
    }

    public static void producer(List<? extends Student> students) {
        for (Student s : students) {
            System.out.println(s.name);
        }
    }

    public static void consumer(List<? super Student> students) {
        students.add(new Student("John1"));
        students.add(new Student("John2"));
        students.add(new Student("John3"));
    }

    public static class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "name: " + name;
        }
    }

    public static class GraduatedStudent extends Student {
        public GraduatedStudent(String name) {
            super(name);
        }
    }
}
