package com.zarutski.task03;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
        double a = -21;
        double b = 17;
        double c = -3;

        double[] abc = operateData(a, b, c);
        double[] dataSet = operateData(7, 4, 3);

        System.out.println(Arrays.toString(abc));
        System.out.println(Arrays.toString(dataSet));
    }

    public static double[] operateData(double a, double b, double c) {
        if (a > b && b > c) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }

        return new double[]{a, b, c};
    }
}
