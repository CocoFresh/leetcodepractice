package com.example.demo;

import com.example.demo.practice.Demo01;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	Demo01 demo01;
	@Test
	public void contextLoads() {

	}

}
