package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 计数质数
 *
 * @author xintao.feng
 * @date 2018/11/21.
 */
@Component
public class Demo48 {
    public int countPrimes(int n) {
        boolean[] f = new boolean[n + 1];
        int num = 0;
        for (int i = 2; i < n; i++) {
            if (!f[i]) {
                num++;
            }
            for (int j = 1; j * i < n; j++) {
                f[j*i] = true;
            }
        }
        return num;
    }
}
