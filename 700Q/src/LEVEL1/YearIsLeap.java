package LEVEL1;

import java.util.Scanner;

public class YearIsLeap {

    public static void main(String[] args) {

        System.out.println("year is  " + "");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 400 == 0) {

            // Divisible by 400 means leap year
            System.out.println("Leap year");

            // Check whether the year is divisible by 100
        } else if (year % 100 == 0) {

            // Divisible by 100 but not 400 means normal year
            System.out.println("Normal year");

            // Check whether the year is divisible by 4
        } else if (year % 4 == 0) {

            // Divisible by 4 means leap year
            System.out.println("Leap year");

        } else {

            // Otherwise it is a normal year
            System.out.println("Normal year");
        }

        // Close Scanner
        sc.close();

    }
}
