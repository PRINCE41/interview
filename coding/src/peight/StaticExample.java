package peight;

class StaticExample {
    static int count = 0; // Static variable
    static String company;

    // Static block to initialize static variables
    static {
        company = "TechCorp";
        System.out.println("Static block executed: Company set to " + company);
    }

    // Static method to increment count
    static void incrementCount() {
        count++;
    }

    // Constructor to demonstrate static variable behavior
    StaticExample() {
        incrementCount();
        System.out.println("Constructor executed. Current count: " + count);
    }

    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample(); // count = 1
        StaticExample obj2 = new StaticExample(); // count = 2

        System.out.println("Final Count: " + StaticExample.count); // Outputs: 2
    }
}
