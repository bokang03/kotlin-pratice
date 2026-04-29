package ch27;

public class Main {
    public static void main(String[] args) {
        int result = compute(5);
        System.out.println("Result: " + result);
    }

    public static int compute(int x) {
        return x * 2 + 10;
    }
}
