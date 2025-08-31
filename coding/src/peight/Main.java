package peight;

class FinalExample {
    final int MAX_VALUE = 100; // Final variable
    final void displayMax() { // Final method
        System.out.println("Max value: " + MAX_VALUE);
    }
}

final class FinalClass { // Final class
    void show() {
        System.out.println("This is a final class.");
    }
}

class Test extends FinalExample {
    // Attempting to override final method will result in an error
    // void displayMax() {} // This would cause a compilation error
}

public class Main {
    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        obj.displayMax(); // Output: Max value: 100

        FinalClass finalClass = new FinalClass();
        finalClass.show(); // Output: This is a final class.
    }
}
