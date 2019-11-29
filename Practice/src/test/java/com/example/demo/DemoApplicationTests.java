package com.example.demo;

import com.example.demo.DataStucture.Tree.BuildBinaryTree2;
import com.example.demo.DataStucture.Tree.PathSum;
import com.example.demo.easy.string.Palindrome;
import com.example.demo.practice.common.TreeNode;
import com.example.demo.practice.second.*;
import com.lowagie.text.DocumentException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    Solution_825 test;

    @Autowired
    PathSum pathSum;

    @Autowired
    BuildBinaryTree2 buildBinaryTree2;

    @Test
    public void testPathSum() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(11);
//        root.left.left.left = new TreeNode(7);
//        root.left.left.right = new TreeNode(2);
        Assert.assertTrue(pathSum.hasPathSum(root, -1));
    }

    @Test
    public void buildTree() {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        buildBinaryTree2.buildTree(preorder, inorder);
    }

    //回文数测试
    @Test
    public void testPalindrome() {
        Palindrome palindrome = new Palindrome();
        Assert.assertTrue(palindrome.isPalindrome(121));
    }

    @Test
    public void testReverseWords() {

    }
//    @Test
//    public void picConvert() throws IOException, DocumentException {
//        String path = "D:\\PIC";
//        String outPath = "D:\\Demo\\";
//        test.getFileList(path, outPath);
//    }

//    @Test
//    public void contextLoads() {
//        test.longestCommonPrefix(new String[]{
//                "dog", "racecar", "car"
//        });
//    }
//
//    @Test
//    public void print() {
//        String s = "Welcome";
//        int i = 0;
//        while (i < s.length()) {
//            System.out.println(s.charAt(i));
//        }
//        for (int j = 0; j < s.length(); j++) {
//            System.out.println(s.charAt(j));
//        }
//        switch (i){
//
//        }
//    }
}
