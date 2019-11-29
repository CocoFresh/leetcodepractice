package com.example.demo.difficul.string;

import com.example.demo.difficult.dynamic.Regular_expression_matching;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: xintao.feng
 * @Date: 2019/11/27 10:28
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Regular_expression_matching_test {
    @Test
    public void test() {
        Regular_expression_matching regular_expression_matching = new Regular_expression_matching();
        Assert.assertTrue(regular_expression_matching.isMatch("aab","a*b"));
    }
}
