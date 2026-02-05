public class Test
{ 
    public static void main(String args[])
    {
        int[] numerators={100,200,300,400};
        int[] denomiators={1,2,0,4};
        for(int i=0;i<numerators.length;i++)
        {
            System.out.println(divide(numerators[i],denomiators[i]));
        }
        System.out.println("Good Job:)");
    }
    public static int divide(int a,int b)
    {     try{
            return a/b;
          }
          catch(ArithmeticException e)
          { System.out.println(e);
            return -1;
          }
    }
}