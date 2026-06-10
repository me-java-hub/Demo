package map;

import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {


    HashMap<Integer, String> hmap1 = new HashMap<>();
    hmap1.put(101,"anu");
    hmap1.put(110,"salim");
    hmap1.put(105,"pragati");
    hmap1.put(120,"anu");
    hmap1.put(105,"robert");

    System.out.println(hmap1);
    System.out.println(hmap1.get(110));
    System.out.println(hmap1.containsKey(120));
    System.out.println(hmap1.containsKey(111));
    System.out.println(hmap1.size());
    System.out.println(hmap1.keySet());
    System.out.println(hmap1.values());
    System.out.println(hmap1.entrySet());
    }





}
