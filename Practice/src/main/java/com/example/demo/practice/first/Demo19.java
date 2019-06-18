package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

/**
 * 反转字符串
 *
 * @author xintao.feng
 * @date 2018/10/18.
 */
@Component
public class Demo19 {
    public String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
