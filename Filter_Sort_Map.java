import java.util.Arrays;
import java.util.*;

public class Filter_Sort_Map {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(8,9,10,11,9, 3, 5);
        
        num.stream().filter(e-> e%2 == 0)
                    .sorted()
                    .map(e->e*e)
                  //  .forEach(e->System.out.println(e)); below forEach is also same
                  .forEach(System.out::println);
    }
}
