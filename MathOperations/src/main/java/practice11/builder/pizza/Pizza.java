package practice11.builder.pizza;

public class Pizza {
    private String dought;
    private String vegetables;
    private String topping;

    public Pizza(String dought, String vegetables, String topping) {
        this.dought = dought;
        this.vegetables = vegetables;
        this.topping = topping;
    }

    public Pizza(PizzaBuilder pizzaBuilder) {
        this.dought = pizzaBuilder.dought;
        this.vegetables = pizzaBuilder.vegetables;
        this.topping = pizzaBuilder.topping;
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza("thick", "tomato", "souce");
        Pizza flexPizza = new Pizza.PizzaBuilder().setDought("big").setVegetables("cucumbers").build();
        System.out.println(pizza);
        System.out.println(flexPizza);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dought='" + dought + '\'' +
                ", vegetables='" + vegetables + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }

    public static class PizzaBuilder {
        private String dought;
        private String vegetables;
        private String topping;

        public PizzaBuilder setDought(String dought) {
            this.dought = dought;
            return this;
        }

        public PizzaBuilder setVegetables(String vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        public PizzaBuilder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

}
