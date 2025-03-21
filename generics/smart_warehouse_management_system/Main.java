package smart_warehouse_management_system;

public class Main {
    public static void main(String args[]){
        Storage<Electronics> electronics = new Storage<>();
        Storage<Groceries> groceries = new Storage<>();
        Storage<Furniture> furniture = new Storage<>();

        // Add name and price to list
        electronics.add(new Electronics("TV", 80000));
        electronics.add(new Electronics("Speaker", 90000));

        groceries.add(new Groceries("Eggs", 20));
        groceries.add(new Groceries("Fish", 100));

        furniture.add(new Furniture("Table", 3000));
        furniture.add(new Furniture("Chair", 2000));

        // Calling displayItems to display details
        System.out.println("Display items for Electronics: ");
        electronics.displayItems(electronics.list);

        System.out.println();

        System.out.println("Display items for Groceries: ");
        groceries.displayItems(groceries.list);

        System.out.println();

        System.out.println("Display items for Furniture: ");
        furniture.displayItems(furniture.list);
    }
}
