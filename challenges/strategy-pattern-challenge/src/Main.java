import strategy.NoDiscount;
import strategy.SeniorDiscount;
import strategy.ShoppingCart;
import strategy.StudentDiscount;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        // Create a shopping cart (Learning Strategy Pattern)
        ShoppingCart cart = new ShoppingCart();
        // Apply student discount
        cart.setDiscountStrategy(new StudentDiscount());
        double studentAmount = cart.checkout(100);
        // Apply no discount
        cart.setDiscountStrategy(new NoDiscount());
        double noDiscountAmount = cart.checkout(100);
        // Apply senior discount
        cart.setDiscountStrategy(new SeniorDiscount());
        double seniorAmount = cart.checkout(100);

        Consumer<Double> display = a -> System.out.println("Amount you need to pay with or without discount: " + a);

        // Display student discount
        display.accept(studentAmount);
        // Display no discount
        display.accept(noDiscountAmount);
        // Display senior discount
        display.accept(seniorAmount);
    }
}