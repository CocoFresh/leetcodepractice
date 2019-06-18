package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成括号
 */
@Component
public class Demo67 {
    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();

        fun(list, "", n, n);
        return list;
    }

    private void fun(List<String> list, String s, int left, int right) {
        if (left > right) {
            return;
        }
        if (left > 0) {
            fun(list, s + "(", left - 1, right);
        }
        if (right > 0) {
            fun(list, s + ")", left, right - 1);
        }
        if (left == 0 && right == 0){
            list.add(s);
            return;
        }
    }


}

