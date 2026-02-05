public class duplicate_element {

    public static void main(String[] args) {
        int arr[]={12,3,56,45,3};
    
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            if(arr[i]==arr[j])
            {
                System.out.println(arr[i]);
            }
        }
        }
        
    }
    
}
