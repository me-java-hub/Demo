package sets;

import java.util.HashSet;
//hashset stores only unique values
public class DuplicateElements {//creates class named DuplicateElements
    public static void main(String[] args) {

        int[] arr = {2, 4, 8, 2, 5, 4};//creates integer array

        HashSet<Integer> hset = new HashSet<Integer>();//creates HashSet named hset

        for (int i=0;i<arr.length;i++) {//0
            if(hset.add(arr[i])==false) {//if unique element then added , if duplicate then add() will not add and return false
                System.out.println(arr[i] + " is duplicate element in given array");

            }
        }
    }
}