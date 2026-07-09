package Basics;

public class ternry {
    public static void main(String[] args) {

        int n=4 ;
    int result1 =0;
    boolean result2 = Boolean.parseBoolean(null);
      /*
        if (n%2==0)
            result=10;
        else
            result=20;
        System.out.println(result);*/

        //ternary
        result1 = n%2==0 ? 10:20;
        result2 = n%2==0 ? true:false;
        System.out.println(result1);
        System.out.println(result2);
    }
}
