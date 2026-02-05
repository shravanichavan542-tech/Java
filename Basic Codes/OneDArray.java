import java.util.*;
class OneDArray
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}