package STreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParelllelStream {
    public static void main(String[] args) {

        int size=1000_0;
        List<Integer> nums=new ArrayList<>(10000);
       //for Random no
        Random random=new Random();
        //for 10000 use loops
        for (int i=1;i<=10000;i++){
            // int value from this random number generator's sequence
           nums.add(random.nextInt(100));
        }

        Stream<Integer> stream1= nums.stream().map(n->n*2).sorted();
        stream1.forEach(n->  System.out.println(nums));
    }


}
//requirement is muliply every value by 2 ::

