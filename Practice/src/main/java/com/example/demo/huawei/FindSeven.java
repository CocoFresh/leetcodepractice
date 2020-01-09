package com.example.demo.huawei;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/7 10:35
 * @Description:
 */
public class FindSeven {
    public int findSeven(int N) {
        int count = 0;
        char a = '0';
        System.out.println((int) a);
        for (int i = 1; i <= N; i++) {
            if (i % 7 == 0) {
                count++;
            } else {
                int temp = i;
                while (temp != 0) {
                    if (temp % 10 == 7) {
                        count++;
                        break;
                    }
                    temp /= 10;
                }
            }
        }

        return count;
    }
}
