public class Interrupt extends Thread{
    public Interrupt(String name) //Create constructor to give the name to the constructor
    {
            super(name);
    }

    
    public void run()
    {
         for(int i=1;i<=5;i++)
         {
            try{
                System.out.println(Thread.currentThread().getName() +" is running");
                Thread.yield();  //Pauses the current executing thread Suggests the CPU to give chance to other threads of equal priority to execute


           
            }
            catch(Exception e){
                System.out.println(e);

            }
         }
          /*try{
            Thread.sleep(1000);
            System.out.println("Thread is Running");
          }
          catch(InterruptedException e)
          {
            System.out.println("Thread Interrupted:"+e);
            
          }*/
    }
    public static void main(String[] args) {
        Interrupt i1=new Interrupt("t1");
        Interrupt i2=new Interrupt("t2");
        i1.start();
        i2.start();
        

        //i1.interrupt(); //interrupt() is a method used to signal a thread to stop what it is doing. t1 thread is sleeping so it interrupts
    }
}
