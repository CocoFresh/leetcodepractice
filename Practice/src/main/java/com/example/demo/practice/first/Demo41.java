package com.example.demo.practice.first;

import java.util.LinkedList;
import java.util.List;

/**
 * Fizz Buzz
 *
 * @author xintao.feng
 * @date 2018/11/21.
 */
public class Demo41 {
    public List<String> fizzBuzz(int n) {
        String a = "Fizz";
        String b = "Buzz";
        List<String> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add(a + b);
            } else if (i % 3 == 0) {
                list.add(a);
            } else if (i % 5 == 0) {
                list.add(b);
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
