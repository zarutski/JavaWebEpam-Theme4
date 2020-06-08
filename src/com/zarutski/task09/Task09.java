package com.zarutski.task09;

public class Task09 {

    public static void main(String[] args) {
        System.out.println(countFunc(10));
    }

    public static long countFunc(long n) {
        long result = 1;
        long sum = 1;

        for (int i = 2; i <= n; i++) {
            sum += i;
            result *= sum;
        }
        return result;
    }
}
