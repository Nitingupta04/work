import java.util.TreeSet;
import java.util.stream.IntStream;

public class Collectioning {
    public static void main(String[] args) {
        TreeSet<Integer> t = IntStream.rangeClosed(1000, 10000)
                                     .boxed()
                                     .collect(java.util.stream.Collectors.toCollection(TreeSet::new));
        
        System.out.println(t);
        System.out.println("Higher than 8000: " + t.higher(8000));
        System.out.println("Floor of 5000: " + t.floor(5000));
    }
}