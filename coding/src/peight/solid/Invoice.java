package peight.solid;

// Violates SRP: The Invoice class handles both invoice calculation and persistence
class Invoice {
    public void calculateTotal() {
        // logic to calculate the total
    }

    public void saveToDatabase() {
        // logic to save invoice to the database
    }
}

// Applying SRP: Separate concerns into two classes
class InvoiceCalculator {
    public void calculateTotal() {
        // logic to calculate the total
    }
}

class InvoiceRepository {
    public void saveToDatabase() {
        // logic to save the invoice to the database
    }
}
