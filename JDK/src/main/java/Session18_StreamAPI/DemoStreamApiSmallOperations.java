package Session18_StreamAPI;

import java.util.Arrays;
import java.util.OptionalDouble;

public class DemoStreamApiSmallOperations {
    public static void main(String[] args) {
        int[] b={10,20,30,40,50,60};
        //count stream
        long count = Arrays.stream(b).count();
        System.out.println(count);

        //iterate over Arrays
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        //for each iterate
        Arrays.stream(b).forEach((x)-> System.out.println("iterate"+x));

        //array sorting
        Arrays.stream(b).sorted().forEach(x->System.out.println("sorted"+x));

        //remove dups from array
        int[] arrdup={70,10,20,30,40,10,40,70,60,50,60};
        Arrays.stream(arrdup).distinct().forEach(x-> System.out.println(x));

        //stream is sequential or parallel
        //if return false sequential
        //if true parallel
        int[] a={10,20,30,40,50,60};
        boolean parallel = Arrays.stream(a).parallel().isParallel();
        System.out.println(parallel);

        //Arrya sum
        int[] summm={10,20,30,40,50,60};
        int sum=0;
        int sum1 = Arrays.stream(summm).sum();
        System.out.println(sum1);

        //Array average
        OptionalDouble average = Arrays.stream(summm).average();
        System.out.println(average.getAsDouble());

        //even
        int[] evenNo={1,2,3,4,6,8,9,12,10};
        Arrays.stream(evenNo)
                .filter(x->x%2==0)
                .forEach(System.out::println);

        //min & max
        int[] nums={1,2,3,4,6,8,9,12,10};
        Arrays.stream(nums).min().ifPresent(System.out::println);
        Arrays.stream(nums).max().ifPresent(System.out::println);

        //to check stream is parallel(true) or sequtentail (false) comes as boolean
        boolean parallel1 = Arrays.stream(nums).isParallel();
        System.out.println(parallel1);
        //false is sequential

        boolean parallel12 = Arrays.stream(nums).parallel().isParallel();
        System.out.println(parallel12);
        //true parallel




    }
}
