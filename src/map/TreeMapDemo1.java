package map;

//TreeMap is uded for sorting Map(on basis of keys)
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        Map<Integer, String> tmap1 = new TreeMap<>();
        tmap1.put(100, "sumit");
        tmap1.put(500, "anu");
        tmap1.put(20, "pukar");
        tmap1.put(100, "mahesh");
        tmap1.put(30, "mahesh3");

        System.out.println(tmap1);

    }
}
