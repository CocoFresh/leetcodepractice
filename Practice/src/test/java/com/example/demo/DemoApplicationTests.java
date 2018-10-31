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
    Demo32 test;


    @Test
    public void contextLoads() {
        test.minSubArrayLen(11, new int[]{1, 2, 3, 4, 5});
    }

}
