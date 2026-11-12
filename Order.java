
public class Order {
    private MenuItem item;
    private int quantity;

    public Order(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public MenuItem getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }


    public double getTotal() {
<<<<<<< HEAD
        return item.getPrice()*quantity;
=======
        return item.getPrice() * quantity ;
>>>>>>> 917c24b80be6116a79fa0d36199563df61519f01
    }
}
