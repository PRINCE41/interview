/*
package peight.solid;

// Violates ISP: Both Printer and Scanner classes must implement methods they don't need
interface Machine {
    void print();
    void scan();
}

class Printer implements Machine {
    public void print() {
        // Print logic
    }

    public void scan() {
        // Printer doesn't scan, violates ISP
    }
}

class Scanner implements Machine {
    public void print() {
        // Scanner doesn't print, violates ISP
    }

    public void scan() {
        // Scan logic
    }
}

// Applying ISP: Split the interface into smaller, more specific ones
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class LaserPrinter implements Printer {
    public void print() {
        // Print logic
    }
}

class DocumentScanner implements Scanner {
    public void scan() {
        // Scan logic
    }
}
*/
