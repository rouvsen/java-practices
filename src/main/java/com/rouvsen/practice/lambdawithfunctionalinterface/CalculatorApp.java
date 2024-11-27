package com.rouvsen.practice.lambdawithfunctionalinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.BiFunction;

public class CalculatorApp {
    public static void main(String[] args) {

        Map<String, Operation> operations = new HashMap<>();
        operations.put("multiply", (x, y) -> x * y);
        operations.put("divide", (x, y) -> x / y);
        operations.put("add", Integer::sum);
        operations.put("subtract", (x, y) -> x - y);

        System.out.print("Enter an operation: ");
        String enteredOperation = new Scanner(System.in).nextLine();

        Operation operation = operations.get(enteredOperation);
        if (Objects.nonNull(operation)) {
            System.out.println(operation.apply(5, 7));
        } else {
            throw new UnsupportedOperationException("invalid operation!");
        }

    }

    public interface Operation extends BiFunction<Integer, Integer, Integer> {

    }

}
