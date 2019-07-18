package com.example.demo.practice.second;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: xintao.feng
 * @Date: 2019/7/17 18:10
 * @Description: 我的日程安排表 II
 */
public class MyCalendarTwo {

    private List<int[]> list;

    public MyCalendarTwo() {
        list = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        int[] calendar = new int[2];
        if (list.size() == 0) {
            calendar[0] = start;
            calendar[1] = end;
            list.add(calendar);
            return true;
        } else {
            int count = 0;
            boolean intersect = false;
            List<int[]> var = new ArrayList<>();
            //遍历list
            for (int[] ints : list) {
                if (isIntersect(ints, start, end)) {
                    var.add(ints);
                    count++;
                    //如果重叠次数大于2，再对重叠日期进行遍历
                    if (count >= 2) {
                        for (int i = 0; i < var.size() - 1; i++) {
                            for (int j = i + 1; j < var.size(); j++) {
                                if (isIntersect(var.get(i), var.get(j)[0], var.get(j)[1])) {
                                    return false;
//                                    intersect = true;
//                                    break;
                                }
                            }
                        }
                        count--;
                    }
                }
            }
            if (count < 2) {
                calendar[0] = start;
                calendar[1] = end;
                list.add(calendar);
                return true;
            }
        }
        return false;
    }

    private boolean isIntersect(int[] ints, int start, int end) {
        if ((start >= ints[0] && start < ints[1]) ||
                (end > ints[0] && end <= ints[1]) ||
                (ints[0] >= start && ints[0] < end) ||
                (ints[1] > start && ints[1] <= end)) {
            return true;
        }
        return false;
    }
}
