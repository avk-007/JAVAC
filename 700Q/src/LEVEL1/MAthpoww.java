package LEVEL1;

import java.util.Scanner;
// Calculate a^b without using Math.pow().
//2^5 = 2 × 2 × 2 × 2 × 2 = 32
public class MAthpoww {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter Base");
        int base = sc.nextInt();

        System.out.println("enter power");
        int power= sc.nextInt();

        int result=1;

        for (int i = 1; i <= power; i++) {
            result=result*base;

        }
        System.out.println(result);
        sc.close();
    }
}
