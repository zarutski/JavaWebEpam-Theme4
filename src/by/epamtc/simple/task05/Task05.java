package by.epamtc.simple.task05;

public class Task05 {

    public static void main(String[] args) {
        int num = 124;

        int sum = calcDigitsSum(num);
        int product = calcDigitsProduct(num);
        int swapped = swapTensAndHundreds(num);
        int transformed = transformIntoFourDigits(num);

        System.out.println(sum);
        System.out.println(product);
        System.out.println(swapped);
        System.out.println(transformed);
    }

    public static int calcDigitsSum(int num) {
        return selectUnits(num) + selectTens(num) + selectHundreds(num);
    }

    public static int calcDigitsProduct(int num) {
        return selectUnits(num) * selectTens(num) * selectHundreds(num);
    }

    public static int swapTensAndHundreds(int num) {
        return selectTens(num) * 100 + selectHundreds(num) * 10 + selectUnits(num);
    }

    public static int transformIntoFourDigits(int num) {
        return selectUnits(num) * 1000 + num;
    }

    private static int selectUnits(int num) {
        return num % 10;
    }

    private static int selectTens(int num) {
        return (num / 10) % 10;
    }

    private static int selectHundreds(int num) {
        return num / 100;
    }
}
