package Session8withLE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        {

            List<Integer> list = new ArrayList();
            list.add(10);
            list.add(20);
            list.add(3);
            list.add(4);
            list.add(5);
            System.out.println(list);

            //with lE in ascending order
            // Collections.sort(list,(i1>i2)?-1:(i1<i2)?1:0);
            //with Comparator with LE
            Collections.sort(list, (Integer i1, Integer i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
            System.out.println(" before sorting descending " + list);

            list.sort((i1, i2) -> i1 - i2);
            System.out.println("sort with ascending" + list);

            //even easier with Integer.compare
            list.sort((i1, i2) -> Integer.compare(i1, i2));
            System.out.println("sort with asceding  Integer.compare" + list);

            //even easier with Integer.compare
            list.sort((i1, i2) -> Integer.compare(i2, i1));
            System.out.println("sort with descending  Integer.compare" + list);
        }
    }
}
