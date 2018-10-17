package com.example.demo.practice;

/**
 * 两个排序数组的中位数
 *
 * @author xintao.feng
 * @date 2018/10/15.
 */
public class Demo10 {
    public int smallestRangeI(int[] A, int K) {
        int min = A[0];
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                max = A[i];
            }
        }
        if ((max - min) > K && (max - min) <= 2 * K) {
            return K;
        } else if ((max - min) > (2 * K)) {
            if (((max - K) - (min + K)) > K) {
                return (max - min) - 2 * K + 1;
            } else {
                return (max - min) - 2 * K;
            }
        } else {
            return max - min;
        }
    }
}
