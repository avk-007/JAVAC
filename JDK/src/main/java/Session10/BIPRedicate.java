package Session10;

import java.util.function.BiPredicate;

public class BIPRedicate {
//there is no equals method avaialable in BiPredicate
    //always true or false will come
    public static void main(String[] args) {

        BiPredicate<Integer,Integer> p1=(a,b)->(a+b)%2==0;
        System.out.println(p1.test(2,2));


    }
}
