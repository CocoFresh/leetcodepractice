package com.example.demo.difficult;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: xintao.feng
 * @Date: 2020/2/13 13:58
 * @Description: 困难题测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DifficultTest {
    @Test
    public void largestRectangleAreaTest() {
        LargestRectangleArea l = new LargestRectangleArea();
        int[] heights = {2, 1, 5, 6, 2, 3};
        l.largestRectangleArea(heights);
//        l.largestRectangleArea2(heights);
    }
}
