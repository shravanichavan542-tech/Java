import java.util.*;

class Sorting2
{   public static void selection_sort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]) 
    {
        int arr[] = { 12, 8, 3, 4, 7 };
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int smallestIdx = i;
            for (int j = i + 1; j < arr.length; j++)
             {
                if (arr[smallestIdx] > arr[j]) 
                {
                    smallestIdx = j;
                }
            }
            int temp = arr[smallestIdx];
            arr[smallestIdx] = arr[i];
            arr[i] = temp;

        }
        selection_sort(arr);
    }

}