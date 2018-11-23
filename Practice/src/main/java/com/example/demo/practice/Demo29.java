package com.example.demo.practice;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 验证回文串
 *
 * @author xintao.feng
 * @date 2018/10/30.
 */
@Component
public class Demo29 {
    public boolean isPalindrome(String s) {
        if (s.equals("")) {
            return true;
        }
//        String regEx = "[^a-zA-Z0-9]";
//        Pattern p = Pattern.compile(regEx);
//        Matcher m = p.matcher(s);
//        s = m.replaceAll("").trim().toLowerCase();
        char[] c = s.toCharArray();
        char[] newc = new char[c.length];
        int index = 0;
        for (int i = 0; i < c.length; i++) {
            if ((c[i]>=48&&c[i]<=57)||(c[i]>=65&&c[i]<=90)||(c[i]>=97&&c[i]<=122)){
                newc[index] = c[i];
                index++;
            }
        }
        s = new String(newc).toLowerCase().trim();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
