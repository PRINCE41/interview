package peight.solid;

// Violates OCP: Any new discount type would require modifying this class
class DiscountCalculatorSolidOpenClosed {
    public double calculate(String discountType, double price) {
        if ("seasonal".equals(discountType)) {
            return price * 0.1;
        } else if ("festival".equals(discountType)) {
            return price * 0.2;
        }
        return price;
    }
}

// Applying OCP: Use inheritance or interfaces to extend the functionality
interface DiscountStrategy {
    double applyDiscount(double price);
}

class SeasonalDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.1;
    }
}

class FestivalDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.2;
    }
}

class DiscountCalculator {
    public double calculate(DiscountStrategy discountStrategy, double price) {
        return discountStrategy.applyDiscount(price);
    }
}
