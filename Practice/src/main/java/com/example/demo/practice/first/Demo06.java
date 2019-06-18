package com.example.demo.practice.first;

/**
 * @author xintao.feng
 * @date 2018/9/12.
 */
public class Demo06 {
    public boolean judgeCircle(String moves) {
        boolean flag = false;
        int x = 0, y = 0;
        char[] chars = moves.toCharArray();
        for (char ch : chars) {
            switch (ch) {
                case 'U':
                    y += 1;
                    break;
                case 'D':
                    y -= 1;
                    break;
                case 'R':
                    x += 1;
                    break;
                case 'L':
                    x -= 1;
                    break;
            }
        }
        if (x == 0 && y == 0) {
            flag = true;
        }
        return flag;
    }
}
