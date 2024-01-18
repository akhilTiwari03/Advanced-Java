import java.util.ArrayList;

public class PrimeNumber {

    public static boolean isPrime(Integer num) {
        if(num == 2) return true;
        if(num < 2) return false;
        
        for(Integer i = 2; i* i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> prime = new ArrayList<>();

        for(Integer i = 1; i <= 100; i++) {
            if(isPrime(i) == true) {
                prime.add(i);
            }
        }
        System.out.println("These Numbers are Prime");
        prime.forEach(num -> System.out.println(num));
    }
}
