import java.util.LinkedList;
import java.util.Arrays;

public class MyLinkedList{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(12);//add element
        list.add(23);
        list.add(89);
        System.out.println(list);

        /*list.remove();
        System.out.println(list); remove first element*/ 
        
        list.set(2,77); //replace the second index element with 77
        System.out.println(list);

        list.remove(0); //remove element by index ,it also involve removeFirst an removeLast
        System.out.println(list);

        list.remove(Integer.valueOf(23)); //remove element by value
        System.out.println(list);

        list.addFirst(67);//add element at 0 index
        list.addLast(90); //add element at last index
        System.out.println(list);

        System.out.println(list.get(1)); //access element 
        System.out.println(list.getFirst());//access element at 0 index
        System.out.println(list.getLast());////access element at last index
       
        list.removeIf(x-> x%3==0); //pass the condition to remove elements
        System.out.println(list);

        LinkedList<String> animals=new LinkedList<>(Arrays.asList("Dog","Elephant","Cat")); //On-the-Fly Creation of LinkedList
        LinkedList<String> animalsToRemove=new LinkedList<>(Arrays.asList("Dog","Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);

        System.out.println(animals.contains("Dog")); //check if element is present or not
        

    }
}

