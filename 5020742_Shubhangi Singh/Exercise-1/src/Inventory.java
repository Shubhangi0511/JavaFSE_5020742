
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private Map<Integer, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (!products.containsKey(product.getProductId())) {
            products.put(product.getProductId(), product);
            System.out.println("Product added successfully!");
        } else {
            System.out.println("Product with the same ID already exists!");
        }
    }

    public void updateProduct(int productId, Product updatedProduct) {
        if (products.containsKey(productId)) {
            products.put(productId, updatedProduct);
            System.out.println("Product updated successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

    public void deleteProduct(int productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

    public void displayProducts() {
        List<Product> productList = new ArrayList<>(products.values());
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}