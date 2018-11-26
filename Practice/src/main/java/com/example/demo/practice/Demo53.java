package com.example.demo.practice;

import com.example.demo.practice.common.ListNode;

/**
 * 合并两个有序链表
 *
 * @author xintao.feng
 * @date 2018/11/22.
 */
public class Demo53 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode p = l1;
        ListNode q = l2;
        int initNum;
        if (p.val <= q.val) {
            initNum = p.val;
            p = p.next;
        } else {
            initNum = q.val;
            q = q.next;
        }
        ListNode head = new ListNode(initNum);
        ListNode p1 = head;
        while (p != null && q != null) {
            if (p.val <= q.val) {
                p1.next = p;
                p = p.next;
            } else {
                p1.next = q;
                q = q.next;
            }
            p1 = p1.next;
        }
        if (p != null) {
            p1.next = p;
        } else if (q != null) {
            p1.next = q;
        }
        return head;
    }
}
