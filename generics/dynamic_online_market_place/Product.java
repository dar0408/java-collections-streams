package dynamic_online_market_place;

import java.util.ArrayList;
import java.util.List;

// Generic class
public class Product<T extends ProductCategory> {
    private String productName;
    private double price;
    private T category;
    
    private List<Product<? extends ProductCategory>> products = new ArrayList<>();

    // Constructor 
    public Product(String productName, double price, T category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    // Constructor 
    public Product() {
        this.productName = "Catalog";
        this.price = 0.0;
        this.category = null;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    public void displayProduct() {
        System.out.println("Product: " + productName + 
            (category != null ? ", Category: " + category.getCategoryName() : "") + 
            ", Price: $" + price);
    }

    // Methods to manage products within the class
    public void addProduct(Product<? extends ProductCategory> product) {
        products.add(product);
    }

    public void displayCatalog() {
        for (Product<? extends ProductCategory> product : products) {
            product.displayProduct();
        }
    }
}
