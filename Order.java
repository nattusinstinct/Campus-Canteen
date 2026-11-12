
public class Order {
    private MenuItem item;
    private int quantity;

    @Override
    public String toString() {
        return "Order [item=" + item + ", quantity=" + quantity + "]";
    }

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
        return item.getPrice() * quantity ;
    }
    
}
