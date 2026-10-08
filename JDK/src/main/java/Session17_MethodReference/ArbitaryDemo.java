package Session17_MethodReference;

import java.util.*;

public class ArbitaryDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 33, 400, 59, 16, 7, 8, 9);
        //with LE
        Collections.sort(list,(i1,i2)->i1.compareTo(i2));
        for (Integer i:list){
            System.out.println("with LE"+i);
        }
        //With Method Reference way
        Collections.sort(list,Integer::compareTo);
        for (Integer i:list){
            System.out.println("with method reference"+i);
        }

    }
}
