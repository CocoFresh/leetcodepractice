package com.example.demo.easy.array;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

/**
 * @Auther: xintao.feng
 * @Date: 2020/2/12 16:03
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArrayTest {
    @Test
    public void fraction() {
        FractionalReduction f = new FractionalReduction();
        int[] a = {3, 2, 0, 2};
        f.fraction(a);
    }

    @Test
    public void mergeTest() {
        Merge m = new Merge();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        m.merge(nums1, 3, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
