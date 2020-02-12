package com.example.demo.huawei;

import java.util.Stack;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/16 17:26
 * @Description: 736. Lisp 语法解析
 */
public class Lisp {
    public int evaluate(String expression) {
        Stack<String> s = new Stack<>();
        Stack<Integer> integers = new Stack<>();
        int index;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') {
                index = findSpace(expression, i);
                s.push(expression.substring(i + 1, index));
                i += index - i;
            } else if (c == ')') {
                int a = integers.pop();
                int b = integers.pop();
                String op = s.pop();
                int result = caculete(a, b, op);
                integers.push(result);
            } else if (c != ' ') {
                integers.push((int) c - 48);
            }
        }
        return integers.pop();
    }

    private int findSpace(String expression, int i) {
        for (int j = i; j < expression.length(); j++) {
            if (expression.charAt(j) == ' ') {
                return j;
            }
        }
        return 0;
    }

    private int caculete(int a, int b, String op) {
        if ("add".equals(op)) {
            return a + b;
        } else if ("mult".equals(op)) {
            return a * b;
        } else {
            return 0;
        }
    }
}
