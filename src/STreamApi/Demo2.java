package STreamApi;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class Demo2 {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,7,3,2,6);

    /*    Consumer<Integer> consumer=new Consumer<Integer>() {
            public void accept(Integer o) {
            }
        };*/
        //in lambda expression

       // Consumer<Integer> consumer=(Integer integer) -> System.out.println(integer);
        //Consumer<Integer> consumer=(Integer integer) ->
        //as foreach takes interface Consumer
        //for each needs an object

        //usually a side effect such as prinitjng,logging,updating an external object

        //single line with lambda expression priniting
     //   nums.forEach(n->System.out.println(n));

     /*   //with stream APi
        Stream<Integer> stream1 = nums.stream();
        //stream1 is being used with for each
        //we can only once we can use streams object with foreach
       // stream1.forEach(n->System.out.println(n));
        //new stream2
     Stream<Integer> stream2 = stream1.filter(n->n%2==0);
//        stream2.forEach(n-> System.out.println(n));

        //new stream3
        Stream<Integer> stream3 = stream2.map(n->n*2);
      //  stream3.forEach(n-> System.out.println(n));
        Integer reduce = stream3.reduce(0, (c, e) -> c + e);
        System.out.println(reduce);*/

        //we can write the above in single line
        Integer reduce1 = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(reduce1);

  /*      Predicate<Integer> p=new Predicate<Integer>() {
            public boolean test(Integer integ) {
            *//*    if (integ%2==0)
                return true;
                else
                    return false;*//*
                return integ%2==0;
            }
               };
*/
//above without lambda expression
     //in lambda expression form for the above
        Predicate<Integer> p =(integ)->integ % 2 == 0;
    }

    }

