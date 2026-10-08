package Session18_StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShotcircuitOps {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(11);
        list.add(9);
        //findFirst
        Optional<Integer> first = list.stream().findFirst();
        System.out.println(first.get());
        //all match
        boolean b = list.stream().allMatch(x -> x == 8);
        System.out.println(b);
    }
}
