package com.example.demo.practice.first;

import java.util.ArrayList;
import java.util.List;

/**
 * 最小栈
 *
 * @author xintao.feng
 * @date 2018/11/21.
 */
public class Demo47 {
    private int top;
    private List<Integer> a;

    public Demo47() {
        this.top = -1;
        this.a = new ArrayList<>();
    }

    public void push(int x) {
        a.add(x);
        top++;
    }

    public void pop() {
        a.remove(top--);
    }

    public int top() {
        return a.get(top);
    }

    public int getMin() {
        int min = 0;
        for (int i = 0; i <= top; i++) {
            if (a.get(i) < min){
                min = a.get(i);
            }
        }
        return min;
    }
}
