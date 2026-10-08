package Session18_StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class withoutStreamApi  {
    public static void main(String[] args) {

        //without Stream Api
        List<String> list=new ArrayList<String>();
        List<String> uniqueList=new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("A");
/* // without Stream API
   for (String i:list){
            if (!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        }
        System.out.println(uniqueList);*/

     //With Stream API
        list.stream().distinct().forEach(x->
        {
            System.out.println(x);
        });

        //or with method reference
        System.out.println("STream API with method Reference");
        list.stream().distinct().forEach(System.out::println);

    }
}
