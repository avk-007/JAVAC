package Session11withFUnction;

import java.util.function.Function;

public class FUnctionChainingEx2 {
    public static void main(String[] args) {

        Function<String,String> f1=s->s.toUpperCase();
        Function<String,String> f2=s->s.substring(0,5);
        // Function 2: Add " Java" at the end
        Function<String, String> f3 = str -> str.concat(" Java");

//andThen
        Function<String,String> andThen=f1.andThen(f2);
        System.out.println(andThen.apply("hello"));

 //compose
        Function<String,String> compose=f1.compose(f2);
        System.out.println(compose.apply("javaworld"));

        //concat with and then
        Function<String,String> compose2withconcat=f1.compose(f3);
        System.out.println(compose2withconcat.apply("new"));

       // sttatic identity(){} //function
       // Returns a function that always returns its input argument.
        Function<String,String>  sttaticidentity=Function.identity();
        System.out.println(" sttatic identity"+f1.apply("superMario "));

    }
}
