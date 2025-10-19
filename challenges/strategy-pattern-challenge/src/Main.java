import strategy.*;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        // Create a shopping cart (Learning Strategy Pattern)
        ShoppingCart cart = new ShoppingCart();

        showDiscountContent(cart, 100, "student");
        showDiscountContent(cart, 100, "senior");
        showDiscountContent(cart, 100, "none");

    }

    public static void showDiscountContent(ShoppingCart cart, double price, String discountType) {

        switch (discountType) {
            case "student" -> {
                // Apply student discount
                cart.setDiscountStrategy(new StudentDiscount());
                double studentAmount = cart.checkout(price);

                System.out.println("-----------------");

                System.out.printf("""
                        Original Price: ₱%.2f
                        Applied Student Discount: 10%%
                        Final Price: ₱%.2f
                        """, price, studentAmount);

            }
            case "senior" -> {
                // Apply senior discount
                cart.setDiscountStrategy(new SeniorDiscount());
                double seniorAmount = cart.checkout(100);

                System.out.println("-----------------");

                System.out.printf("""
                        Original Price: ₱%.2f
                        Applied Senior Discount: 20%%
                        Final Price: ₱%.2f
                        """, price, seniorAmount);
            }
            case "none" -> {
                // Apply no discount
                cart.setDiscountStrategy(new NoDiscount());
                double noDiscountAmount = cart.checkout(100);

                System.out.println("-----------------");

                System.out.printf("""
                        Original Price: ₱%.2f
                        Applied Discount: 0%%
                        Final Price: ₱%.2f
                        """, price, noDiscountAmount);
            }

            default -> System.out.println("Invalid discount type.");


        }

    }

}