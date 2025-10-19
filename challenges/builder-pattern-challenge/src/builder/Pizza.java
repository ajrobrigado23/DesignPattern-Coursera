package builder;

public class Pizza {

    private final String size;

    private final String crust;

    private final boolean cheese;

    private final boolean pepperoni;

    private final boolean mushroom;

    private final boolean extraSauce;

    private final double price;

    // Constructor
    public Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.crust = pizzaBuilder.crust;
        this.cheese = pizzaBuilder.cheese;
        this.pepperoni = pizzaBuilder.pepperoni;
        this.mushroom = pizzaBuilder.mushroom;
        this.extraSauce = pizzaBuilder.extraSauce;
        this.price = pizzaBuilder.price;
    }

    // PizzaBuilder class
    public static class PizzaBuilder {

        private String size;

        private String crust;

        private boolean cheese;

        private boolean pepperoni;

        private boolean mushroom;

        private boolean extraSauce;

        private double price;

        // Constructor
        public PizzaBuilder(String size, String crust) {
            this.size = size;
            this.crust = crust;
        }

        // Optional
        public PizzaBuilder setCheese(boolean cheese) {
            this.cheese = cheese;
            System.out.println(this);
            return this;
        }

        public PizzaBuilder setPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder setMushroom(boolean mushroom) {
            this.mushroom = mushroom;
            return this;
        }

        public PizzaBuilder setExtraSauce(boolean extraSauce) {
            this.extraSauce = extraSauce;
            return this;
        }

        public PizzaBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }


    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crust='" + crust + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", mushroom=" + mushroom +
                ", extraSauce=" + extraSauce +
                ", price=" + price +
                '}';
    }
}
