package com.example.demo.practice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 */
@Component
public class Demo70 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
//        int[] res = new int[nums.length];
//        fun(lists, list, nums, 0, res);
        fun(lists, list, 0, nums);

        return lists;
    }

    private void fun(List<List<Integer>> lists, List<Integer> list, int i, int[] nums) {
        if (i == nums.length) {
            lists.add(new ArrayList<>(list));
        }
        for (int j = 0; j < nums.length; j++) {
            if (!list.contains(nums[j])) {
                list.add(nums[j]);
                fun(lists, list, i + 1, nums);
                list.remove((Object) nums[j]);
            }
        }
    }

//    private void fun(List<List<Integer>> lists, List<Integer> list, int[] nums, int i, int[] result) {
//        if (i == nums.length) {
//            List<Integer> l = new ArrayList<>();
//            for (int j = 0; j < result.length; j++) {
//                l.add(result[j]);
//            }
//            lists.add(l);
//            return;
//        }
//        for (int j = 0; j < nums.length; j++) {
//            if (!list.contains(nums[j])) {
//                list.add(nums[j]);

//                result[i] = nums[j];
//                fun(lists, list, nums, i + 1, result);
//                list.remove((Object) nums[j]);
//            }
//        }
//    }
}
