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
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    Demo76 test;


    @Test
    public void contextLoads() {
        test.spiralOrder(new int[][]{
                {3},
                {6}
        });
    }

}
