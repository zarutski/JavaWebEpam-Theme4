package by.epamtc.simple.task03;

public class DataSet {
    public double a;
    public double b;
    public double c;

    public DataSet(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "DataSet: " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c;
    }
}
