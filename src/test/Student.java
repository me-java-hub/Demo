package test;

import java.sql.SQLOutput;
import java.util.ArrayList;
//store and print student names
public class Student {
    public static void main(String[] args) {
        //creating ArrayList
        ArrayList<String> studentname = new ArrayList<>();

        //Adding student names
        studentname.add("Rohit");
        studentname.add("Neha");
        studentname.add("jack");
        studentname.add("Marie");
        studentname.add("Ryan");

        for (String name : studentname){
            System.out.println(name);
        }



    }
}
