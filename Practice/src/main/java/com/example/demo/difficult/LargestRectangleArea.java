package com.example.demo.difficult;

import java.util.Stack;

/**
 * @Auther: xintao.feng
 * @Date: 2020/2/13 13:48
 * @Description: 84. 柱状图中最大的矩形
 */
public class LargestRectangleArea {
    //暴力解法
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int minHeight = heights[i];
            for (int j = i; j < heights.length; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                int Area = minHeight * (j - i + 1);
                if (maxArea < Area) {
                    maxArea = Area;
                }
            }
        }
        return maxArea;
    }

    //栈方法
    public int largestRectangleArea2(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        stack.push(0);
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[stack.peek()]) {
                stack.push(i);
            } else {
                while (stack.size() != 1) {
                    if (heights[i] > heights[stack.peek()]) {
                        break;
                    }
                    int top = stack.pop();
                    int Area = heights[top] * (i - stack.peek() - 1);
                    maxArea = Math.max(Area, maxArea);
                }
                stack.push(i);
            }
        }

        while (stack.size() != 1) {
            int top = stack.pop();
            int Area = (heights.length - stack.peek() - 1) * heights[top];
            maxArea = Math.max(Area, maxArea);
        }
        return maxArea;
    }
}
