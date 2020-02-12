package com.example.demo.huawei;

import java.util.Stack;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/17 10:22
 * @Description: 394. 字符串解码
 */
public class DecodeString {
    public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num.append(c);
            } else if (c == ']') {
                int n = numStack.pop();
                String sb = popString(strStack);
                StringBuilder res = new StringBuilder();
                for (int i1 = 0; i1 < n; i1++) {
                    res.append(sb);
                }
                strStack.push(res.toString());
            } else {
                if (num.length() != 0) {
                    numStack.push(Integer.valueOf(num.toString()));
                    num = new StringBuilder();
                }
                strStack.push(String.valueOf(c));
            }
        }
        return popString(strStack);
    }

    private String popString(Stack<String> strStack) {
        StringBuilder sb = new StringBuilder();
        while (!strStack.empty()) {
            String s1 = strStack.pop();
            if ("[".equals(s1)) {
                break;
            }
            sb.insert(0, s1);
        }
        return sb.toString();
    }


}

