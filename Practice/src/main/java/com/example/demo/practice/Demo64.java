package com.example.demo.practice;

import com.example.demo.practice.common.TreeNode;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的序列化与反序列化
 */
@Component
public class Demo64 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if (root == null) {
            return sb.toString();
        }
        int deep = Math.max(btDeepth(root.left), btDeepth(root.right)) + 1;
        int leaves = (int) (Math.pow(2, deep) - 1);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 0;
        while (!queue.isEmpty() && i < leaves) {
            TreeNode p = queue.poll();
            if (p == null) {
                sb.append("#,");
                queue.offer(null);
                queue.offer(null);
            } else {
                sb.append(p.val + ",");
                queue.offer(p.left);
                queue.offer(p.right);
            }
            i++;
        }
        return sb.toString();
    }

    private int btDeepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = btDeepth(root.left);
        int rigjt = btDeepth(root.right);
        return Math.max(left, rigjt) + 1;
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() == 0) {
            return null;
        }
        String[] s = data.split(",");
        int i = 0;
        int val = Integer.parseInt(s[i]);
        TreeNode root = new TreeNode(val);
        root.left = subDeserialize(s, i * 2 + 1);
        root.right = subDeserialize(s, i * 2 + 2);
        return root;
    }


    private TreeNode subDeserialize(String[] data, int i) {
        if (i >= data.length) {
            return null;
        }
        if (data[i].compareTo("#") == 0) {
            return null;
        }
        int num = Integer.parseInt(data[i]);
        TreeNode root = new TreeNode(num);
        root.left = subDeserialize(data, i * 2 + 1);
        root.right = subDeserialize(data, i * 2 + 2);
        return root;
    }


}
