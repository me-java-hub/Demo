package methods;

public class MethodCW {
    public static void main(String[] args) {
        //calling the method
        myDetails("Merina","214562587","NC");

    }
    static void myDetails(String name,String contact,String address){
        System.out.println("My name is "+name);
        System.out.println("My contact no. is "+contact);
        System.out.println("My address is "+address);
    }
}
