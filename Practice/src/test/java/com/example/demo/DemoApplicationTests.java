package com.example.demo;

import com.example.demo.practice.*;
import com.example.demo.practice.common.TreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    Demo64 test;


    @Test
    public void contextLoads() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(9);
        p.right = new TreeNode(2);
        p.left.left = new TreeNode(8);
        p.left.right = new TreeNode(10);
        String s = test.serialize(null);
        TreeNode root = test.deserialize(s);
        System.out.println(s);
    }

}
