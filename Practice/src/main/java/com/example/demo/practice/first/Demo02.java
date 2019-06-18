package com.example.demo.practice.first;

/**
 * @author xintao.feng
 * @date 2018/9/12.
 */
public class Demo02 {

    private Integer INT_MAX = 2147483647;
    private Integer INT_MIN = -2147483648;

    public int reverse(int x) {
//        int rev = 0;
//        while (x != 0) {
//            int pop = x % 10;
//            x /= 10;
//            if (rev > INT_MAX/10 || (rev == INT_MAX / 10 && pop > 7)) return 0;
//            if (rev < INT_MIN/10 || (rev == INT_MIN / 10 && pop < -8)) return 0;
//            rev = rev * 10 + pop;
//        }
//        return rev;
        char symbol = '-';
        Integer y = x;
        String m = y.toString();
        char[] num = new char[m.length()];
        String n = new String();
        for (int i = 0; i < num.length; i++) {
            num[i] = m.charAt(i);
        }
        if (x < 0) {
            n += symbol;
            for (int i = num.length - 1; i >= 1; i--) {
                n += num[i];
            }
        } else {
            for (int i = num.length - 1; i >= 0; i--) {
                n += num[i];
            }
        }
        Long y1 = Long.parseLong(n);
        if (y1 > INT_MAX || y1 < INT_MIN) {
            return 0;
        }
        y = Integer.parseInt(n);
        return y;
    }
}
