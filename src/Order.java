import java.util.List;
import java.util.Observer;

public class Order {
    private int orderID;
    private List<Item> listItems;
    private List<OrderObserver> observers;

    public Order() {

    }

    public void attach(OrderObserver observer) {
    }

    public void detach(OrderObserver observer) {
    }

    public void getTotalPrice() {
    }

    public void getCount() {
    }

    public String toString() {
    }

    public void addItem(Item item) {
    }




}
