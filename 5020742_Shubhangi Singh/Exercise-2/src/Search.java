public class Search {
    public static int linearSearch(Product1[] product1s, int targetId) {
        for (int i = 0; i < product1s.length; i++) {
            if (product1s[i].getProductId() == targetId) {
                return i;
            }
        }
        return -1;
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
        return -1;
    }
}