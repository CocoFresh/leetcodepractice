package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: xintao.feng
 * @Date: 2019/1/3 14:32
 * @Description:分割回文串
 */
@Component
public class Demo84 {
    public List<List<String>> partition(String s) {
        List<List<String>> results = new ArrayList<>();
        List<String> subResult = new ArrayList<>();
        isPartition(results, 0, s, subResult);
        return results;
    }

    private void isPartition(List<List<String>> results, int i, String s, List<String> subResult) {
        if (i == s.length()) {
            List<String> list = new ArrayList<>();
            list.addAll(subResult);
            results.add(list);
            return;
        }
        for (int j = i; j < s.length(); j++) {
            String str = s.substring(i, j + 1);
            if (check(str)) {
                subResult.add(str);
                isPartition(results, j + 1, s, subResult);
                subResult.remove(subResult.size() - 1);
            }
        }
    }

    private boolean check(String substring) {
        for (int i = 0; i < substring.length() / 2; i++) {
            if (substring.charAt(i) != substring.charAt(substring.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


}
