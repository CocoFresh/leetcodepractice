package com.example.demo.practice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 螺旋矩阵
 */
@Component
public class Demo76 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();
        if (matrix[0].length == 1) {
            for (int i = 0; i < matrix.length; i++) {
                list.add(matrix[i][0]);
            }
            return list;
        }
        int endi = matrix.length - 1;
        int endj = matrix[0].length - 1;
        int starti = 0;
        int startj = 0;
        int m = 0, n = 0;
        int i = 1;
        while (list.size() != (matrix.length) * (matrix[0].length)) {
            if (m == starti && n <= endj && i == 1) {
                list.add(matrix[m][n++]);
                if (n == endj) {
                    starti++;
                    i++;
                }
            } else if (n == endj && m <= endi && i == 2) {
                list.add(matrix[m++][n]);
                if (m == endi) {
                    endj--;
                    i++;
                }
            } else if (m == endi && n >= startj && i == 3) {
                list.add(matrix[m][n--]);
                if (n == startj) {
                    endi--;
                    i++;
                }
            } else if (n == startj && m >= starti && i == 4) {
                list.add(matrix[m--][n]);
                if (m == starti) {
                    startj++;
                    i = 1;
                }
            }
        }
        return list;
    }
}
