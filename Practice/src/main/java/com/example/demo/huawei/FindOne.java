package com.example.demo.huawei;

import java.util.Scanner;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/3 11:34
 * @Description: 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数
 */
public class FindOne {
    public int findOne(int num) {
        int result = 0;
        while (num != 0) {
            if (num % 2 == 1) {
                result++;
            }
            num /= 2;
        }
        return result;
    }
}
