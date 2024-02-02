import java.util.Arrays;
import java.util.List;
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
        
    }
}
