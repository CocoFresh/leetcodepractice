package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 */
@Component
public class Demo62 {
    public int[] searchRange(int[] nums, int target) {
        int i;
        int j = nums.length - 1;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                break;
            }
        }
        for (; j >= 0; j--) {
            if (nums[j] == target) {
                break;
            }
        }
        if (i < nums.length && j >= 0) {
            return new int[]{i, j};
        } else {
            return new int[]{-1, -1};
        }
    }
}
