package com.example.demo.practice;

/**
 *
 * @author xintao.feng
 * @date 2018/10/19.
 */
public class Demo23 {
    public int removeElement(int[] nums, int val) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[a] = nums[i];
                a++;
            }
        }
        return  a;
    }
}
