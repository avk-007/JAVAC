package Session8withLE;

import java.util.ArrayList;
import java.util.List;

public class ListStrinEMployee {
    static void main() {

        List<String> list = new ArrayList<>();
        list.add("Arunachal");
        list.add("Bangalore");
        list.add("Chennai");
        list.add("Delhi");
        list.add("Dehradun");
        list.add("Karnataka");

        //sort all elements with
        //list.sort((i1,i2)->i1.compareTo(i2));
        list.sort(String::compareTo);
        System.out.println("sort with asceding  String.compare" +":"+list);


    }
}
