package sets;
import java.util.*;

//TreeSet is a special kind of set used for sorting
public class TreeSetDemo1 {
    public static void main(String[] args) {

        TreeSet<String> tset = new TreeSet<>();
        tset.add("anu");
        tset.add("prakash");
        tset.add("sumit");
        tset.add("praveen");
        System.out.println(tset);//by default sort is ascending
        //descanding using inbuilt method
        System.out.println(tset.descendingSet());//sort in descanding order

    }

}
