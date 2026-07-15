package Exceptionns;

public class Demo {

    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("You must be 18 or older.");
        }

        System.out.println("Access Granted");
    }
}