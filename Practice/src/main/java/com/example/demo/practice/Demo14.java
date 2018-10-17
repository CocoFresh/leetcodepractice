package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 汉明距离
 *
 * @author xintao.feng
 * @date 2018/10/16.
 */
@Component
public class Demo14 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int flag = 1;
        int count = 0;
        while (flag != 0) {
            if ((z & flag) != 0)
                count++;
            flag <<= 1;
        }
        return count;
    }
//        int num = 0;
//        StringBuilder xBuilder = new StringBuilder();
//        StringBuilder yBuilder = new StringBuilder();
//        for (int i = 0; i < 32; i++) {
//            xBuilder.append(x & 1);
//            yBuilder.append(y & 1);
//            x = x >>> 1;
//            y = y >>> 1;
//        }
//        String a = xBuilder.reverse().toString();
//        String b = yBuilder.reverse().toString();
//        int indexA = a.length() - 1;
//        int indexB = b.length() - 1;
//        for (int i = 0; i < (a.length() < b.length() ? b.length() : a.length()); i++) {
//            if (a.charAt(i) != b.charAt(i)) {
//                num++;
//            }
//        }
//        return num;
}

