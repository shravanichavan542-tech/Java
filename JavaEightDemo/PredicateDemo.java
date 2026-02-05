import java.util.function.Predicate;
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven=i->i%2==0;
        System.out.println(isEven.test(4));

    }
    
}
