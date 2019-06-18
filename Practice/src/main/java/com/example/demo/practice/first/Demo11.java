package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

/**
 * 按奇偶排序数组 II
 * @author xintao.feng
 * @date 2018/10/16.
 */
@Component
public class Demo11 {
    public int[] sortArrayByParityII(int[] A) {
        int a = 0;
        int b = 0;
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (i%2==0){
                for (int j = b; j < A.length; j++) {
                    if (A[j]%2==0){
                        b = j+1;
                        B[i] = A[j];
                        break;
                    }
                }
            }else {
                for (int j = a; j < A.length; j++) {
                    if (A[j]%2!=0){
                        a = j+1;
                        B[i] = A[j];
                        break;
                    }
                }
            }
        }
        return B;
    }
}
