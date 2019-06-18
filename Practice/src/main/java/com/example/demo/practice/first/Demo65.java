package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 */
@Component
public class Demo65 {
    public int lengthOfLongestSubstring(String s) {
        //        O(N)的时间复杂度
        if (s.length() == 0) {
            return 0;
        }
        int max = 0;
        int j = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (map.containsKey(a)) {
                j = map.get(a);
                map.remove(a);
                map.put(a, i);
                max = Math.max(max, i - j);
                j = i;
            } else {
                map.put(a, i);
            }
        }
        if (j == 0) {
            return Math.max(max, s.length());
        }
        return max;
//        O(N^2)的时间复杂度
//        if (s.length() == 0) {
//            return 0;
//        }
//        int max = 0;
//        Map<Character, Integer> strMap = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            strMap.put(s.charAt(i), i);
//            for (int j = i + 1; j < s.length(); j++) {
//                if (!strMap.containsKey(s.charAt(j))) {
//                    strMap.put(s.charAt(j), j);
//                } else {
//                    break;
//                }
//            }
//            max = Math.max(strMap.size(), max);
//            strMap.clear();
//        }
//        return max;


    }
}
