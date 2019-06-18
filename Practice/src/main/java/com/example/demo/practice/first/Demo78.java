package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: xintao.feng
 * @Date: 2018/12/19 14:25
 * @Description:单词接龙
 */
@Component
public class Demo78 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        int m = 0;
        List<List<String>> queue = new ArrayList<>();
        List<String> lists = new ArrayList<>();
        lists.add(beginWord);
        queue.add(Arrays.asList(beginWord));
        while (true) {
            if (m >= queue.size()) {
                break;
            }
            List<String> list = queue.get(m);
            List<String> strings = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                String s = list.get(i);
                if (s.equals(endWord)) {
                    return m + 1;
                }
                for (int j = 0; j < wordList.size(); j++) {
                    String temp = wordList.get(j);
                    int num = 0;
                    for (int k = 0; k < s.length(); k++) {
                        if (s.charAt(k) != temp.charAt(k)) {
                            num++;
                            if (num > 1) {
                                break;
                            }
                        }
                    }
                    if (num == 1 && !lists.contains(temp)) {
                        strings.add(temp);
                        lists.add(temp);
                    }
                }
            }
            if (strings.size() != 0) {
                queue.add(strings);
            }
            m++;
        }
        return 0;
    }
}
