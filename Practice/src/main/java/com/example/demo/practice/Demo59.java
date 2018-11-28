package com.example.demo.practice;

import com.example.demo.practice.common.ListNode;

/**
 * 两数相加
 */

public class Demo59 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int x = 0;
        ListNode head = new ListNode(0);
        ListNode p = head;
        int sum = 0;
        while (l1 != null && l2 != null) {
            sum = (l1.val + l2.val + x);
            x = sum / 10;
            int val = sum % 10;
            p.next = new ListNode(val);
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            p.next = l1;
        }
        if (l2 != null) {
            p.next = l2;
        }
        while (x != 0) {
            if (p.next == null) {
                p.next = new ListNode(x);
                x = 0;
            } else {
                p = p.next;
                sum = p.val + x;
                p.val = (sum) % 10;
                x = sum / 10;
            }
        }
        return head.next;
    }
}
