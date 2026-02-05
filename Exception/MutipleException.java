public class MutipleException {
    public static void main(String[] args) {
        int[] numerators={10,200,300,40};
        int[] denominators={1,2,0,8,99};
        for(int i=0;i<numerators.length;i++)
        {
            System.out.println(divide(numerators[i],denominators[i]));
        }
        
    }
    public static int divide(int a,int b)
    {
        try{
            
            return a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide By zero exception occur...");
            return 0;
        }
        catch(NullPointerException e)
        {
            System.out.println("Null pointer Exception:(");
             return 0;
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Index out of Bound Exception:(");
             return 0;
        }
        catch(Exception e)
        {
            System.out.println(e);
             return 0;
        }
    }
    
}
