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
    Demo33 test;


    @Test
    public void contextLoads() {
        test.threeSum(new int[]{0,3,0,1,1,-1,-5,-5,3,-3,-3,0});
    }

}
