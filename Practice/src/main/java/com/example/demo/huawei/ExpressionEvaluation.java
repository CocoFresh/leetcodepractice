package com.example.demo.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/3 13:54
 * @Description:
 */
public class ExpressionEvaluation {

    public int expressionEvaluation(String expression) {
        Queue<String> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c >= '0' && c <= '9') {
                sb.append(expression.charAt(i));
                continue;
            }
            if (sb.length() != 0) {
                queue.offer(sb.toString());
                sb.delete(0, sb.length());
            }
            char currentChar = expression.charAt(i);
            if (stack.empty()) {
                stack.push(currentChar);
            } else if (compare(currentChar, stack.peek())) {
                stack.push(currentChar);
            } else {
                c = stack.pop();
                if (c != '(') {
                    queue.offer(String.valueOf(c));
                    while (!stack.empty()) {
                        if (compare(currentChar, stack.peek())) {
                            stack.push(currentChar);
                            break;
                        } else {
                            c = stack.pop();
                            if (c != '(') {
                                queue.offer(String.valueOf(c));
                            } else {
                                break;
                            }
                        }
                    }
                    if (stack.empty()) {
                        stack.push(currentChar);
                    }
                }
            }
        }
        if (sb.length() != 0) {
            queue.offer(sb.toString());
            sb.delete(0, sb.length());
        }
        while (!stack.empty()) {
            queue.offer(String.valueOf(stack.pop()));
        }
        Stack<Integer> result = new Stack<>();
        for (String s : queue) {
            if (notNumber(s)) {
                int right = result.pop();
                int left = result.pop();
                result.push(compute(left, right, s));
            } else {
                result.push(Integer.valueOf(s));
            }
        }
        return result.peek();
    }

    private int compute(int left, int right, String s) {
        if (s.equals("+")) {
            return left + right;
        } else if (s.equals("-")) {
            return left - right;
        } else if (s.equals("*")) {
            return left * right;
        } else {
            return left / right;
        }
    }

    private boolean notNumber(String s) {
        if (s.equalsIgnoreCase("/") ||
                s.equalsIgnoreCase("+") ||
                s.equalsIgnoreCase("-") ||
                s.equalsIgnoreCase("*")) {
            return true;
        }
        return false;
    }

    private boolean compare(char currentChar, Character peek) {
        if (currentChar == '(') {
            return true;
        } else if (currentChar == '*' || currentChar == '/') {
            if (peek == '*' || peek == '/') {
                return false;
            } else {
                return true;
            }
        } else if (currentChar == '+' || currentChar == '-') {
            return peek == '(';
        } else {
            return false;
        }
    }
}
