package peight;

class Example {
    public synchronized void instanceSyncMethod() {
        System.out.println("Executing instance synchronized method");
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished instance synchronized method");
    }
    
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        
        // Two threads calling the synchronized method on different objects
        Thread t1 = new Thread(obj1::instanceSyncMethod);
        Thread t2 = new Thread(obj2::instanceSyncMethod);
        
        t1.start();
        t2.start();
    }
}
