@FunctionalInterface 
interface MyFuncInterface {
    public String sayHello();
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyFuncInterface msg = () -> { return "Hello Student";}; // Lambda expression with 0 parameter

        System.out.println(msg.sayHello());
    }
}
