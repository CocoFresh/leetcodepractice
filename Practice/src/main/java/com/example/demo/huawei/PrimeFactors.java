package com.example.demo.huawei;

/**
 * @Auther: xintao.feng
 * @Date: 2020/1/6 15:36
 * @Description:
 */
public class PrimeFactors {
    public String getPrimeFactors(long num) {
        boolean[] primes = new boolean[(int) (num+1)];
        for(int i = 2; i < (num+1) / 2; i++){
            if(!primes[i]){
                for(int j = i; i * j < (num+1); j++){
                    primes[i*j] = true;
                }
            }
        }
        for (int i = 2; i < primes.length; i++) {
            if (!primes[i]){
                System.out.println(i);
            }
        }
        StringBuilder res = new StringBuilder();
        int index = 2;
        while (num != 1) {
            if (num % index == 0) {
                res.append(index).append(" ");
                num /= index;
            } else {
                index++;
            }
        }
        System.out.println(res.toString());
        return res.toString();
    }
}
