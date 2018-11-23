package com.example.demo.practice;

import org.springframework.stereotype.Component;

/**
 * 第一个错误的版本
 *
 * @author xintao.feng
 * @date 2018/11/21.
 */
@Component
public class Demo45 {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int result = 0;
        while (start < end) {
            int mid = (int)(((long)start + (long)end) >> 1);
            if (isBadVersion(mid) ^ isBadVersion(mid + 1)) {
                result = mid + 1;
                break;
            } else {
                if (!isBadVersion(mid)) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }
        return result;
    }

    private boolean isBadVersion(int mid) {
        if (mid >= 1702766719) {
            return true;
        }
        return false;
    }
}
