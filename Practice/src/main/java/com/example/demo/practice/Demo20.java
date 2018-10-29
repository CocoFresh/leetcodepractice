package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 键盘行
 *
 * @author xintao.feng
 * @date 2018/10/18.
 */
@Component
public class Demo20 {
    public String[] findWords(String[] words) {
        String[] str1 = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        String[] news = new String[words.length];
        int index = -1;
        int n = 0;
        boolean flag = true;
        for (String s : words) {
            for (int i = 0; i < s.length(); i++) {
                for (int k = 0; k < str1.length; k++) {
                    if (str1[k].contains(String.valueOf(s.toLowerCase().charAt(i)))) {
                        if (index < 0) {
                            index = k;
                            break;
                        } else {
                            if (index != k) {
                                flag = false;
                                break;
                            }
                        }
                    }
                }
                if (!flag) {
                    break;
                }
            }
            if (flag) {
                news[n] = s;
                n++;
            }
            flag = true;
            index = -1;
        }
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = news[i];
        }
        return a;
    }
}
