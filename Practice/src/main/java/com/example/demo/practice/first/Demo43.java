package com.example.demo.practice.first;

/**
 * 反转字符串
 *
 * @author xintao.feng
 * @date 2018/11/21.
 */
public class Demo43 {
    public String reverseString(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length/2; i++) {
            char b = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-1-i] = b;
        }
        return String.valueOf(a);
    }
}
