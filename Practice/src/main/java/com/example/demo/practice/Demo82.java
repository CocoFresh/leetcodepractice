package com.example.demo.practice;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Auther: xintao.feng
 * @Date: 2018/12/26 15:32
 * @Description:第一个缺失的正数
 */
@Component
public class Demo82 {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int min = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            }
            if (nums[i] > min) {
                return min;
            }
            if (nums[i] == min) {
                min++;
            }
        }
        return min;
    }
}
