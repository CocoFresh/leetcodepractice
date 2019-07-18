package com.example.demo.practice.second;

/**
 * @Auther: xintao.feng
 * @Date: 2019/4/3 11:38
 * @Description:旋转数组
 */
public class Solution_01 {
    public void rotate(int[] nums, int k) {
        if (k == 0){
            return;
        }
        int[] temp = new int[k];    
        for (int i = nums.length - k - 1, j = 0; i < nums.length ; i++, j++) {
            temp[j] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            
        }
    }
}
