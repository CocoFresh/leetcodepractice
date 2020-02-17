package com.example.demo.easy.array;

/**
 * @Auther: xintao.feng
 * @Date: 2020/2/14 16:18
 * @Description:
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i++];
            } else {
                nums3[k] = nums2[j++];
            }
            k++;
        }
        if (i < m) {
            for (; i < m; i++, k++) {
                nums3[k] = nums1[i];
            }
        }
        if (j < n) {
            for (; j < n; j++, k++) {
                nums3[k] = nums2[j];
            }
        }
        for (i = 0; i < nums3.length; i++) {
            nums1[i] = nums3[i];
        }
    }
}
