package methods;

//static methods can be called without creating any object but
// for calling non static method we need to use objects to call it

public class MethodDemo3 {
    public static void main(String[] args) {//main() is system defined

     sum(30,20);//main method calling sum() method
        //calling non static method--create object of class and then call it
     MethodDemo3 obj=new MethodDemo3();
     obj.mutiplication(3,2,6);
    }
    static void sum(int no1, int no2) {//user defined
        int result = no1 + no2;
        System.out.println(result);
    }
    //non static method

     void mutiplication(int a, int b, int c) {//user defined
        int mul=a*b*c;
        System.out.println(mul);
    }
}
