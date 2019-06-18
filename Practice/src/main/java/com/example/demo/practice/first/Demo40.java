package com.example.demo.practice.first;

/**
 * 爬楼梯
 *
 * @author xintao.feng
 * @date 2018/11/21.
 */
public class Demo40 {
    public int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
            for (int i = 2; i < n; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }
        return a[n-1];
    }
}
