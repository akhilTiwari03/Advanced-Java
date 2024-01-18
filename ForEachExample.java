import java.util.ArrayList;
import java.util.Iterator;

class Student {
    String name;
    String city;
    Student(String name, String cityName) {
        this.name = name;
        this.city = cityName;
    }
    public String toString() {
        return "Name : " + name + "  | City : " + city;
    }
}
public class ForEachExample {
    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        ls.add(new Student("Akhil", "Sitapur"));
        ls.add(new Student("Akash", "Sitapur"));
        ls.add(new Student("Arpit", "Sitapur"));        
        ls.add(new Student("Abhinandan", "Sitapur"));

        Iterator<Student> it = ls.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("For Each Loop");
        
        ls.forEach(s->System.out.println(s));
    }
}
