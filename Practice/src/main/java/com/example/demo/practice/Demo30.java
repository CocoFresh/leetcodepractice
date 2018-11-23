package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 反转字符串中的元音字母
 *
 * @author xintao.feng
 * @date 2018/10/30.
 */
@Component
public class Demo30 {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        boolean a, b;
        char[] chars = s.toCharArray();
        while (i < j) {
            a = GetResult(String.valueOf(s.charAt(i)));
            b = GetResult(String.valueOf(s.charAt(j)));
            if (a&&b){
                char temp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = temp;
            }else if(a){
                j--;
            }else if (b){
                i++;
            }else {
                i++;
                j--;
            }
        }
        s = new String(chars);
        return s;

    }

    public static boolean GetResult(String code) {
        if (code.equalsIgnoreCase("a") ||
                code.equalsIgnoreCase("e") ||
                code.equalsIgnoreCase("i") ||
                code.equalsIgnoreCase("o") ||
                code.equalsIgnoreCase("u")) {
            return true;
        }
        return false;
    }
}
