package com.example.demo.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/6 14:04
 * @Description:
 */
public class RandomNumber {
    public List<Integer> randomNumber(List<Integer> list){
        Collections.sort(list);
        List<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            if (!result.contains(integer)){
                result.add(integer);
            }
        }
        for (Integer integer : result) {
            System.out.println(integer);
        }
        return result;
    }
}
