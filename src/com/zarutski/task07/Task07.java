package com.zarutski.task07;

public class Task07 {

    public static void main(String[] args) {
        double number = 923.486;

        System.out.println(swapParts(number));
    }

    public static double swapParts(double number) {
        double integerPart = Math.floor(number);

        double newFractionalPart = integerPart * 0.001;
        double newIntegerPart = getNewIntegerPart(number);

        return newFractionalPart + newIntegerPart;
    }

    private static double getNewIntegerPart(double num) {
        num = num * 1000;
        int tmpVal = (int) num;

        int newDigits = tmpVal % 10;
        int newTens = (tmpVal / 10) % 10;
        int newHundreds = (tmpVal / 100) % 10;

        return newDigits + (newTens * 10) + (newHundreds * 100);
    }
}
