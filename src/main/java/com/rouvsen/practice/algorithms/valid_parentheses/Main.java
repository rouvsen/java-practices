package com.rouvsen.practice.algorithms.valid_parentheses;

import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String input = "([{}])";
        System.out.println("Parenthesis are valid? " + isValid(input));
    }

    public static boolean isValid(String str) {
        if (Objects.isNull(str) || str.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                Character top = stack.pop();
                if (top == '(' && c != ')'
                        || top == '[' && c != ']'
                        || top == '{' && c != '}') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
