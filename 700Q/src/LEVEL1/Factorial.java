package LEVEL1;

import java.util.Scanner;

//Calculate factorial of N.
//example 5! =>5*4*3*2*1

//note for larger number use Biginteger everywhere
public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        int factorial=1;

        for (int i=1;i<=fact;i++) {
            factorial=factorial*i;
        }
        System.out.println(factorial);

    }

 /*   //Biginteger
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
        factorial = factorial.multiply(BigInteger.valueOf(i));
    }

        System.out.println(factorial);

        sc.close();*/


}
