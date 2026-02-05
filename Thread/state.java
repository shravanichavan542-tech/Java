public class state extends Thread{
    public void run()
    {
           System.out.println("RUNNING");
           try
           {
           Thread.sleep(2000);
           }
           catch(InterruptedException e)
           {
            System.out.println(e);
           }
            
    }
    public static void main(String args[])throws InterruptedException
    {
        state s1=new state();
        System.out.println(s1.getState()); // New State after creation of thread object
        s1.start(); 
        System.out.println(s1.getState()); //Runnable state

        Thread.sleep(100); //Pause the main thread and start the s1 method or run method
        System.out.println(s1.getState());
        
        s1.join(); //main thread will wait to finish the s1 thread work
        System.out.println(s1.getState());

    }
}
