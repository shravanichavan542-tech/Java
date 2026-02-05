public class lambdaExpression2 {
    public static void main(String[] args) {
        
              Mathoperations sum=( a,b)->a+b;
              int res=sum.operation(1,2);
              System.out.println(res);
           
            }

    }
    

interface Mathoperations
{
    int operation(int a,int b);
}
