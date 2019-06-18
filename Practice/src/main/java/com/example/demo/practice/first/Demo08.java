package com.example.demo.practice.first;

import com.example.demo.practice.common.ListNode;
import org.springframework.stereotype.Component;

/**
 * @author xintao.feng
 * @date 2018/9/12.
 */
@Component
public class Demo08 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode Head = l1;
//        int temp = 0, total = 0;
//        while (l1 != null && l2 != null) {
//            total = l1.val + l2.val;
//            if (temp != 0) {
//                total += temp;
//                temp = 0;
//            }
//            l1.val = total % 10;
//            temp = total / 10;
//            if (l1.next == null || l2.next == null) {
//                break;
//            }
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//        l2 = l2.next;
//        if (l1.next != null) {
//            l1 = l1.next;
//        }
//        if (l2 != null) {
//            l1.next = l2;
//            l1 = l1.next;
//        }
//
//        while (l1 != null) {
//            if (temp == 0) {
//                break;
//            }
//            total = l1.val + temp;
//            l1.val = (total) % 10;
//            temp = (total) / 10;
//            if (l1.next == null) {
//                break;
//            }
//            l1 = l1.next;
//        }
//        if (temp != 0) {
//            l1.next = new ListNode(temp);
//        }
//        return Head;
        int temp = 0;
        ListNode p = l1;
        ListNode Head = l1;
        while (l1 != null && l2 != null) {
            int total = l1.val + l2.val;
            if (temp != 0) {
                total += temp;
            }
            l1.val = total % 10;
            temp = total / 10;
            p = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l2 != null) {
            p.next = l2;
            l1 = l2;
        }
        while (l1 != null) {
            if (temp == 0) {
                break;
            }
            int total = l1.val + temp;
            l1.val = total % 10;
            temp = total / 10;
            p = l1;
            l1 = l1.next;
        }
        if (temp != 0) {
            ListNode next = new ListNode(temp);
            p.next = next;
        }
        return Head;
    }
}
