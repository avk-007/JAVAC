package LEVEL1;

import java.util.Scanner;

//Read two numbers and perform +, -, *, / and %.
public class Read {

    public static void main(String[] args) {
        Scanner scanner= new  Scanner(System.in);
        System.out.println("addition");

        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the 2nd number");
        int num2 = scanner.nextInt();

        System.out.println(num1+num2+"op"+" ");
    }
}
