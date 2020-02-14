package com.example.demo.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: xintao.feng
 * @Date: 2019/11/29 10:41
 * @Description: 15. 三数之和
 */
public class ThreeSum {
    //暴力法
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> lists = new ArrayList<>();
//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int j = i + 1; j < nums.length - 1; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> list = new ArrayList<>();
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[k]);
//                        list.sort(Integer::compareTo);
//                        if (!lists.contains(list)) {
//                            lists.add(list);
//                        }
//                    }
//                }
//            }
//        }
//        return lists;
//    }
    //双指针法（O(N^2)）
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if (nums == null || len < 3) return ans;
        Arrays.sort(nums); // 排序
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去重
            int L = i + 1;
            int R = len - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while (L < R && nums[L] == nums[L + 1]) L++; // 去重
                    while (L < R && nums[R] == nums[R - 1]) R--; // 去重
                    L++;
                    R--;
                } else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }
}
