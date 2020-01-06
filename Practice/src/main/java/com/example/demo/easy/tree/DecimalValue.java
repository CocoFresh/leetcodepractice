package com.example.demo.easy.tree;

import com.example.demo.practice.common.ListNode;

/**
 * @Auther: xintao.feng
 * @Date: 2019/12/24 15:19
 * @Description: 1290. 二进制链表转整数
 */
public class DecimalValue {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        int i = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            i++;
        }
        while (head != null) {
            sum += head.val * Math.pow(2, --i);
            head = head.next;
        }
        return sum;
    }
}
