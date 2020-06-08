package com.zarutski.task05;

public class Task05 {

    public static void main(String[] args) {
        int num = 124;

        System.out.println(ifNegative(num) * sum(num));
        System.out.println(ifNegative(num) * product(num));
        System.out.println(ifNegative(num) * tensAndHundredsSwap(num));
        System.out.println(ifNegative(num) * fourDigitTransform(num));
    }

    public static int sum(int num) {
        return units(num) + tens(num) + hundreds(num);
    }

    public static int product(int num) {
        return units(num) * tens(num) * hundreds(num);
    }

    public static int tensAndHundredsSwap(int num) {
        return tens(num) * 100 + hundreds(num) * 10 + units(num);
    }

    public static int fourDigitTransform(int num) {
        return units(num) * 1000 + num;
    }

    private static int units(int num) {
        return num % 10;
    }

    private static int tens(int num) {
        return (num / 10) % 10;
    }

    private static int hundreds(int num) {
        return num / 100;
    }

    private static int ifNegative(int num) {
        if (num < 0) {
            return -1;
        }
        return 1;
    }

}
