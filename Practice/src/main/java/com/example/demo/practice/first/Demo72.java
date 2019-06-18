package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

/**
 * 最长回文子串
 */
@Component
public class Demo72 {
    public String longestPalindrome(String s) {
        String result = "";
        int i = 0;
        while (i < s.length()) {
            for (int j = s.length() - 1; j >= i; j--) {
                if (s.charAt(j) == s.charAt(i)) {
                    boolean flag = true;
                    for (int m = i + 1, n = j - 1; m <= n; m++, n--) {
                        if (s.charAt(m) != s.charAt(n)) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        if ((j - i + 1) > result.length()) {
                            result = s.substring(i, j + 1);
                        }
                    }
                }
            }
            i++;
        }

        return result;
    }
}
