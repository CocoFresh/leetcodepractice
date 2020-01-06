package com.example.demo.easy.array;

/**
 * @Auther: xintao.feng
 * @Date: 2019/12/24 14:47
 * @Description:
 */
public class FiguresForTheEvenNumbers {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int i = 0;
            while (num != 0) {
                num /= 10;
                i++;
            }
            if (i % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }
}
