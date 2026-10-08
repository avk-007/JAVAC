package LEVEL1;

import java.util.Scanner;
//Check whether a character is uppercase, lowercase, digit, or special character.
public class UpperCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.next();
       // char ch = next.charAt(0);

        if (Character.isUpperCase(next.charAt(0))) {
            System.out.println("Upper Case");
        } else if (Character.isLowerCase(next.charAt(0))) {
            System.out.println("Lower Case");
        } else if (Character.isDigit(next.charAt(0))) {
            System.out.println("digit");
        }
        else if (!Character.isLetterOrDigit(next.charAt(0))) {
            System.out.println("special character");
        }

        scanner.close();
    }
}
