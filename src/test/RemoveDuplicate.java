package test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//remove duplicate elements
public class RemoveDuplicate {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(5);
        set.add(78);
        set.add(10);
        set.add(55);
        set.add(5);
        System.out.println(set);


    }
}
