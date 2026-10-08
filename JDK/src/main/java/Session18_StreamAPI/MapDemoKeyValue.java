package Session18_StreamAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemoKeyValue {
//to get key using stream API
    public static void main(String[] args) {
        Map< Integer,String> map = new HashMap<>();
        map.put(1,"abhishek");
        map.put(2,"kalin");
        map.put(3,"sumit");

        //to get key using stream API
        map.keySet()
                .stream()
                .forEach(k->System.out.println(k));

        //to get value using stream API
        map.values()
                .stream()
                .forEach(k->System.out.println(k));

        //to get both
        map.entrySet()
                .stream()
                .forEach(k->System.out.println(k));

        //sort the data based on key in asceding order
        map.keySet().stream().sorted().forEach(k->System.out.println(k));

        //sort the data based on value in ascending order
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(k->System.out.println(k));

        //sort the data based on value in descending order
        map.entrySet().stream()
                .sorted(Map.Entry.<Integer,String>comparingByValue().reversed())
                .forEach(k->System.out.println(k));

        //sort the data based on key in descending order
        map.entrySet().stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                .forEach(k->System.out.println(k));

        //Convert Map to List using Stream API
        List<Map.Entry<Integer, String>> collect = map.entrySet().stream().collect(Collectors.toList());
        System.out.println(collect);

    }
}
