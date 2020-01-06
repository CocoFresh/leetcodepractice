package com.example.demo.huawei;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/3 13:44
 * @Description:
 */
public class InvertString {
    public String invertString(String s) {
        StringBuilder is = new StringBuilder();
        for (int i = s.length() - 1; i > 0; i--) {
            is.append(s.charAt(i));
        }
        return is.toString();
    }
}
