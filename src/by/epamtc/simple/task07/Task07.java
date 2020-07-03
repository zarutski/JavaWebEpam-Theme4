package by.epamtc.simple.task07;

public class Task07 {

    public static void main(String[] args) {
        double number = 923.486;
        System.out.println(swapIntegerFractionalParts(number));
    }

    public static double swapIntegerFractionalParts(double number) {
        double fractionalPart = Math.floor(number) * 0.001;
        double integerPart = (number * 1000) % 1000;

        return fractionalPart + integerPart;
    }
}