package com.example.demo.practice;

import com.example.demo.practice.common.ListNode;

/**
 * 删除链表中的节点
 *
 * @author xintao.feng
 * @date 2018/11/20.
 */
public class Demo38 {
    public void deleteNode(ListNode node){
        ListNode p = node;
        while (p.next != null){
            node.val = p.val;
            p = p.next;
            node = node.next;
        }
        node.val = p.val;
        node.next = null;
    }
}
