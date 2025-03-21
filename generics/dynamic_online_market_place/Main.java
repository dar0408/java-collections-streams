package dynamic_online_market_place;

public class Main {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 29.99, new BookCategory());
        Product<ClothingCategory> clothing = new Product<>("T-Shirt", 19.99, new ClothingCategory());
        Product<GadgetsCategory> gadget = new Product<>("Smartphone", 599.99, new GadgetsCategory());

        // Apply discounts
        book.applyDiscount(10);
        clothing.applyDiscount(5);
        gadget.applyDiscount(15);

        // Creating and managing catalog
        Product<ProductCategory> catalog = new Product<>();
        catalog.addProduct(book);
        catalog.addProduct(clothing);
        catalog.addProduct(gadget);

        // Display catalog
        System.out.println("Online Marketplace Product Catalog:");
        catalog.displayCatalog();
    }
}
