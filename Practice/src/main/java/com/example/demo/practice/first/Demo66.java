package com.example.demo.practice.first;

import com.example.demo.practice.common.TreeLinkNode;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 每个节点的右向指针
 */
@Component
public class Demo66 {
    public void connect(TreeLinkNode root) {
        if (root == null){
            return;
        }
        int deep = Math.max(deepth(root.left), deepth(root.right));
        int i = 0;
        Queue<TreeLinkNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        while (i <= deep) {
            int num = (int) Math.pow(2, i);
            while (num > 0) {
                TreeLinkNode p = queue.poll();
                if (p != null) {
                    if (num - 1 > 0) {
                        TreeLinkNode q = queue.peek();
                        if (q != null) {
                            p.next = q;
                        } else {
                            p.next = null;
                        }
                    } else {
                        p.next = null;
                    }
                }
                queue.offer(p.left);
                queue.offer(p.right);
                num--;
            }
            ++i;
        }
    }

    private int deepth(TreeLinkNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(deepth(root.left), deepth(root.right)) + 1;
    }
}
