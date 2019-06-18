package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

/**
 * 数字的补数
 * @author xintao.feng
 * @date 2018/10/17.
 */
@Component
public class Demo18 {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        String newstr = new String();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1'){
                newstr += "0";
            }else {
                newstr += "1";
            }
        }
        return Integer.parseInt(newstr,2);
    }
}
