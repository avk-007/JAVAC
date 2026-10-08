package LEVEL1;


public class swap {
    public static void main(String[] args) {
/*        //. Swap two numbers using a third variable.
        int num1=4;
        int num2=6;
        System.out.println(num1);
        System.out.println(num2);

//third variable
      int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("op");
        System.out.println(num1);
        System.out.println(num2);*/

//    Swap two numbers without using a third variable.
        int num1=60;
        int num2=40;
        System.out.println(num1);
        System.out.println(num2);
         num1=num1+num2;
         num2=num1-num2;
         num1=num1-num2;
        System.out.println("op");
        System.out.println(num1);
        System.out.println(num2);

    }
}
