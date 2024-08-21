import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        Product[] products = new Product[] {
                new Product(1, "Product 1", "Category 1"),
                new Product(2, "Product 2", "Category 2"),
                new Product(3, "Product 3", "Category 3"),
                new Product(4, "Product 4", "Category 4"),
                new Product(5, "Product 5", "Category 5")
        };
        int targetId = 3;
        int result = Search.linearSearch(products, targetId);
        if (result != -1) {
            System.out.println("Product found at index " + result);
        } else {
            System.out.println("Product not found");
        }

        Arrays.sort(products, (a, b) -> Integer.compare(a.getProductId(), b.getProductId()));
        targetId = 3;
        result = Search.binarySearch(products, targetId);
        if (result != -1) {
            System.out.println("Product found at index " + result);
        } else {
            System.out.println("Product not found");
        }
    }
}