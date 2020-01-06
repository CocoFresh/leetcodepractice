package com.example.demo.easy.array;

/**
 * @Auther: xintao.feng
 * @Date: 2019/11/29 14:17
 * @Description:
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            res = Math.max(sum, res);
        }
        return res;
    }
}
