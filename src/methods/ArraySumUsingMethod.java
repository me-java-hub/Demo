package methods;

import java.sql.Array;

public class ArraySumUsingMethod {
    public static void main(String[] args) {
        int[] subjectMarks = {40, 50, 30, 70};
//        int sum=0;
//        for(int i=0; i<subjectMarks.length;i++){
//            sum= sum+ subjectMarks[i];
//            System.out.println("sum is " + sum);
//        }
//        System.out.println("Final sum is" + sum);

        arraySum(subjectMarks);
        int collectedSum = arraySum2(subjectMarks);
        System.out.println("Total sum is " + collectedSum);
    //calling non static method
        ArraySumUsingMethod obj1=new ArraySumUsingMethod();
        obj1.arraySum3(subjectMarks);
        //calling another non static method
        int collectedResult = obj1.arraySum4(subjectMarks);
        System.out.println("Total sum is " + collectedResult);

    }


    static void arraySum(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            //System.out.println("sum is " + sum);
        }
        System.out.println("Final sum is " + sum);

    }

    static int arraySum2(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }

        return sum;
    }
    void arraySum3(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }

        System.out.println("Final sum is " + sum);
    }
    //creating non static method which returns result
    int arraySum4(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }

        return sum;
    }
}
