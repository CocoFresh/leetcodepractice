package com.example.demo.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/6 14:14
 * @Description:
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String hexadecimal = sc.nextLine();
        int result = 0;
        for (int i = hexadecimal.length() - 1; i > 1; i--) {
            char c = hexadecimal.charAt(i);
            if (c >= '0' && c <= '9') {
                result += (int) c * Math.pow(16, i - 1);
            } else if (c == 'a' || c == 'A') {
                result += 10 * Math.pow(16, i - 1);
            } else if (c == 'b' || c == 'B') {
                result += 11 * Math.pow(16, i - 1);
            } else if (c == 'c' || c == 'C') {
                result += 12 * Math.pow(16, i - 1);
            } else if (c == 'd' || c == 'D') {
                result += 13 * Math.pow(16, i - 1);
            } else if (c == 'e' || c == 'E') {
                result += 14 * Math.pow(16, i - 1);
            } else {
                result += 15 * Math.pow(16, i - 1);
            }
        }
        System.out.println(result);
    }
}
