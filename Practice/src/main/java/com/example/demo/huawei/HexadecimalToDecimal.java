package com.example.demo.huawei;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/6 15:08
 * @Description:
 */
public class HexadecimalToDecimal {
    public int hexadecimalToDecimal(String hexadecimal) {
        int result = 0;
        int param = 0;
        for (int i = hexadecimal.length() - 1; i > 1; i--) {
            char c = hexadecimal.charAt(i);
            if (c >= '0' && c <= '9') {
                result += ((int) c - 48) * Math.pow(16, param);
            } else if (c == 'a' || c == 'A') {
                result += 10 * Math.pow(16, param);
            } else if (c == 'b' || c == 'B') {
                result += 11 * Math.pow(16, param);
            } else if (c == 'c' || c == 'C') {
                result += 12 * Math.pow(16, param);
            } else if (c == 'd' || c == 'D') {
                result += 13 * Math.pow(16, param);
            } else if (c == 'e' || c == 'E') {
                result += 14 * Math.pow(16, param);
            } else {
                result += 15 * Math.pow(16, param);
            }
            param++;
        }
        return result;
    }
}
