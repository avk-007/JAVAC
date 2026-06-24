package Basics;
//class1
public class PrimitiveNonPri {
    public static void main(String[] args) {
        //primitive
        float marks=100f;
        byte b=1;
        int n=1100;
        boolean aBoolean=false;

        System.out.println(aBoolean);


        //literals

        int da= (int) 12e10;
        int n11=1000_11_00;
        int numm1=n11*n11;
        System.out.println(numm1);

        // Integer Literal
        int age = 25;

        // Long Literal
        long population = 8000000000L;

        // Floating Point Literal
        float price = 99.99f;
        double pi = 3.14159;

        // Character Literal
        char grade = 'A';

        // String Literal
        String name = "Abhi";

        // Boolean Literal
        boolean isJavaFun = true;

        // Null Literal
        String address = "a block";

        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Price: " + price);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);
        System.out.println("Is Java Fun: " + isJavaFun);
        System.out.println("Address: " + address);

        //type casting

        byte b11= (byte) 1299;
        char cc=(char)2;

        String strr="1";

        //loose .4 will be removed
        int x= (int) 1.4f;
        System.out.println(x);

        //type promotion
        byte a11=11;
        byte b12=2;
        int resile=a11*b12;
        System.out.println(resile);
    }


}
