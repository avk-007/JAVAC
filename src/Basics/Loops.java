package Basics;
//class4
public class Loops {
    public static void main(String[] args) {
 /*       int  i=1;
        while (i<=4){
            System.out.println("Hi " + i );
            i++;
        }
        //when i=5 it becomes false checked this in debug mode puuted breakpoint in while
        //op value of i is 5 with bye
        System.out.println("Bye" + i);*/


        //with nested while loop for every 4 hi we need 3 hello
        int  i=1;
        while (i<=4)
        {
            System.out.println(" Hi " + i);
            //inner loop
            int j=1;
            while(j<=3) {
                System.out.println(" Hello " + j);
                j++;
                ////inner loop upto here
            }
            i++;
        }
        //when i=5 it becomes false checked this in debug mode put breakpoint in while
        //op value of i is 5 with bye
        System.out.println("Bye" + i);

        //do while loop if while (k<=4) is true lets condn be false still execute even once if it false
        int  k=5;

        do {
            System.out.println("Hi Abhishek " + k);
            k++;
        }while (k<=5);

    }
    }
