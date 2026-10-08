package LEVEL1;

import java.util.Scanner;

//Count the number of digits in an integer.
public class count {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
       while (n>0){
           n=n/10;
           count++;
       }
        System.out.println(count);

    }
}
