package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet is a special kind of set that maintains order
public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();//<>is generics for type safety
        set1.add(1000);
        set1.add(30);
        set1.add(13);
        set1.add(30);
        set1.add(2);
        set1.add(13);
        set1.add(8);
        System.out.println(set1);
    }
}
