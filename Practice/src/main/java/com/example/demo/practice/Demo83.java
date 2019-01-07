package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * @Auther: xintao.feng
 * @Date: 2018/12/26 15:55
 * @Description: 通配符匹配
 */
@Component
public class Demo83 {
    public boolean isMatch(String s, String p) {
        int index_s = 0;
        int index_p = 0;
        int mark_s = -1;
        int maek_p = -1;
        while (index_s < s.length()) {
            if (index_p < p.length() && (s.charAt(index_s) == p.charAt(index_p) || p.charAt(index_p) == '?')) {
                index_p++;
                index_s++;
            } else if (index_p < p.length() && p.charAt(index_p) == '*') {
                maek_p = index_p;
                mark_s = index_s;
                index_p++;
            } else if (maek_p != -1) {
                index_p = maek_p + 1;
                index_s = mark_s + 1;
                mark_s++;
            } else {
                return false;
            }
        }

        while (index_p < p.length()) {
            if (p.charAt(index_p) != '*') {
                return false;
            }
            index_p++;
        }
        return true;
    }


}
