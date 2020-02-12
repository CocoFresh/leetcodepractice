package com.example.demo.huawei;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/16 16:57
 * @Description: 1165. 单行键盘
 */
public class SimpleKeyBoard {
    public int calculateTime(String keyboard, String word) {
        int distance = 0;
        int pre = 0;
        Map<Character, Integer> keyBoardMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (keyBoardMap.containsKey(c)) {
                distance += Math.abs(keyBoardMap.get(c) - pre);
                pre = keyBoardMap.get(c);
            } else {
                for (int j = 0; j < keyboard.length(); j++) {
                    if (keyboard.charAt(j) == c) {
                        distance += Math.abs(j - pre);
                        keyBoardMap.put(c, j);
                        pre = j;
                        break;
                    }
                }
            }
        }
        return distance;
    }
}
