package com.example.demo.practice;

import com.example.demo.practice.common.TreeNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉搜索树中第K小的元素
 */
@Component
public class Demo68 {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> max = new ArrayList<>();
        kthSmallestItera(root, k, max);
        return max.get(--k);
    }

    private int kthSmallestItera(TreeNode root, int k, List<Integer> max) {
        if (root == null) {
            return 0;
        }
        kthSmallestItera(root.left, k, max);
        max.add(root.val);
        kthSmallestItera(root.right, k, max);
        return 0;
    }
}
