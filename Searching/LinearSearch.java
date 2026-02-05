import java.util.*;
public class LinearSearch
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter Array Elements:");
       
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the element which you want search:");
        int key=sc.nextInt();
        int flag=0;
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]==key)
            {
                flag=1;
                break;
            }


        }
        if(flag==0)
        {
            System.out.println("key is not found");

        }
        else
        {
            System.out.println("Key is found");
        }
    }
}