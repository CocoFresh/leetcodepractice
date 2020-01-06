package com.example.demo.huawei;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/6 16:44
 * @Description:
 */
public class Approximation {
    public int getApproximation(double num) {
        int result = (int) num;
        if ((num - result) >= 0.5) {
            result += 1;
        }
        return result;
    }
}
