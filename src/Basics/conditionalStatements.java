package Basics;
//class3
public class  conditionalStatements {
    public static void main(String[] args) {

/*        //3 values compare
        int x= 8;
        int y=7;
        int z=9;
        if(x>z &x>z){
        System.out.println(x);
        }
        else if (y>x && y>z){
            System.out.println(y);
        }
        else
            System.out.println(z);*/

        //4 even odd
        int n = 5;
        int result = 0;

/*  if (n%2==0)
      result=10;
  else
      result=20;
        System.out.println(result);*/

/*//other way /4 even odd with ternary operator n%2==0?10:20;

        result= n%2==0?10:20;
        System.out.println(result);*/

        //print of your choice
        int n1 = 2;
        if (n1 == 1)
            System.out.println("mon");
        else if (n1 == 2)
            System.out.println("tue");
        else if (n1 == 3)
            System.out.println("wed");
        else
            System.out.println("thur");

        //print of your choice or you can use switch as alternative
        //lets write everything in switch case with break
        int m = 6;
        switch(m){
            case 1:
                System.out.println("mond");
                break;
            case 2:
                System.out.println("tuess");
                break;
            case 3:
                System.out.println("weddd ");
                break;
//if none of the case is matching use default will npt print anything
            default:

        }
}
}



/*//2 values
        //if else elseif
        int x= 30;
        int y=8;

        if (x>y){
        System.out.println(x);
        System.out.println("hello x");
        }
        else{
            System.out.println(y);
        }*/

/*
//1
        int x = 18;
        if (x > 6 && x<=20)
            System.out.println("hello");
        else
            System.out.println("bye");
*/
