package com.example.demo.practice;

import java.util.*;

/**
 * 二叉树的层次遍历
 *
 * @author xintao.feng
 * @date 2018/11/12.
 */
public class Demo36 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        if (root == null) {
            return l;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while (q.size() != 0) {
            List<Integer> list = new ArrayList<>();
            int num = q.size();
            for (int i = 0; i < num; i++) {
                TreeNode node = q.poll();
                list.add(node.val);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            l.add(list);
        }
        return l;
    }
}
