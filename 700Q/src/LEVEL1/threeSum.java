package LEVEL1;
//Find the largest of three numbers.
public class threeSum {
    public static void main(String[] args) {

        int num1=99;
        int num2=66;
        int num3=73;
        int num4=33;
        int num5=33;

//1st way simple approach
        // Check if num1 is greater than both num2 and num3
        if (num1 > num2 && num1 > num3) {

            // num1 is the largest
            System.out.println("Largest number: " + num1);

            // Check if num2 is greater than both num1 and num3
        } else if (num2 > num1 && num2 > num3) {

            // num2 is the largest
            System.out.println("Largest number: " + num2);

            // Otherwise, num3 is the largest
        } else {
            System.out.println("Largest number: " + num3);
        }

        //otherway
        int max = Math.max((num1), Math.max(num2, num3));
        System.out.println(max);

        //smallest of three

        int min = Math.min((num1), Math.max(num2, num3));
        System.out.println(min);

    }
}
