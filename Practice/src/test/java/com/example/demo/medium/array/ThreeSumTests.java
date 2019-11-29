package com.example.demo.medium.array;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: xintao.feng
 * @Date: 2019/11/29 10:59
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ThreeSumTests {
    @Test
    public void test() {
        ThreeSum threeSum = new ThreeSum();
        int[] sums = {-1, 0, 1, 2, -1, -4};
        threeSum.threeSum(sums);
    }
}
