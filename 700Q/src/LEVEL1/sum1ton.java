package LEVEL1;

import java.util.Scanner;

// Find the sum of numbers from 1 to N.
public class sum1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer next = sc.nextInt();
        int sum =0;
        for (int i = 1; i <= next; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
