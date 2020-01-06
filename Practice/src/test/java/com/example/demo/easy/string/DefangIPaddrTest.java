package com.example.demo.easy.string;

import org.junit.Test;

/**
 * @Auther: xintao.feng
 * @Date: 2019/12/24 15:09
 * @Description:
 */
public class DefangIPaddrTest {
    @Test
    public void test(){
        DefangIPaddr de = new DefangIPaddr();
        System.out.println(de.defangIPaddr("1.1.1.1"));
    }
}
