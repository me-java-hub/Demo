package methods;

public class OtherUserOfMethod {
    public static void main(String[] args) {//lets another user is prakash(corresponding to main)
        //need to sum 2 numbers
        int collectedResultFromOutside = MethodDemo4.sum(10,20);//main method calling sum()
        System.out.println(collectedResultFromOutside);
    // calling nultiplication()
        //calling non static method--create object of class and then call it
        MethodDemo4 obj=new MethodDemo4();
        obj.mutiplication(3,1,6);

    //calling other class method to find sum of marks
        int[] subjectMarks = {30, 20, 20, 10};
        ArraySumUsingMethod.arraySum(subjectMarks);//final sum is 80
        int collectedResult = ArraySumUsingMethod.arraySum2(subjectMarks);
        System.out.println(collectedResult);//80
    }






}
