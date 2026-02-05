

//Take an array element from user
import java.util.*;
public class Array2{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Array Size:");
         int size=sc.nextInt();
         int[] nums=new int[size];
         System.out.println("Enter Array Elements:");

         for(int i=0;i<nums.length;i++)
         {
            
            nums[i]=sc.nextInt();
         }
         for(int i=0;i<size;i++)
         {
            System.out.println("Array Elements are:"+nums[i]);
         }

         sc.close();

    }
}

