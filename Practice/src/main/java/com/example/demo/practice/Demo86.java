package com.example.demo.practice;

import com.example.demo.practice.common.TreeNode;
import org.springframework.stereotype.Component;

/**
 * @Auther: xintao.feng
 * @Date: 2019/1/4 15:00
 * @Description:二叉树中的最大路径和
 */
@Component
public class Demo86 {
    private static int max = 0;

    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(dfs(root.left), 0);
        int right = Math.max(dfs(root.right), 0);
        max = Math.max(max, left + right + root.val);
        return Math.max(left + root.val, right + root.val);
    }
}
