public class Search {
    public static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == targetId) {
                return i;
            }
        }
        return -1; // Not found
    }

    public static int binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId() == targetId) {
                return mid;
            } else if (products[mid].getProductId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Not found
    }
}