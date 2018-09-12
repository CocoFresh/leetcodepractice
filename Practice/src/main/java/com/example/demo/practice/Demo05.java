package com.example.demo.practice;

/**
 * @author xintao.feng
 * @date 2018/9/12.
 */
public class Demo05 {
    public String toLowerCase(String str) {
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 65 && s[i] <= 90) {
                s[i] += 32;
            }
        }
        str = String.copyValueOf(s);
        return str;
    }
}
