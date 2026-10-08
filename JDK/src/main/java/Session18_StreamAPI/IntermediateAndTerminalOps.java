package Session18_StreamAPI;

import java.util.*;
import java.util.stream.Stream;

/*Collection / Array  →  Stream  →  Intermediate Operation(s)  →  Terminal Operation  →  Result
Intermediate Operations →  filter() → map() → sorted() → distinct() → limit() → skip()
Terminal Operations →  forEach() → collect() → count() → reduce() → min() → max() → findFirst()*/

public class IntermediateAndTerminalOps {
    //Stream OA
    public static void main(String[] args) {
       List<Integer> no=Arrays.asList(1, 2, 3, 4, 6, 8, 9, 12, 10, null);
        //how to remove null values from Arraylist
        //use Filter
        no.stream().filter((x)->x!=null).forEach(x-> System.out.println(x));

       //or Arrays List we can define in this way
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("6");
        list.add("2");
        list.add("3");
        list.add("2");
        list.add("4");
        list.add(null);

        list.stream().filter((x)->x!=null).forEach(x-> System.out.println(x));

      //Remove dups from Arraylist
        list.stream().distinct().forEach(x-> System.out.println("dups"+x));

        //Remove dups & null values from Arraylist
        list.stream()
                .filter((x)->x!=null).distinct()
                .forEach(x-> System.out.println("dups & null"+x));

        //sort Arraylist data
        System.out.println("sort without dups and nulls below");
        list.stream().filter((x)->x!=null).distinct().sorted().forEach(x-> System.out.println(x));


        //Map use --intermediate operation
        List<String> listN=new ArrayList<>();
        listN.add("abhishek");
        listN.add("sumit");
        listN.add("hello");
        listN.add("world");
        listN.add("smallcase");
        listN.add(null);

        //Lazy intermediate and terminal foreach is eager in nature
        listN.stream().filter(x->x!=null)
                .map(y->y.toUpperCase())
                .sorted().distinct()
                .forEach(x-> System.out.println(x));

/*       limit() Intermediate Operations
        limit wil take size as input
         limit --return streams which contains 2 elements  */

         listN.stream()
                 .filter(x -> x != null)
                 .map(y->y.toUpperCase())
                 .limit(2)
                 .forEach(y-> System.out.println(y));

      //skip()
        System.out.println("skip() intermediate operation method ");
        listN.stream()
                .filter(x -> x != null)
                .limit(4)
                .skip(2)
                .forEach(y-> System.out.println(y));
        //op hello ,world





    }
}
