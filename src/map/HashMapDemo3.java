package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo3 {
    public static void main(String[] args) {
    HashMap<String, Integer> hmap3 = new HashMap<>();
    hmap3.put("1011",45);
    hmap3.put("1102",55);
    hmap3.put("1054",23);
    hmap3.put("1203",44);
    hmap3.put("1051",32);

    //fastest way of iterating a map(using Map.Entry)
        Set<Map.Entry<String, Integer>>setOfEntry=hmap3.entrySet();
        for (Map.Entry<String, Integer> entry:setOfEntry){
            System.out.println(entry.getKey()+" " +entry.getValue());
        }
        //way2
        Set<String>setOfKeys=hmap3.keySet();
        for(String key : setOfKeys){
            System.out.println(key + " --"+hmap3.get(key));
        }
    }





}
