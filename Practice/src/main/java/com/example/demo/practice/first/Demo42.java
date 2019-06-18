package com.example.demo.practice.first;

/**
 * 买卖股票的最佳时机 II
 *
 * @author xintao.feng
 * @date 2018/11/21.
 */
public class Demo42 {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i+1] > prices[i]){
                max += prices[i+1] - prices[i];
            }
        }
        return max;
    }
}
