package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 翻转图像
 *
 * @author xintao.feng
 * @date 2018/10/16.
 */
@Component
public class Demo13 {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] B = new int[A.length][];
        int index = 0;
        for (int[] i : A) {
            int[] b = new int[i.length];
            for (int j = i.length - 1, m = 0; j >= 0; j--, m++) {
                if (i[j] == 0) {
                    b[m] = 1;
                }else {
                    b[m] = 0;
                }
            }
            B[index] = b;
            index++;
        }
        return B;
    }
}
