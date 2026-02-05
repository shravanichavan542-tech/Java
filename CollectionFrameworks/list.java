
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;



public class list {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
         System.out.println(list.getClass().getName());
        list.add(1);
        list.add(5);
        list.add(2);
        
       
       System.out.println(list.get(2));
       
        
        System.out.println(list.size());

        for(int i=0;i<=list.size();i++)
        {
                   System.out.println(list.get(i));
        }
        System.out.println(list.contains(3)); //check existence
        System.out.println(list.contains(35));

        list.remove(2); //remove value by index
        list.remove(5); //remove value by value
        
        for(int i=0;i<=list.size();i++)
        {
                   System.out.println(list.get(i));
        }
        
        list.add(2,42); //it will add element at index 2
        System.out.println(list); 

        list.set(0,6);
        System.out.println(list);   //it will replace  the index value
        

        System.out.println(list.isEmpty()); //check arraylist is empty or not

       list.clear(); //it will clear all list elements
  

       System.out.println(list);
       List<String> list1=Arrays.asList("Monday","Tuesday");
       System.out.println(list1);
       System.out.println(list1.getClass().getName());
 
       String[] array={"Apple","Banana","Pineapple"};
       List list2=Arrays.asList(array);
       System.out.println(list2);
       System.out.println(list2.getClass().getName());
 

       List<Integer> list3=List.of(111,222);
       System.out.println(list3);

       list.addAll(list3);
       System.out.println(list);

       Collections.sort(list);
       System.out.println(list); 


      


       


    }
}
