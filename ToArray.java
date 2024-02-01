import java.util.*;
import java.util.stream.Stream;

class Mobile {
    String name;
    int price;
    String processor;
    int ram;
    public Mobile(String name, int price, String processor, int ram) {
        this.name = name;
        this.price = price;
        this.processor = processor;
        this.ram = ram;
    }
}

public class ToArray {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Nokia",100,"Nokia",2);
        Mobile m2 = new Mobile("Samsung",2000 , "Intel", 4);
        Mobile m3 = new Mobile("Realme", 150, "Mediatek", 6);
        Mobile m4 = new Mobile("Redmi", 50, "Snapdragon", 1);
        List<Mobile> arr = new ArrayList<>();
        arr.add(m1);
        arr.add(m2);
        arr.add(m3);
        arr.add(m4);

        Stream<Mobile> mm= arr.stream().sorted((x, y) -> x.price >= y.price? 1:-1);
        Object[] a = mm.toArray();
        for(Object t: a) {
            Mobile p = (Mobile)t;
            System.out.println("Name : "+ p.name);
            System.out.println("Price : "+ p.price);
            System.out.println("Processor : "+p.processor);
            System.out.println("Ram : "+ p.ram);
            System.out.println();
        }
    }
}