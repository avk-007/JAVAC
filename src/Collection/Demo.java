package Collection;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        //syntax
        List<Integer> nums  = new ArrayList<Integer>();
        nums.add(1);
        nums.add(5);
        nums.add(7);
        nums.add(7);

      //  Set<Integer> numSet  = new HashSet<Integer>();
      //  sorted set
        Set<Integer> numSet  = new TreeSet<>();
        numSet.add(1);
        numSet.add(5);
        numSet.add(7);
        numSet.add(7);

        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

 /*op
 1
 5
 7
 7
 */
     /*   //for index value
        int i = nums.indexOf(5);
        System.out.println("index"+i);
        //ehanced for loop
        for (int n : nums){
            System.out.println(n);
        }
        System.out.println(nums);*/
    }
    }
