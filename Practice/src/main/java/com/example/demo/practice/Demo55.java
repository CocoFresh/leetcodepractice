package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 实现strStr()
 */
@Component
public class Demo55 {
    public int strStr(String haystack, String needle) {
        if (needle.compareTo("") == 0) {
            return 0;
        }
        if (needle.length()>haystack.length()){
            return -1;
        }
        int j = 0;
        boolean flag = true;
        for (int i = 0; i < haystack.length(); i++) {
            char a = haystack.charAt(i);
            char b = needle.charAt(j);
            if (a == b){
                j++;
                while (j<needle.length()){
                    if (!(i+j<haystack.length())){
                        flag =false;
                        break;
                    }
                    a = haystack.charAt(i+j);
                    b = needle.charAt(j);
                    j++;
                    if (a != b){
                        flag = false;
                        break;
                    }
                }
            }else {
                continue;
            }
            if (flag){
                return i;
            }
            j = 0;
            flag = true;
        }
        return -1;
    }
}
