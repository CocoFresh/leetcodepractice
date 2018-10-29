package com.example.demo.practice;

/**
 * 两数之和 II - 输入有序数组
 *
 * @author xintao.feng
 * @date 2018/10/27.
 */
public class Demo28 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{};
    }
}
