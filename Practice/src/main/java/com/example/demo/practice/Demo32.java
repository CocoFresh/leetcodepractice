package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 长度最小的子数组
 *
 * @author xintao.feng
 * @date 2018/10/30.
 */
@Component
public class Demo32 {
    public int minSubArrayLen(int s, int[] nums) {
//        for (int i = 1; i <= nums.length ; i++) {
//            for (int j = 0; j < nums.length + 1 - i; j++) {
//                int sum = 0;
//                for (int k = 0, index = j; k < i; k++, index++) {
//                    sum += nums[index];
//                }
//                if (sum >= s) {
//                    return i;
//                }
//            }
//        }
        for (int i = 0; i < nums.length; i++) {
            int m =0, n =i;

        }
        return 0;
    }
}
