package strategy;

public class ShoppingCart {

    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double checkout(double totalPrice) {
        return this.discountStrategy.applyDiscount(totalPrice);
    }
}
