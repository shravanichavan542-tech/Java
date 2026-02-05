public class ExceptionDemo {
    public static void main(String[] args) {
        int a=10,b=5,c=5,x,y;
        try
        {
            System.out.println("try-catch block execution");
            x=a/(b-c);
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide By zero excepyion occur...");
        }
        finally
        {
            System.out.println("Finally Block Always Executed");
        }
        y=a/(b-c);
        System.out.println("Y:"+y);
    }
    
}
