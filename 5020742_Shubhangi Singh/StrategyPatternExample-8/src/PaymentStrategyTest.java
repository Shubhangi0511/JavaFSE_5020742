public class PaymentStrategyTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
        paymentContext.executePayment(100.0);

        paymentContext.setPaymentStrategy(new PayPalPayment());
        paymentContext.executePayment(200.0);
    }
}