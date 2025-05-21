package mock.museum;

public abstract class Ticket {
    private int price;
    private int discount;

    public Ticket(int price, int discount) {
        if (discount > 0) {
            this.price = price / 100 * discount;
        } else {
            this.price = price;
        }
        this.discount = discount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
