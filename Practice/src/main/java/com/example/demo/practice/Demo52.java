package com.example.demo.practice;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * 字符串中的第一个唯一字符
 *
 * @author xintao.feng
 * @date 2018/11/22.
 */
@Component
public class Demo52 {
    public int firstUniqChar(String s) {
        if (s.length() == 1) {
            return 0;
        }
        if (s.compareTo("") == 0){
            return -1;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            boolean flag = true;
            char a = s.charAt(i);
            if (a == ' ') {
                continue;
            }
            for (int j = i + 1; j < s.length(); j++) {
                char b = s.charAt(j);
                if (a == b) {
                    flag = false;
                    s = s.replace(a, ' ');
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        if (s.charAt(s.length()-1)!=' '){
            return s.length()-1;
        }
        return -1;
    }
}
