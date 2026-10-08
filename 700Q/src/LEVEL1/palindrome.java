package LEVEL1;

import java.util.Scanner;

public class palindrome {
//A palindrome number is a number that reads the same forward and backward.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;

            reverse = reverse*10 + digit;

            n = n / 10;
        }

        if (original==reverse){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
        sc.close();
    }
}