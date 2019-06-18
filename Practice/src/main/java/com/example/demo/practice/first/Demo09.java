package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

/**
 * @author xintao.feng
 * @date 2018/9/13.
 */
@Component
public class Demo09 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int temp = 0;
        String str = "";
        boolean flag = true;
        char a, b;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                a = s.charAt(j);
                for (int m = 0; m < str.length(); m++) {
                    b = str.charAt(m);
                    if (a == b) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    str += a;
                    temp++;
                } else {
                    flag = true;
                    str = "";
                    break;
                }
            }
            max = temp > max ? temp : max;
            temp = 0;
            if (max == s.substring(i).length()) {
                break;
            }
        }
        return max;
    }
}
