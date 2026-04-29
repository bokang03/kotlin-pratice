package ch26;

public class Main {
    public static void main(String[] args) {
        String message = "Hello";

        System.out.println("Before: " + message);
        message = message.toUpperCase();
        System.out.println("After: " + message);
    }
}