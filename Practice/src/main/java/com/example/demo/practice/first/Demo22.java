package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

/**
 * 移动零
 *
 * @author xintao.feng
 * @date 2018/10/18.
 */
@Component
public class Demo22 {
    public void moveZeroes(int[] nums) {
        int[] a = new int[nums.length];
        int head = 0;
        int rear = nums.length - 1;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 0) {
                a[rear] = nums[i];
                rear--;
            } else {
                a[head] = nums[i];
                head++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
}
