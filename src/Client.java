import java.util.ArrayList;
import java.util.List;

public class Client {
    private String clientName;
    private List<Order> orders;

    public Client(String name) {
        this.clientName = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return this.clientName;
    }

    public void addItemToOrder(Item item,Order order) {
        order.addItem(item);
    }

    public void createOrder() {

    }

}
