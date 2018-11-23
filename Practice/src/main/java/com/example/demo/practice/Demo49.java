package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 位1的个数
 *
 * @author xintao.feng
 * @date 2018/11/22.
 */
@Component
public class Demo49 {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                num++;
            }
        }
        return num;
    }
}
