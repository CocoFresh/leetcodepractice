package com.example.demo.difficult;

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
}
