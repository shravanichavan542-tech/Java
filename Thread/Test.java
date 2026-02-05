class World extends Thread{
    public void run()
    {
       // for(int i=0;i<10;i++)
         for(;;)
        {
            //System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Test
{
    public static void main(String[] args) {

        World w1=new World();
        w1.start();
        //for(int i=1;i<10;i++)
        for(;;) //infinite time runs the thread
        {
            //System.out.println("World");
             System.out.println(Thread.currentThread().getName());
        }
      
        
    }
}