package LEVEL1;

import java.util.Scanner;

// Find the product of digits of a number.
public class Productofdigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mult = 1;
        while (n > 0) {
            int digit = n % 10; // Get the last digit

            mult = mult * digit;
            n = n / 10;
        }
        System.out.println(mult);
    }
}