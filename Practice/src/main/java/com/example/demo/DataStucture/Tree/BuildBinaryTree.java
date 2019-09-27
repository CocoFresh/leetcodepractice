package com.example.demo.DataStucture.Tree;

import com.example.demo.practice.common.TreeNode;
import org.springframework.stereotype.Component;

/**
 * @Auther: xintao.feng
 * @Date: 2019/9/17 14:38
 * @Description: 从中序与后序遍历序列构造二叉树
 */
@Component
public class BuildBinaryTree {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, postorder, postorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int postend, int instart, int inend) {
        if (instart > inend) {
            return null;
        }
        int rootVal = postorder[postend];
        TreeNode root = new TreeNode(rootVal);

        int index = 0;
        for (int i = instart; i <= inend; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }
        root.left = build(inorder, postorder, postend - (inend - index) - 1, instart, index - 1);
        root.right = build(inorder, postorder, postend - 1, index + 1, inend);
        return root;
    }
}
