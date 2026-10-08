package LEVEL1;

import java.util.Scanner;

//Print all even numbers from 1 to N.
public class EVENODD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer next = sc.nextInt();

        for (int i = 1; i <= next; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int j = next; j >=0; j--) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
        sc.close();
    }
}
