package com.example.demo.practice.first;

/**
 * 颜色分类
 * @author xintao.feng
 * @date 2018/10/26.
 */
public class Demo25 {
    private final int RED_COLOR = 0;
    private final int WHITE_COLOR = 1;
    private final int BLUE_COLOR = 2;

    public void sortColors(int[] nums) {
        int blue = 0;
        int red = 0;
        int white = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == RED_COLOR) {
                red++;
            }
            if (nums[i] == WHITE_COLOR) {
                white++;
            }
            if (nums[i] == BLUE_COLOR) {
                blue++;
            }
        }
        for (int i = 0; i < red; i++) {
            nums[i] = RED_COLOR;
        }
        for (int i = red; i < white + red; i++) {
            nums[i] = WHITE_COLOR;
        }
        for (int i = white + red; i < red + white + blue; i++) {
            nums[i] = BLUE_COLOR;
        }
    }
}
