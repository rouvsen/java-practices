package com.rouvsen.practice.nomoreifelse;

import java.util.Objects;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Getter;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(
                "Bob",
                18,
                new Street("Main Street",
                        new City("Los Angeles",
                                new State("CA"))));

        System.out.println(getStateFromJava7(student));
        System.out.println(getStateFromJava8(student));
    }

    private static String getStateFromJava7(Student student) {
        if (Objects.nonNull(student)) {
            if (Objects.nonNull(student.getAddress())) {
                if (Objects.nonNull(student.getAddress().getCity())) {
                    if (Objects.nonNull(student.getAddress().getCity().getState())) {
                        if (Objects.nonNull(student.getAddress().getCity().getState().getName())) {
                            return student.getAddress().getCity().getState().getName();
                        }
                        return "unknown";
                    }
                    return "unknown";
                }
                return "unknown";
            }
            return "unknown";
        }
        return "unknown";
    }

    private static String getStateFromJava8(Student student) {
        return Optional.ofNullable(student)
                .map(Student::getAddress)
                .map(Street::getCity)
                .map(City::getState)
                .map(State::getName)
                .orElse("unknown");
    }

    @Getter
    @AllArgsConstructor
    static class Student {
        private String name;
        private Integer age;
        private Street address;
    }

    @Getter
    @AllArgsConstructor
    static class Street {
        private String name;
        private City city;
    }

    @Getter
    @AllArgsConstructor
    static class City {
        private String name;
        private State state;
    }

    @Getter
    @AllArgsConstructor
    static class State {
        private String name;
    }
}
