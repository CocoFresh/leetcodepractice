package com.example.demo.practice.first;

/**
 * @author xintao.feng
 * @date 2018/9/12.
 */
public class Demo03 {

    private Integer INT_MAX = 2147483647;
    private Integer INT_MIN = -2147483648;
    //字符串转整数
    public int myAtoi(String str) {
        String n = "";
        if (str.equals(n) || str.equals("-")) {
            return 0;
        }
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (i != str.length() - 1) {
                if (str.charAt(i) == ' ') {
                    continue;
                } else if ((ch < 48 && ch != 45 && ch != 43) || ch > 57 || (str.charAt(i) == 45 && (str.charAt(i + 1) > 57 || str.charAt(i + 1) < 48)) || (str.charAt(i) == 43 && (str.charAt(i + 1) > 57 || str.charAt(i + 1) < 48))) {
                    break;
                }
                if ((str.charAt(i) <= 57 && str.charAt(i) >= 48) && (str.charAt(i + 1) <= 57 && str.charAt(i + 1) >= 48)) {
                    n += str.charAt(i);
                } else if (str.charAt(i) == 45 || str.charAt(i) == 43) {
                    n += str.charAt(i);
                } else {
                    n += str.charAt(i);
                    break;
                }
            } else {
                if (str.charAt(i) <= 57 && str.charAt(i) >= 48) {
                    n += str.charAt(i);
                }
            }
        }
        String m = "";
        if (n.equals(m)) {
            return 0;
        }
        try {
            return Integer.parseInt(n);
        } catch (Exception e) {
            if (n.charAt(0) == '-') {
                if (n.length() > INT_MIN.toString().length()) {
                    return INT_MIN;
                } else if (n.length() == INT_MIN.toString().length()) {
                    if (Long.parseLong(n) < INT_MIN) {
                        return INT_MIN;
                    }
                }
            } else {
                if (n.length() > INT_MAX.toString().length()) {
                    return INT_MAX;
                } else if (n.length() == INT_MAX.toString().length()) {
                    if (Long.parseLong(n) > INT_MAX) {
                        return INT_MAX;
                    }
                }
            }
        }
        return Integer.parseInt(n);
    }
}
