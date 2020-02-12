package com.example.demo.huawei;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/16 14:13
 * @Description: 43. 字符串相乘
 */
public class StringMultiply {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        for (int i = num1.length() - 1; i >= 0; i--) {
            int p1 = num1.length() - i;
            int multiplier1 = num1.charAt(i) - 48;
            int result = 0;
            for (int j = num2.length() - 1; j >= 0; j--) {
                int p2 = num2.length() - j - 1;
                int p = p1 + p2;
                int multiplier2 = num2.charAt(j) - 48;
                int product = multiplier1 * multiplier2;
                int remainder = product % 10;
                if (res.length() < p) {
                    remainder += result;
                    result = remainder / 10;
                    remainder %= 10;
                    res.append(remainder);
                } else {
                    int tempValue = res.charAt(p - 1) - 48;
                    tempValue += remainder;
                    tempValue += result;
                    result = tempValue / 10;
                    tempValue %= 10;
                    res.replace(p - 1, p, String.valueOf(tempValue));
                }
                result = product / 10 + result;
            }
            while (result != 0) {
                res.append(result % 10);
                result /= 10;
            }
        }
        return res.reverse().toString();
    }
}
