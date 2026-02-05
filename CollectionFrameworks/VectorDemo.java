

import java.util.Vector;
import java.util.Arrays;


public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        System.out.println(vector.capacity()); //Initial Capacity is 10
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Grapes");
        System.out.println(vector);
        for(String fruits:vector) //for loop iterates over the vector 3 times(once for each element) and it iterate a whole vector
        {
            System.out.println(vector);
        }
        System.out.println(vector.get(0));
        System.out.println(vector.remove(2));
        System.out.println(vector.remove("Apple"));
        System.out.println(vector.contains("Banana"));
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.elements());
         vector.clear();
        System.out.println(vector);
    }
    
}
