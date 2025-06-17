package com.william.alg;

import java.util.ArrayList;
import java.util.List;

/**
 * 遞迴（Recursion）是一種在函數內部調用自身的編程技術。
 * 尾遞迴（Tail Recursion）是遞迴的一種特殊形式，其中遞迴調用是函數的最後一個操作。
 */
public class Recursion {

    public static void main(String[] args) {
        fibonacciPolynomial(10);
    }

    /**
     * 斐波那契數列以 Tail Recursion 實作
     * 第 n 項的值等於前兩項的和，通常定義為 F(0) = 0, F(1) = 1。
     * @param n
     */
    public static void fibonacciPolynomial(int n) {

        List<Integer> fibonacciPolynomial = new ArrayList<>();

        for(int i = 0; i< n; i++){
            if(i==0){
                fibonacciPolynomial.add(0);
            } else if (i==1) {
                fibonacciPolynomial.add(1);
            } else {
                // F(n) = F(n-1) + F(n-2)
                int nextValue = fibonacciPolynomial.get(i - 1) + fibonacciPolynomial.get(i - 2);
                fibonacciPolynomial.add(nextValue);
            }
        }

        System.err.println("斐波那契數列: " + fibonacciPolynomial);
        System.err.println("斐波那契數列第 " + n + " 項 : " + fibonacciPolynomial.get(n - 1));

    }


}
