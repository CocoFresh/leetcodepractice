package com.example.demo.huawei;

import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/7 13:48
 * @Description:
 */
public class Add {
    public String add(String num1, String num2) {
        BigInteger a = new BigInteger(num1.trim());
        BigInteger b = new BigInteger(num2.trim());
        return a.add(b).toString();

//        StringBuilder res = new StringBuilder();
//        if (num1.charAt(0) == '-' && num2.charAt(0) == '-') {
//            int b = 0;
//            int index1 = num1.length() - 1;
//            int index2 = num2.length() - 1;
//            while (index1 > 0 && index2 > 0) {
//                int sum = (int) num1.charAt(index1) +
//                        (int) num2.charAt(index2) - 96;
//                int a = sum % 10;
//                if (b != 0) {
//                    a += b;
//                }
//                b = sum / 10;
//                res.append(a);
//                index1--;
//                index2--;
//            }
//            while (index1 > 0) {
//                int a = num1.charAt(index1) - 48;
//                if (b != 0) {
//                    a += b;
//                    b = a / 10;
//                }
//                res.append(a);
//                index1--;
//            }
//            while (index2 > 0) {
//                int a = num2.charAt(index2) - 48;
//                if (b != 0) {
//                    a += b;
//                    b = a / 10;
//                }
//                res.append(a);
//                index2--;
//            }
//            if (b != 0) {
//                res.append(b);
//            }
//            res.append('-');
//            return res.reverse().toString();
//        } else if (num1.charAt(0) != '-' && num2.charAt(0) != '-') {
//            int b = 0;
//            int index1 = num1.length() - 1;
//            int index2 = num2.length() - 1;
//            while (index1 >= 0 && index2 >= 0) {
//                int sum = (int) num1.charAt(index1) +
//                        (int) num2.charAt(index2) - 96;
//                int a = sum % 10;
//                if (b != 0) {
//                    a += b;
//                }
//                b = sum / 10;
//                res.append(a);
//                index1--;
//                index2--;
//            }
//            while (index1 >= 0) {
//                int a = num1.charAt(index1) - 48;
//                if (b != 0) {
//                    a += b;
//                    b = a / 10;
//                }
//                res.append(a);
//                index1--;
//            }
//            while (index2 >= 0) {
//                int a = num2.charAt(index2) - 48;
//                if (b != 0) {
//                    a += b;
//                    b = a / 10;
//                }
//                res.append(a);
//                index2--;
//            }
//            if (b != 0) {
//                res.append(b);
//            }
//            return res.reverse().toString();
//        } else {
//        }
    }
}
