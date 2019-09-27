package com.example.demo.DataStucture.Tree;

import com.example.demo.practice.common.TreeNode;
import org.springframework.stereotype.Component;

/**
 * @Auther: xintao.feng
 * @Date: 2019/9/18 17:01
 * @Description: 从前序与中序遍历序列构造二叉树
 */
@Component
public class BuildBinaryTree2 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(inorder, preorder, 0, 0, inorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] preorder, int prestart, int instart, int inend) {
        if (instart > inend) {
            return null;
        }
        int rootVal = preorder[prestart];
        TreeNode root = new TreeNode(rootVal);

        int index = 0;
        for (int i = instart; i <= inend; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }
        root.left = build(inorder, preorder, prestart + 1, instart, index - 1);
        root.right = build(inorder, preorder, prestart + (index - instart) + 1, index + 1, inend);
        return root;
    }
}
