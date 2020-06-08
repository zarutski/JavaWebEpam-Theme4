package com.zarutski.task01;

import static java.lang.Math.*;

public class Task01 {

    public static void main(String[] args) {
        System.out.println(expressionValue(1, 2, 0));
    }

    public static double expressionValue(double a, double b, double c) {
        if (a == 0 || b == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return ((b + sqrt(pow(b, 2) + 4 * a * c)) / 2 * a) - pow(a, 3) * c + pow(b, -2);
    }
}