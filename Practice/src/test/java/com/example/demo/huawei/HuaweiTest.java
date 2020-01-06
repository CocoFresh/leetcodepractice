package com.example.demo.huawei;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/3 13:33
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HuaweiTest {
    @Test
    public void invert() {
        InvertNumber in = new InvertNumber();
        System.out.println(in.invert(1516000));
    }

    @Test
    public void expressionTest() {
        ExpressionEvaluation e = new ExpressionEvaluation();
        e.expressionEvaluation("2*(9+6/3-5)+4");
    }
}
