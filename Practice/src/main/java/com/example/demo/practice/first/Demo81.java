package com.example.demo.practice.first;

import org.springframework.stereotype.Component;

/**
 * @Auther: xintao.feng
 * @Date: 2018/12/25 15:37
 * @Description:被围绕的区域
 */
@Component
public class Demo81 {
    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ('O' == board[i][j]) {
                    if (!isSurrounded(board, i, j)) {
                        board[i][j] = 'o';
                        infectedAround(board, i, j);
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ('o' == board[i][j]) {
                    board[i][j] = 'O';
                } else if ('O' == board[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void infectedAround(char[][] board, int i, int j) {
        isO(board, i - 1, j);
        isO(board, i + 1, j);
        isO(board, i, j - 1);
        isO(board, i, j + 1);
    }

    private void isO(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return;
        }
        if (board[i][j] == 'O') {
            board[i][j] = 'o';
            infectedAround(board, i, j);
        }
    }

    private boolean isX(char[][] board, int i, int j, int prei, int prej) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }
        return true;
    }

    private boolean isSurrounded(char[][] board, int i, int j) {
        if (!isX(board, i - 1, j, i, j)) {
            return false;
        }
        if (!isX(board, i, j - 1, i, j)) {
            return false;
        }
        if (!isX(board, i + 1, j, i, j)) {
            return false;
        }
        if (!isX(board, i, j + 1, i, j)) {
            return false;
        }
        return true;
    }
}
