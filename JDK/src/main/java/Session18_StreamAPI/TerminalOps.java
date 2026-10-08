package Session18_StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
/*  Collection / Array  →  Stream  →  Intermediate Operation(s)  →  Terminal Operation  →  Result
    Intermediate Operations →  filter() → map() → sorted() → distinct() → limit() → skip()

    Terminal Operations →  forEach() → collect() → count() → reduce() → min() → max() → findFirst()
                           findFirst(),findany(),anymatch(),
                           allmatch() , noneMatch()
*/
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        // count() --Returns the number of elements in the stream. i,e size
        long count = list.stream().count();
        System.out.println(count);

        //reduce() -->reduce the data into single element i.e addition only
        Optional<Integer> reduce = list.stream().distinct().reduce((a, b) -> a + b);
        System.out.println("reduce"+reduce.get());

        //for each() -->for each take consumer as input process one by one element and finally displayed to end user
        list.stream().distinct().forEach(x-> System.out.println(x));

        //toArray is used to convert stream to array
        Object[] array = list.stream().distinct().toArray();
        // System.out.println(Arrays.toString(array));
        //same as sout
        for (Object a:array){
            System.out.println(a);
        }

        //max
        Optional<Integer> max = list.stream()
                .max((v1, v2) -> v1.compareTo(v2));
        System.out.println("max"+":" +max.get());

        //min
        Optional<Integer> min = list.stream()
                .min((v1, v2) -> v1.compareTo(v2));
        System.out.println("max"+":" +min.get());

        //collect
        //it is used to convert the processed stream into a Collection or another data structure.

        List<Integer> collect = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

        //List-->STream-COllectors.toList->List  and viceversa for collect()

        //findFirst
        Optional<Integer> first = list.stream().findFirst();
        System.out.println("find first"+":" +first.get());

        //findany
        Optional<Integer> findany = list.stream().findAny();
        System.out.println("findany"+":" +first.get());

        //anymatch(),allmatch(),nonematch()
        //--will take predicate as an input return true if any element satisfy given conditons else return false
        List<String> stringlist=new ArrayList<>();
        stringlist.add("abhis");
        stringlist.add("hello");
        stringlist.add("world");
        //anymatch
        boolean b = stringlist.stream().anyMatch(x->x.startsWith("he"));
        System.out.println(b);
        //all match --every element have to start with a then it will become true.
        boolean b1 = stringlist.stream().allMatch(x->x.startsWith("a"));
        System.out.println(b1);
        //none match--used when no element is matching with your list of strings
        boolean b2 = stringlist.stream().noneMatch(x->x.startsWith("kartik"));
        System.out.println(b2);
    }
}
