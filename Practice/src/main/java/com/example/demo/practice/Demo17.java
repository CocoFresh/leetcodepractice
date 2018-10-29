package com.example.demo.practice;

import com.example.demo.practice.common.TreeNode;
import org.springframework.stereotype.Component;

/**
 * 合并二叉树
 *
 * @author xintao.feng
 * @date 2018/10/17.
 */
@Component
public class Demo17 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return t1 == null ? t2 : t1;
        }
        t1.val += t2.val;
        mergeTrees(t1.left, t2.left);
        mergeTrees(t1.right, t2.right);
        if (t1.left == null && t2.left != null) {
            t1.left = t2.left;
        }
        if (t1.right == null && t2.right != null) {
            t1.right = t2.right;
        }
        return t1;
    }
}
