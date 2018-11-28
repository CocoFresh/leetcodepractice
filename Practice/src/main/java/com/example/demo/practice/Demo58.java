package com.example.demo.practice;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 字谜分组
 */
@Component
public class Demo58 {
    public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> lists = new ArrayList<>();
//        for (int i = 0; i < strs.length; i++) {
//            List<String> list = new ArrayList<>();
//            String s = strs[i];
//            if (s != "") {
//                list.add(s);
//            } else {
//                continue;
//            }
//            for (int j = i + 1; j < strs.length; j++) {
//                String s1 = strs[j];
//                if (s1 != "") {
//                    if (s.length() != s1.length()) {
//                        continue;
//                    }
//                    if (isFamilar(s, s1)) {
//                        list.add(s1);
//                        strs[j] = "";
//                    } else {
//                        continue;
//                    }
//                } else {
//                    continue;
//                }
//            }
//            lists.add(list);
//        }
//        return lists;
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }
        return new ArrayList<List<String>>(map.values());
    }

//    private boolean isFamilar(String s, String s1) {
//        boolean flag = true;
//        for (int k = 0; k < s.length(); k++) {
//            if (s1.indexOf(s.charAt(k)) == -1) {
//                flag = false;
//                break;
//            } else {
//                s1 = s1.replaceFirst(String.valueOf(s.charAt(k)),"");
//            }
//        }
//        return flag;
//    }
}
