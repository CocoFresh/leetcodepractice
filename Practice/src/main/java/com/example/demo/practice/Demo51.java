package com.example.demo.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 只出现一次的数字
 *
 * @author xintao.feng
 * @date 2018/11/22.
 */
public class Demo51 {
    public int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i += 2) {
//            if (nums[i] != nums[i + 1]) {
//                return nums[i];
//            }
//        }
//        return nums[nums.length-1];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
