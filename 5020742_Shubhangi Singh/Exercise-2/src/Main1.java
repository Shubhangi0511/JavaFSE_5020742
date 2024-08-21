import java.util.Arrays;

class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

class Search {
    public static int linearSearch(Product1[] product1s, int targetId) {
        for (int i = 0; i < product1s.length; i++) {
            if (product1s[i].getProductId() == targetId) {
                return i;
            }
        }
        return -1; // Not found
    }

    public static int binarySearch(Product1[] product1s, int targetId) {
        int left = 0;
        int right = product1s.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (product1s[mid].getProductId() == targetId) {
                return mid;
            } else if (product1s[mid].getProductId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Not found
    }
}

public class Main1 {
    public static void main(String[] args) {

        Product1[] product1s = new Product1[] {
                new Product1(1, "Product 1", "Category 1"),
                new Product1(2, "Product 2", "Category 2"),
                new Product1(3, "Product 3", "Category 3"),
                new Product1(4, "Product 4", "Category 4"),
                new Product1(5, "Product 5", "Category 5")
        };
        int targetId = 3;
        int result = Search.linearSearch(product1s, targetId);
        if (result != -1) {
            System.out.println("Product found at index " + result);
        } else {
            System.out.println("Product not found");
        }

        Arrays.sort(product1s, (a, b) -> Integer.compare(a.getProductId(), b.getProductId()));
        targetId = 3;
        result = Search.binarySearch(product1s, targetId);
        if (result != -1) {
            System.out.println("Product found at index " + result);
        } else {
            System.out.println("Product not found");
        }
    }
}