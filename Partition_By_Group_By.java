import java.util.*;
import java.util.stream.Collectors;

class Mobile {
    String model,Os;
    int ram;
    Mobile(String m, String os, int r) {
        model = m;
        this.Os = os;
        ram = r;
    }
}


public class Partition_By_Group_By {
    public static void main(String[] args) {
        ArrayList<Mobile> m = new ArrayList<>();
        m.add(new Mobile("Redmi", "Android", 2));
        m.add(new Mobile("Apple", "ios", 5));
        m.add(new Mobile("Realme","Android", 8));
        m.add(new Mobile("Nokia","Windows", 2));
        m.add(new Mobile("Lava","Android", 6));
        m.add(new Mobile("OnePlus","ios", 5));
        m.add(new Mobile("BlackBerry","Kios", 4));
        m.add(new Mobile("Samsung","Android", 12));


        Map<Boolean, List<Mobile>> mp = m.stream().sorted((m1,m2)->m2.ram < m1.ram? 1: -1)  //example of Partitioning by
                                        .collect(Collectors.partitioningBy(e->e.Os.equals("ios")));
                                        
        List<Mobile> ls = mp.get(true);

        Map<String, List<Mobile>>mp1 = m.stream() // example of grouping By
                                        .sorted((m1, m2)-> m2.ram < m1.ram ? 1: -1)
                                        .collect(Collectors.groupingBy(e->e.Os));

        List<Mobile> ls1 = mp1.get("Android");

        for(Mobile i:ls) {
            System.out.println(i.model+ " "+ i.Os + " "+ i.ram);
        }
        System.out.println();

        for(Mobile i1 : ls1) {
            System.out.println(i1.model + " "+ i1.Os +" "+ i1.ram);
        }
    }
}
