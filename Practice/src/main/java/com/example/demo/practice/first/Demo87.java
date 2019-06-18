package com.example.demo.practice.first;

import com.example.demo.practice.common.ListNode;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @Auther: xintao.feng
 * @Date: 2019/1/7 11:12
 * @Description:链表排序
 */
@Component
public class Demo87 {
    public ListNode sortList(ListNode head) {
        ListNode p = head;
        List<Integer> list = new ArrayList<>();
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        Collections.sort(list);
        p = head;
        int i = 0;
        while (p != null) {
            p.val = list.get(i);
            p = p.next;
            i++;
        }
        return head;
    }
}
