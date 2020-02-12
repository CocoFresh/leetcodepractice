package com.example.demo.huawei;

import java.util.Stack;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/20 10:40
 * @Description:
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int max = 0;
        int num = 0;
        Stack<Character> left = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left.push(s.charAt(i));
            } else {
                if (!left.isEmpty()) {
                    left.pop();
                    num += 2;
                } else {
                    max = num > max ? num : max;
                    num = 0;
                }
            }
        }
        return max;
    }
}
