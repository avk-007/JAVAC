package Session10;


/*""autoboxing and auto-unboxing""
autoboxing   -->primitive to wrapper Object conversion is autoboxing
auto-unboxing-->wrapper Object to primitive conversion is auto-unboxing*/

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class Autoboxingandunboxing {
    public static void main(String[] args) {

        int[] x={10,20,30,40,50,60};
        //condition
        Predicate<Integer> p1= (i)->i%2==0;

        //enhanced for loop
        for (int x1 : x){
            if(p1.test(x1)){
                System.out.println(x1);
            }
        }

 /*       //PRimitive Predicate::
        while peroforming conditional checks the developer forcing to do the autoboxing and unboxing
        which will cause the performace issue
        to overcome this problems we should use Primitive Predicate interface

        EX--IntPredicate,LongPredicate,DoublePredicate*/


        //IntPredicate example
        //no boxing auto bxing will happend in this IntPredicate
        IntPredicate p2= i->i%2==0; //result is int
        for (int x2 : x){
            if (p2.test(x2)){ //x2 is int value
                System.out.println("IntPredicate"+":"+x2);
            }
        }

        //LongPredicate
        LongPredicate p3= i->i%2==0;
        for (int x3 : x){
            if (p3.test(x3)){
                System.out.println("LongPredicate"+":"+x3);
            }
        }

        //DoublePredicate
        DoublePredicate p4= i->i%2==0;
        for (int x4 : x) {
            if (p4.test(10.0)) {
                System.out.println("DoublePredicate" + ":" + 10.0);
            }
        }
    }
}
