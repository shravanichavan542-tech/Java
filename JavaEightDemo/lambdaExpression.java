/*public class lambdaExpression{
    public static void main(String[] args) {
      Thread thread1=new Thread(new Task());
      thread1.start();  

    }
}
class Task implements Runnable
{
    public void run()
   public class lambdaExpression{
    public static void main(String[] args) {
      Thread thread1=new Thread(new Task());  

    }
}
class Task implements Runnable
{
    public void run()
    {
        System.out.println("Hello!!!");
    }
}




}
// Instead of the older commented-out approach using Task and new Runnable()/Task class:
        //   Thread thread1 = new Thread(new Task());
        //   thread1.start();
        // we directly pass a lambda here, which defines Runnable.run() inline in a cleaner way.
*/
public class lambdaExpression
{
    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
        System.out.println("Hello!!!");
       
        
    });
    thread1.start();
    
    

    }
}


