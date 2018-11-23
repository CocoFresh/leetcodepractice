package com.example.demo.practice;

/**
 * 买卖股票的最佳时机
 *
 * @author xintao.feng
 * @date 2018/11/21.
 */
public class Demo46 {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if ((prices[j] - prices[i])>max){
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }
}
