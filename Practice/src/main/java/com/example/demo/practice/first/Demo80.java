package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

/**
 * @Auther: xintao.feng
 * @Date: 2018/12/24 15:35
 * @Description:寻找两个有序数组的中位数
 */
@Component
public class Demo80 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int lenth = nums1.length + nums2.length;
        int mediumLenth = lenth / 2;
        int[] nums3 = new int[mediumLenth + 1];
        int m = 0;
        int n = 0;
        int i;

        for (i = 0; i <= mediumLenth && m < nums1.length && n < nums2.length; i++) {
            if (nums1[m] < nums2[n]) {
                nums3[i] = nums1[m];
                m++;
            } else {
                nums3[i] = nums2[n];
                n++;
            }
        }
        while (m < nums1.length && i <= mediumLenth) {
            nums3[i] = nums1[m];
            i++;
            m++;
        }
        while (n < nums2.length && i <= mediumLenth) {
            nums3[i] = nums2[n];
            i++;
            n++;
        }
        if (lenth % 2 == 0) {
            median = (median + nums3[i - 1] + nums3[i - 2]) / 2;
        } else {
            median = nums3[i - 1];
        }
        return median;
    }
}
