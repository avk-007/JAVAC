package LEVEL1;

import java.util.Scanner;

//. Check whether a number is even or odd.
public class EvnOdd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }


    }
}
