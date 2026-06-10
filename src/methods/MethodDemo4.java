package methods;

//static methods can be called without creating any object but
// for calling non static method we need to use objects to call it

public class MethodDemo4 {
    public static void main(String[] args) {//main() is system defined

      int collectedResult = sum(10,20);//main method calling sum()
      System.out.println("collectedResult in main is " + collectedResult);
      //main method calling sum() method
        //calling non static method--create object of class and then call it
     MethodDemo4 obj=new MethodDemo4();
     obj.mutiplication(2,4,6);
    }
    static int sum(int no1, int no2) {//user defined
        int result = no1 + no2;
        //System.out.println(result);
          return result;
    }
    //non static method

     void mutiplication(int a, int b, int c) {//user defined
        int mul=a*b*c;
        System.out.println(mul);
    }
}
