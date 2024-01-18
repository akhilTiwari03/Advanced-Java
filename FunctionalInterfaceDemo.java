// An interface having 1 abstract method(and can have any number of default and static methods like toString(), equals() these are default methods given by jdk) that need to be implemented by the class are called Functional Interface or SAM(Single Abstract Method) interfaces. 
@FunctionalInterface
interface msg {
    void say(String msg);
}
public class FunctionalInterfaceDemo implements msg {
    public void say(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        FunctionalInterfaceDemo d = new FunctionalInterfaceDemo();
        d.say("Good Morning Everyone");
    }
}
