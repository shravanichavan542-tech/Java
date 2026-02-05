public class smallest_element {
    public static void main(String[] args) {
        int arr[]={12 ,3 ,4 ,5,89};
        int smallest=arr[0];

        for(int i=1;i<arr.length;i++)
        {
              if(arr[i]<smallest)
              {
                 smallest=arr[i];
              }
              
        }
        System.out.println(smallest);
    }
    
}
