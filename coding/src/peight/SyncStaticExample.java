package peight;

class SyncStaticExample {
    static synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static synchronized void printNumbersq() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(SyncStaticExample::printNumbers, "Thread-1");
        Thread t2 = new Thread(SyncStaticExample::printNumbersq, "Thread-2");

        t1.start();
        t2.start();
    }
}
