package com.example.demo.difficult;

import java.util.Arrays;

/**
 * @Auther: xintao.feng
 * @Date: 2020/2/13 15:25
 * @Description: 85. 最大矩形
 */
public class MaximalRectangle {
    private LargestRectangleArea l;

    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        l = new LargestRectangleArea();
        int[] heights = new int[matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int rol = 0; rol < matrix[0].length; rol++) {
                if (matrix[row][rol] == '1') {
                    heights[rol] += 1;
                } else {
                    heights[rol] = 0;
                }
            }
            int Area = l.largestRectangleArea2(heights);
            maxArea = Math.max(Area, maxArea);
        }
        return maxArea;
    }

    public int maximalRectangle2(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;

        int[] left = new int[n]; // initialize left as the leftmost boundary possible
        int[] right = new int[n];
        int[] height = new int[n];

        Arrays.fill(right, n); // initialize right as the rightmost boundary possible

        int maxarea = 0;
        for (int i = 0; i < m; i++) {
            int cur_left = 0, cur_right = n;
            // update height
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') height[j]++;
                else height[j] = 0;
            }
            // update left
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') left[j] = Math.max(left[j], cur_left);
                else {
                    left[j] = 0;
                    cur_left = j + 1;
                }
            }
            // update right
            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == '1') right[j] = Math.min(right[j], cur_right);
                else {
                    right[j] = n;
                    cur_right = j;
                }
            }
            // update area
            for (int j = 0; j < n; j++) {
                maxarea = Math.max(maxarea, (right[j] - left[j]) * height[j]);
            }
        }
        return maxarea;
    }
}
