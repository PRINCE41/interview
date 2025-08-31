package peight;

class SyncBlockExample {
    void printNumbers() {
        // Some code that does not need synchronization
        System.out.println(Thread.currentThread().getName() + " is preparing...");

        synchronized (this) { // Synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(500); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SyncBlockExample obj = new SyncBlockExample();

        Thread t1 = new Thread(obj::printNumbers, "Thread-1");
        Thread t2 = new Thread(obj::printNumbers, "Thread-2");

        t1.start();
        t2.start();
    }
}
