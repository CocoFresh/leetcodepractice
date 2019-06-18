package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

/**
 * 删除排序数组中的重复项
 *
 * @author xintao.feng
 * @date 2018/10/22.
 */
@Component
public class Demo24 {
    public int removeDuplicates(int[] nums) {
        if (nums != null && nums.length != 0) {
            int temp = nums[0];
            int a = 0;
            int b = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == temp && b < 2) {
                    temp = nums[i];
                    nums[a] = temp;
                    a++;
                    b++;
                } else if (nums[i] != temp){
                    b = 1;
                    temp = nums[i];
                    nums[a] = temp;
                    a++;
                }
            }
            return a;
        }
        return 0;
    }
}
