package LEVEL1;

import java.util.Scanner;
//. Find the difference between the largest and smallest digit of a number.

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int largest = 0;
        int smallest = 9;

        while (n > 0) {

            int digit = n % 10;

            if (digit > largest) {
                largest = digit;
            }

            if (digit < smallest) {
                smallest = digit;
            }
/*            largest = Math.max(largest, digit);
            smallest = Math.min(smallest, digit);*/
            n = n / 10;

        }
        System.out.println("Largest Digit = " + largest);
        System.out.println("Smallest Digit = " + smallest);
        System.out.println("Difference = " + (largest - smallest));

        sc.close();
    }
}
