package com.example.demo.practice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 电话号码的字母组合
 */
@Component
public class Demo61 {
    public List<String> letterCombinations(String digits) {
        String[] strings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> lists = new ArrayList<>();
        if (digits.length() == 0) {
            return lists;
        }
        String s = "";
        int num = 0;
        fun(s, num, digits, strings, lists);
        return lists;
    }

    private void fun(String s, int num, String digits, String[] strings, List<String> lists) {
        if (num >= digits.length()) {
            lists.add(s);
            return;
        }
        int i = digits.charAt(num) - '0';
        String s1 = strings[i];
        for (int j = 0; j < s1.length(); j++) {
            fun(s + s1.charAt(j), num + 1, digits, strings, lists);
        }
    }
}
