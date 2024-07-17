public class Item {
    private double unitPrice;
    private String name;

    public Item(double price, String name) {
        this.unitPrice = price;
        this.name = name;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public String getName() {
        return this.name;
    }

}
