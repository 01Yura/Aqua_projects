package no_bugs.practice11.builder.onlineshop;

public class Order {
    String goodName;
    int discount;
    String paymentMethod;

    public Order(String goodName, int discount, String paymentMethod) {
        this.goodName = goodName;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
    }

    public Order(Builder builder) {
        this.goodName = builder.goodName;
        this.discount = builder.discount;
        this.paymentMethod = builder.paymentMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "goodName='" + goodName + '\'' +
                ", discount=" + discount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    static class Builder {
        String goodName;
        int discount;
        String paymentMethod;

        public Builder setGoodName(String goodName) {
            this.goodName = goodName;
            return this;
        }

        public Builder setDiscount(int discount) {
            this.discount = discount;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Order build() {
            return new Order(this);
        }

    }
}
