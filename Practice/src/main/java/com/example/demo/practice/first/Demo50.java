package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * 有效的括号
 *
 * @author xintao.feng
 * @date 2018/11/22.
 */
@Component
public class Demo50 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(' || a == '[' || a == '{') {
                stack.push(a);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char b = stack.pop();
                switch (a) {
                    case '}':
                        if (b != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if (b != '[') {
                            return false;
                        }
                        break;
                    case ')':
                        if (b != '(') {
                            return false;
                        }
                }
            }
        }
        return stack.empty();
    }
}
