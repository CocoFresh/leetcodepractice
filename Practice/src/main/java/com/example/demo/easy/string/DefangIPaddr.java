package com.example.demo.easy.string;

/**
 * @Auther: xintao.feng
 * @Date: 2019/12/24 15:03
 * @Description: 1108. IP 地址无效化
 */
public class DefangIPaddr {
    public String defangIPaddr(String address) {
        address = address.replace(".","[.]");
        return address;
    }
}
