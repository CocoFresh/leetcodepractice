package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 自除数
 *
 * @author xintao.feng
 * @date 2018/10/18.
 */
@Component
public class Demo21 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int a = 0, b = 0, c = 0, d = 0;
        List<Integer> num = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i < 10) {
                num.add(i);
            } else if (i < 100) {
                a = i % 10;
                b = (i / 10) % 10;
                if (a != 0 && b != 0) {
                    if (i % a == 0 && i % b == 0) {
                        num.add(i);
                    }
                }
            } else if (i < 1000) {
                a = i % 10;
                b = (i / 10) % 10;
                c = (i / 100) % 10;
                if (a != 0 && b != 0 && c != 0) {
                    if (i % a == 0 && i % b == 0 && i % c == 0) {
                        num.add(i);
                    }
                }
            } else {
                a = i % 10;
                b = (i / 10) % 10;
                c = (i / 100) % 10;
                d = (i / 1000) % 10;
                if (a != 0 && b != 0 && c != 0 && d != 0) {
                    if (i % a == 0 && i % b == 0 && i % c == 0 && i % d == 0) {
                        num.add(i);
                    }
                }
            }
        }
        return num;
    }
//    更好的解答
//    public List<Integer> res = new ArrayList<Integer>();
//    public boolean Chaifen(int x){
//        int d = 0;
//        int before = x;
//        while(x > 0)
//        {
//            d = x % 10;
//            if(d == 0)
//            {
//                return false;
//            }
//            x /= 10;
//            if(before % d != 0)
//            {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public List<Integer> selfDividingNumbers(int left, int right) {
//        for(int i = left;i <= right;i++)
//        {
//            if(Chaifen(i))
//                res.add(i);
//        }
//        return res;
//    }
}
