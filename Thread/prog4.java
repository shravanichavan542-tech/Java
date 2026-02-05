//Given An Array of Say 6 int Values .Write a Method to determine whether the sum of any pair of distinct elemmentsis target value 
// no[] = {6,0,12,4,5,8},target = 11==>true
//target = 7 ==>false
import java.util.*;
public class prog4 {

    public static boolean CheckSum(int no[],int target1)
    {
       
        for(int i=0;i<no.length;i++)
        {
            for(int j=i+1;j<=no.length;j++)
            {
                    
                    if(no[i]+no[j]==target1)
                    {
                            return true;  
                    }
                   
            }
        }
        return false;
    }
    public static void main(String[] args){
        int no[]={6,0,12,4,5,8};
        int target1=11;
        int target2=7;
        System.out.println(CheckSum(no, target1));
        System.out.println(CheckSum(no, target2));
        

    }
}