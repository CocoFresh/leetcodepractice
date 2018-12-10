package com.example.demo.practice;

import com.example.demo.practice.common.ListNode;
import org.springframework.stereotype.Component;

/**
 * 相交链表
 */
@Component
public class Demo73 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null) {
//            return null;
//        }
        int i = getListNodeLen(headA);
        int j = getListNodeLen(headB);
        ListNode p = headA;
        ListNode q = headB;
        if (j > i) {
            int m = j - i;
            while (m > 0) {
                m--;
                q = q.next;
            }
        } else {
            int m = i - j;
            while (m > 0) {
                m--;
                p = p.next;
            }
        }
        while (p != null) {
            if (p == q) {
                return p;
            }
            p = p.next;
            q = q.next;
        }
        return null;
    }

    private int getListNodeLen(ListNode root) {
        int len = 0;
        ListNode p = root;
        while (p != null) {
            len++;
            p = p.next;
        }
        return len;
    }
}
