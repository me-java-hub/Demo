package map;

import java.util.HashMap;
import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
    HashMap<Integer, String> hmap1 = new HashMap<>();
    hmap1.put(101,"anu");
    hmap1.put(110,"salim");
    hmap1.put(105,"pragati");
    hmap1.put(120,"anu");
    hmap1.put(105,"robert");

    //fastest way of iterating a map(using Map.Entry)
        Set<Map.Entry<Integer, String>>setOfEntry=hmap1.entrySet();
        for (Map.Entry<Integer,String> entry:setOfEntry){
            System.out.println(entry.getKey()+" " +entry.getValue());
        }
        //way2
        Set<Integer>setOfKeys=hmap1.keySet();
        for(Integer key : setOfKeys){
            System.out.println(key + " --"+hmap1.get(key));
        }
    }





}
