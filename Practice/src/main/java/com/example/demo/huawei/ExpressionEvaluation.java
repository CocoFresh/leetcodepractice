package com.example.demo.huawei;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/3 13:54
 * @Description:
 */
public class ExpressionEvaluation {

    public int expressionEvaluation(String expression) {
        Queue<String> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        int position = 0;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c >= '0' && c <= '9' && i != expression.length() - 1) {
                continue;
            }
            if (i == expression.length() - 1) {
                queue.offer(expression.substring(position, i + 1));
                break;
            } else {
                queue.offer(expression.substring(position, i));
            }
            position = i;
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
        while (!stack.empty()) {
            queue.offer(String.valueOf(stack.pop()));
        }
        return 0;
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
