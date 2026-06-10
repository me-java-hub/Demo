package map;
//LinkedHashMap maintains order in map(on the basis of key)
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> lhmap1=new LinkedHashMap<>();
        lhmap1.put(100,"sumit");
        lhmap1.put(500,"anu");
        lhmap1.put(20,"pukar");
        lhmap1.put(100,"mahesh");
        System.out.println(lhmap1);



    }








}
