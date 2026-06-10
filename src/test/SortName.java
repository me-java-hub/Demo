package test;

//sort student name alphabetically

import java.util.TreeSet;

public class SortName {
    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<>();
        tset.add("priya");
        tset.add("ankush");
        tset.add("juliet");
        tset.add("praveen");
        System.out.println(tset);//by default sort is ascending


    }
}
