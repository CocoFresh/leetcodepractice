package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 零钱兑换
 */
@Component
public class Demo74 {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int i = coins.length - 1;
        int len = i;
        int num = 0;
        int m = amount;
        int min = amount;
        while (m != 0) {
            if (m - coins[i] >= 0) {
                m -= coins[i];
                num++;
            } else {
                i--;
            }
            if (i < 0) {
                len--;
                i = len;
                if (m == 0) {
                    min = Math.min(num, min);
                }
                m = amount;
                num = 0;
            }
            if (len < 0) {
                break;
            }
        }
        return amount == 0 ? min : -1;
    }
}
