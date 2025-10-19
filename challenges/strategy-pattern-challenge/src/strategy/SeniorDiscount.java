package strategy;

public class SeniorDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double price) {
        return price - (price * 0.9);
    }
}
