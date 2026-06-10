package methods;


public class MethodDemo2 {
    public static void main(String[] args) {//main() is system defined

     sum(30,20);//main method calling sum() method
     mutiplication(2,4,6);
    }
    static void sum(int no1, int no2) {//user defined
        int result = no1 + no2;
        System.out.println(result);
    }
    static void mutiplication(int a, int b, int c) {//user defined
        int mul=a*b*c;
        System.out.println(mul);
    }
}
