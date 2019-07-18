package com.example.demo.practice.second;

import org.springframework.stereotype.Component;

/**
 * @Auther: xintao.feng
 * @Date: 2019/4/19 10:42
 * @Description: 最长公共前缀
 */
@Component
public class Solution_02 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuffer bf = new StringBuffer();
        int i = 0;
        boolean flag = true;
        boolean isSame = true;
        while (flag) {
            if (i >= strs[0].length()) {
                break;
            }
            char ch = strs[0].charAt(i);
            for (String str : strs) {
                if (i >= str.length()) {
                    flag = false;
                    break;
                }
                if (ch != str.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                bf.append(ch);
            }
            i++;
        }
        return bf.toString();
    }
}
