import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hashmap=new LinkedHashMap<>(3);
        hashmap.put(12,"Apple");
        hashmap.put(30,"Pineapple");
        hashmap.put(89,"Mango");
   
        hashmap.get("Apple");
       for(Map.Entry<Integer,String> entry : hashmap.entrySet())
        {
            System.out.println(entry.getKey() + ":"+entry.getValue());
        }
    }
    
}
