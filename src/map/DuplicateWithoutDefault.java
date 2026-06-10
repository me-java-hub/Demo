package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//print duplicate element without using getORDefault
public class DuplicateWithoutDefault {
    public static void main(String[] args) {

        int[] numbers = {20,30,40,20,300,40,700};
        Map<Integer, Integer> map=new HashMap<>();

        for (int num : numbers){//takes one number at a time from array
//
              Integer count = map.get(num);//check if number already exist

              if(count==null) {//if number not found
                  map.put(num,1);

              } else {//if number already exist count increase by 1
                  map.put(num,count+1);
              }


        }
        //iterate
        Set<Integer> setOfKeys = map.keySet();
        for (int number : setOfKeys){
            int value=map.get(number);
            System.out.println(number+ " ---" + value );//this will print element and how many times it appears
            //if(value>1) System.out.println(number + " is duplicate element");

        }


    }


}
