package LEVEL1;

import java.util.Scanner;

// Reverse an integer.
public class ReverseInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n = n / 10;
        }

        System.out.println(reverse);

        sc.close();
    }
}
