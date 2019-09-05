package com.example.demo;

import com.example.demo.practice.second.*;
import com.lowagie.text.DocumentException;
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


    @Test
    public void testReverseWords() {
        int[] nums = {98, 60, 24, 89, 84, 51, 61, 96, 108, 87, 68, 29, 14, 11, 13, 50, 13, 104, 57, 8, 57, 111, 92, 87, 9, 59, 65, 116, 56, 39, 55, 11, 21, 105, 57, 36, 48, 93, 20, 94, 35, 68, 64, 41, 37, 11, 50, 47, 8, 9};
        System.out.println(test.numFriendRequests(nums));
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
