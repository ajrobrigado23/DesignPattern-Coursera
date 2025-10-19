package strategy;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        // Return the original price
        return price;
    }
}
