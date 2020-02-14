package com.example.demo.medium;

import com.example.demo.practice.common.ListNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: xintao.feng
 * @Date: 2020/2/14 10:17
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MediumTest {
    @Test
    public void partitionTest() {
        Partition p = new Partition();
        ListNode head = new ListNode(1);
        ListNode q = head;
        q.next = new ListNode(1);
        q = q.next;
//        q.next = new ListNode(3);
//        q = q.next;
//        q.next = new ListNode(2);
//        q = q.next;
//        q.next = new ListNode(5);
//        q = q.next;
//        q.next = new ListNode(2);
//        q = q.next;
        q.next = null;
        p.partition2(head, 2);
    }
}
