public class Mythread extends Thread {
    public Mythread(String name) //Create constructor to give the name to the constructor
    {
            super(name);
    }

    public void run()
    {
        
        for(int i=0;i<=4;i++)
        { 
            System.out.println(Thread.currentThread().getName()+"-Priority:"+Thread.currentThread().getPriority()+" count"+i);
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args)throws InterruptedException {
        Mythread l=new Mythread("Low Priority Thread");
        Mythread m=new Mythread("Medium Priority Thread");
        Mythread h=new Mythread("High Priority Thread");
        
        
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        
        l.start();     
        m.start();
        h.start();
       // t1.join();
       //System.out.println("Hello");   
    }
    
}
