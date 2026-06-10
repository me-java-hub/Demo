package sets;

//import java.util.HashSet;
//import java.util.Set;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.TreeSet;
import java.util.*;
//sorting of HashSet
public class HashSetDemo2 {
    public static void main(String[] args) {
        Set<Integer> hset1 = new HashSet<>();//<>is generics for type safety
        hset1.add(1000);
        hset1.add(30);
        hset1.add(13);
        hset1.add(30);
        hset1.add(2);
        hset1.add(13);
        hset1.add(8);
        System.out.println(hset1);
        System.out.println(hset1.contains(30));//true
        System.out.println(hset1.contains(130));//false
        System.out.println(hset1.size());//4

        //sort,way1
        //Collections.sort(hset1);//it works only for list
        List<Integer> list = new ArrayList<>(hset1);
        Collections.sort(list);
        System.out.println(list);

        //sort way2
        Set<Integer> tset = new TreeSet<>(hset1);
        System.out.println(tset);

        //sort in descending order using comparator

        TreeSet<Integer> tset3 = new TreeSet<>(new SortDesIntegerComparator());
        tset3.add(10);
        tset3.add(45);
        tset3.add(8);
        tset3.add(30);
        System.out.println(tset3);




    }
}
