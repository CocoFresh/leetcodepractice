package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

/**
 * @Auther: xintao.feng
 * @Date: 2019/1/10 14:13
 * @Description:乘积最大子序列
 */
@Component
public class Demo88 {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int maxm = nums[0];
        int minm = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tempMax = maxm;
            int tempMin = minm;
            int temp = nums[i];
            maxm = Math.max(temp, Math.max(temp * tempMax, temp * tempMin));
            minm = Math.min(temp, Math.min(temp * tempMax, temp * tempMin));
            max = Math.max(max, maxm);
        }
        return max;
    }
}
