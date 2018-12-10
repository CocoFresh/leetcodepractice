package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 岛屿的个数
 */
@Component
public class Demo69 {
    public int numIslands(char[][] grid) {
            if (grid.length == 0) {
                return 0;
            }
            if (grid[0].length == 0) {
                return 0;
            }
            int res = 0;
            int row = grid.length;
            int col = grid[0].length;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (grid[i][j] == '1') {
                        res++;
                        toZero(grid, i, j, row, col);
                    }
                }
            }
            return res;
    }

    private void toZero(char[][] grid, int i, int j, int row, int col) {
        if (i < 0 || j < 0 || j >= col || i >= row) {
            return;
        }
        if (grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        toZero(grid, i, j - 1, row, col);
        toZero(grid, i, j + 1, row, col);
        toZero(grid, i - 1, j, row, col);
        toZero(grid, i + 1, j, row, col);
    }
}
