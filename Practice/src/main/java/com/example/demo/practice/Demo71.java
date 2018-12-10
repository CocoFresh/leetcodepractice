package com.example.demo.practice;

import com.example.demo.practice.common.Interval;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 合并区间
 */
@Component
public class Demo71 {
    public List<Interval> merge(List<Interval> intervals) {
//        if (intervals.size() <= 1)
//            return intervals;
//        Collections.sort(intervals, new Comparator<Interval>(){
//            public int compare(Interval i1, Interval i2) {
//                return i1.start - i2.start;
//            }
//        });
//        List<Interval> result = new ArrayList<>();
//        result.add(intervals.get(0));
//        for (int i = 1; i < intervals.size(); i++) {
//            int curtStart = intervals.get(i).start;
//            Interval lastOne = result.get(result.size() - 1);
//
//            if (curtStart <= lastOne.end) {
//                lastOne.end = Math.max(lastOne.end, intervals.get(i).end);
//            } else {
//                result.add(intervals.get(i));
//            }
//        }
//        return result;
        if (intervals.size() == 0 || intervals.size() == 1) {
            return intervals;
        }
//        intervals.sort(Comparator.comparing(Interval::getStart));
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
//        for (int i = 0; i < intervals.size(); i++) {
//            boolean flag = true;
//            for (int j = 0; j < intervals.size() - 1; j++) {
//                Interval m = intervals.get(j);
//                Interval n = intervals.get(j + 1);
//                if (m.start > n.start) {
//                    intervals.set(j, n);
//                    intervals.set(j + 1, m);
//                    flag = false;
//                }
//            }
//            if (flag) {
//                break;
//            }
//        }
        int i = 0;
        int j = 1;
        while (j < intervals.size()) {
            Interval m = intervals.get(i);
            Interval n = intervals.get(j);

            if (m.end >= n.start && m.start <= n.end) {
                m.start = Math.min(m.start, n.start);
                m.end = Math.max(m.end, n.end);
                j++;
            } else {
                i++;
                j++;
                intervals.set(i, n);
            }
        }
        List<Interval> list = new ArrayList<>();
        for (int k = 0; k <= i; k++) {
            list.add(intervals.get(k));
        }
        return list;
    }
}
