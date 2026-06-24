package Basics;
//class2
public class operators {

    public static void main(String[] args) {
        //logical < > = !
        // | o  r & and ! not

        int a1=1;
        int i=2;
        int a =2;
        int b=9;
         boolean result=a1>i &&   a<b;// true
        boolean result1=a1>i || a<b;
        System.out.println(result);
        System.out.println(result1);

        if (a1>i) {
            System.out.println("a1 is greater");
        }else{
            System.out.println("i is greater");
        }
    }
}


