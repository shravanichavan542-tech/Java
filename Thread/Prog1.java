//convert no. into array  e.g no=123 array={1,2,3}
public class Prog1 {
    public static void main(String args[])
    {
        int nos[]={1,2,3},i;
        System.out.println("I/P Array is:");
        for(int i=0;i<nos.length;i++)
        {
            System.out.println(nos[i]+" ");
        }
        nos=addNo(nos);
        System.out.println("o/p Array is");
        for(i=0;i<nos.length;i++)
        {
           System.out.println(nos[i]+"");
        }
    }
    static int[] addNo(int nos[])
    {
        int no=0;
        for(int i=0;i<nos.length;i++)
        {
            no=no*10+nos[i];
        }
        no+=1;
        //to count the no.s digit in no
        int count;
        for(int temp=no;temp!=0;temp/=10)
        {
            count++;
        }
        //assign read memory for array based on no. of digit in number
        int arr[]=new int[count];

        for(i=count-1;i>=0;i--)
        {
            arr[i]=no%10;
            no/=10;
        }
    }
    
}
