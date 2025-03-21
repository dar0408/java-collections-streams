package smart_warehouse_management_system;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
     List <T> list = new ArrayList<>();

    // Add Method
    void add(T item){
        list.add(item);
    }

    // Method to display all items in electronics, groceries, furniture
    public void displayItems(List <? extends WarehouseItem> item){
        for(WarehouseItem num : list){
            System.out.println(num.geTList());
        }
    }
}
