package com.example.demo.practice.first;

import com.example.demo.practice.common.TreeNode;

/**
 * @author xintao.feng
 * @date 2018/9/12.
 */
public class Demo07 {

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return 1 + Math.max(left, right);
        }
    }
}
