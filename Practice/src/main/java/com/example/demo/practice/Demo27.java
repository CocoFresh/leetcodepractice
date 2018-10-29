package com.example.demo.practice;

/**
 * 合并两个有序数组
 *
 * @author xintao.feng
 * @date 2018/10/26.
 */
public class Demo27 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0;
        int index2 = 0;
        int i = 0;
        int[] nums3 = new int[m + n];
        while (index1 != m && index2 != n) {
            if (nums1[index1] < nums2[index2]) {
                nums3[i] = nums1[index1];
                i++;
                index1++;
            } else {
                nums3[i] = nums2[index2];
                i++;
                index2++;
            }
        }
        if (index1 != m) {
            for (int j = i; j < m + n; j++) {
                nums3[j] = nums1[index1];
                index1++;
            }
        }
        if (index2 != n) {
            for (int j = i; j < m + n; j++) {
                nums3[j] = nums2[index2];
                index2++;
            }
        }
        for (int j = 0; j < m+n; j++) {
            nums1[j] = nums3[j];
        }
    }
}
