package com.example.demo.easy.array;

/**
 * @Auther: xintao.feng
 * @Date: 2019/12/24 14:43
 * @Description: LCP 1. 猜数字
 */
public class GuessNumber {
    public int game(int[] guess, int[] answer) {
        int sum = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                sum++;
            }
        }
        return sum;
    }
}
