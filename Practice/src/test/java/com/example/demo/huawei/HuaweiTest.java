package com.example.demo.huawei;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Find;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(e.expressionEvaluation("2*(3+4)"));
    }

    @Test
    public void lastWordLengthTest() {
        TheLastWordLength t = new TheLastWordLength();
        System.out.println(t.lastWordLength("hello world"));
    }

    @Test
    public void randomNumberTest() {
        RandomNumber r = new RandomNumber();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(32);
        list.add(67);
        list.add(40);
        list.add(20);
        list.add(89);
        list.add(300);
        list.add(400);
        list.add(15);

        r.randomNumber(list);
    }

    @Test
    public void hexadecimalToDecimalTest() {
        HexadecimalToDecimal h = new HexadecimalToDecimal();
        h.hexadecimalToDecimal("0x76E");
    }

    @Test
    public void primeFactorsTest() {
        PrimeFactors p = new PrimeFactors();
        p.getPrimeFactors(108);
    }

    @Test
    public void getApproximationTest() {
        Approximation a = new Approximation();
        a.getApproximation(5.5);
    }

    @Test
    public void nonrepeatingIntegersTest() {
        NonrepeatingIntegers n = new NonrepeatingIntegers();
        n.getNonrepeatingIntegers(9876673);
    }

    @Test
    public void findSeven() {
        FindSeven f = new FindSeven();
        System.out.println(f.findSeven(15929));
    }

    @Test
    public void addTest() {
        Add a = new Add();
        System.out.println(a.add("-9876543210", "-1234567890"));
    }

    @Test
    public void stringMultiplyTest() {
        StringMultiply s = new StringMultiply();
        System.out.println(s.multiply("888", "9999"));
    }

    @Test
    public void simpleKeyBoardTest() {
        SimpleKeyBoard s = new SimpleKeyBoard();
        System.out.println(s.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"));
    }

    @Test
    public void lisp() {
        Lisp l = new Lisp();
        l.evaluate("(mult 3 (add 2 3))");
    }

    @Test
    public void decodeString() {
        DecodeString decodeString = new DecodeString();
        System.out.println(decodeString.decodeString("100[leetcode]"
        ));
    }

    @Test
    public void longestValidParentheses(){
        LongestValidParentheses l = new LongestValidParentheses();
        l.longestValidParentheses(")()())");
    }
}
