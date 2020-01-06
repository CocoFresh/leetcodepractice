package com.example.demo.huawei;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/6 11:14
 * @Description: 字符串最后一个单词长度
 */
public class TheLastWordLength {
    public int lastWordLength(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                result++;
            } else {
                return result;
            }
        }
        return result;
    }
}
