//Check array is sorted or not
public class Sorted_array {
    public static void main(String[] args) {
        
        int[] arr={12,3,4,1,6};
        if(isSorted(arr))
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is  not sorted");
        }
         

     }
     public static boolean isSorted(int[] arr)
     {
       for(int i=0;i<arr.length-1;i++)
       {
           if(arr[i]>arr[i+1])
           {
                return false;
           }
          
       }
       return true;
     }
    
}
