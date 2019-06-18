package com.example.demo;

import com.example.demo.practice.second.Solution_02;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    Solution_02 test;


    @Test
    public void contextLoads() {
        test.longestCommonPrefix(new String[]{
                "dog", "racecar", "car"
        });
    }

    @Test
    public void print() {
        String s = "Welcome";
        int i = 0;
        while (i < s.length()) {
            System.out.println(s.charAt(i));
        }
        for (int j = 0; j < s.length(); j++) {
            System.out.println(s.charAt(j));
        }
        switch (i){

        }
    }
}
