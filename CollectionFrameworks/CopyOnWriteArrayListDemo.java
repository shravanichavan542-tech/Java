import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        // Example 1: Modifying CopyOnWriteArrayList while iterating
        CopyOnWriteArrayList<String> shopping = new CopyOnWriteArrayList<>();
        shopping.add("Milk");
        shopping.add("Eggs");
        shopping.add("Bread");
        System.out.println("Initial Shopping List: " + shopping);

        for (String item : shopping) {
            System.out.println(item);
            // Try to modify the list while reading
            if (item.equals("Eggs")) {
                shopping.add("Butter");
                System.out.println("Added Butter While Reading");
            }
        }
        System.out.println("Updated Shopping List: " + shopping);


        // Example 2: Concurrent reading using a separate thread
        CopyOnWriteArrayList<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");

        Thread readerThread = new Thread(() -> {
            try {
                while (true) {
                    for (String item : sharedList) {
                        System.out.println("Reading item: " + item);
                        Thread.sleep(100); // Sleep for 100 milliseconds
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Exception in reader thread: " + e);
            }
        });

        Thread writeThread=new Thread(()->{
            try {
                Thread.sleep(100);
                sharedList.add("Item4");
                System.out.println("Added Item4 to the list");

                Thread.sleep(100);
                sharedList.remove("Item1");
                System.out.println("Remove Item1 from  the list");
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        );
        readerThread.start();
        writeThread.start();



        
        
    }
}
