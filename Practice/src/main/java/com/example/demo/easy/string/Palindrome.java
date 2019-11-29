package com.example.demo.easy.string;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: xintao.feng
 * @Date: 2019/11/26 14:17
 * @Description: 9.回文数
 */

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        List<Integer> list = new LinkedList<>();
        int y = 0;
        while (x != 0) {
            y = x % 10;
            x /= 10;
            list.add(y);
        }
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            if (list.get(i) != list.get(j)) {
                return false;
            }
        }
        return true;
    }
}
