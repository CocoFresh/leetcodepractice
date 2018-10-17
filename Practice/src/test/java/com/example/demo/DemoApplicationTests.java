package com.example.demo;

import com.example.demo.practice.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    Demo14 test;

    @Test
    public void contextLoads() {
        test.hammingDistance(1, 4);
    }

}
