package com.example.demo.practice.first;

/**
 * @author xintao.feng
 * @date 2018/9/12.
 */
public class Demo04 {
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)) {
                    num++;
                }
            }
        }
        return num;
    }
}
