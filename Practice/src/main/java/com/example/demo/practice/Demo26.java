package com.example.demo.practice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * 数组中的第K个最大元素
 *
 * @author xintao.feng
 * @date 2018/10/26.
 */
@Component
public class Demo26 {
    public int findKthLargest(int[] nums, int k) {
//        int max = -1;
//        boolean flag = false;
//        for (int i = 0; i < nums.length - 1; i++) {
//            flag = true;
//            for (int j = 0; j < nums.length - 1 - i; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                    flag = false;
//                }
//            }
//            if (flag) {
//                break;
//            }
//        }
//        while (k != 0) {
//            for (int i = nums.length - 1; i >= 0; i--) {
//                if (max != nums[i]) {
//                    max = nums[i];
//                    k--;
//                }
//            }
//        }
//        return max;
        for (int i = 0; i < k; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j]>nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums[k-1];
    }
}
