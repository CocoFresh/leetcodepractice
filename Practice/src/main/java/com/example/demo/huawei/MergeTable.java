package com.example.demo.huawei;

import java.util.*;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/6 17:01
 * @Description:
 */
public class MergeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while (sc.hasNext()) {
            Map<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < count; i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + value);
                } else {
                    map.put(key, value);
                }
            }
            for (Integer key : map.keySet()) {
                System.out.print(key);
                System.out.print(" ");
                System.out.println(map.get(key));
            }
        }
    }
}

