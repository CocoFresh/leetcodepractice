package com.example.demo.practice.second;

import org.springframework.stereotype.Component;

/**
 * @Auther: xintao.feng
 * @Date: 2019/7/19 14:11
 * @Description: 戳气球
 */
@Component
public class Solution_312 {
    public int maxCoins(int[] nums) {
        return dp(nums);


//        return itera(nums);
    }

    //动态规划，O(N^3)
    private int dp(int[] nums) {
        int[] coins = new int[nums.length + 2];
        int dp[][] = new int[coins.length][coins.length];
        coins[0] = 1;
        coins[coins.length - 1] = 1;

        for (int i = 0; i < nums.length; i++) {
            coins[i + 1] = nums[i];
        }

        for (int i = 2; i < coins.length; i++) {
            for (int j = 0; j + i < coins.length; j++) {
                for (int k = j + 1; k < j + i; k++) {
                    dp[j][j + i] = Math.max(dp[j][j + i], dp[j][k] + dp[k][j + i] + coins[j] * coins[k] * coins[j + i]);
                }
            }
        }
        return dp[0][coins.length - 1];

    }


    //暴力法 时间复杂度O(n!)
    private int itera(int[] nums) {
        int left;
        int right;
        int sum;
        int result = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            left = i <= 0 ? 1 : nums[i - 1];
            right = i >= nums.length - 1 ? 1 : nums[i + 1];
            sum = nums[i] * left * right;
            int index1 = 0;
            int nums1[] = new int[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                nums1[index1] = nums[j];
                index1++;
            }
            int temp = itera(nums1) + sum;
            result = temp > result ? temp : result;
        }
        return result;
    }
}
