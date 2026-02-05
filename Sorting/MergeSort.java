import java.util.*;
public class MergeSort {
    public static void conquer(int arr[],int start_idx,int mid,int end_idx) 
    {
        int merged[]=new int[end_idx-start_idx+1];
        int idx1=start_idx;
        int idx2=mid+1;
        int x=0; //temp array
        while(idx1<=mid && idx2<=end_idx)
        {   if(arr[idx1]<=arr[idx2])
            {
                merged[x]=arr[idx1];
                x++;
                idx1++;
    
            }
            else
            {
                merged[x]=arr[idx2];
                x++;
                idx2++;
    
            }

        }
        while(idx1<=mid){
            merged[x]=arr[idx1];
                x++;
                idx1++;
    

        }
        while(idx2<=end_idx){
            merged[x]=arr[idx2];
                x++;
                idx2++;
    

        }
        for(int i=0 ,  j=start_idx; i<merged.length;i++,j++)
        {
                      arr[j]=merged[i];
        }
        
        

        
    }
    public static void divide(int arr[],int start_idx,int end_idx)
    {
        if(start_idx < end_idx){
        int mid=start_idx+(end_idx-start_idx)/2;
        divide(arr,start_idx,mid);
        divide(arr,mid+1,end_idx);
        conquer(arr,start_idx,mid,end_idx);
        }
    
    }
    public static void main(String args[])
    {
      
        int arr[]={12,31,35,8,32,17};
        int n=arr.length;
        divide(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
       System.out.println(); 
    }
    
}
