package smart_warehouse_management_system;

public abstract class WarehouseItem {
    // Attributes
    private String name;
    private double price;

    // Constructor
    public WarehouseItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    // Getter Method
    public String geTList(){
        return name + " " + price;
    }
}
