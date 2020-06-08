package com.zarutski.task08;

public class Task08 {

    public static void main(String[] args) {
        double b = 28;
        double h = 3;

        for (double a = 3; a <= b; a += h) {
            System.out.println(funcY(a));
        }
    }

    public static double funcY(double x) {
        double c = 4;
        if (x == 15) {
            return (x + c) * 2;

        } else {
            return (x - c) + 6;
        }
    }
}
