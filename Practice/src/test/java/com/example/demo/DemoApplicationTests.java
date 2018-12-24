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
    Demo79 test;


    @Test
    public void contextLoads() {
        char board[][] = {
//                {'o', 'a', 'a', 'n'},
//                {'e', 't', 'a', 'e'},
//                {'i', 'h', 'k', 'r'},
//                {'i', 'f', 'l', 'v'}
                {'a'}
        };
        String[] words = {
//                "oath", "pea", "eat", "rain"
                "a", "a"
        };

        test.findWords(board, words);
    }

}
