package LEVEL1;

import java.util.Scanner;

//Find the sum of all even numbers from 1 to N.
public class Sumofeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int evenSum=0;
        int oddSum=0;

        for (int j=1;j<=i;j++){

            if (j%2==0){
                System.out.println("Even"+j);
                evenSum=evenSum+j;
            }
            //for sum of odd
            else if(j%2!=0){
                System.out.println("odd"+j);
                oddSum=oddSum+j;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
        sc.close();
    }
}
