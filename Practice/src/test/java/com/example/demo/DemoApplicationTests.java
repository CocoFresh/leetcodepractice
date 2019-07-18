package com.example.demo;

import com.example.demo.practice.second.PicLoader;
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
    PicLoader test;


    @Test
    public void picConvert() throws IOException, DocumentException {
        String path = "D:\\PIC";
        String outPath = "D:\\Demo\\";
        test.getFileList(path, outPath);
    }

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
