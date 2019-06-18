package com.example.demo.practice.first;

import com.example.demo.practice.common.ListNode;

/**
 * 反转链表
 *
 * @author xintao.feng
 * @date 2018/11/21.
 */
public class Demo44 {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode p = reverseList(head.next);
        if (p == null){
            head.next = p;
            return head;
        }
        ListNode q = p;
        while (q.next!=null){
            q = q.next;
        }
        q.next = head;
        head.next = null;
        return p;
    }
}
