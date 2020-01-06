package com.example.demo.huawei;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/6 15:36
 * @Description:
 */
public class PrimeFactors {
    public String getPrimeFactors(long num) {
        StringBuilder res = new StringBuilder();
        int index = 2;
        while (num != 1) {
            if (num % index == 0) {
                res.append(index).append(" ");
                num /= index;
            } else {
                index++;
            }
        }
        System.out.println(res.toString());
        return res.toString();
    }
}
