package com.example.demo.DataStucture.Tree;

import com.example.demo.practice.common.TreeNode;
import org.springframework.stereotype.Component;

/**
 * @Auther: xintao.feng
 * @Date: 2019/9/16 09:04
 * @Description: 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 */
@Component
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        int val = 0;
        return recursive(root, sum, val);
    }

    private boolean recursive(TreeNode root, int sum, int val) {
        if (root == null) {
            return false;
        }
        val += root.val;
        if (val == sum && root.left == null && root.right == null) {
            return true;
        }
        if (recursive(root.left, sum, val)) {
            return true;
        }
        if (recursive(root.right, sum, val)) {
            return true;
        }
        return false;
    }
}
