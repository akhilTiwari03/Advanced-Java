import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface Example {
    public static void main(String[] args) {
        // Non - Terminal -> filter, map, distinct, limit_
        // return stream_of object_
        // Terminal -> collect, count, min, max, forEach, toArray,  

        List<String> list = Arrays.asList("car", "bike", "bus", "bike", "car");

        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        list.stream().distinct().forEach(System.out::println);

        long x = list.stream().count();
        long y = list.stream().distinct().count();
        System.out.println(x);
        System.out.println(y);

        list.stream().limit(2).forEach(System.out::println);
        List<String> collect2 = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(collect2);
        

        // Finding how many numbers in the list are even numbers

        List<Integer> list1 = Arrays.asList(2,3,4,5,6,7,8,13,14,16,15);

        Long n = list1.stream().filter(e->e%2 == 0).count();
        System.out.println(n);

        Optional<Integer> mm = list1.stream().min((a,b)->{return a.compareTo(b);}); // use of min function

        System.out.println(mm.get());


        
    }
}
