package ch32;

class MathUtils {
    public static final double PI = 3.14159;

    public static int square(int x) {
        return x * x;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("PI: " + MathUtils.PI);
        System.out.println("Square of 4: " + MathUtils.square(4));
    }
}