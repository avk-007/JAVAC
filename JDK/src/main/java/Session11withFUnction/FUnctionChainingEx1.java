package Session11withFUnction;

import java.util.function.Function;

/* "FUNCTION CHAINING" ::
 ----------------------
1.combined 2 or more functions in a single function is called Function chaining..

2.THERE are 2 methods to perform function chaining
a.compose()
b.andThen()
3.these 2 methods are default methods and input and output both is function
4.examples::
andThen()
  f1.andThen(f2); //first f1 will be applied followed by f2 will be applied
compose()
 f1.compose(f2); f2 will be applied followed by f1.

5-Functional interface will have 1 abstarct method,2 default method and 1 static method
 methods:;
 apply(); //method
 compose(){} //function
 sttatic identity(){} //function
 andThen(){} //function

 {} --function sign

 */
public class FUnctionChainingEx1 {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = i -> i + 1;

        // Second function
        Function<Integer, Integer> f2 = i -> i * 2;

        // andThen()
        // First f1, then f2
        Function<Integer, Integer> andThen = f1.andThen(f2);

        System.out.println(andThen.apply(5));

        // compose()
        // First f2, then f1
        Function<Integer, Integer> compose = f1.compose(f2);

        System.out.println(compose.apply(5));
    }
}
