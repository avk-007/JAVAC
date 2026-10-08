package LEVEL1;

import java.util.Scanner;

//Print numbers from 1 to N.
public class oneToN {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Integer onetoN = scanner.nextInt();

        for ( int i=1; i <=onetoN; i++) {
            System.out.println(i);
        }

      //  Print numbers from N to 1.
        Integer nto1 = scanner.nextInt();
        for ( int j=nto1; j >=1; j--) {
            System.out.println(j);
        }




    }
}
