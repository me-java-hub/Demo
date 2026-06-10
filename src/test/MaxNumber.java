package test;

import java.util.ArrayList;
import java.util.List;

//find the maximum number
public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();//creating list
        numbers.add(5);
        numbers.add(99);
        numbers.add(120);
        numbers.add(7);
        numbers.add(45);

        int max = 0;

        for( int num:numbers){
            if(num>max){
                max = num;
            }
        }

        System.out.println("Maximum Number is:" + max);
    }
}
