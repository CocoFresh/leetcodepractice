package com.example.demo.medium.array;

/**
 * @Auther: xintao.feng
 * @Date: 2020/2/12 16:28
 * @Description: 1027. 最长等差数列
 */
public class LongestArithSeqLength {
    public int longestArithSeqLength(int[] A) {
        int res = 0;
        int stepLength = 1;
        int start = 0;
        int comDeff = 0;
        while (start != A.length) {
            comDeff = A[start + stepLength] - A[start];

            if (stepLength < A.length) {
                stepLength++;
            } else {
                start++;
            }

        }

        return res;
    }
}
