package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: xintao.feng
 * @Date: 2018/12/20 16:37
 * @Description:单词搜索 II
 */
@Component
public class Demo79 {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            boolean isUsed[][] = new boolean[board.length][board[0].length];
            backTracking(str, 0, board, 0, 0, list, isUsed);
        }
        return list;
    }

    private boolean backTracking(String str, int i, char[][] board, int i1, int i2, List<String> list, boolean[][] isUsed) {
        if (i >= str.length()) {
            if (!list.contains(str)) {
                list.add(str);
            }
            return true;
        }
        if (i1 < 0 || i2 < 0 || i1 >= board.length || i2 >= board[0].length || isUsed[i1][i2]) {
            return false;
        }
        char a = str.charAt(i);
        boolean flag;
        if (i == 0) {
            for (int k = 0; k < board.length; k++) {
                for (int j = 0; j < board[k].length; j++) {
                    flag = check(str, i, board, k, j, list, a, isUsed);
                    if (flag) {
                        return false;
                    }
                }
            }
        } else {
            if (check(str, i, board, i1, i2, list, a, isUsed)) {
                return true;
            }
        }
        return false;
    }

    private boolean check(String str, int i, char[][] board, int i1, int i2, List<String> list, char a, boolean[][] isUsed) {
        if (a == board[i1][i2]) {
            isUsed[i1][i2] = true;
            if (backTracking(str, i + 1, board, i1 - 1, i2, list, isUsed)) {
                return true;
            }
            if (backTracking(str, i + 1, board, i1 + 1, i2, list, isUsed)) {
                return true;
            }
            if (backTracking(str, i + 1, board, i1, i2 - 1, list, isUsed)) {
                return true;
            }
            if (backTracking(str, i + 1, board, i1, i2 + 1, list, isUsed)) {
                return true;
            }
        }
        isUsed[i1][i2] = false;
        return false;
    }
}
