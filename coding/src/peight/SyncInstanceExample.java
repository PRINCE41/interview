package peight;

class SyncInstanceExample {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void printNumbers1() {
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
        SyncInstanceExample obj1 = new SyncInstanceExample();
        SyncInstanceExample obj2 = new SyncInstanceExample();

        Thread t1 = new Thread(obj1::printNumbers, "Thread-1");
        Thread t2 = new Thread(obj1::printNumbers1, "Thread-2");

        t1.start();
        t2.start();
    }
}
