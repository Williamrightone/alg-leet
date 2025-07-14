package com.william.top150.hashmap;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {


    }

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false; // 進入死循環
            }
            seen.add(n);
            n = getNext(n);
        }

        return true;
    }

    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

}
