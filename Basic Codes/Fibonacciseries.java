import java.util.*;
class Fibonacciseries
{
    public static void main(String args[])
    {   
    int fno=0,sno=1,tno,N;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Value of N:");
    N=sc.nextInt();
    
    System.out.println("Fibonacci series:"+fno+ "\t" +sno);
        for(int i=3;i<=N;i++ )
        {
            tno=fno+sno;
            System.out.println(tno);
             
            fno=sno;
            sno=tno;
             
         
        }
    }
}
