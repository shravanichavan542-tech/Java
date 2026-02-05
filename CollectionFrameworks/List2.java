

import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2; // Ascending order
    }
}

public class List2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(56, 1, 4);
        numbers.sort(new MyComparator());
        System.out.println(numbers);
    }
}
