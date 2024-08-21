public class PaymentProcessorTest {
    public static void main(String[] args) {
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();
        BankTransferGateway bankTransferGateway = new BankTransferGateway();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);
        PaymentProcessor bankTransferAdapter = new BankTransferAdapter(bankTransferGateway);

        payPalAdapter.processPayment("PayPal", 100.0);
        stripeAdapter.processPayment("Stripe", 200.0);
        bankTransferAdapter.processPayment("Bank Transfer", 300.0);
    }
}