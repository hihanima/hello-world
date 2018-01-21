package com.hi.utils;

/**
 * Created by genius on 2018/1/21.
 */
public class Math {
    public int factorial(int n){
        if(n<0){
            throw new RuntimeException("负数没有阶乘");
        } else if (n <= 1) {
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
}
