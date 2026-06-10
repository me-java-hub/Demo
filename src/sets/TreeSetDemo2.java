package sets;

import java.util.TreeSet;

//TreeSet is a special kind of set used for sorting
public class TreeSetDemo2 {
    public static void main(String[] args) {

        TreeSet<String> tset = new TreeSet<>();
        tset.add("anu");
        tset.add("prakash");
        tset.add("sumit");
        tset.add("praveen");
        System.out.println(tset);//by default sort is ascending
        //descanding using inbuilt method
        //System.out.println(tset.descendingSet());//sort in descanding order

        //using comparator for custom sorting

        TreeSet<String> tset2 = new TreeSet<>(new SortDescendingComparator());
        tset2.add("anu");
        tset2.add("prakash");
        tset2.add("sumit");
        tset2.add("praveen");
        System.out.println(tset2);





    }

}
