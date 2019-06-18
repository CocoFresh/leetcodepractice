package com.example.demo.practice.first;

import com.example.demo.practice.common.TreeNode;
import org.springframework.stereotype.Component;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @Auther: xintao.feng
 * @Date: 2019/1/3 16:56
 * @Description:二叉树的最近公共祖先
 */
@Component
public class Demo85 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //通过栈先找到一个叶子节点的全部祖先
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> ancestor = new Stack<>();
        stack.push(root);
        boolean flag = false;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            ancestor.push(node);
            if (node.val == p.val) {
                flag = true;
                break;
            }
            if (node.val == q.val) {
                break;
            }
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        //遍历所有祖先节点，一旦找到它的子节点和另一个节点相同就返回
        if (flag) {
            while (!ancestor.isEmpty()) {
                TreeNode node = ancestor.pop();
                if (dfs(node, q)) {
                    return node;
                }
            }
        } else {
            while (!ancestor.isEmpty()) {
                TreeNode node = ancestor.pop();
                if (dfs(node, p)) {
                    return node;
                }
            }
        }
        return null;
    }

    private boolean dfs(TreeNode node, TreeNode q) {
        if (node == null) {
            return false;
        }
        if (node.val == q.val) {
            return true;
        }
        if (dfs(node.left, q)) {
            return true;
        }
        if (dfs(node.right, q)) {
            return true;
        }
        return false;
    }


}

