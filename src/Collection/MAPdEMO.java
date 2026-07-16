package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.logging.SocketHandler;

public class MAPdEMO {

    //kv pair
    public static void main(String[] args) {
        //works almost same
       // Map<Integer,String> maps=new HashMap<>();
        Map<Integer,String> maps=new Hashtable<>(
        );
        maps.put(19,"hi");
        maps.put(33,"hello");
        maps.put(44,"bye");
        maps.put(33,"abhi");

        System.out.println(maps.keySet());
       // System.out.println(maps);
        for (Integer key: maps.keySet()){
            System.out.println(key+" "+ maps.get(key));

        }
    }
}
