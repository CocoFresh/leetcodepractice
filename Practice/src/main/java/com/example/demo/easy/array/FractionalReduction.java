package com.example.demo.easy.array;

/**
 * @Auther: xintao.feng
 * @Date: 2020/2/12 15:57
 * @Description: 分式化简
 */
public class FractionalReduction {
    public int[] fraction(int[] cont) {
        int[] result = new int[2];
        //0为分子，1为分母
        result[0] = 1;
        result[1] = cont[cont.length - 1];
        for (int i = cont.length - 2; i >= 0; i--) {
            //分数相加
            int temp = cont[i];
            temp *= result[1];
            result[0] += temp;
            //分数颠倒
            temp = result[0];
            result[0] = result[1];
            result[1] = temp;

        }
        int temp = result[0];
        result[0] = result[1];
        result[1] = temp;
        return result;
    }
}
