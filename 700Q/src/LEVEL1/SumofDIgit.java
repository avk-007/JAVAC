package LEVEL1;

import java.util.Scanner;

//Find the sum of digits of a number.
public class SumofDIgit {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int sum=0;
            while (n>0){
                int digit = n % 10; // Get the last digit

                sum = sum + digit;  // Add it to the sum
                n = n / 10;
            }
            System.out.println(sum);
        }
    }

/*
Pattern to Remember
Every digit problem follows this structure:
while (n > 0) {
    int digit = n % 10; // Extract last digit
    // Process digit
    n = n / 10;         // Remove last digit
}
Count digits → count++
Sum digits → sum += digit
Reverse number → reverse = reverse * 10 + digit
Palindrome → Reverse the number, then compare
Armstrong → Add digit raised to a power
Strong number → Add the factorial of each digit
*/