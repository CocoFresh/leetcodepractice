package com.example.demo.practice;

import com.example.demo.practice.common.TreeNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 中序遍历二叉树(迭代法)
 */
@Component
public class Demo60 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode p = root.left;
        while (!stack.empty()) {
            if (p == null) {
                p = stack.pop();
                list.add(p.val);
                p = p.right;
            }
            if (p != null) {
                stack.push(p);
                p = p.left;
            }
        }
        return list;
    }
}
