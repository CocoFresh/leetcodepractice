package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * @author xintao.feng
 * @date 2018/9/12.
 */
@Component
public class Demo01 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {

                    result[0] = nums[i];
                    result[1] = nums[j];
                }
            }
        }
        return result;
    }
}
