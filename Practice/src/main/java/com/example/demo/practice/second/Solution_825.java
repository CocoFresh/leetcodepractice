package com.example.demo.practice.second;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: xintao.feng
 * @Date: 2019/7/23 17:22
 * @Description: 适龄的朋友
 */
@Component
public class Solution_825 {
    public int numFriendRequests(int[] ages) {

        return simpleMethod(ages);

//        return forceMethod(ages);

    }

    private int simpleMethod(int[] ages) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 15) {
                if (!map.containsKey(ages[i])) {
                    map.put(ages[i], 1);
                } else {
                    int num = map.get(ages[i]);
                    map.put(ages[i], num + 1);
                }
            }
        }
        Set<Integer> set = map.keySet();
        for (int a : set) {
            for (int b : set) {
                if (a == b) {
//                    System.out.println(a + " -> " + b);
                    count += map.get(a) * (map.get(a) - 1);
                } else if (isValid(a, b)) {
//                    System.out.println(a + " -> " + b);
                    count += map.get(a) * map.get(b);
                }
            }
        }
        return count;
    }

    private boolean isValid(int a, int b) {
        if ((b <= a * 0.5 + 7) ||
                (b > a) ||
                (b > 100 && a < 100)) {
            return false;
        }
        return true;
    }

    //暴力法O(n^2)
    private int forceMethod(int[] ages) {
        int count = 0;
        for (int a = 0; a < ages.length; a++) {
            for (int b = 0; b < ages.length; b++) {
                if ((b == a) ||
                        (ages[b] <= ages[a] / 2 + 7) ||
                        (ages[b] > ages[a]) ||
                        (ages[b] > 100 && ages[a] < 100)) {
                    continue;
                }
                count++;
                System.out.println(ages[a] + " -> " + ages[b]);
            }
        }
        return count;
    }
}
