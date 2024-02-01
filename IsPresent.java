import java.util.ArrayList;
import java.util.Optional;

public class IsPresent {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(12);
        list.add(10);
        list.add(7);

       Optional<Integer>reduce = list.stream().filter(e->e%2 == 1).reduce((x,y)->x+y);
        if(reduce.isPresent()) {
            System.out.println(reduce.get());
        }
        else 
            System.out.println("Not Present");
    }
}
