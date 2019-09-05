package com.example.demo.practice.second;

import org.springframework.stereotype.Component;

/**
 * @Auther: xintao.feng
 * @Date: 2019/7/18 13:33
 * @Description: 翻转字符串里的单词
 */
@Component
public class Solution_151 {

    private final String space = " ";

    public String reverseWords(String s) {
        String s1 = s.trim();
        StringBuffer stringBuffer = new StringBuffer();
        String[] strings = s1.split(space);
        for (int i = strings.length - 1; i >= 0; i--) {
            String s2 = strings[i].trim();
            if (!s2.equals("")) {
                stringBuffer.append(s2);
                stringBuffer.append(space);
            }
        }
        return stringBuffer.toString().trim();
    }
}
