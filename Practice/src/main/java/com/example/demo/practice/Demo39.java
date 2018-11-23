package com.example.demo.practice;

import com.example.demo.practice.common.ListNode;

/**
 * 删除链表的倒数第N个节点
 * @author xintao.feng
 * @date 2018/11/21.
 */
public class Demo39 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null){
            return null;
        }
        ListNode p = head;
        ListNode q = head;
        int m = 0;
        while (p.next != null){
            p=p.next;

            if (m >= n+1){
                q = q.next;
            }
            m++;
        }
        q.next = q.next.next;
        return head;
    }
}
