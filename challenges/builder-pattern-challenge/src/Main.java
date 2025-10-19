import builder.Pizza;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza.PizzaBuilder("Large", "Stuffed")
                .setCheese(true)
                .setPepperoni(true)
                .setExtraSauce(false)
                .setPrice(499.99)
                .build();

        System.out.println(pizza.toString());
    }

}