package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 盛最多水的容器
 *
 * @author xintao.feng
 * @date 2018/10/30.
 */
@Component
public class Demo31 {
    public int maxArea(int[] height) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                temp = height[i] > height[j] ? height[j] : height[i];
                max = (temp * (j - i)) > max ? (temp * (j - i)) : max;
            }
        }
        return max;
    }
}
