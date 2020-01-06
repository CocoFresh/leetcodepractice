package com.example.demo.easy.array;

/**
 * @Auther: xintao.feng
 * @Date: 2019/12/24 14:55
 * @Description: 1281. 整数的各位积和之差
 */
public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n != 0) {

            int i = n % 10;
            product *= i;
            sum += i;
            n /= 10;
        }
        return product - sum;
    }
}
