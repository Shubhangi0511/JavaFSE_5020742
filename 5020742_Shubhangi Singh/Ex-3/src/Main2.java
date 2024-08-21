public class Main2 {
    public static void main(String[] args) {
        Order[] orders = new Order[] {
                new Order(1, "John", 100.0),
                new Order(2, "Jane", 50.0),
                new Order(3, "Bob", 200.0),
                new Order(4, "Alice", 150.0),
                new Order(5, "Mike", 80.0)
        };

        System.out.println("Before sorting:");
        printOrders(orders);

        BubbleSort.sortOrders(orders);
        System.out.println("After Bubble Sort:");
        printOrders(orders);

        Order[] orders2 = new Order[] {
                new Order(1, "John", 100.0),
                new Order(2, "Jane", 50.0),
                new Order(3, "Bob", 200.0),
                new Order(4, "Alice", 150.0),
                new Order(5, "Mike", 80.0)
        };

        QuickSort.sortOrders(orders2);
        System.out.println("After Quick Sort:");
        printOrders(orders2);
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId() + ", Customer Name: " + order.getCustomerName() + ", Total Price: " + order.getTotalPrice());
        }
    }
}