package com.example.demo.practice.first;

import com.example.demo.practice.common.ListNode;

/**
 * 回文链表
 */
public class Demo54 {
    public boolean isPalindrome(ListNode head) {
        ListNode p = head;
        int len = 0;
        while (p != null) {
            p = p.next;
            len++;
        }
        int[] num = new int[len];
        int i = 0;
        p = head;
        while (p!=null){
            num[i] = p.val;
            p = p.next;
            i++;
        }
        for (int j = 0; j < num.length/2; j++) {
            if (num[j] != num[num.length-1-j]){
                return false;
            }
        }
        return true;
    }
}