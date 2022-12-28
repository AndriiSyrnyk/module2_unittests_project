package goit.javadeveloper;

public class SumCalculator {
    public int sum(int n) {
        if (n != 0) return (n + n * n) / 2;
        else throw new IllegalArgumentException();
    }
}
