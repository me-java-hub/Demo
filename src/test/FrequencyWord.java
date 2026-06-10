package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// count frequency of each word
public class FrequencyWord {
    public static void main(String[] args) {
        String [] words = {"ryan","julie","rosy","ryan","julie"};
        Map<String, Integer> map=new HashMap<>();

        for (String word : words){//takes one word at a time from array
//
            Integer count = map.get(word);//check if word already exist

            if(count==null) {//if word not found
                map.put(word,1);

            } else {//if word already exist count increase by 1
                map.put(word,count+1);
            }


        }
        //iterate
        Set<String> setOfKeys = map.keySet();
        for (String element : setOfKeys){
            int value=map.get(element);
            System.out.println(element + " ---" + value );//this will print element and how many times it appears


        }


    }
}
