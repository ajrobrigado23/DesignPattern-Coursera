package strategy;

public class StudentDiscount implements DiscountStrategy{

    @Override
    public double applyDiscount(double price) {

        // 10%
        double discountAmount = price * 0.1;

        // return price - discountAmount
        return (price - discountAmount);
    }
}
