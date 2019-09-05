package com.example.demo.practice.second;

import org.springframework.stereotype.Component;

/**
 * @Auther: xintao.feng
 * @Date: 2019/7/23 10:47
 * @Description: 下一个排列
 */
@Component
public class Solution_031 {
    public void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                for (int i1 = nums.length - 1; i1 >= 0; i1--) {
                    if (nums[i - 1] < nums[i1]) {
                        swap(nums, i - 1, i1);
                        reverse(nums, i);
                        return;
                    }
                }
            }
        }
        reverse(nums, 0);
    }

    private void reverse(int[] nums, int i) {
        int j = i;
        for (int i1 = nums.length - 1; i1 > (j + nums.length - 1) / 2; i1--, i++) {
            swap(nums, i, i1);
        }
    }

    private void swap(int[] nums, int i, int i1) {
        int temp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = temp;
    }
}
