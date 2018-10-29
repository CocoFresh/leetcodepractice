package com.example.demo.practice;

import com.example.demo.practice.common.TreeNode;
import org.springframework.stereotype.Component;

/**
 * 翻转二叉树
 *
 * @author xintao.feng
 * @date 2018/10/17.
 */

// Definition for a binary tree node.
@Component
public class Demo16 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode P = root.left;
        root.left = root.right;
        root.right = P;
        return root;
    }
}
