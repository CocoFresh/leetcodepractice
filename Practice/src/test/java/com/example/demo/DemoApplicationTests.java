package com.example.demo;

import com.example.demo.practice.*;
import com.example.demo.practice.common.Interval;
import com.example.demo.practice.common.ListNode;
import com.example.demo.practice.common.TreeLinkNode;
import com.example.demo.practice.common.TreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    Demo86 test;


    @Test
    public void contextLoads() {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(1);
        left.left = new TreeNode(6);
        left.right = new TreeNode(2);
        right.left = new TreeNode(0);
        right.right = new TreeNode(8);
        left.right.left = new TreeNode(7);
        left.right.right = new TreeNode(4);
        root.left = left;
        root.right = right;
        System.out.println(test.maxPathSum(new TreeNode(-3)));
    }
}
