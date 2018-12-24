package com.example.demo.practice;

import com.example.demo.practice.common.ListNode;
import org.springframework.stereotype.Component;

/**
 * @Auther: xintao.feng
 * @Date: 2018/12/19 11:13
 * @Description:合并K个元素的有序链表
 */
@Component
public class Demo77 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode head = new ListNode(0);
        ListNode p = lists[0];
        head.next = p;
        p = head;
        for (int i = 1; i < lists.length; i++) {
            ListNode q = lists[i];
            while (p.next != null && q != null) {
                if (p.next.val <= q.val) {
                    p = p.next;
                } else {
                    ListNode temp = p.next;
                    p.next = q;
                    p = p.next;
                    q = q.next;
                    p.next = temp;
                }
            }
            if (q != null) {
                p.next = q;
            }
            p = head;
        }
        return head.next;
    }
}
