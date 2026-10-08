package LEVEL1;

import java.util.Scanner;

//Print the multiplication table of a number.
public class multiplication {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int mult = sc.nextInt();
        for (int i=1;i<=10;i++){
            int i1 = mult * i;
            System.out.println(i1);
        }

    }
}
