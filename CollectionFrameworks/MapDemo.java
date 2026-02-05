import java.util.HashMap;
import java.util.Set;
public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Pineapple");
        map.put(3, "Mango");
        System.out.println(map);

        System.out.println(map.get(2));// retrives a value ;returns null if absent

        System.out.println(map.remove(1)); //deletes an entry

        System.out.println(map.size()); //returns the size

        System.out.println(map.containsKey(3)); //returns boolean value if key present 
         System.out.println(map.containsValue("Apple")); //


    }
}
