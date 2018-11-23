package com.example.demo.practice;

import java.util.LinkedList;
import java.util.List;

/**
 * 验证二叉搜索树
 *
 * @author xintao.feng
 * @date 2018/11/3.
 */
public class Demo34 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        List<Integer> list = new LinkedList<>();
        a(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private void a(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        a(root.left, list);
        list.add(root.val);
        a(root.right, list);
    }
}
