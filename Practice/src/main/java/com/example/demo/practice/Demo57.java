package com.example.demo.practice;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 两个数组的交集 II
 */
@Component
public class Demo57 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int num = 0;
        if (nums1.length < nums2.length) {
            num = find_intersect(nums1, nums2, result);
        } else {
            num = find_intersect(nums2, nums1, result);
        }
        int[] finalResult = new int[num];
        for (int i = 0; i < num; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }

    private int find_intersect(int[] shortNum, int[] longNum, int[] result) {
        int i = 0, j = 0, index = 0, temp = 0;
        while (i < shortNum.length) {
            if (shortNum[i] == longNum[j]) {
                result[index] = shortNum[i];
                i++;
                j++;
                index++;
                temp = j;
            } else {
                j++;
            }
            if (j == longNum.length) {
                if (temp == longNum.length){
                    break;
                }
                j = temp;
                i++;
            }
        }
        return index;
    }
}
