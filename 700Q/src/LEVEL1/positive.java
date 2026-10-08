package LEVEL1;

import java.util.Scanner;

public class positive{
  //  Check whether a number is positive, negative, or zero.
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1==0){
            System.out.println("zero");

        } else if (num1>0) {
            System.out.println("positive");

        } else if (num1<0) {
            System.out.println("negative");
        }
        {

        }
    }
}
