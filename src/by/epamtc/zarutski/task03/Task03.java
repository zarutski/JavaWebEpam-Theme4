package by.epamtc.zarutski.task03;

public class Task03 {

    public static void main(String[] args) {
        DataSet dataSet = new DataSet(42, 4, -5);
        performDataOperations(dataSet);

        System.out.println(dataSet);
    }

    public static void performDataOperations(DataSet dataSet) {
        double a = dataSet.getA();
        double b = dataSet.getB();
        double c = dataSet.getC();

        if ((a > b) && (b > c)) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }

        dataSet.setA(a);
        dataSet.setB(b);
        dataSet.setC(c);
    }
}
