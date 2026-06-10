package map;

//TreeMap is used for sorting Map(on basis of keys)
import java.util.Map;
import java.util.TreeMap;
//sorting in descending order using comparator
public class TreeMapDemo2 {
    public static void main(String[] args) {
        Map<Integer, String> tmap2 = new TreeMap<>(new SortDescendingOrder1());
        tmap2.put(100, "sumit");
        tmap2.put(500, "anu");
        tmap2.put(20, "pukar");
        tmap2.put(100, "mahesh");
        tmap2.put(30, "mahesh3");

        System.out.println(tmap2);

    }
}

