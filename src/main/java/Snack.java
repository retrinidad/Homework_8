public class Snack {
    private String name;
    private int quantity;
    private double price;

    public Snack(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduce(){
        this.quantity--;
    }
}
