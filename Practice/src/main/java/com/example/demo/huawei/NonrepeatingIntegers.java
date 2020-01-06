package com.example.demo.huawei;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/6 17:23
 * @Description:
 */
public class NonrepeatingIntegers {
    public int getNonrepeatingIntegers(int num) {
        int res = 0;
        Set<Integer> set = new LinkedHashSet<>();
        while (num != 0) {
            int temp = num % 10;
            set.add(temp);
            num /= 10;
        }
        int index = set.size() - 1;
        for (Integer i : set) {
            res += i * Math.pow(10, index);
            index--;
        }
        return res;
    }
}
