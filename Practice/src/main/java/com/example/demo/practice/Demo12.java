package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 按奇偶排序数组
 *
 * @author xintao.feng
 * @date 2018/10/16.
 */
@Component
public class Demo12 {
    public int[] sortArrayByParity(int[] A) {
        int[] B = new int[A.length];
        int a = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[a] = A[i];
                a++;
            }
        }
        int b = a;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                B[b] = A[i];
                b++;
            }
        }
        return B;
    }
}
