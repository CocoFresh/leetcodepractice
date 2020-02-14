package com.example.demo.medium;

import com.example.demo.practice.common.ListNode;

/**
 * @Auther: xintao.feng
 * @Date: 2020/2/14 09:33
 * @Description: 86. 分隔链表
 */
public class Partition {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head;
        ListNode q = null;
        ListNode head1 = null;
        //找到第一个比x小的数
        while (p != null) {
            if (p.val < x) {
                head1 = new ListNode(p.val);
                q = head1;
                p = p.next;
                break;
            }
            p = p.next;
        }
        if (head1 == null) {
            return head;
        }
        //把所有比x小的数链接起来
        while (p != null) {
            if (p.val < x) {
                q.next = new ListNode(p.val);
                q = q.next;
            }
            p = p.next;
        }
        //找到第一个大于等于x的数
        p = head;
        ListNode head2 = null;
        while (p != null) {
            if (p.val >= x) {
                head2 = new ListNode(p.val);
                p = p.next;
                break;
            }
            p = p.next;
        }
        if (head2 == null) {
            return head1;
        }
        ListNode node = head2;
        while (p != null) {
            if (p.val >= x) {
                node.next = new ListNode(p.val);
                node = node.next;
            }
            p = p.next;
        }
        q.next = head2;
        return head1;
    }

    //优化
    public ListNode partition2(ListNode head, int x) {
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        ListNode p1 = l1;
        ListNode p2 = l2;
        while (head != null) {
            if (head.val < x) {
                p1.next = head;
                p1 = p1.next;
            } else {
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }
        p2.next = null;
        p1.next = l2.next;
        return l1.next;
    }
}
