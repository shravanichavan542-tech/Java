/*import java.util.*;

class PrimeNO {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int no = sc.nextInt();
        int flag = 0;
        if (no == 1) 
        {
            System.out.println("Number is not prime nor composite");
        } 
        else
         {
            for (int i = 2; i < no; i++) 
            {
                if (no % i == 0)
                 {
                    flag = 1;
                    break;

                }
            }
            if (flag == 0) 
            {
                System.out.println("Number is  PrimeNo!!");
            }
            else
            {
                System.out.println("Number is not PrimeNo!!");
            }
        }
    }
}*/

import java.util.*;

class PrimeNo
{
    public static void main(String[] args) {
        
        int flag=0;
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value:");
        no=sc.nextInt();

        if(no==1)
        {
            System.out.println("Number is not prime nor composite");
        }
        else
        {
            for(int i=2;i<no;i++)
            {
                if(no%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                 System.out.println("Number is  PrimeNo!!");
            }
            else
            {
                 System.out.println("Number is  not PrimeNo!!");
            }
        }
    }
}