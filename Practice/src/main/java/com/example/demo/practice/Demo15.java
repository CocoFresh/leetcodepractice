package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 山脉数组的峰顶索引
 *
 * @author xintao.feng
 * @date 2018/10/17.
 */
@Component
public class Demo15 {
    public int peakIndexInMountainArray(int[] A) {
        int max = A[0];
        int top = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            } else {
                top = i - 1;
                break;
            }
        }
        return top;
    }
}
