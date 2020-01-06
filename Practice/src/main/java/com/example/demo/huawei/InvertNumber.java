package com.example.demo.huawei;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/3 13:28
 * @Description:
 */
public class InvertNumber {
    public String invert(int num) {
        StringBuilder s = new StringBuilder();
        while (num != 0) {
            s.append(num % 10);
            num /= 10;
        }
        return s.toString();
    }
}
