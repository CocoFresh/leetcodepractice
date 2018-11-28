package com.example.demo.practice;

import com.example.demo.practice.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 对称二叉树
 *
 * @author xintao.feng
 * @date 2018/11/3.
 */
public class Demo35 {


    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return a(root.left, root.right);
    }

    private boolean a(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        return (left.val == right.val) && a(left.left, right.right) && a(left.right, right.left);
    }
}

