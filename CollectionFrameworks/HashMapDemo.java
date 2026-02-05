import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Mango");
        map.put(3,"Graphes");
        System.out.println(map);
        System.out.println(map.get(3));

        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Apple"));
        System.out.println("Values Of the key:");
        for(int i:map.keySet())//used keySet() when you only need keys or access values using keys
        {
            System.out.println(map.get(i));
        }
        for(Map.Entry<Integer,String> entry:map.entrySet())//when you need key and value
        {
            System.out.println("key:"+entry.getKey()+",Value:"+entry.getValue());
        }
        for(String value:map.values())//when you only want values
        {
            System.out.println("value:"+value);
        }




    }
    
}
